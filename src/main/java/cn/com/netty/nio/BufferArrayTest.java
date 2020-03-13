package cn.com.netty.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

/**
 * nio 测试
 *
 * @desc: cn.com.netty.nio.Test1
 * @author: niejian9001@163.com
 * @date: 2020/2/3 21:38
 */
public class BufferArrayTest {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(8899);
        serverSocketChannel.socket().bind(inetSocketAddress);

        int messageLength = 2 + 3 + 4;
        ByteBuffer buffer1 = ByteBuffer.allocate(2);
        ByteBuffer buffer2 = ByteBuffer.allocate(3);
        ByteBuffer buffer3 = ByteBuffer.allocate(4);

//        List<ByteBuffer> list = Arrays.asList(buffer1, buffer2, buffer3);
        ByteBuffer[] array = new ByteBuffer[]{buffer1, buffer2, buffer3};

        SocketChannel socketChannel = serverSocketChannel.accept();

        while (true) {
            int byteRead = 0;

            while (byteRead < messageLength) {
                long r = socketChannel.read(array);
                byteRead += r;
                System.out.println("byte read: " + byteRead);
                Arrays.asList(array).stream().map(p -> "limit is: " + p.limit() + ", position is: " + p.position()).forEach(System.out::println);
            }

            Arrays.asList(array).forEach(p -> p.flip());

            long writes = 0;

            while (writes < messageLength) {
                long w = socketChannel.write(array);
                writes += w;
            }

            Arrays.asList(array).forEach(p -> p.clear());
//            break;

        }

    }
}
