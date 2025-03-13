/**
 * This program converts letter grade into number
 * @author jmancilla
 * @params none
 * @returns g (grade)
 *
 */
import java.util.Scanner;
public class LetterGrade {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter letter grade: ");
	String g = in.nextLine();
	g = g.toUpperCase();
	double result;
	
	if(g.equals("A")){
        result = 4;
    }
    else if(g.equals("A+")){
        result = 4.3;
    }
    else if(g.equals("A-")){
        result = 3.7;
    }
    else if(g.equals("B")){
        result = 3;
    }
    else if(g.equals("B+")){
        result = 3.3;
    }
    else if(g.equals("B-")){
        result = 2.7;
    }
    else if(g.equals("C")){
        result = 2;
    }
    else if(g.equals("C+")){
        result = 2.3;
    }
    else if(g.equals("C-")){
        result = 1.7;
    }
    else if(g.equals("D")){
        result = 1;
    }
    else if(g.equals("D+")){
        result = 1.3;
    }
    else if(g.equals("D-")){
        result = 0.7;
    }
    else if(g.equals("F")){
        result = 0;
    }
    else{
        result = -1;
    }

    if(result==-1){
        System.out.println("Invalid input");
    }
    else{
        System.out.println("The numeric value is "+result+".");
    }
	
	}
}
