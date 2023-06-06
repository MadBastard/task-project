package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int[] array = new int[11];
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > 2)
                throw new RuntimeException("Not Found");
            if (array[i] == 0)
                throw new RuntimeException("Not Found");
            System.out.println();
            if (array[i] == 1) {
                System.out.println("First Class " + i);
            }
            if (array[i] == 2) {
                System.out.println("Economy " + i);
            }
        }
    }
}
