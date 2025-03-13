/**
Author: Caleb Parten
Class: CS123
Purpose: Find if 3 integers are in numerical order
Date: 9/29/2022
*/
import java.util.Scanner;
class OrderCheck {
    public static void main(String[] args) {
        //get user input
        int input = 0;
        int[] list = {0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 3 digits with no spaces for order check: ");
        input = sc.nextInt();
        sc.close();
        //put into array for easy reading
        while(input>=100){
            list[0]++;
            input-=100;
        }
        while(input>=10){
            list[1]++;
            input-=10;
        }
        while(input>=1){
            list[2]++;
            input-=1;
        }
        //check for order
        int asending = 0, desending = 0;
        for(int j=1; j<3; j++){
            if(list[j-1]<=list[j]){
                asending++;
            }
            if(list[j-1]>=list[j]){
                desending++;
            }
        }
        //check values
        if((asending==2)||(desending==2)){
            System.out.print("Items are in order.\n");
        }else{
            System.out.print("Items are not in order.\n");
        }
    }
}
