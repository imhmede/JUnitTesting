/*
Lab 4a
Author: Caleb Parten
Class: CS123
Purpose: check a list of doubles for ceritan data values
Date: 10/22
*/
import java.util.Scanner;
public class DoubleAnaylisis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[J\n\n     Enter 1 To check if the inputs are the same.\n\n     Enter 2 To find average inputs.\n\n     Enter 3 To find the smallest of inputs.\n\n     Enter 4 To sort inputs from smallest to largest.\n\n     Enter 5 for all.\n\n     Enter method value here: ");
        //get user input
        int MethodInput = sc.nextInt();
        System.out.print("\n     Enter number of values inputted: ");
        int NumOfInput = sc.nextInt();
        System.out.print("\033[H\033[J\n\n     Enter values for anaylisis: ");
        double values[] = new double[NumOfInput];
        for(int i=0; i<NumOfInput; i++){
            values[i] = sc.nextDouble();
            //33 spaces until i figure out the printf formating for spaces
            for(int j = 0; j < 33; j++)
                System.out.print(" ");
        }
        sc.close();
        System.out.print("\033[H\033[J\n\n     Values are:\n     ");
        for(int i=0; i<NumOfInput; i++){
            System.out.print(values[i]+"  ");
        }
        System.out.print("\n\n");
        //check to see if all inputs are the same 
        double tempSame = values[0];
        boolean checkSame = true;
        if((MethodInput==1)||(MethodInput==5)){
            for(int i=0; i<NumOfInput; i++){
                if(tempSame != values[i]){
                    checkSame = false;
                }
            }
            if(checkSame==true){
                System.out.print("     Inputted values are the same\n\n");
            }else{
                System.out.print("     Inputted values are not the same\n\n");
            }
        }
        //return the average of inputs
        double avSum=0;
        if((MethodInput==2)||(MethodInput==5)){
            for(int i=0; i<NumOfInput; i++){
                avSum += values[i];
            }
            System.out.print("     Average value is\n     "+(avSum/NumOfInput)+"\n\n");
        }
        //find the smallest of the inputs
        double tempSmall = values[0];
        if((MethodInput==3)||(MethodInput==5)){
            for(int i=0; i<NumOfInput; i++){
                if(tempSmall > values[i]){
                    tempSmall = values[i];
                }
            }
            System.out.print("     Smallest value is\n     "+tempSmall+"\n\n");
        }
        //sort from smallest to biggest using insertion sort
       if((MethodInput==4)||(MethodInput==5)){
            int length = values.length;
            for (int i = 1; i < length; ++i) {
                double tempSort = values[i];
                int j = i - 1;
                while (j >= 0 && values[j] > tempSort) {
                    values[j + 1] = values[j];
                    j--;
                }
                values[j + 1] = tempSort;
            }
            System.out.print("     Sorted values\n     ");
            for(int i=0; i<NumOfInput; i++){
                System.out.print(values[i]+"  ");
            }
            System.out.print("\n\n");
        }
    }
}
