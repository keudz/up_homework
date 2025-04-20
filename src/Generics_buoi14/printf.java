package Generics_buoi14;

import java.util.Objects;

//Generics method
public class printf {
   public static void main(String[] args){
       Integer [] oj1 = {1,232,45,67,8,6,54,32};
       String [] oj2 = {"qwert","sdfg","asdfg","sdcvb"};
       print(oj1);
       print(oj2);
   }
   static <T> void print( T [] list){
       for(int i  = 1; i < list.length; i++){
           System.out.print(" "+list[i]);

       }
   }
}
