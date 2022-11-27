package Seminar_2_kod;

public class Average_array {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 4, 9, 56, 45};
        int sum = 0;
        double average;
        for (int i:array) {
            sum = sum + i;
        }
        average = (double) sum / array.length;
        System.out.println("Average = " + average);
    }
}
