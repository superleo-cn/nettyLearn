package cn.com.netty.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.Executors;

public class MyNIOClient {

    public static void main(String[] args) throws Exception {
        Selector selector = Selector.open();
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.register(selector, SelectionKey.OP_CONNECT);
        socketChannel.connect(new InetSocketAddress("localhost", 8899));

        for (; ; ) {
            int count = selector.select();
            System.out.println("收到的消息数量: " + count);

            Set<SelectionKey> selectionKeySet = selector.selectedKeys();
            selectionKeySet.forEach(selectionKey -> {
                if (selectionKey.isConnectable()) {
                    SocketChannel sc = (SocketChannel) selectionKey.channel();
                    // 链接是否处于pending状态
                    if (sc.isConnectionPending()) {
                        try {
                            // 标记该链接链接成功
                            sc.finishConnect();

                            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                            byteBuffer.clear();
                            byteBuffer.put(("链接时间: " + LocalDateTime.now() + " 结束。").getBytes());
                            byteBuffer.flip();
                            sc.write(byteBuffer);

                            Executors.newSingleThreadExecutor().submit(() -> {
                                for (; ; ) {
                                    byteBuffer.clear();
                                    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                                    String message = bufferedReader.readLine();
                                    byteBuffer.put(message.getBytes());
                                    byteBuffer.flip();
                                    sc.write(byteBuffer);
                                }
                            });

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        try {
                            sc.register(selector, SelectionKey.OP_READ);
                        } catch (ClosedChannelException e) {
                            e.printStackTrace();
                        }

                    }
                } else if (selectionKey.isReadable()) {
                    SocketChannel sc = (SocketChannel) selectionKey.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    try {
                        int total = sc.read(byteBuffer);
                        // 对于全量一次性取出所有字节数组的话，是不用调用flip的。
                        //  byteBuffer.flip();
                        if (total > 0) {
                            // 方式一：直接从headbuff所依赖的底层byte数组把数据返回和要不要flip没有任何关系
//                            String str = new String(byteBuffer.array(), 0, total);
//                            System.out.println("【客户端】接收到服务端返回的数据 ： " + str);

                            // 方式二：使用 flip + Charset + CharBuffer 来循环输出
                            byteBuffer.flip();
                            Charset charset = Charset.forName("UTF-8");
                            CharBuffer charBuffer = charset.newDecoder().decode(byteBuffer);
                            while (charBuffer.hasRemaining()) {
                                System.out.print(charBuffer.get());
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });

            selectionKeySet.clear();
        }

    }

}
