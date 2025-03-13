/**
     * PA05: converts a letter grade (A, B, C, D, F) to a number grade (4, 3, 2, 1, 0).
     * @author Lincoln Werhane
     * @version 2
     * Version created on 2023.03.01
     */
 
     import java.util.Scanner; //will be used to recieve user input later

     public class PA05_LetterToNumberGrade
     {
        /**
         * The main method.
         * @param args  a list of user command-line arguments.
         */
        public static void main(String[] args)
        {
            /*
             * stores possible letter grades in an array letterGrades[]
             * stores possible number grades in an array numberGrades[] such that the index of each number grade is equal to the index of each letter grade
             */
            String letterGrades[] = {"A", "B", "C", "D", "F"};
            int numberGrades[] = {4, 3, 2, 1, 0};
    
            //prints a message prompting user input
            System.out.println("Enter a letter grade:");
    
            /*
            * establishes a scanner to recieve user input
            * stores user input (the letter grade) as a variable inputedLetterGrade
            */
            Scanner in = new Scanner(System.in);
            String inputedLetterGrade = in.next();

            int i = 0;
    
            //ensures that a non-valid input (not a letter grade) will not result in an error
            try
            { 
                /*
                * cycles through letterGrades[] until it reaches the index before where the input is equal to the entry in letterGrades[]
                * prints the result (the entry in letterGrades[] at the next index)
                * if the value provided is not a valid letter grade (resulting in an error), prompts the user to provide a new letter grade or exit the program
                */
                while(inputedLetterGrade.equalsIgnoreCase(letterGrades[i]) == false) 
                {
                    i++;
                }
                System.out.println("The numeric value of the letter grade " + letterGrades[i] + " is " + numberGrades[i] + ".");  //uses letterGrades[i] to ensure that it is always printed as a capital, even when the user enters a lowercase  
            }
            //catches the error that occurs if the input is not a valid letter grade
            catch(ArrayIndexOutOfBoundsException e)
            {
                //prints an error message
                System.out.println('"' + inputedLetterGrade + '"' + " is not a valid letter grade.  Program is terminated.");
                System.exit(0);
            }
        }
     }