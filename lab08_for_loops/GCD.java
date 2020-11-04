//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - GCD

import static java.lang.System.*;

public class GCD
{
	private int one, two;

	public GCD()
	{
	}

	public GCD(int numOne, int numTwo)
	{
      one = numOne;
      two = numTwo;
	}

	public void setNums(int numOne, int numTwo)
	{
      one = numOne;
      two = numTwo;
	}

	public long getGCD( )
	{
		long gcd=0;
      for(int i= 1;i<=one;i++)
      {
         if(one%i==0 && two%i==0)
            gcd = i;
      }
      
		return gcd;
	}

	public String toString()
	{
		return "the gcd of "+one +" and "+ two + " is "+ getGCD()+"\n";
	}
}