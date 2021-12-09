package STUD.LiuZheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        String[] split = s.split(",");
//        int[] ints = new int[split.length];
//        for (int i = 0; i < split.length; i++) {
//            ints[i] = Integer.parseInt(split[i]);
//        }
//        Arrays.sort(ints);
//        String target = scanner.nextLine();
//        int shengyu = Integer.parseInt(target);
//        int sum = 0;
//            for (int i = ints.length - 1; i >=0 ; i--) {
//                while (shengyu >= ints[i]){
//                    sum++;
//                    shengyu = shengyu - ints[i];
//                }
//        }
//            if (shengyu == 0){
//                System.out.println(sum);
//            }else {
//                System.out.println(-1);
//            }
//    }
//}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(";");
        String s1 = split[0];
        String s2 = split[1];
        String[] split1 = s1.split(",");
        String[] split2 = s2.split(",");
        int length;
        if (split1.length >= split2.length){
            length = split1.length;
        }else {
            length = split2.length;;
        }
        int[] ints1 = new int[length];
        int[] ints2 = new int[length];
        int index = 0;
        for (String sb : split1) {
            ints1[index] = Integer.parseInt(sb);
            index++;
        }
        index = 0;
        for (String sb : split2) {
            ints2[index] = Integer.parseInt(sb);
            index++;
        }
        if (s1.equals("")){
            System.out.println(ints2[3]);
        }
        if (s2.equals("")){
            System.out.println(ints1[3]);
        }

        int count = 0;
        for (int i = 0; i < ints1.length;) {
            for (int j = 0; j < ints2.length;) {
                if (ints1[i] < ints2[j]){
                    count++;
                    if (count == 4){
                        System.out.println(ints1[i]);
                    }
                    i++;
                }else if (ints1[i] > ints2[j]){
                    count++;
                    if (count == 4){
                        System.out.println(ints2[j]);
                    }
                    j++;
                }else {
                    count+=2;
                    if (count == 5){
                        System.out.println(ints1[i]);
                    }
                    i++;
                    j++;
                }
            }
        }
    }
}