package cn.com.netty.nio;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * nio 测试
 *
 * @desc: cn.com.netty.nio.Test1
 * @author: niejian9001@163.com
 * @date: 2020/2/3 21:38
 */
public class BufferTypeTest {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(128);
        byteBuffer.putInt(10);
        byteBuffer.putChar('H');
        byteBuffer.putLong(100000000000L);
        byteBuffer.putDouble(3434.432432);
        byteBuffer.putShort((short) 127);

        byteBuffer.flip();

        System.out.println(byteBuffer.getInt());
        System.out.println(byteBuffer.getChar());
        System.out.println(byteBuffer.getLong());
        System.out.println(byteBuffer.getDouble());
        System.out.println(byteBuffer.getShort());

    }
}
