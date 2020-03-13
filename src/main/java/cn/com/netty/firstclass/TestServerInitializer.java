package cn.com.netty.firstclass;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

/**
 * @author niejian
 * @description
 * @file cn.com.netty.firstclass.TestServerInitializer
 * @create 2020-01-12 16:25
 **/
public class TestServerInitializer extends ChannelInitializer<SocketChannel> {

    // 当ServerSocket和client链接成功后，就会生成一个SocketChannel，同时回调下面这个方法
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        // 得到改SocketChannel的Pipeline
        ChannelPipeline pipeline = socketChannel.pipeline();
        // 添加解码器的时候注意用new来创建实例，不要用共享对象，以免多线程下出现并发问题
        // 添加Http的编码和解码器，等价于同时添加了 HttpRequestDecoder 和 HttpResponseEncoder
        pipeline.addLast("httpServerCodec", new HttpServerCodec());
        // 添加自定义解码器
        pipeline.addLast("testHttpServerhandler", new TestHttpServerHandler());

    }
}

