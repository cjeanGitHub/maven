package com.cjean.exercise.exercise01.netty.netty5.tcp.two;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;

/**
 * 作者：DarkKIng
 * 类说明：订阅handler，读取服务器的应答
 */
public class QuestoinHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
        System.out.println("读取服务器的应答..........");
        //获得应答，DatagramPacket提供了content()方法取得报文的实际内容
        String response = msg.content().toString(CharsetUtil.UTF_8);
        if (response.startsWith(UdpAnswerSide.ANSWER)) {
            System.out.println(response);
            ctx.close();
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}