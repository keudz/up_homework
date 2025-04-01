package buoi12;

import java.util.Scanner;

public class checknumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Vòng lặp yêu cầu người dùng nhập lại nếu có lỗi
            try {
                System.out.print("Enter an integer: "); // Yêu cầu người dùng nhập số
                int number = scanner.nextInt();


                if (number < 0) {
                    // Ném ngoại lệ NumberFormatException
                    throw new NumberFormatException("Negative number entered1");
                }
                System.out.println("Valid number: " + number);
                break;
            } catch (NumberFormatException e) {
                try{
                    throw new NegativeNumberException("Error !!");

                } catch (NegativeNumberException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }catch (Exception e){
                System.out.println("Error : invalid input");
                scanner.nextLine();
            }finally {
                scanner.close();
            }
        }
    }
}



