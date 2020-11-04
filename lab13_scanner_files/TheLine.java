//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Largest Number

import java.util.Scanner.*;
import java.util.*;
import static java.lang.System.*; 

public class TheLine
{
   private String line;

   public TheLine()
   {
      line = null;
   }

   public TheLine(String s)
   {
      line = s;
   }

	public int getLargest()
	{
		int largest = Integer.MIN_VALUE;
      Scanner test = new Scanner(line);
      while(test.hasNextInt())
      {
         int num = test.nextInt();
         if(num>largest)
         {
            largest = num;
         }
      }
      return largest;
	}

	public String toString( )
	{
		return line + " -  Largest == "+getLargest()+"\n";
	}
}