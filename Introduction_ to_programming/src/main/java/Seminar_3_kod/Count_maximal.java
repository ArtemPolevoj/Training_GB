package Seminar_3_kod;

public class Count_maximal {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 3, 8, 2, 6, 8, 8};
        int count_maximal = 0, index = 0;
        int maximum = numbers[index];
        while (index < numbers.length){
            if(numbers[index] > maximum){
                maximum = numbers[index];
                count_maximal = 1;
            } else if (numbers[index] == maximum) {
                count_maximal = count_maximal + 1;
            }
            index = index + 1;
        }
        System.out.println("Count " + count_maximal);
    }
}
