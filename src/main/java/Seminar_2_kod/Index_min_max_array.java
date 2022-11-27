package Seminar_2_kod;

public class Index_min_max_array {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 4, 9, 56, 45};
        int indexMin = 0 , indexMax = 0;
        for (int i = 0; i < array.length ; i++){
            if(array[i] > array[indexMax]){
                indexMax = i;
            } else if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
        System.out.println("IndexMin = " + indexMin + "\nIndexMax = " + indexMax);
    }
}
