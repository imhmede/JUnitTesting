/**
 * This assigns a letter grade to a given number
 * @author: Ramon Oropesa
 * October 25,2023
 */
import java.util.Scanner;

public class Grade {
/**
 * This is the main method
 * @param args a list of possible arguments passed by the user
 */
  public static void main (String[] args) {

    //varaible declaration
    int score; 
    String grade; 

    Scanner in = new Scanner(System.in);

        //User prompted to enter a grade 
    System.out.println("Enter a number grade for a class (0-100): ");
    int score= in.nextInt(); 


        //Decision pathway in form of if statement
    if(score>=90) {
      grade="A";
    }
      else if(score>=80){
      grade="B";
      } 
      else if(score>=70){
       grade="C";
      } 
      else if(score>=60){
        grade="D";
      } 
      else {
        grade="F";
      } 

        //Display of the students grade in letter form

      System.out.print("your grade is " + grade);
