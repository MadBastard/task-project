package chapter2.two16;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("These numbers is larger:" + a);
        }
        if (a < b) {
            System.out.println("These numbers is larger:" + b);
        }
        if (a==b){
            System.out.println("These numbers are equal:" + a);
        }
    }
}
