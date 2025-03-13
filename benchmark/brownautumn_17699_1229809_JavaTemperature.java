import java.util.Scanner;

public class JavaTemperature
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temp = in.nextInt();

        in.nextLine();
        System.out.print("Enter the temperate scale (F or C): ");
        String scale = in.nextLine();


        in.close();

        if (scale.equals("F"))
        {
            temp = (5*(temp+32)/9);
        }

        if (temp <= 0)
        {
            System.out.print("The water is a solid.\n");
        }
        else if (temp <= 100)
        {
            System.out.print("The water is a liquid\n");
        }
        else
        {
            System.out.print("\nThe water is a gas.\n");
        }
    }
}