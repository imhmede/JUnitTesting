import java.util.*;

//Saul Marmolejo
//4-7-2023
//Programming Assignment 10


public class ReverseString {

    public static String reverse(String str){

        int strLength = str.length();
        char[] letters = new char[strLength];
        char[] reverse = new char[strLength];


        //Making array of characters from the string
        for (int i = 0; i < strLength; i++){
            letters[i] = str.charAt(i);
        }
        //Reversing the the char array
        for (int i = 0; i < strLength; i++){
            reverse[i] = letters[strLength-1-i];
        }

        //Making char array into string
        String reversedString = new String(reverse);
        
        return reversedString;

    }
    public static void main(String[] args){
        String word;
        System.out.println("Enter a word:");
        Scanner myScan = new Scanner(System.in);
        word = myScan.next();

        System.out.println(reverse(word));



    }
}