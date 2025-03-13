import java.util.*;
class StringCompare {
  public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);
      
      String input1,input2;
      
      System.out.println("Enter the First string: ");
      input1=sc.nextLine();
      System.out.println("Enter the Second string: ");
      input2=sc.nextLine();
       
      
      if(input1.length()!=input2.length())
      {
      	System.out.println("Neither");
      	return;	
      }

      boolean similar=false;
      for(int i = 0; i<input1.length();i++)
      {
      	for(int j=0; j<input2.length();j++)
      	{
      		if(input1.charAt(i)==input2.charAt(j))
          {
            similar=true;
            break;
          }
          else 
            similar=false;
      	}
       if(similar==true)
       {
      		continue;
       }
       else
       {
         System.out.println("Neither");
         break;
       }
     }
     if(similar == true)
       System.out.println("All the same");
     
  }
}