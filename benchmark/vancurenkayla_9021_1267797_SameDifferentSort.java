/**
 *Kayla Van Curen
 *4-3-2023
 *CS 123 - Computer Science 1
 *Assignment- PA 09
*/


import java.util.*;
public class SameDifferentSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,z; //declaration of varaiable
        
        //Taking user inputs and assiging values to the varaiable
        System.out.print("Enter the first number: ");
        x = sc.nextDouble();
        System.out.print("Enter the second number: ");
        y = sc.nextDouble();
        System.out.print("Enter the third number: ");
        z = sc.nextDouble();
        sc.close();

        boolean a = allTheSame( x, y, z); // calling method allTheSame whose value is sorted in out1.
        boolean b = allDifferent( x, y, z); // calling method allTheSame whose value is sorted in out2.
        boolean c = sorted( x, y, z); // calling method allTheSame whose value is sorted in out3.
        
    }
    
    public static boolean allTheSame(double x, double y, double z){
        if(x==y && y==z && z==x){
            System.out.println("All the numbers are the same");
            return true; //if all values are same then return true.
        }
        else{
            return false; //if values are not equal return false.
        }
    }
    
public static boolean allDifferent(double x, double y, double z){
        if(x!=y && y!=z && z!=x){
            System.out.println("All the numbers are different");
            return true; //if all values are Different return true. 
        }
        else{
            return false; //if not return false.
        }
    }
    
    public static boolean sorted(double x, double y, double z){
        if(x<y && x<z && y<z){
            System.out.println("All the numbers are sorted");
            return true; // if the numbers are sorted in smallest order return true.
        }
        else if (x>y && x>z && y>z){
            System.out.println("All the numbers are sorted");
            return true; // if the numbers are sorted in largest order return true.
        }
        else if(x==y && x==z && y==z){
            System.out.println("All the numbers are sorted");
            return true; // if the numbers are sorted the same return true.
        }
        else{
            System.out.println("The numbers are not sorted");
            return false;
        }
    }
}