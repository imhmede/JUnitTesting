/* Aaron Rohde - CS123
 * Assignment:    Lab1
 * Due:     09/04/2022
 */
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class lab1
{
    public static void main(String[] args)
    {
        // vars that change the run
        double interest_rate = 5.0 / 100.0;
        double account_balance = 1000.00;
        int years_to_calc = 3;

        // Get todays date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime today = LocalDateTime.now();

        // Display Name, current date, and assignment title
        System.out.println(" Aaron Rohde          CS 123 \n Lab 1       Due: 09/04/2022 \n Today's Date is: "+ dtf.format(today) + "\n");
        
        // Setup grid header for output
        System.out.println("| Year |  Interest  |   Balance  |");
        System.out.println("|------|------------|------------|");

        // Calculation loop
        for (int i = 0; i <= years_to_calc; i++)
        {
            // Calculate interest earned
            double interest = account_balance * interest_rate;

            // Correct year zero to $ 0.00 interest earned
            if ( i == 0 )
            {
                interest = 0.00;
            }; 
            // Update balance 
            account_balance = account_balance + interest;

            // Call formatter to make it pretty
            String gridOutput = gridFormat(i, interest, account_balance);
            // Output run data
            System.out.println(gridOutput);
        }
    }

    // Return the numberic values once formatted to grid, int for year, double interest, double balance 
    public static String gridFormat(int year, Double interest, Double balance)
    {
        // convert from int and doubles to Strings
        String intrst = String.format("%.2f", interest);
        String bal = String.format("%.2f", balance);
        String yr = String.valueOf(year);

        // format to make the grid 'pretty'
        intrst = addDollarSign(intrst);
        intrst = padLeftSpaces(intrst, 10);
        bal = addDollarSign(bal);
        bal = padLeftSpaces(bal, 11);
        yr = padRightSpaces(yr, 4);
        yr = padLeftSpaces(yr, 6);
        return "|" + yr + "|" + intrst + "  |" + bal + " |";
    }

    // Add dollar sign and space to the left side with input of String and length after spaces are added
    public static String addDollarSign(String inputString)
    {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        sb.append(' ');
        sb.append(inputString);
    
        return sb.toString();
    }

    // Add spaces to the Left side with input of String and length after spaces are added
    public static String padLeftSpaces(String inputString, int length)
    {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append(' ');
        }
        sb.append(inputString);
    
        return sb.toString();
    }

    // Add spaces to the Right side with input of String and length after spaces are added
    public static String padRightSpaces(String inputString, int length)
    {
        if (inputString.length() >= length) {
            return inputString;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(inputString);
        while (sb.length() < length - inputString.length()) {
            sb.append(' ');
        }
    
        return sb.toString();
    }
}