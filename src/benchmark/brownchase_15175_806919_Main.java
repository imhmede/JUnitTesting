package me.chasebrown;

// Chase Brown
// 9/1/2022
// Lab 1

public class Main {

    public static void main(String[] args) {
        // init 1000
        // 5% interest
        double principal = 1000;
        double interestRate = 0.05;

        double oneYearInterest = principal * interestRate * 1;
        System.out.println("Year 1 Balance: " + (principal + oneYearInterest));
        System.out.println("Year 2 Balance: " + (principal + oneYearInterest * 2));
        System.out.println("Year 3 Balance: " + (principal + oneYearInterest * 3));
    }

}
