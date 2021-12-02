package STUD.LiuZheng;



/**
 * @author qingyun
 * @version 1.0
 * @date 2021/4/12 19:02
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(",");
        int length = split.length;
        String[] baogouhetangshu = split[length-1].split("#");
        int tangshu = Integer.parseInt(baogouhetangshu[1]);
        if (length+1 < tangshu){
            System.out.println("趟数必须小于等于【包裹个数】");
        }
        int[] baogou = new int[length];
        baogou[baogou.length-1]  = Integer.parseInt(baogouhetangshu[0]);
        for (int i = 0; i < length-1; i++) {
            baogou[i] = Integer.parseInt(split[i]);
        }
        int maxBao = 0;
        int sum = 0;
        for (int i : baogou) {
            maxBao = Math.max(maxBao,i);
            sum+=i;
        }

        while((maxBao % 5)!=0){
            maxBao++;
        }

        for (int i = maxBao; i < Integer.MAX_VALUE; i+=5) {
            if ((i * tangshu)  >= sum){
                System.out.println(i);
                break;
            }
        }

    }
}
