package Seminar_1_kod;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        int count = 5;
        for (int i = 1; !(i > count); i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
