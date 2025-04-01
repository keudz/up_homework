package buoi12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        while (true) {
            System.out.print("enter an integer: ");
            try {
                input = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("error !!! , enter again!");
                sc.nextLine();
            }
        }
        System.out.println("the integer you enter is : " + input);
    }
}

