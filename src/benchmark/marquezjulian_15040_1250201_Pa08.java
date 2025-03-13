import java.util.Scanner;
public class Pa08{ 
    public static void main(String args[]){
        System.out.println("Enter a number between 1 and 12:");
        Scanner user = new Scanner(System.in);
        
        int num = user.nextInt(); 

        int a=num*1;
        int b=num*2;
        int c=num*3;
        int d=num*4;
        int e=num*5;
        int f=num*6;
        int g=num*7;
        int h=num*8;
        int i=num*9;
        int j=num*10;
        int k=num*11;
        int l=num*12;


        if(num==1||num==2||num==3||num==4||num==5||num==6||num==7||num==8||num==9||num==10||num==11||num==12)
        
            System.out.print(num+" x 1 = "+a+"\n"+num+" x 2 = "+b+"\n"+num+" x 3 = "+c+"\n"+num+" x 4 = "+d+"\n"+num+" x 5 = "+e+"\n"+num+" x 6 = "+f+"\n"+num+" x 7 = "+g+"\n"+num+" x 8 = "+h+"\n"+num+" x 9 = "+i+"\n"+num+" x 10 = "+j+"\n"+num+" x 11 = "+k+"\n"+num+" x 12 = "+l);

    }
}