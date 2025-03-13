/*
Name: Kayla Van Curen
Date: 4/24/2023
Class: CS 123
Project: PA 12
*/

import java.util.Random;

class boolean equals{
    public static void main(String args[]){
        Random rand = new Random();
        
        int a = rand.nextInt(9);
        System.out.print("First Array: \n");
        System.out.print(a);
        int b =rand.nextInt(9);
        System.out.print("\nSecond Array: \n");
        System.out.print(b);
        
        boolean TF = equals(a,b);
        
        if(TF){
            System.out.print("\nThe two arrays have the same elements in the same order.");
        }
        else{
            System.out.print("\nThe two arrays do not have the same elements in the same order.");
        }
    }

public static boolean equals(int[] a,int[] b){
    if(a.length!=b.length){
        return false;
    }
    
    for(int i=0;i<a.length;i++){
        if(a[i]!=b[i])
        return false;
    }
    
    return true;
}
}