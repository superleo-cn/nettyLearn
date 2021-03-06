package cn.com.netty.second;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * 客户端程序
 *
 * @author niejian
 * @description
 * @file cn.com.netty.second.MyClient
 * @create 2020-01-13 21:09
 **/
public class MyClient {

    public static void main(String[] args) {
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();


        try {
            Bootstrap bootstrap = new Bootstrap();
            // 对于netty的client端，只要一个channel就足够了
            bootstrap.group(eventLoopGroup).channel(NioSocketChannel.class)
                    // handler和childHandler的区别: handler是处理boss线程组所使用的处理器，比如Log之类的
                    // childHandler是连接上boss的client的请求交给worker现场组后，由works线程组所使用的处理器
                    .handler(new MyClientInitializer());

            ChannelFuture channelFuture = bootstrap.connect("localhost", 8899).sync();
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            eventLoopGroup.shutdownGracefully();
        }

    }
}
