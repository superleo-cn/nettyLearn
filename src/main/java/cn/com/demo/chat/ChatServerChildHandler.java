package cn.com.demo.chat;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class ChatServerChildHandler extends SimpleChannelInboundHandler<String> {

    private static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        group.forEach(channel -> {
            if (channel != ctx.channel()) {
                channel.writeAndFlush(String.format("用户[%s]发送消息: %s\n", channel.remoteAddress(), msg));
            } else {
                channel.writeAndFlush(String.format("我自己发送消息: %s\n", msg));
            }
        });
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        group.writeAndFlush(String.format("用户[%s]上线\n", ctx.channel().remoteAddress()));
        group.add(ctx.channel());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        group.writeAndFlush(String.format("用户[%s]下线\n", ctx.channel().remoteAddress()));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
