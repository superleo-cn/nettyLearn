package cn.com.netty.nio;

import java.nio.ByteBuffer;

/**
 * nio 测试
 *
 * @desc: cn.com.netty.nio.Test1
 * @author: niejian9001@163.com
 * @date: 2020/2/3 21:38
 */
public class BufferSliceTest {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        for (int i = 0; i < byteBuffer.capacity(); i++) {
            byteBuffer.put((byte) i);
        }

        byteBuffer.position(3);
        byteBuffer.limit(7);
        ByteBuffer bufferSlice = byteBuffer.slice();
        for (int i = 0; i < bufferSlice.capacity(); i++) {
            byte data = bufferSlice.get(i);
            data *= 2;
            System.out.println(data);
            bufferSlice.put(i, data);
        }

        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());

        while (byteBuffer.hasRemaining()) {
            System.out.print(byteBuffer.get() + ", ");
        }
    }
}
