import java.util.Scanner;
class numbertograde {
    public static void main(String[] args) {
        int numbergrade;
        char chargrade = ' ';
        Scanner inputnum = new Scanner(System.in);
        numbergrade = inputnum.nextInt();
        if (numbergrade <= 100 && numbergrade >= 90)
        {
            chargrade = 'A';
        }
        else if (numbergrade < 90 && numbergrade >= 80) 
        {
            chargrade = 'B';
        }
        else if (numbergrade < 80 && numbergrade >= 70) 
        {
            chargrade = 'C';
        }
        else if (numbergrade < 70 && numbergrade >= 60) 
        {
            chargrade = 'D';
        }
        else if (numbergrade < 60) 
        {
            chargrade = 'F';
        }
        System.out.println(chargrade);
    }
}