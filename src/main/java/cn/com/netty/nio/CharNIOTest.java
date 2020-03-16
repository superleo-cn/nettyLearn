package cn.com.netty.nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

public class CharNIOTest {

    public static void main(String[] args) throws Exception {
        RandomAccessFile readFile = new RandomAccessFile("aa.txt", "r");
        RandomAccessFile writeFile = new RandomAccessFile("bb.txt", "rw");
        FileChannel readChannel = readFile.getChannel();
        FileChannel writeChannel = writeFile.getChannel();

        long length = readFile.length();

        MappedByteBuffer byteBuffer = readChannel.map(FileChannel.MapMode.READ_ONLY, 0, length);
        Charset charset = Charset.forName("ISO-8859-1");
//        Charset newCharset = Charset.forName("UTF-8");
        CharsetEncoder encoder = charset.newEncoder();
        CharsetDecoder decoder = charset.newDecoder();

//        CharsetDecoder decoder1 = newCharset.newDecoder();

        CharBuffer charBuffer = decoder.decode(byteBuffer);

//        System.out.println(charBuffer.get(52));

        ByteBuffer writeByteBuffer = encoder.encode(charBuffer);

        // 这段代码有问题，就怕一个用编码A，输出用解码B
//        ByteBuffer writeByteBuffer = newCharset.encode(charBuffer);
        // 如果加上flip就有问题，不能再调用  writeByteBuffer.flip();, encode内部已经执行过flip了。
        // flip()：Buffer有两种模式，写模式和读模式。在写模式下调用flip()之后，Buffer从写模式变成读模式。
        writeChannel.write(writeByteBuffer);
        readFile.close();
        writeFile.close();
    }
}
