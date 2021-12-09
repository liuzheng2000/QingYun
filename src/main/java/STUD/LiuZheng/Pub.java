package STUD.LiuZheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Pub {
    public static void main(String[] args) {
        int length;  int index = 0;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = " "+s +" ";
        String[] split = s.split(";");
        String s1 = split[0];
        String s2 = split[1];
        if (s1.equals(" ")){
            s2 = s2.trim();
            String[] split2 = s2.split(",");
            length = split2.length;;
            int[] ints2 = new int[length];
            index = 0;
            for (String sb : split2) {
                ints2[index] = Integer.parseInt(sb);
                index++;
            }
            System.out.println(ints2[3]);
            return;
        }
        if (s2.equals(" ")){
            s1 = s1.trim();
            String[] split1 = s1.split(",");
            length = split1.length;
            int[] ints1 = new int[length];
            for (String sb : split1) {
                ints1[index] = Integer.parseInt(sb);
                index++;
            }
            System.out.println(ints1[3]);
            return;
        }
        s2 = s2.trim();
        s1 = s1.trim();
        String[] split1 = s1.split(",");
        String[] split2 = s2.split(",");

        if (split1.length >= split2.length){
            length = split1.length;
        }else {
            length = split2.length;;
        }
        int[] ints1 = new int[length];
        int[] ints2 = new int[length];

        for (String sb : split1) {
            ints1[index] = Integer.parseInt(sb);
            index++;
        }
        index = 0;
        for (String sb : split2) {
            ints2[index] = Integer.parseInt(sb);
            index++;
        }
        int count = 0;
        int i = 0 , j = 0;
        while (i < ints1.length && j<ints2.length){
            if (ints1[i] < ints2[j]){
                count++;
                if (count == 4){
                    System.out.println(ints1[i]);
                    return;
                }
                i++;
            }else if (ints1[i] > ints2[j]){
                count++;
                if (count == 4){
                    System.out.println(ints2[j]);
                    return;
                }
                j++;
            }else {
                count+=2;
                if (count == 4){
                    System.out.println(ints1[i]);
                    return;
                }
                i++;
                j++;
            }
        }
        if (count < 4){
            if ( i ==ints1.length ){
                System.out.println(ints2[4-ints1.length - j ]);
                return;
            }else {
                System.out.println(ints1[4-ints2.length - i ]);
                return;
            }
        }
    }
}