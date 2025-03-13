/*
 * John Norman
 * Oct 30 2022
 * CS 123
 */

import java.util.Scanner;

public class Lab5_b {
    public static String middle(String str) {
        if (str.length() %2 == 0) {
            return str.substring((str.length()/2)-1, (str.length()/2)+1);
        }
        else {return str.substring((str.length()/2), (str.length()/2)+1);
        }
    }

    public static String repeat(String str, int n) {
        return (str.repeat(n));
    }

    public static int countVowels(String str) {
        char[] ch = str.toCharArray();
        int vowels = 0;
        for (char c : ch) {
            if (c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' || 
                c == 'u' || c == 'U') {
                vowels++;
            }
        }
        return vowels;
    }

    public static int countWords(String str) {
        String[] strArray = str.split(" ");
        return strArray.length;
    }

    public static void main(String[] args) {
        String str = "";
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a string: ");
        str = input.nextLine();
        System.out.println("Give me a multiplier: ");
        num = input.nextInt();
        input.close();
        System.out.println("middle: " + middle(str));
        System.out.println("repeat: " + repeat(str, num));
        System.out.println("countVowels: " + countVowels(str));
        System.out.println("countWords: " + countWords(str));
    }

}