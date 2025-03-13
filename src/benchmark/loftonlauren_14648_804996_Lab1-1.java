/*
Calculating Interest
Name: Lauren Lofton
Date: 8/30/22
Class: CS 123
 */
import java.text.NumberFormat;

public class Lab1 {

    public static void main(String[] args)
    {
        //formats numbers into currency
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        
        double balance = 1000; 
        double rate = 5;
        int years = 3;
        
        //Start of final statement
        System.out.println("With a starting balance of " + dollars.format(balance) + " and a " + rate + "% interest rate, your end of year balance will be:");
        
//Start of for loop that counts down the years and adds previous balance to new interest amount
        for (int i = 0; i < years; i++) {
            double interest = balance * (rate / 100);
            balance = interest + balance;
            int year = i + 1;
            
            //End of final statement
            System.out.println("Year " + year + ": " + dollars.format(balance));
        }
    }
}
