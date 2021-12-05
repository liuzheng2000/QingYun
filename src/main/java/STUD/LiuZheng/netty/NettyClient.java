package STUD.LiuZheng.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

import java.lang.reflect.Proxy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NettyClient {
    //创建线程池
    /**
     * 各参数含义
     * corePoolSize    : 线程池中常驻的线程数量。核心线程数，默认情况下核心线程会一直存活，即使处于闲置状态也不会
     * 受存活时间 keepAliveTime 的限制，除非将 allowCoreThreadTimeOut 设置为 true。
     * maximumPoolSize : 线程池所能容纳的最大线程数。超过这个数的线程将被阻塞。当任务队列为没有设置大小的
     * LinkedBlockingQueue时，这个值无效。
     * keepAliveTime   : 当线程数量多于 corePoolSize 时，空闲线程的存活时长，超过这个时间就会被回收
     * unit            : keepAliveTime 的时间单位
     * workQueue       : 存放待处理任务的队列
     * threadFactory   : 线程工厂
     * handler         : 拒绝策略，拒绝无法接收添加的任务
     */
    // 创建线程池，其中任务队列需要结合实际情况设置合理的容量
    ThreadPoolExecutor executor = new ThreadPoolExecutor(5,
            10,
            10L,
            TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(1024),
            new ThreadPoolExecutor.AbortPolicy());

    private static NettyClientHandler client;
    private int count;


    public Object getBean(final Class<?> serivceClass, final String providerName) {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class<?>[]{serivceClass}, (proxy, method, args) -> {
            System.out.println("(proxy, method, args) 进入...." + (++count) + " 次");
            if (client == null) {
                initClient();
            }
            client.setPara(providerName + args[0]);
            //执行过程是屏蔽的
            return executor.submit(client).get();
        });
    }

    private void initClient() {
        client = new NettyClientHandler();
        //创建EventLoopGroup
        NioEventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(
                        new ChannelInitializer<SocketChannel>() {
                            @Override
                            protected void initChannel(SocketChannel ch) throws Exception {
                                ChannelPipeline pipeline = ch.pipeline();
                                pipeline.addLast(new StringDecoder());
                                pipeline.addLast(new StringEncoder());
                                pipeline.addLast(client);
                            }
                        }
                );

        try {
            bootstrap.connect("127.0.0.1", 7000).sync();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}