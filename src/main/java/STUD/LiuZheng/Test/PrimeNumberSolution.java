package STUD.LiuZheng.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class PrimeNumberSolution {


    public static void main(String[] args) throws InterruptedException {
        Integer count = 100000;
        long start = System.currentTimeMillis();
        PrimeNumberContext primeNumberSolution = new PrimeNumberContext(count);
        ExecutorService single = Executors.newSingleThreadExecutor();
        for (int i = 0; i < count; i++) {
            single.submit(new ComputePrime(primeNumberSolution));
        }
        primeNumberSolution.countDownLatch.await();
        single.shutdown();
        System.out.println("1个线程用时："+ (System.currentTimeMillis() - start) +"("+ primeNumberSolution.getNum() + " / "+ primeNumberSolution.getPrimeCount() +")");

        start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        PrimeNumberContext multiPrime = new PrimeNumberContext(count);
        for (int i = 0; i < count; i++) {
            executorService.submit(new ComputePrime(multiPrime));
        }
        multiPrime.countDownLatch.await(60, TimeUnit.SECONDS);
        executorService.shutdown();
        System.out.println(Runtime.getRuntime().availableProcessors() + "个线程用时：" + (System.currentTimeMillis() - start) + "(" + multiPrime.getNum() + " / " + multiPrime.getPrimeCount() + ")");


    }
}

class PrimeNumberContext{
    AtomicInteger num;
    AtomicInteger primeCount;
    CountDownLatch countDownLatch;

    public PrimeNumberContext(int limit){
        num = new AtomicInteger(1);
        primeCount = new AtomicInteger(0);
        countDownLatch  = new CountDownLatch(limit);
    }

    public int getNum() {
        return num.getAndIncrement();
    }

    public void addPrime(){
        primeCount.incrementAndGet();
    }

    public AtomicInteger getPrimeCount(){
        return primeCount;
    }

    public void decreaseLatch(){
        countDownLatch.countDown();
    }
}

class ComputePrime implements Runnable{
    PrimeNumberContext primeNumberContext;
    public ComputePrime(PrimeNumberContext primeNumber){
        this.primeNumberContext = primeNumber;
    }
    @Override
    public void run() {
        if (ckeckBinary(primeNumberContext.getNum())){
            primeNumberContext.addPrime();
        }
        primeNumberContext.decreaseLatch();
    }

    private boolean ckeckBinary(int num) {
        for (int i = num - 1; i >= 1; i--) {
            int gcd = gcd(num,i);
            if (gcd != 1){
                return false;
            }
        }
        return true;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


}