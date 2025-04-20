package Generics_buoi14;

import java.util.List;

public class sumNumber {
    public static void main(String[] args){
        List <Integer> num1 = List.of(1,213,2,13423,4,324,2,4);
        List <Double> num2 = List.of(4.5,4.7,8.9,4.6);
        System.out.println(sumnumber(num1));
        System.out.println(sumnumber(num2));

    }
    static double sumnumber(List<? extends Number> list){
        double sum = 0;
        int i = 0;
        while ( list.size() > i  ){

            sum += list.get(i).doubleValue();
            i++;

        }
        return sum;
    }
}
