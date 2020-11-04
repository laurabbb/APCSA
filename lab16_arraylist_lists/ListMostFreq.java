//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Most Frequent

import java.util.*;

public class ListMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go( List<Integer> ray )
	{
      int count=0;
      int beatCount=0;
      int val=ray.get(0);
      int beatVal;
      
      Collections.sort(ray);
      if(ray.size()>1)
      {
         for(int i = 0;i<ray.size()-1;i++)
         {
            if(ray.get(i)==ray.get(i+1))
               {
               val = ray.get(i);
               count++;
               return val;
               }
         }
         return val;
         
      }
      else
         return ray.get(0);
 	}
}