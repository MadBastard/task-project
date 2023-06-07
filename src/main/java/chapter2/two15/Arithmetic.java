package chapter2.two15;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum:" + (a + b));
        System.out.println("Product:" + (a * b));
        System.out.println("Difference:" + (a - b));
        System.out.println("Quotient:" + (a / b));
    }
}
