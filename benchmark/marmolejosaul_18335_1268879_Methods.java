import java.util.*;

//Saul Marmolejo
//4-3-2023
//Programming Assignment 09


public class Methods {

    public boolean allTheSame(double x, double y, double z){

        if (x == y &&  x == z && y == z){
            return true;
        } else {
            return false;
        }

    }


    public boolean allDifferent(double x, double y, double z){

        if (x != y && x != z && y != z){
            return true;
        } else {
            return false;
        }

    }

    public boolean sorted(double x, double y, double z){

        if (x <= y){
            if (y <= z){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }





    public static void main(String[] args){

        Methods test = new Methods();

        double firstNum;
        double secondNum;
        double thirdNum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        firstNum = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        secondNum = scanner.nextDouble();
        System.out.println("Enter the third number: ");
        thirdNum = scanner.nextDouble();


        //Testing the methods
        System.out.println("Checking to see if all the numbers are the same, or if they are different: ");

        if (test.allTheSame(firstNum, secondNum, thirdNum)){
            System.out.println("All the numbers are the same");
            if (test.sorted(firstNum, secondNum, thirdNum)){
                System.out.println("All the numbers are sorted");
            }
        } 

        if (test.allDifferent(firstNum, secondNum, thirdNum)){
            System.out.println("All the numbers are different");
            if (test.sorted(firstNum, secondNum, thirdNum)){
                System.out.println("All the numbers are sorted");
            }
        }

    }
}
