package Data_structure_buoi13;

import java.util.Scanner;
import java.util.Stack;

public class hw04 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String words = sc.nextLine();
        for(int i = 0 ; i < words.length(); i++){
            stack.push(words.charAt(i));
        }
        for(int i = 0; i < words.length();i++){
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
