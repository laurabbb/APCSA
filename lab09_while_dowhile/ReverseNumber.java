//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Reverse Number

import static java.lang.System.*;

public class ReverseNumber
{
   private int num;

	//add constructors
	public ReverseNumber()
   {
      num = 0;
   }
   
   public ReverseNumber(int number)
   {
      num = number;
   }
	
	//add a set method
   public void setNum(int number)
   {
      num = number;
   }


	public int getReverse()
	{
		int rev=0;
      while(num>0)
      {
         rev = rev*10 + (num%10);
         num = num/10;
      }
		return rev;
	}

	//add  a toString
   public String toString()
   {
     return num +" reversed is "+ getReverse()+"\n";   
   }	
	
}