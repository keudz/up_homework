package buoi12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {
    private double sodu;
    public BankAccount( double fsodu){
        sodu = fsodu;
    };

    public  void fundout(double amount) throws InsufficientFundsException {
        if( amount > sodu){
            throw new InsufficientFundsException("so tien vuot qua gioi han!!!");
        }
        sodu -= amount;
        System.out.println("so tien con lai la:" +(sodu) );
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount ttk = new BankAccount(500);
        double so_tien_can_rut;
        while (true){
            try{
                System.out.println();
                System.out.print("nhap so tien can rut :");
                so_tien_can_rut = sc.nextDouble();
                ttk.fundout(so_tien_can_rut);

                break;
            }catch( InsufficientFundsException e){
                System.out.print(e.getMessage());
            }catch (InputMismatchException e){
                System.out.println("sai dinh dang!!!");
                sc.nextLine();
            }
        }




    }
}
