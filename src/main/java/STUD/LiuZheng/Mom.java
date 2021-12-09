package STUD.LiuZheng;

import java.util.Scanner;

public class Mom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length() - t.length(); i++) {
             int minx = 0;
            for (int j = 0; j < t.length(); j++) {
                if (minx > min){
                    break;
                }
                if (s.charAt(i+j) != t.charAt(j)){
                    minx++;
                }
            }
            if (minx == 0){
                System.out.println(minx);
                return;
            }
            min = Math.min(min,minx);
        }
        System.out.println(min);
    }
}
