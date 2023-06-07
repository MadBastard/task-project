package chapter2.two30;

import java.util.Scanner;

public class SeparatingTheDigitsIsAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = (int) Math.pow(10, String.valueOf(a).length()); i >= 10; i /= 10) {
            System.out.print(a % i / (i / 10) + " ");
        }
    }
}
