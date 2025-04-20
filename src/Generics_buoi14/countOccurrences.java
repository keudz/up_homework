package Generics_buoi14;

import java.util.List;

public class countOccurrences {
    public static void main(String[]args){
        List<Integer> interger = List.of(1,324,235,43,63,46,4,4);
        List<String> string1 = List.of("cc","cc","cc");


        System.out.println(dem(interger,4));
        System.out.println(dem(string1,"cc"));
    }
    static <T> int dem (List<T> list ,T element ){
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if( list.get(i) == element ){
                count++;
            }
        }
        return count;
    }
}
