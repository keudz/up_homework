package Generics_buoi14;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//Unboun wildcard
public class wildcard {
    public static void main(String [] args){
        List <String> oj1 = List.of("wergh","dfgdv","sdfgbfgdwe");
        List <Integer> oj2 = List.of(12,3,45,67,5,43,2,45,67,65);
        print(oj1);
        print(oj2);
        System.out.println(sum(oj2));
        List <Number> oj3 = new ArrayList<>();
        List <Integer> oj4 = new ArrayList<>();
        add(oj3);
        add(oj4);
        System.out.println(oj3);
        System.out.println(oj4);

    }
  public static void print (List<?> list){
        for(Object oj : list){
            System.out.println(oj);
        }
  }
// Upper wildcard
  public static double  sum (List <? extends Number> list){
        double sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i).doubleValue();//
        }
        return sum;
  }
// Lower wildcard
     static void add (List <? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
        Integer a = (Integer) list.get(0);
     }
}
