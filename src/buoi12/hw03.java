package buoi12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        try{
           number1 = sc.nextInt();
           number2 = sc.nextInt();
           int sum = number1 + number2;
           System.out.println("sum = " + sum);
        }catch (InputMismatchException e){
          System.out.println("error!!");
        }finally {
            System.out.println("program has terminated");

        }
    }
}
