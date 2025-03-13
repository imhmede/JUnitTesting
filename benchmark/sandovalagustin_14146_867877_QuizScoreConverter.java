/*
Agustin Sandoval
Lab3_a
CS 123
10-1-22
*/

import java.util.Scanner;                   //scanner is imported
public class QuizScoreConverter                              
{
	public static void main(String[] args) {              
	
	Scanner scanner = new Scanner(System.in);           //scanner object is created
	
		                                                 
    System.out.println("Enter the quiz score: ");       // request for quiz score 
    int quizScore = scanner.nextInt();                  // user's input is stored as int variable
    
    /*
    a string stating the letter grade associated with the quiz score is printed if
    if statement or else if statement's conditions are met
    */
    
    
    if (quizScore <= 100 && quizScore >= 90 ){                        // conditions are met if quiz score is within a range //
        System.out.println("Your letter grade for the quiz is A");    // that pertains to a letter.                         //
    }else if (quizScore <= 89 && quizScore >= 80 ){
        System.out.println("Your letter grade for the quiz is B");
    }else if (quizScore <= 79 && quizScore >= 70 ){
        System.out.println("Your letter grade for the quiz is C");
    }else if (quizScore <= 69 && quizScore >= 60 ){
        System.out.println("Your letter grade for the quiz is D");
    }else if (quizScore <= 59 && quizScore >= 0 ){
        System.out.println("Your letter grade for the quiz is F");
    }else{                                                            // if a quiz score is not within any letter grade range //  
        System.out.println("Please enter a valid score.");            // then it meets the else statement's condition         //
    }                                                                 // which lets user know an invalid score was entered.   //
    
    
		
		
	}
}
