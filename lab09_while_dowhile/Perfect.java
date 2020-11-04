//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Perfect Number

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect()
   {
   }
   
   public Perfect(int num)
   {
      number = num;
   }

   public void setNumber(int num)
   {
      number = num;
   }

	public boolean isPerfect()
	{
      int total = 0;
      for(int i = 1;i<number;i++)
      {
         if(number%i==0)
            total+=i;
      }
      
      //out.println(total);
      if(total == number)
         return true;
      else
         return false;
	}

	//add a toString
   public String toString()
   {
      /*if(isPerfect() == true)
      {
         return number + " is perfect.\n";
      }
      else
         return number + " is not perfect.\n";*/
      String output ="";
      if(isPerfect()== true)
      {
         output = number + " is perfect.\n";
      }
      else
         output = number + " is not perfect.\n";
         
     return output;
   }
	
}