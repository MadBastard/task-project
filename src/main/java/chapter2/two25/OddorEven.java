package chapter2.two25;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 1) {
            System.out.println(a + " is odd");
        } else {
            System.out.println(a + " is even");
        }
    }
}
