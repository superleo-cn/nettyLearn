package cn.com.netty.nio;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/**
 * nio 测试
 *
 * @desc: cn.com.netty.nio.Test1
 * @author: niejian9001@163.com
 * @date: 2020/2/3 21:38
 */
public class SelectorTest {
    public static void main(String[] args) throws Exception {
        Integer[] ports = Arrays.asList(10000, 10001, 10002).toArray(new Integer[]{});

        Selector selector = Selector.open();

        for (Integer i : ports) {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            ServerSocket socket = serverSocketChannel.socket();
            socket.bind(new InetSocketAddress(i));
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("Listening port: " + i);
        }

        do {
            int count = selector.select();
            System.out.println("当前注册事件个数: " + count);
            Set<SelectionKey> keySet = selector.selectedKeys();
            System.out.println("当前注册事件: " + keySet);
            Iterator<SelectionKey> iterator = keySet.iterator();

            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                if (key.isAcceptable()) {
                    ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
                    serverSocketChannel.configureBlocking(false);
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector, SelectionKey.OP_READ);
                    iterator.remove();
                    System.out.println("获得客户端连接: " + socketChannel);
                } else if (key.isReadable()) {
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    byteBuffer.clear();
                    SocketChannel socketChannel = (SocketChannel) key.channel();
                    socketChannel.read(byteBuffer);
                    byteBuffer.flip();
                    int counts = 0;
                    while (true) {
                        int read = socketChannel.write(byteBuffer);
                        counts += read;
                        if (read <= 0) {
                            break;
                        }
                    }
                    System.out.println("Received: " + counts);
                    iterator.remove();
                }

            }

        } while (true);

    }
}
