//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Odd to Even

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
      int firstOdd = -10000;
      int even=0;
      for(int i = 0;i<ray.size();i++)
      {
         if(ray.get(i)%2==0&&firstOdd>-1000000)
            {
               even = ray.get(i);
            }
        else if(ray.get(i)%2==1&&firstOdd== -10000)
         firstOdd = ray.get(i);
            
      }
      if(firstOdd!=-10000&&even!=0)
		   return ray.lastIndexOf(even)-ray.indexOf(firstOdd);
      else
         return -1;
	}
   
}