package STUD.LiuZheng.service;

import STUD.LiuZheng.controller.OrderNumberCreateUtils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OrderService {

    private Lock lock = new ReentrantLock();
    private OrderNumberCreateUtils orderNumberCreateUtils = new OrderNumberCreateUtils();

    public String getOrderNumber(){
        lock.lock();
        try{
            return orderNumberCreateUtils.getOrderNumber();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        return null;
    }
}
