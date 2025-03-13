//Jacob Rogers
//CS123P
//March 10, 2023

import java.util.Scanner;

public class LettertoNumberGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter letter grade: ");
        String grade = scanner.next();
        
        int numGrade;
        if (grade.equals("A")) {
            numGrade = 4;
        } else if (grade.equals("B")) {
            numGrade = 3;
        } else if (grade.equals("C")) {
            numGrade = 2;
        } else if (grade.equals("D")) {
            numGrade = 1;
        } else if (grade.equals("F")) {
            numGrade = 0;
        } else {
            System.out.println("Invalid input");
            return;
        }
        
        System.out.println("Number grade: " + numGrade);
    }
}