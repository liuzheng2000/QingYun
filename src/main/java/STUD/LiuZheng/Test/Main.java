package STUD.LiuZheng.Test;



/**
 * @author qingyun
 * @version 1.0
 * @date 2021/4/12 19:02
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] ints = new int[53][53];
        for (int i = 1; i <= 52; i++) {
            ints[i][0]=i;
        }
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            ints[c-97][1] +=1;
        }
        Arrays.sort(ints, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        for (int[] anInt : ints) {
            if (anInt[1] != 0){
                char c = (char) (anInt[0] + 97);
                for (int i = 0; i < anInt[1]; i++) {
                    System.out.println(c);
                }
            }
        }
    }
}


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