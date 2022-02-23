package STUD.LiuZheng.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinExample  extends RecursiveTask<Integer> {
    private final int threshold = 100; //任务大小阈值
    private int first; // 任务起始
    private int last; // 任务结束
    private List<Integer> list; // 结果集

    public ForkJoinExample(int first ,int last ,List<Integer> list){
        this.first = first;
        this.last = last;
        this.list = list;
    }

    private boolean isPrime(int num){
        for (int i = 2; i < (int) Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    @Override
    protected Integer compute() {
        int cnt = 0;
        if (last - first <= threshold){
            for (int i = first; i <= last ; i++) {
                if (isPrime(i)){
                    list.add(i);
                    cnt++;
                }
            }
        }else {
            int middle = first + (last - first) / 2;
            ForkJoinExample leftTask = new ForkJoinExample(first,middle,list);
            ForkJoinExample rightTask = new ForkJoinExample(middle + 1, last, list);
            leftTask.fork();
            rightTask.fork();
            cnt = leftTask.join() + rightTask.join();
        }
        return cnt;
    }

    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
        long start = System.currentTimeMillis();
        //创建任务
        ForkJoinExample example = new ForkJoinExample(2, 15458630, list);
        //创建ForkJoin线程池
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        //执行任务
        Integer result = forkJoinPool.invoke(example);
        System.out.println("用时：" + (System.currentTimeMillis() - start));
        System.out.println("质数个数：" + result);
        Collections.sort(list);
//        System.out.println(list);
    }
}
