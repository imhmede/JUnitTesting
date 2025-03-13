/*
*          Class: CS 123 Computer Science 1
*          Description: Lab3a: Print the student's grade based on their score
*          Author: Brandon Bleyenberg
*          Date: 10/02/2022
*/

import java.util.Scanner;

public class QuizGrades {
   public static void main(String[]args) {
      //Initializing my variables
      Scanner in = new Scanner(System.in);
      String quizScoreString;
      int quizScoreInteger;
      char quizGrade;
      
      //Print and read statement for the student's score
      System.out.print("Enter the student's quiz score: ");
      quizScoreString = in.nextLine();

      //Converting the string into an integer
      quizScoreInteger = Integer.parseInt(quizScoreString);

      //Checking score from 90-100
      if (quizScoreInteger >= 90) {
         //Assigning A if true
         quizGrade = 'A';
      }
      //Checking score from 80-89
      else if (quizScoreInteger >= 80) {
         //Assigning B if true
         quizGrade = 'B';  
      }
      //Checking score from 70-79
      else if (quizScoreInteger >= 70) {
         //Assigning C if true
         quizGrade = 'C';     
      }
      //Checking score from 60-69
      else if (quizScoreInteger >= 60) {
        //Assigning D if true
        quizGrade = 'D';   
      }
      //Score is below 60
      else {
         //Assigning F
         quizGrade = 'F';
      }
      //Print statement for the grade of the quiz
      System.out.println("The student's grade is: " + quizGrade);
   }
}
