import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (0-100): ");
        int grade = scanner.nextInt();

        char letterGrade;

        if (grade >= 90 && grade <= 100) {
            letterGrade = 'A';
        } else if (grade >= 80 && grade < 90) {
            letterGrade = 'B';
        } else if (grade >= 70 && grade < 80) {
            letterGrade = 'C';
        } else if (grade >= 60 && grade < 70) {
            letterGrade = 'D';
        } else if (grade >= 0 && grade < 60) {
            letterGrade = 'F';
        } else {
            System.out.println("Invalid input. Grade must be between 0 and 100.");
            scanner.close();
            return;
        }

        System.out.println("Your letter grade is: " + letterGrade);
        scanner.close();
    }
}
