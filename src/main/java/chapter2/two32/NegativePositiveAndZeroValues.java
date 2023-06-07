package chapter2.two32;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int positive = 0;
        int negative = 0;
        int amountOfZero = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > 0) {
                positive++;
            }
            if (array[i] < 0) {
                negative++;
            }
            if (array[i] == 0) {
                amountOfZero++;
            }
        }
        System.out.println("Positive numbers is:" + positive);
        System.out.println("Negative numbers is:" + negative);
        System.out.println("Zero numbers is:" + amountOfZero);
    }
}
