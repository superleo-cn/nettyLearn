package cn.com.netty.nio;

import java.io.File;
import java.io.FileInputStream;
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
public class FileReadWriteBufferTest {

    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new File("nio2.txt"));
        FileOutputStream outputStream = new FileOutputStream(new File("nio_read_write.txt"));
        FileChannel inputChannel = inputStream.getChannel();
        FileChannel outputChannel = outputStream.getChannel();


        ByteBuffer charBuffer = ByteBuffer.allocate(1024);
        charBuffer.clear();

        inputChannel.read(charBuffer);
        charBuffer.flip();
        outputChannel.write(charBuffer);

        outputStream.close();
        inputStream.close();
    }
}
