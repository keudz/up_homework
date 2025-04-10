package Data_structure_buoi13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class hw05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []arr = { 123,4,56,457,8,654,3,456,7865,432,45,67};
        Queue<Integer> num = new LinkedList<>();
        for(int i = 0; i < arr.length; i++){
            num.offer(arr[i]);
        }
        for(int i = 0; i < arr.length;i++){
            System.out.println(num.peek());
            num.poll();
        }
    }
}
