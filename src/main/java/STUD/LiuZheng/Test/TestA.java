package STUD.LiuZheng.Test;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class TestA {
    public static void addList (@NotNull List<Integer> addArrayList){
        addArrayList.add(5);
    }

    public static void addString (@NotNull StringBuilder stringBuilder){
       stringBuilder.append("521");
    }
    /**
     * List 会加入新的数值
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(2);
        integers.add(3);
        addList(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        StringBuilder stringBuilder = new StringBuilder("23");
        addString(stringBuilder);
        String s = stringBuilder.toString();
        System.out.println(s);
    }
}
