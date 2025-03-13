import java.util.Scanner;

public class Temperaturetostate
{

    public static void main(String[] args) {

        float t;
        String s;

        System.out.println("Enter the temperature: ");
        Scanner in = new Scanner(System.in);
        t  = in.nextInt();

        System.out.println("Enter the scale of the temperature: ");
        s = in.next();

        if (s.contains ("F") || s.contains("f")){
            t = 5 * (t-32) / 9;
            if (t < 0){
                System.out.println("The water is a solid");
            }else if (t >= 0 && t <= 100){
                System.out.println("The water is liquid");
            }else{
                System.out.println("The water is gas");
            }
        } else if (s.contains ("C") || s.contains("c")){
            if (t < 0){
                System.out.println("The water is a solid");
            }else if (t >= 0 && t <= 100){
                System.out.println("The water is liquid");
            }else{
                System.out.println("The water is gas");
            }
        } else{
            System.out.println("Invalid input");
        }
	}
}