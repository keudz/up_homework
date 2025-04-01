package buoi12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[10];
        while(true){
            try{
                System.out.print("enter index for array:");
                int i = sc.nextInt();
                System.out.print("enter the value:");
                arr[i] = sc.nextInt();
                System.out.printf("arr[%d] = %d" ,i,arr[i]);
                break;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("invalid array index,enter again!!!");
                sc.nextLine();
            }catch(InputMismatchException e){
                System.out.println("invalid input,enter again");
                sc.nextLine();
            }
        }
    }

}
