package Generics_buoi14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class swap {
    public static void main(String[] args){
        Integer [] arr1 = {1,2,3,454,32,24,52,4,2,523,4,2};
     String [] arr2 = {"sadasd","sdadas","adsada"};
     swap(arr1,0,3);
     swap(arr2,0,1);
     System.out.println(Arrays.toString(arr1));
     System.out.println(Arrays.toString(arr2));
    }
    static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    }

