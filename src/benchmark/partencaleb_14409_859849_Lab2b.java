/**
Author: Caleb Parten
Class: CS123
Purpose: Find differnces between two times
Date: 9/13/2022
*/
import java.util.Scanner;
import java.lang.Math;
class Lab2b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int FH=0,FM=0,SH=0,SM=0,DH=0,DM=0,check=0; //first hour, first minute, second hour,..,difference
    System.out.print("Enter two times to find the difference\n");
    while(check==0){    //get user input
        FH=-1;FM=-1;SH=-1;SM=-1;
        System.out.print("Enter  hour  time: ");
        FH = sc.nextInt();
        System.out.print("\033[F\rEnter minute time: "+FH+":");
        FM = sc.nextInt();
        System.out.print("\033[F\r"+FH+":"+FM+"\033[J");
        System.out.print("\nEnter  hour  time: ");
        SH = sc.nextInt();
        System.out.print("\033[F\rEnter minute time: "+SH+":");
        SM = sc.nextInt();
        System.out.print("\033[F\r"+SH+":"+SM+"\033[J");
        if(FH<=23&&FM<=59&&SH<=23&&SM<=59&&FH>=0&&FM>=0&&SH>=0&&SM>=0){
            check=1;
        }else{  //check user input
            System.out.print("\nNot valid time try again...\n");
        }
    }
    sc.close();//compute
    DH=Math.abs(FH-SH);
    DM=Math.abs(FM-SM);
    if((FH-SH>0&&SM-FM>0)||(SH-FH>0&&FM-SM>0)){
        DH--;
    }
    if((FH>SH)||(FH>=SH&&FM>SM)){
        DH=Math.abs(DH-24);
        if(FM>SM){
            DH--;
            DM=Math.abs(DM-60);
        }
    }
    if(DM<10){  //output or print
        System.out.print("\nTime difference is: "+DH+":0"+DM+"\n");
    }else{
        System.out.print("\nTime difference is: "+DH+":"+DM+"\n");
    }
  }
}
