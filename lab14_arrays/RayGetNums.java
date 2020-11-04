//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Get 1st Nums >11

import java.lang.*;
import java.util.*;
public class RayGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static String go(int[] ray)
	{
      int[] array = new int[3];
      int count = 0;
      int num = 0;
      
      for(int i :ray)
      {
      num = i;
         if(num>11)
         {
         array[count]=num;
         count++;
         }
         if(count==3)
         {
         return Arrays.toString(array);
         }
      }
       return Arrays.toString(array);
	}
}