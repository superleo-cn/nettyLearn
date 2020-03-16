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

    private static final String PATH = "aa.txt";

    public static void main(String[] args) throws Exception {
        File file = new File(PATH);
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();
        ByteBuffer charBuffer = ByteBuffer.allocate((int) file.length());
        channel.read(charBuffer);
        charBuffer.flip();
        // 先取缓冲区5个字符
        for (int i = 0; i < 5; i++) {
            if (charBuffer.hasRemaining()) {
                System.out.print((char) charBuffer.get());
            }
        }
        // 然后调用HeapBuffer的array()方法，直接从headbuff所依赖的底层byte数组把数据返回和要不要flip没有任何关系
        byte[] bytes = charBuffer.array();
        // 发现array()方法其实是从position=0的位置，把所有的字节都取出来了
        System.out.println(" ====length: " + bytes.length + "===string: " + new String(bytes, "GBK") + "===== ");
//        charBuffer.flip();
        // 千万注意，flip 不能重复调用多次，第二个调用由于 limit = position = 0 就把指针都设置到了0的位置，这样就读取不到数据了
//        charBuffer.flip();
        // 继续执行剩下的缓冲区的字节，可以发现这个调用根本不受 charBuffer.array() 调用的影响
        while (charBuffer.hasRemaining()) {
            System.out.print((char) charBuffer.get());
        }
        fileInputStream.close();
    }
}
