/**
Lab4
Author: Caleb Parten
Class: CS123
Purpose: Find values of certian specified things 
Date: 10/17
*/
import java.util.Scanner;
class IntegerAnylisis {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\033[H\033[J\n\n     Enter 1 for the smallest and largest inputs.\n\n     Enter 2 for the number of even and odd inputs.\n\n     Enter 3 for cumulitive totals.\n\n     Enter 4 for all adjacent inputs\n\n     Enter 5 for all.\n\n     Enter method value here: ");
    //get user input
    int MethodInput = sc.nextInt();
    System.out.print("\n     Enter value for integer:");
    String Input = sc.next();
    sc.close();
    //transfer from string to array
    int Length = String.valueOf(Input).length();
    int values[] = new int[Length];
    for(int i = 0; i<Length; i++){
        values[i] = Integer.parseInt(Character.toString(Input.charAt(i)));
    }
    System.out.print("\033[H\033[J\n\n     Intger value is:"+Input+"\n");
    //find smallest and biggest numbers in the array
    int tempS=10,tempL=0;
    if((MethodInput==1)||(MethodInput==5)){
        for(int i = 0; i<Length; i++){
            if(tempS>values[i])
                tempS=values[i];
            if(tempL<values[i])
                tempL=values[i];
        }
        System.out.print("\n     Largest value is: "+tempL+"\n     Smallest value is: "+tempS+"\n\n");
    }
    //The number of even and odd inputs.
    int odd = 0, even = 0;
    if((MethodInput==2)||(MethodInput==5)){
        for(int i = 0; i<Length; i++){
            if(values[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.print("\n     Number of evens: "+even+"\n     Sumber of odds: "+odd+"\n\n");
    }
    //find cumulative totals
    int cumTemp = 0;
    if((MethodInput==3)||(MethodInput==5)){
        System.out.print("\n     Original:     ");
        for(int i = 0; i<Length; i++){
            System.out.print(values[i]+"   ");
        }
        System.out.print("\n     Cumulative:");
        for(int i = 0; i<Length; i++){
            cumTemp += values[i];
            if(cumTemp<10){
                System.out.print("   "+cumTemp);
            }else if(cumTemp<100){
                System.out.print("  "+cumTemp);
            }else{
            System.out.print(" "+cumTemp);
            }
        }
        System.out.print("\n     Final total is: "+cumTemp+"\n\n");
    }
    //find adjacent duplicates
    boolean check = false;
    int tempCheck=10;
    if((MethodInput==4)||(MethodInput==5)){
        System.out.print("\n     Adjacent duplicates: ");
        for(int i = 0; i<Length-1; i++){
            if(values[i]==values[i+1]&&values[i]!=tempCheck){
                System.out.print(values[i]+" ");
                tempCheck = values[i];
                check = true;
            }
        }
        if(check==false){
            System.out.print("None");
        }
        System.out.print("\n\n");
    }
        
    }
}
