package buoi12;

import java.util.Scanner;

public class checkege {
    public static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("enter your age:");
            int age = sc.nextInt();
            InvalidAgeException.checkage(age);
            System.out.print("done");

        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }


}