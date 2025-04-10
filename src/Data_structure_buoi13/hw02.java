package Data_structure_buoi13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hw02 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String ,Integer> map = new HashMap<>();

        String input = sc.nextLine();
        String [] words = input.split(" ");
        for( int i = 0; i < words.length; i++){
            if(map.containsKey(words[i])){
                   map.put(words[i],map.get(words[i]) + 1);
            }else
                map.put(words[i], 1);
        }

          for (Map.Entry<String, Integer> entry : map.entrySet()) {
              System.out.println(entry.getKey() + "=" + entry.getValue());
          }

              }

          }



