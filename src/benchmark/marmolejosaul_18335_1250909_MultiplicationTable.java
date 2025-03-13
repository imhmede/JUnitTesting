import java.util.*;

//Saul Marmolejo
//3-28-2023
//Programming Assignment 08


public class MultiplicationTable {
    
public static void main(String[] args){
    final int maxValue = 12;
    final int minValue = 1;
    System.out.println("Enter a number between 1 and 12: ");
    Scanner scanner = new Scanner(System.in);
    int scannedValue = scanner.nextInt();

    if (scannedValue >= minValue - 1 && scannedValue < maxValue + 1){
        for (int i = 0; i <= maxValue; i++){
            System.out.print(scannedValue + " x " + i + " = ");
            System.out.print(scannedValue * i);
            System.out.println(" ");

        }
    } else {
        System.out.println("Number is not between 1 and 12.");
    }




}

}
