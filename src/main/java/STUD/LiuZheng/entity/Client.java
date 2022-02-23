package STUD.LiuZheng.entity;

public class Client {
    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 50; i++) {
            new Thread(() ->{
                new OrderService().getOrderNumber();
                System.out.println("str");
            },String.valueOf(i)).start();
        }
    }
}
