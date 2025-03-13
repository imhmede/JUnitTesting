package me.chasebrown;

// Chase Brown

import java.util.Scanner;

public class LabFive {


    public LabFive() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Please enter a number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Please enter a number: ");
        double num3 = scanner.nextDouble();

        System.out.println();

        System.out.println(allTheSame(num1, num2, num3));
        System.out.println(average(num1, num2, num3));
        System.out.println(theSmallest(num1, num2, num3));
    }

    public static void main(String[] args) {
        new LabFive();
    }

    public boolean allTheSame(double x, double y, double z) {
        return (x == y && x == z);
    }

    double average(double x, double y, double z) {
        double sum = x + y + z;
        return sum / 3;
    }

    double theSmallest(double x, double y, double z) {
        if (x < y && x < z) {
          return x;
        } else if (y < x && z < x) {
            return y;
        } else if (z < x && z < y) {
            return z;
        }
        return x;
    }

    boolean sorted(double x, double y, double z) {
        return true;
    }
}

