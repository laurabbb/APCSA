//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Going Down

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
      if(numArray.size()>1)
      {
         for(int i = 0;i<numArray.size();i++)
         {
            for(int a = 1;i<numArray.size();i++)
            {
               if(numArray.get(i)>numArray.get(a))
                  return true;
               else
                  return false;
            }
         }
      }
      else
         return true;
	}	
}