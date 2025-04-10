package Data_structure_buoi13;

import java.util.ArrayList;
import java.util.Scanner;

public class hw01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Double> num = new ArrayList<>();
        int op;
        double n;
        int index;
        double element;

        while (true){
            System.out.println("nhap lua chon");
            System.out.println("chon 1 de them so");
            System.out.println("chon 2 de xoa so");
            System.out.println("chon 3 de xem tap hop so do");
            System.out.println("chon 4 de sửa số");
            System.out.print("chon option:");
             op = sc.nextInt();
        switch (op){
            case 1:
                 n = sc.nextDouble();
                num.add(n);
                break;
            case 2:
                n = sc.nextDouble();
                num.remove(n);
                break;
            case 3:
                for(Double nums : num){
                    System.out.println(nums);
                }
                break;
            case 4:
                index = sc.nextInt();
                element = sc.nextDouble();
                num.set(index,element);
            default:
                System.out.println("k có option hợp lệ");
                return;
        }

    }
}
}
