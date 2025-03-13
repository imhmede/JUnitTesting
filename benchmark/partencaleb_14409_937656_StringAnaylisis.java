/*
Lab 5b
Author: Caleb Parten
Class: CS123
Purpose: check a string for ceritan data values
Date: 10/22
*/
import java.util.Scanner;
public class StringAnaylisis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[J\n\n     Enter 1 To find middles values of string.\n\n     Enter 2 To repeat statements a number of times.\n\n     Enter 3 To count number of vowels.\n\n     Enter 4 To count number of words.\n\n     Enter 5 for all.\n\n     Enter method value here: ");
    //get user input
        int MethodInput = Integer.parseInt(sc.nextLine());
        int repeat=0;
    //get repeat value if needed
        if((MethodInput==2)||(MethodInput==5)){
            System.out.print("\n     Enter value for times repeated in method 2: ");
            repeat = Integer.parseInt(sc.nextLine());
        }
        System.out.print("\033[H\033[J\n\n     Enter string for anaylisis: ");
        String input = sc.nextLine();
        sc.close();
        System.out.print("\033[H\033[J\n\n     String is: "+input+"\n\n\n");
        String Input[] = new String[input.length()];
    //translate string to array of chars in string form
        for(int i=0; i<input.length(); i++)
            Input[i] = Character.toString(input.charAt(i));
    //find the middle values in the string
        if((MethodInput==1)||(MethodInput==5)){
            if(input.length()%2==0)
                System.out.print("     Middle values are: "+Input[(input.length()/2)-1]+", "+Input[input.length()/2]+"\n\n"); 
            else
                System.out.print("     Middle value is: "+Input[input.length()/2]+"\n\n");
        }
    //repeat string for a set number of times
        if((MethodInput==2)||(MethodInput==5)){
            System.out.print("     Repeated string: ");
            for(int i=0; i<repeat; i++)
                System.out.print(input);
            System.out.print("\n\n");
        }
    //count vowels in string
        int VCount=0;
        if((MethodInput==3)||(MethodInput==5)){
            for(int i=0; i<input.length(); i++)
                if(Input[i].equals("a")||Input[i].equals("e")||Input[i].equals("i")||Input[i].equals("o")||Input[i].equals("u")||Input[i].equals("A")||Input[i].equals("E")||Input[i].equals("I")||Input[i].equals("O")||Input[i].equals("U"))
                    VCount++;
            System.out.print("     Number of vowels is : "+VCount+"\n\n");
        }
    //count number of words
        int WCount=1;
        if((MethodInput==4)||(MethodInput==5)){
            for(int i=0; i<input.length()-2; i++)
                if(!(Input[i].equals(" ")&&Input[i+2].equals(" "))&&Input[i+1].equals(" "))
                    WCount++;
            System.out.print("     Number of words is : "+WCount+"\n\n");
        }
    }
}
