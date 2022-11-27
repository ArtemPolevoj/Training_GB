package Seminar_2_kod;

public class Difference_index_min_max_array {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 4, 9, 56, 45};
        int indexMin = 0 , indexMax = 0, sum = 0;
        for (int i = 0; i < array.length ; i++){
            if(array[i] > array[indexMax]){
                indexMax = i;
            } else if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
        if(indexMax > indexMin){
            for(int j = indexMin + 1; j < indexMax; j++){
                sum = sum + array[j];
            }
        }else{
            for(int j = indexMax + 1; j < indexMin; j++) {
                sum = sum + array[j];
            }
        }
        System.out.println("Amount = " + sum);
    }
}
