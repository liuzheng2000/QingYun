package STUD.LiuZheng.entity;

import STUD.LiuZheng.controller.OrderNumberCreateUtils;

public class OrderService {
     private OrderNumberCreateUtils orderNumberCreateUtil = new OrderNumberCreateUtils();

     public void getOrderNumber() {
          ZkDistributedLock zkLock = new ZkDistributedLock();
          zkLock.zkLock();
          try{

          }catch (Exception e){
               e.printStackTrace();
          }finally {
               zkLock.zkUnlock();
          }

          System.out.println(orderNumberCreateUtil.getOrderNumber());
     }
}
