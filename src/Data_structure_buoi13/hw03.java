package Data_structure_buoi13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hw03 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Set<Integer> num = new HashSet<>();
       int number = 0;
       int []arr = {1,2,3,4,34,45,46,4,3,56,45,2,5};
       for( int i = 0; i < arr.length; i++){
           num.add(arr[i]);
       }
       for(Integer nums: num){
           number++;
       }
       for(Integer nums: num){
           System.out.print(nums + " ");
       }System.out.println("có " + number + " phẩn tử khác nhau");


   }
}


