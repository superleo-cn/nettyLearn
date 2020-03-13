package cn.com.netty.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * nio 测试
 *
 * @desc: cn.com.netty.nio.Test1
 * @author: niejian9001@163.com
 * @date: 2020/2/3 21:38
 */
public class FileWriteBufferTest {

    private static final String PATH = "/Users/kylin/Documents/dev/java/opensource/nettyLearn/nio2.txt";

    public static void main(String[] args) throws Exception {
        FileOutputStream outputStream = new FileOutputStream(new File(PATH));
        FileChannel channel = outputStream.getChannel();
        ByteBuffer charBuffer = ByteBuffer.allocate(800);
        charBuffer.put("Hello World".getBytes());
        charBuffer.flip();
        channel.write(charBuffer);
//        charBuffer.flip();
//        while (charBuffer.hasRemaining()) {
//            System.out.print((char) charBuffer.get());
//        }
        outputStream.close();
    }
}
