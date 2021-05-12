package com.albers.netty.client;

import com.albers.netty.handler.EchoClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;


/**
 * @author: Albers
 * @date: 2021/5/11
 * @description:
 */
public class EchoClient {
    private final String host;
    private final int port;
    public EchoClient(String host,int port){
        this.host=host;
        this.port=port;
    }


    public void start()throws Exception{
        NioEventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioSocketChannel.class)
                    .remoteAddress(new InetSocketAddress(host,port))
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel channel) throws Exception {
                            channel.pipeline().addLast(new EchoClientHandler());
                        }
                    });

            ChannelFuture f = b.connect().sync();
            f.channel().closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
          group.shutdownGracefully().sync();
        }

    }

    public static void main(String[] args) throws Exception {
        if (args.length!=2){
            System.out.println(EchoClient.class.getSimpleName());
        }

        String host = "127.0.0.1";
        int port = 8379;
        new EchoClient(host,port).start();;
    }
}
