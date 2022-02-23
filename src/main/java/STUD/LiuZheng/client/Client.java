package STUD.LiuZheng.client;

import STUD.LiuZheng.service.OrderService;

/**
 * 客户端
 * @author qingyun
 * @date 2022/2/22
 */
public class Client {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        for (int i = 0; i < 50; i++) {
            new Thread(() ->{
                String str = orderService.getOrderNumber();
                System.out.println(str);
            },String.valueOf(i)).start();
        }
    }

}
