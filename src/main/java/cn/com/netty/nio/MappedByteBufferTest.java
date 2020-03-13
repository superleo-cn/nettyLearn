package cn.com.netty.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * nio 测试
 *
 * @desc: cn.com.netty.nio.Test1
 * @author: niejian9001@163.com
 * @date: 2020/2/3 21:38
 */
public class MappedByteBufferTest {
    public static void main(String[] args) throws Exception {
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File("nio_random_access_file.txt"), "rw");
        FileChannel channel = randomAccessFile.getChannel();
        MappedByteBuffer byteBuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 128);
        byteBuffer.put("Hello World\n".getBytes());
        byteBuffer.put("Hello World2\n".getBytes());
        byteBuffer.put("I like Java.".getBytes());
        Thread.sleep(1000000L);
        randomAccessFile.close();

    }
}
