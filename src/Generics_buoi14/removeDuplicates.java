package Generics_buoi14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> op = new ArrayList<>();
        op.add(1);
        op.add(1);
        op.add(4);
        op.add(3);
        op.add(3);
        op.add(2);
        op.add(2);
        List <Integer> op1 = removeduplicates(op);
        System.out.println(op1);
    }

    public static <E> ArrayList<E> removeduplicates(ArrayList<E> list) {
        Set<E> num = new HashSet<>(list);
        return new ArrayList<>(num);
    }
}