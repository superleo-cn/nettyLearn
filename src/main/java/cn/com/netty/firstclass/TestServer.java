package cn.com.netty.firstclass;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author niejian
 * @description
 * @file cn.com.netty.firstclass.TestServer
 * @create 2020-01-12 16:21
 **/
public class TestServer {

    public static void main(String[] args) throws InterruptedException {
        // 获取客户端发送过来的链接
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        // 拿到获取到链接进行相关的处理
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            // 启动服务端
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            // acceptor(bossGroup) 和 client(workerGroup) 分别用两个group来配置
            serverBootstrap.group(bossGroup, workerGroup)
                    // 通过无参构造函数反射生成一个专门接受client链接的ServerSocketChannel-给acceptor使用
                    .channel(NioServerSocketChannel.class)
                    // 定义自定义的initialialer套路都是一样的-给负责处理client的workerGroup使用
                    .childHandler(new TestServerInitializer());
            // 绑定监听端口
            ChannelFuture channelFuture = serverBootstrap.bind(8081).sync();
            // 监听Netty容器关闭事件
            channelFuture.channel().closeFuture().sync();
        } finally {
            // 优雅关闭
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
