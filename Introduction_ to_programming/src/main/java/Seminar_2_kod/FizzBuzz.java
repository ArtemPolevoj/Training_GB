package Seminar_2_kod;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        int[] array = new int[100];
        ArrayList<Object> newArray = new ArrayList<>(array.length);
        for (int i = 0, j = 1; i < array.length; i++, j++) {
            array[i] = j;
        }
        for (int k:array) {
            if(k % 15 == 0){
                newArray.add("FizzBuzz!");
            } else if (k % 3 == 0) {
                newArray.add("Fizz!");
            } else if (k % 5 == 0) {
                newArray.add("Buzz!");
            }else {
                newArray.add(k);
            }
        }
        for (Object obj:newArray) {
            System.out.println(obj);
        }
    }
}
