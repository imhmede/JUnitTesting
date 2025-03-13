import java.util.Scanner;

public class Lab2_a {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Give me a number: ");
    
        String initnum = num.nextLine();
        num.close();
        String parts[] = initnum.split("");
            for(String part: parts){
                System.out.print(part +" ");
        }
    }

}
