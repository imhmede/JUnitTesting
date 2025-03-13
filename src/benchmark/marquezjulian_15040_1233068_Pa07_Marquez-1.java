import java.util.Scanner;

public class Pa07_Marquez{ 

    public static void main(String args[]){

        System.out.println("Please enter a word:");
        
        Scanner user = new Scanner(System.in);
        String vowels = user.next();
        int count = 0;

        for(int i = 0; i < vowels.length(); i++)
            if(vowels.charAt(i) == 'a'||vowels.charAt(i) == 'e'||vowels.charAt(i) == 'i'||vowels.charAt(i) == 'o'||vowels.charAt(i) == 'u'||vowels.charAt(i) == 'y'||vowels.charAt(i) == 'A'||vowels.charAt(i) == 'E'||vowels.charAt(i) == 'I'||vowels.charAt(i) == 'O'||vowels.charAt(i) == 'U'||vowels.charAt(i) == 'Y')
                count++;
                
        System.out.print("The number of vowels in " + vowels + " is " + count + "."); 
                
    }       
}