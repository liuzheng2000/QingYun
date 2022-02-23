package STUD.LiuZheng.Test;



/**
 * @author qingyun
 * @version 1.0
 * @date 2021/4/12 19:02
 */

import java.util.*;

//public class Main {
//    public static void main(String[] args) {
//        int[][] ints = new int[53][53];
//        for (int i = 1; i <= 52; i++) {
//            ints[i][0]=i;
//        }
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//            System.out.println(c-97);
//            ints[c-97][1] +=1;
//        }
//        Arrays.sort(ints, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[2] - o2[2];
//            }
//        });
//        for (int[] anInt : ints) {
//            if (anInt[1] != 0){
//                char c = (char) (anInt[0] + 97);
//                for (int i = 0; i < anInt[1]; i++) {
//                    System.out.println(c);
//                }
//            }
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String length = scanner.nextLine();
//
//        int[][] properties = new int[Integer.parseInt(length)][Integer.parseInt(length)];
//        for (int i = 0; i < Integer.parseInt(length); i++) {
//            String propertiesValue = scanner.nextLine();
//            String[] s = propertiesValue.split(" ");
//            properties[i][0] = Integer.parseInt(s[0]);
//            properties[i][1] = Integer.parseInt(s[1]);
//        }
//
//
//        Arrays.sort(properties, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] - o2[0];
//            }
//        });
//
//
//        int count = 0;
//        for (int i = 0; i < properties.length; i++) {
//            for (int j = i; j < properties.length; j++) {
//                if (properties[i][1] <= properties[j][1]){
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}

//class Result {
//
//    /*
//     * Complete the 'swapAdjacent' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts INTEGER_ARRAY array as parameter.
//     */
//
//    public static List<Integer> swapAdjacent(List<Integer> array) {
////        List<Integer> res = new ArrayList<>();
////        Scanner scanner = new Scanner(System.in);
////        Integer size = scanner.nextInt();
////
//        for (Integer integer : array) {
//            System.out.println(integer);
//        }
//        return null;
//    }
//
//}

//class Solution {
//    public String pushDominoes(String dominoes) {
//        char[] s = dominoes.toCharArray();
//        int n = s.length,i = 0;
//        char left = 'L';
//        while (i < n){
//            int j = i ;
//            while (j < n && s[j] == '.'){
//                j++;
//            }
//            char right = j < n ? s[j] : 'R';
//            if (left == right){
//                while (i < j){
//                    s[i++] = right;
//                }
//            }else if (left == 'R' && right == 'L'){
//                int k = j - 1;
//                while (i < k){
//                    s[i++] = 'R';
//                    s[k--] = 'L';
//                }
//            }
//            left = right;
//            i = j+1;
//        }
//        return new String(s);
//    }
//}

//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        for (int i = 0; i < n-1; i++) {
//            if (nums[i] == nums[i+1]){
//                return true;
//            }
//        }
//        return false;
//    }
//}


//class Solution {
//    public int maxSubArray(int[] nums) {
//        int pre = 0 ;int maxNum = nums[0];
//        for (int num : nums) {
//            pre = Math.max(pre+num,num);
//            maxNum = Math.max(maxNum,pre);
//        }
//        return maxNum;
//    }
//}

//class Solution {
//    public int maxSubArray(int[] nums) {
//        int pre = 0; int maxNum = nums[0];
//        for (int num : nums) {
//            pre = Math.max(num,pre + num);
//            maxNum = Math.max(pre,maxNum);
//        }
//        return maxNum;
//    }
//}

//public class Solution{
//    public static int longestValidStr(String s){
//        //创建一个栈
//        LinkStack liststack = new Stack();
//        //s作为char类型数组
//        char[] chars = s.toCharArray();
//
//    }
//}


//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            hashMap.put(nums[i],i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if ((hashMap.get(target-nums[i]) != null) && (i!=hashMap.get(target-nums[i]))){
//                int width[] = {i,hashMap.get(target-nums[i])};
//                return width;
//            }
//        }
//        return null;
//    }
//}

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            hashMap.put(nums[i],i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if ((hashMap.get(target - nums[i]) != null) && (i != hashMap.get(target - nums[i]))){
//                int width[]  = {i , hashMap.get(target - nums[i])};
//                return width;
//            }
//        }
//        return null;
//    }
//}


//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int p1 = 0, p2 = 0;
//        int[] sorted = new int[m + n];
//        int cur = 0;
//        while (p1 < m || p2 < n){
//            if (p1 == m){
//                cur = nums2[p2++];
//            }else if (p2 == n){
//                cur = nums1[p1++];
//            }else if (nums1[p1] < nums2[p2]){
//                cur = nums1[p1++];
//            }else {
//                cur = nums2[p2++];
//            }
//            sorted[p1+p2-1] = cur;
//        }
//        for (int i = 0; i != m+n ; i++) {
//            nums1[i] = sorted[i];
//        }
//    }
//}


//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int p1 = 0 , p2 = 0;
//        int[] sorted = new int[m + n];
//        int cur = 0;
//        while (p1 < m || p2 <n) {
//            if (p1 == m){
//                cur = nums2[p2];
//                p2++;
//            }else if (p2 == n){
//                cur = nums1[p1];
//                p1++;
//            }else if (nums1[p1] < nums2[p2]){
//                cur = nums1[p1];
//                p1++;
//            }else {
//                cur = nums2[p2];
//                p2++;
//            }
//            sorted[p1+p2-1] = cur;
//        }
//
//        for (int i = 0; i != m+n ; i++) {
//            nums1[i] = sorted[i];
//        }
//    }
//}

//
//import java.util.Vector;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.Executors;
//import java.util.concurrent.atomic.AtomicInteger;
//
//class Solution {
//    public int[] listPrimes(int n, int threads) throws InterruptedException {
//
//        var vector = new Vector<Integer>(n);
//        var executorService = Executors.newFixedThreadPool(threads);
//        AtomicInteger count = new AtomicInteger(0),
//                curr = new AtomicInteger(2), limit = new AtomicInteger(Integer.MAX_VALUE);
//
//        CountDownLatch cdl = new CountDownLatch(threads);
//        Runnable runnable = () -> {
//            while (true) {
//                int num = curr.getAndIncrement();
//                if (num > limit.get()) {
//                    cdl.countDown();
//                    break;
//                }
//
//                if (isPrime(num)) {
//                    vector.add(num);
//                    if (count.incrementAndGet() == n) {
//                        limit.set(num);
//                    }
//                }
//            }
//        };
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < threads; i++) {
//            executorService.submit(runnable);
//        }
//        cdl.await();
//        System.out.println(System.currentTimeMillis() - start);
//        System.out.println(vector.size());
//        executorService.shutdown();
//        return vector.stream().sorted().limit(n).mapToInt(o -> o).toArray();
//    }
//
//    private static boolean isPrime(int num) {
//        int limit = (int) Math.sqrt(num);
//        for (int i = 2; i <= limit; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        int input = 1_000_000;
//        int count = 0;
//        long start = System.currentTimeMillis();
//        for (int i = 0; count < input; i++) {
//            if (isPrime(i)) {
//                count++;
//            }
//        }
//        System.out.println(System.currentTimeMillis() - start);
//        new Solution().listPrimes(input, Runtime.getRuntime().availableProcessors());
//    }
//}





import java.util.*;

//
// class Solution {
//
//    //千子数处理
//    public StringBuffer qianzi( int i ,StringBuffer stringBuilder ){
//        if (i >= 1000){
//            int i1 = i / 1000;
//            stringBuilder.append(i1).append("q");
//            i = i%1000;
//        }
//        if (i >= 100){
//            int i1 = i / 100;
//            stringBuilder.append(i1).append("b");
//            i = i%100;
//        }
//        if (i >= 10){
//            int i1 = i / 10;
//            stringBuilder.append(i1).append("s");
//            i = i%10;
//        }
//        if (i >= 1){
//            int i1 = i / 1;
//            stringBuilder.append(i1);
//        }
//        return stringBuilder;
//    }
//
//
//    public StringBuffer xiaoyuwqianzi( int i ,StringBuffer stringBuilder ){
//        if (i == 0){
//            return stringBuilder;
//        }
//        if (i >= 1000){
//            int i1 = i / 1000;
//            stringBuilder.append(i1).append("q");
//            i = i%1000;
//        }else {
//            stringBuilder.append(0);
//        }
//        if (i >= 100){
//            int i1 = i / 100;
//            stringBuilder.append(i1).append("b");
//            i = i%100;
//        }
//        if (i >= 10){
//            int i1 = i / 10;
//            stringBuilder.append(i1).append("s");
//            i = i%10;
//        }
//        if (i >= 1){
//            int i1 = i / 1;
//            stringBuilder.append(i1);
//        }
//        return stringBuilder;
//    }
//
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * 将输入的整数 n（0 <= n && n < 1千万）转换为中文数字大写格式
//     * @param n int整型 输入的整数
//     * @return string字符串
//     */
//
//    public String chinese_number (int n) {
//
//        // write code here
//        StringBuffer stringBuffer = new StringBuffer();
//        //处理万字位数
//        if ( n >= 10000){
//            int nw = n / 10000;
//            stringBuffer = qianzi(nw, stringBuffer);
//            stringBuffer.append("w");
//            n = n%10000;
//        }else {
//            return qianzi(n,stringBuffer).toString();
//        }
//        return xiaoyuwqianzi(n,stringBuffer).toString();
//    }
//
//}

import java.util.*;
import java.util.stream.IntStream;


//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     *
//     * @param list int整型一维数组
//     * @return int整型一维数组
//     */
//    public int[] unique (int[] list) {
//        HashSet<Integer> integers = new HashSet<>();
//        ArrayList<Integer> re = new ArrayList<>();
//        for (Integer integer : list) {
//            if (integers.contains(integer)){
//            }else {
//                integers.add(integer);
//                re.add(integer);
//            }
//        }
//        int[] reints = new int[re.size()];
//        for (int i = 0; i < re.size(); i++) {
//            reints[i] = re.get(i);
//        }
//        return reints;
//    }
//}


import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

 class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param l1 ListNode类
     * @param l2 ListNode类
     * @return ListNode类
//     */
    public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        int jinwei = 0;
        ListNode head = null;ListNode tail = null;
        while (l1 != null || l2 != null){
            int l1val = 0; int l2val = 0;
            if (l1 != null){
                l1val = l1.val;
            }
            if (l2 != null){
                l2val = l2.val;
            }

            if (head == null){
                head = tail = new ListNode((l1val + l2val + jinwei) % 10);
            }else {
                tail.next = new ListNode((l1val + l2val + jinwei) % 10);
                tail = tail.next;
            }

            if ((l1val + l2val + jinwei) >= 10){
                jinwei = (l1val + l2val + jinwei) / 10;
            }else {
                jinwei = 0;
            }

            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (jinwei > 0){
            tail.next = new ListNode(jinwei);
        }
        return head;
    }
}