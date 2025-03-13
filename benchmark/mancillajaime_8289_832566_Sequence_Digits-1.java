/** Class:  CS123_Computer Science
    Description:  This program will split the current integer
    Author: Jay Mancilla
    Date: 9/17/2022
 */
public class Sequence_Digits 
{

	public static void main(String[] args) 
	{
        int n1 = 16384;  //Main integer
        int n2 = n1 / 10000 % 10;  // Dividing n1 by 10000 = 1.6384 and modular removes remainder
        int n3 = n1 / 1000  % 10;  // divide by one less zero and 10 modular = 6 removes ramainder
        int n4 = n1 / 100  % 10; //so forth
        int n5 = n1 / 10  % 10;
        int n6 = n1 / 1  % 10;
        
        System.out.println(n2 + " " + n3+ " " + n4+ " " + n5+ " " + n6); //simple print statment
    }
}
