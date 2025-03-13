
/**
 * name : Kenneth Cox
 * lab  : 01 
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Account class, manages balance and applies interest to balance
 */
public class Account {
    private static final double ANNUAL_INTEREST = 0.05; // default interest rate
    private final double INITAL_AMOUNT = 1000; // default amount to be applied in constructor
    private final DecimalFormat df = new DecimalFormat("0.00"); // used for decimal place precision, only allows two dec
    private int accountAge; // age of the account in years
    private double balance;

    public Account() {
        balance = INITAL_AMOUNT;
        accountAge = 0;
    }

    public static void main(String[] args) {
        Account act = new Account(); // create Account instance
        // iterate 3 years
        for (int year = 0; year < 3; year++) {
            act.apply_interest();
            System.out.println(act);
        }
    }

    /**
     * public getter for balance
     * 
     * @return account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * applies interest, since for this assignment
     * the interst is coupled to the year, the account age
     * will increment with interest application
     */
    public void apply_interest() {
        accountAge += 1;
        balance += getBalance() * ANNUAL_INTEREST;
    }

    /**
     * override of Objects toString method
     * used for printing the object
     */
    public String toString() {
        df.setRoundingMode(RoundingMode.DOWN);
        return "Balance is: $" + df.format(getBalance()) + " after " + accountAge + " year";
    }

}
