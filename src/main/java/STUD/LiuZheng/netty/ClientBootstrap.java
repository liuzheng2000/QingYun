package STUD.LiuZheng.netty;

public class ClientBootstrap {
    public static void main(String[] args) throws InterruptedException {

        NettyClient customer = new NettyClient();

        HelloService  service = (HelloService) customer.getBean(HelloService.class, BootStrap.providerName);

        for (;; ) {
            Thread.sleep(2*1000);
            String res = service.hello("你好 dubbo~");
            System.out.println("调用的结果 res= " + res);
        }
    }
}
