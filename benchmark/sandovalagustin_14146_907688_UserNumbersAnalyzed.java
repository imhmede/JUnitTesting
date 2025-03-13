import java.util.Scanner;

public class UserNumbersAnalyzed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int biggestNum = 0;                             // this variable will be compared to every input in while-loop...                           
                                                        //...biggestNum starts of at zero so that the first input to take its value. 
        
        
        int smallestNum = 999999;                       // smallestNum will also be compared to user's input in while-loop and will take a new value...
                                                        //...if any number is smaller than 999999
        
        int evenNumbers = 0;                            // the variable evenNumbers keeps track of the amount of enven numbers
        
        
        
        int oddNumbers = 0;                             // the variable oddNumbers keeps track of the amount of odd numbers
        
        int culmativeSum = 0;                           // culmativeSum is where the user's inputs will be added and stored
        
        String culmativeTotals = "";                    // culmativeTotals will alow for the culmative sums to be displayed in a series
        
        String adjacentDuplicates = "";                 // adjacentDuplicates also alows for the adjacent duplicates to be displayed in a series
        
        int previousNum = -1;                           // previousNum is where the previous user's input will be stored, the variable is initialized by non-positive number
        
        System.out.println("Enter a sequence of positive numbers, enter . when finished");      // request for user to enter input ( restrictions on negative numbers and request to enter non int to exit loop)   
        while (in.hasNextInt()) {                                                               // while loop will gather user's input until non- integer value is inserted.
            
            int newNumber = in.nextInt();                                   

            culmativeSum += newNumber;                  // any new input is added and stored at culmativeSum                                                   
            
            culmativeTotals = culmativeTotals + " " + culmativeSum;         // The culmative sums are stored in each iteration along with a space 
                                                                            
            if (newNumber > biggestNum) {               // first if-statement checks if the new input is bigger than zero first, than if bigger of the previous stored value.
                biggestNum = newNumber;                 // if condition is met a new bigger value will be stored.
            
                
            }if (newNumber < smallestNum) {             // second if-statement checks if the new input is smaller than 999999 first, than if smaller of the previous stored value.
                smallestNum = newNumber;                // if condition is met a new smaller value will be stored.
            
                
            }if (newNumber % 2 == 0) {                  // if-statement checks if number is even
                evenNumbers++;                          // if condition is met counter will increase for each even number
            
                
            }if (newNumber % 2 == 1) {                  // if-statement checks if number is odd
                oddNumbers++;                           // if condition is met counter will increase for each odd number
            
                
                
            }if (previousNum == newNumber ) {           // if-statement checks if the previous entered input is the same as the current input
                                                 
                adjacentDuplicates = adjacentDuplicates + " " + newNumber;  // The adjacent duplicates are stored in each iteration along with a space...    
                                                                            //... with each iteration they will be added to the string
            }
            previousNum = newNumber;                    // previousNum is updated to a new current number to be compared to with each iteration
        }

        System.out.printf("The Biggest number is: %d\n", biggestNum);               // results are displayed 
        System.out.printf("The smallest number is: %d\n", smallestNum);
        System.out.printf("The Amount of even numbers is: %d\n", evenNumbers);
        System.out.printf("The Amount of odd numbers is: %d\n", oddNumbers);
        System.out.printf("The culmative totals are: %s\n", culmativeTotals);
        if (adjacentDuplicates != "") {                                                         // string will not be empty if duplacites are found
            System.out.printf("The Adjacent duplacate numbers are: %s", adjacentDuplicates);    // results are displayed.
        }
        
        
    }
}