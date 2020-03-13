package cn.com.netty.nio;

import java.nio.IntBuffer;

/**
 * nio 测试
 *
 * @desc: cn.com.netty.nio.Test1
 * @author: niejian9001@163.com
 * @date: 2020/2/3 21:38
 */
public class BufferTest {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);
        System.out.println("capacity: " + buffer.capacity());
        System.out.println("limit: " + buffer.limit());
        System.out.println("before flip: " + buffer.limit());

        for (int i = 0; i < 5; i++) {
            buffer.put(i);
        }

        buffer.flip();
        System.out.println("capacity: " + buffer.capacity());
        System.out.println("after limit: " + buffer.limit());

        while (buffer.hasRemaining()) {
            System.out.println("capacity: " + buffer.capacity());
            System.out.println("limit: " + buffer.limit());
            System.out.println(buffer.get());
        }


    }
}
