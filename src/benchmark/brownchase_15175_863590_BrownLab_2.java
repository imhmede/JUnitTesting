package me.chasebrown;

// Chase Brown
// 9/1/2022
// Lab 1

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        // Variables
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("HHmm");

        // Get the first time
        System.out.print("Please enter the first time: ");
        String input = scanner.nextLine();
        Date firstDate = sdf.parse(input);

        // Get the second time
        System.out.print("Please enter the second time: ");
        input = scanner.nextLine();
        Date secondDate = sdf.parse(input);

        // Calculate difference
        long diff = firstDate.getTime() - secondDate.getTime();
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        // for some reason the number is negative sometimes, so we will check for that
        if (diffMinutes < 0) {
            diffMinutes *= -1;
        }
        if (diffHours < 0) {
            diffHours *= -1;
        }

        // print result
        System.out.print(diffHours + " hours and " + diffMinutes + " minutes ");
    }


}

