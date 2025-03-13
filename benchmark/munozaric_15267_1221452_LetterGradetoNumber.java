import java.io.*;
import java.util.*;

public class LetterGradetoNumber{

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Enter letter grade:");

char grade = scan.next().charAt(0);

float result = -1;

if(grade == 'A'){
result = 4;
}
else if(grade == 'B'){
result = 3;
}
else if(grade == 'C'){
result = 2;
}
else if(grade == 'D'){
result = 1;
}
else if(grade == 'F'){
result = 0;
}

System.out.println("The numeric value is " + result);
}
}