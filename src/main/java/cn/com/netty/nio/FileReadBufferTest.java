package cn.com.netty.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * nio 测试
 *
 * @desc: cn.com.netty.nio.Test1
 * @author: niejian9001@163.com
 * @date: 2020/2/3 21:38
 */
public class FileReadBufferTest {

    private static final String PATH = "/Users/kylin/Documents/dev/java/opensource/nettyLearn/nio.txt";

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new File(PATH));
        FileChannel channel = fileInputStream.getChannel();
        ByteBuffer charBuffer = ByteBuffer.allocate(80000);
        channel.read(charBuffer);
        charBuffer.flip();
        while (charBuffer.hasRemaining()) {
            System.out.print((char) charBuffer.get());
        }
        fileInputStream.close();
    }
}
