package STUD.LiuZheng.controller;

public class OrderNumberCreateUtils {
    private static int num = 0;

    public String getOrderNumber(){
        return "\t 生成订单数：" + (++num);
    }

}
