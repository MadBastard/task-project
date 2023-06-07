package chapter2.two24;

import java.util.Scanner;

public class LargestandSmallestIntegers {
    public static void main(String[] args) {

        int[] array = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for (int array1 : array) {
            if (min <= array1) {
                min = array1;
            }

            if (max >= array1) {
                max = array1;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
