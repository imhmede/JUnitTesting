import java.util.*;

//Saul Marmolejo
//3-24-2023
//Programming Assignment 07

public class VowelCounter{

    public static void main(String[] args){
        
        //Initialize char array
        char vowels[] = {'a','e','i','o','u','y'};

        System.out.println("Enter a word:");
        String scannerInput;
        Scanner scanner = new Scanner(System.in);
        scannerInput = scanner.next();
        scannerInput = scannerInput.toLowerCase();
        int wordLength = scannerInput.length();
        int counter = 0;

        char newArray[] = new char[wordLength];


        for (int num = 0; num < wordLength; num++){
            newArray[num] = scannerInput.charAt(num);
            
            if (newArray[num] == vowels[0] || newArray[num] == vowels[1] || newArray[num] == vowels[2]| newArray[num] == vowels[3] ||
            newArray[num] == vowels[4] || newArray[num] == vowels[5]){
                counter++;
            } 
        }


        System.out.println("The number of vowels in " + scannerInput + " is " + counter);

        
    }

}