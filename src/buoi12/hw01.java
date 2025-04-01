package buoi12;

import java.util.Scanner;

public class testone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try{
            int result = divide(num1 ,num2);
            System.out.printf("\n %d / %d = %d",num1, num2,result);
        }catch (ArithmeticException e){
            System.out.printf("error : num2 is zezo");
        }

    }
    static int divide (int num1, int num2){
        if(num2 == 0){
            throw new ArithmeticException("can not divide by zero");
        }
        return num1 /num2;
    }
}
