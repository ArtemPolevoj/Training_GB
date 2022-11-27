package Seminar_2_kod;

import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 4, 9, 56, 45};

        System.out.println("Input " + Arrays.toString(array));
        for (int i = 0, temp; i < array.length / 2; i++){
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Reverse " + Arrays.toString(array));
    }
}
