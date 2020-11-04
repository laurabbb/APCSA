//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Factorial

import static java.lang.System.*;

public class Factorial
{
	private int number;

	public Factorial()
	{
      number = 0;
	}

	public Factorial(int num)
	{
      number = num;
	}

	public void setNum(int num)
	{
      number = num;
	}

	public int getNum()
	{
		return number;
	}

	public long getFactorial( )
	{
		long factorial=1;
      
      for(int i = number;i>=1;i--)
      {
         factorial *= i;
      }
		return factorial;
	}

	public String toString()
	{
		return "factorial of " + getNum() + " is "+ getFactorial()+"\n";
	}
}