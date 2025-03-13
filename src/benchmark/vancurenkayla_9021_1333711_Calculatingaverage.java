/*
Name: Kayla Van Curen
Date: 5/4/2023
Class: CS 123
Project: PA 13
*/

import java.io.*;
import java.util.*;

public class Calculatingaverage{
public static void main(String[] args) throws FileNotFoundException{

    int count=0;
    float col1=0.0f, col2=0.0f;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an input file name : ");
    String input = in.next();
    in = new Scanner(new File(input));
    
    while(in.hasNextFloat()){

        col1+=in.nextFloat();
        col2+=in.nextFloat();
        count++;
    }

    System.out.println("\nAverage of 1st Column : "+col1/count);
    System.out.println("\nAverage of 2nd Column : "+col2/count);
    in.close();
}
}