package cn.com.netty.nio;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class MyNIOServer {

    public static void main(String[] args) throws Exception {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 注意看这里
        serverSocketChannel.configureBlocking(false);
        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.bind(new InetSocketAddress(8899));
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        Map<String, SocketChannel> map = new HashMap<>();

        for (; ; ) {
            int count = selector.select();
            System.out.println("本次消息个数: " + count);
            Set<SelectionKey> keySet = selector.selectedKeys();
            Iterator<SelectionKey> it = keySet.iterator();
            while (it.hasNext()) {
                final SocketChannel socketChannel;
                SelectionKey key = it.next();
                if (key.isAcceptable()) {
                    ServerSocketChannel channel = (ServerSocketChannel) key.channel();
                    socketChannel = channel.accept();
                    // 注意看这里
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector, SelectionKey.OP_READ);
                    map.put(UUID.randomUUID().toString(), socketChannel);
                } else if (key.isReadable()) {
                    SocketChannel channel = (SocketChannel) key.channel();
                    ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                    readBuffer.clear();
                    int read = channel.read(readBuffer);
                    if (read > 0) {
                        readBuffer.flip();
                        Charset charset = StandardCharsets.UTF_8;
                        String message = String.valueOf(charset.decode(readBuffer).array(), 0, read);
                        System.out.println("收到的客户端【" + channel.toString() + "】的消息是: " + message);
                        String senderKey = null;
                        for(Map.Entry<String, SocketChannel> entry : map.entrySet()) {
                            if(channel == entry.getValue()) {
                                senderKey = entry.getKey();
                                break;
                            }
                        }

                        for (Map.Entry<String, SocketChannel> entry : map.entrySet()) {
                            SocketChannel sc = entry.getValue();
                            ByteBuffer writeByteBuffer = ByteBuffer.allocate(1024);
                            writeByteBuffer.put(("【服务端返回数据】: " + senderKey + ":" + message).getBytes());
                            writeByteBuffer.flip();
                            sc.write(writeByteBuffer);
                        }

                    }
                }

            }
            keySet.clear();
        }


    }

}
