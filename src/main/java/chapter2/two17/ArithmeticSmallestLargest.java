package chapter2.two17;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Sum:" + (a + b + c));
        System.out.println("Average:" + ((a * b * c) / 3));
        System.out.println("Product:" + (a * b * c));
        if (a < b && a < c) {
            System.out.println("These number is smallest:" + a);
        }
        if (b < a && b < c) {
            System.out.println("These number is smallest:" + b);
        }
        if (c < a && c < b) {
            System.out.println("These number is smallest:" + c);
        }
        if (a > b && a > c) {
            System.out.println("These number is larger:" + a);
        }
        if (b > a && b > c) {
            System.out.println("These number is larger:" + b);
        }
        if (c > a && c > b) {
            System.out.println("These number is larger:" + c);
        }

    }
}
