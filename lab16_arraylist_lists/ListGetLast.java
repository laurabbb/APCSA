//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Get Values > Last

import java.util.*;

public class ListGetLast
{
	//method go will return a list
	//containing the all of the values greater 
	//than the last value in the list
	public static List<Integer> go(  List<Integer> ray )
	{
      List<Integer> ar = new ArrayList<Integer>();
      for(int i = 0;i<ray.size();i++)
      {
         if(ray.get(i)>ray.get(ray.size()-1))
            ar.add(ray.get(i));
      }
		return ar;
	}
}