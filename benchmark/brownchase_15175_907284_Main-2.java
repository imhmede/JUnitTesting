package me.chasebrown;

// Chase Brown

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.print("Please enter a series of numbers, enter any letter/word to stop: ");

        while (true) {
            try {
                input = scanner.nextLine();
                numList.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                break;
            }

        }
        printList(numList);
        System.out.println("Largest Number is: " + findLargestNum(numList));
        System.out.println("Smallest Number is: " + findSmallestNum(numList));
        System.out.println("Number of Odd Numbers is: " + findOddNumberAmount(numList));
        System.out.println("Number of Even Numbers is: " + findEvenNumberAmount(numList));
        System.out.print("Cumulative totals: ");
        printCumulativeTotals(numList);
        System.out.print("List without duplicates: ");
        printNoDuplicates(numList);

    }

    public static void printList(ArrayList<Integer> list) {
        System.out.println("Numbers: ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int findLargestNum(ArrayList<Integer>  list) {
        int largestNum = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (i > largestNum) largestNum = i;
        }
        return largestNum;
    }

    public static int findSmallestNum(ArrayList<Integer>  list) {
        int smallestNum = Integer.MAX_VALUE;
        for (Integer i : list) {
            if (i < smallestNum) smallestNum = i;
        }
        return smallestNum;
    }

    public static int findOddNumberAmount(ArrayList<Integer> list) {
        int oddNumCount = 0;
        for (Integer i : list)
            if (i % 2 != 0) oddNumCount++;
        return oddNumCount;
    }

    public static int findEvenNumberAmount(ArrayList<Integer> list) {
        int evenNumCount = 0;
        for (Integer i : list)
            if (i % 2 == 0) evenNumCount++;
        return evenNumCount;
    }

    public static void printCumulativeTotals(ArrayList<Integer> list) {
        int prevNum = 0;
        for (int i = 0; i < list.size(); i++) {
            int addedNum = list.get(i) + prevNum;
            System.out.print(addedNum + " ");
            prevNum = addedNum;
        }
        System.out.println();
    }

    public static void printNoDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> numSet = new HashSet<>(list);
        for (Integer i : numSet) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

