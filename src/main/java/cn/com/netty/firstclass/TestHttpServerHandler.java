package cn.com.netty.firstclass;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;

/**
 * @author niejian
 * @description
 * @file cn.com.netty.firstclass.TestHttpServerHandler
 * @create 2020-01-12 16:30
 **/
public class TestHttpServerHandler extends SimpleChannelInboundHandler<HttpObject> {

    /**
     * 读取客户端发发过来的消息，并发出响应
     *
     * @param channelHandlerContext
     * @param httpObject
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, HttpObject httpObject) throws Exception {

        System.out.println("客户端地址信息：" + channelHandlerContext.channel().remoteAddress());
        if (httpObject instanceof HttpRequest) {
            HttpRequest request = (HttpRequest) httpObject;
            System.out.println("channelHandler 执行 channelRead0");
            System.out.println("请求方法名：" + request.method().name() + ", uri:" + request.uri());
            //过滤相关无用的请求 对于像某些类似浏览器的程序，除了正常的请求，还会额外的发送这个favicon.ico图标，这里我们可以过滤掉
            if (request.uri().contains("favicon.ico")) {
                return;
            }

            // 构建响应，并返回客户端
            ByteBuf content = Unpooled.copiedBuffer("hello world", CharsetUtil.UTF_8);
            FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, content);
            // 设置返回头信息
            response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain");
            response.headers().set(HttpHeaderNames.CONTENT_LENGTH, content.readableBytes());

            // 返回客户端
            channelHandlerContext.writeAndFlush(response);

            // 也可以服务器端主动关闭连接，这样就能触发inactive和unregister等方法并不会马上回调
            // channelHandlerContext.channel().close();
        }


    }

    /**
     * 浏览器跟终端curl请求可能不一样，根据Http协议的版本浏览器并不一定会立即关闭客户端的请求
     * 关掉浏览器后 unregistered被调用
     *
     * @param ctx
     * @throws Exception
     */

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channel active");
        super.channelActive(ctx);
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channel registred");
        super.channelRegistered(ctx);
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        System.out.println("handler added");
        super.handlerAdded(ctx);
    }

    // 所以类似inactive和unregister等方法并不会马上回调
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channel inactive");
        super.channelInactive(ctx);
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channel unregistred");
        super.channelUnregistered(ctx);
    }
}
