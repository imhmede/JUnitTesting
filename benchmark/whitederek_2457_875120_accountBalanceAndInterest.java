public class accountBalanceAndInterest {
   public static void main (String[] args){
      /*
       * Author: Derek White
       * Date: 30 September 2022
       *
       * The purpose of this program is to take into consideration the balance of a bank account
       * each year for three years and append 5% interest to it each year as well.
       */
      double balance = 1000;
      double interest = 0.05;
      int years = 0;
      // This loop will handle the three years for us
      while(years < 3){
	 balance += (balance * interest);
	 System.out.println("Year " + (years+1) + "'s balance = " + balance); // The (Years+1)
									      // will translate this
									      // into human-readable
									      // format on the
									      // output for us.
	 years++;
      }
   } 
}
