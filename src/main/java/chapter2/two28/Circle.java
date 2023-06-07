package chapter2.two28;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.println("Diameter = " + getDiameter(radius));
        System.out.println("Circumference = " + getCircumference(radius));
        System.out.println("Area = " + getArea(radius));
    }

    public static double getDiameter(int radius) {
        return radius * 2;
    }

    public static double getCircumference(int radius) {
        return getDiameter(radius) * Math.PI;
    }

    public static double getArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
