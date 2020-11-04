//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Number Shifter

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
      int[] ray = new int[size];
      for(int i = 0; i<ray.length;i++)
      {
         ray[i] = (int) (Math.random()*11);
      }
      return ray;
	}
     
	public static void shiftEm(int[] array)
	{
      int count = 0;
      for(int i = 0 ; i < array.length; i++)
     {
      if(array[i] == 7)
      {
         if(array[count] != 7)
         {
         int temp = array[count];
         array[count] = array[i];
         array[i] = temp;
         count++;
         }
      }
     }
	 out.println(Arrays.toString(array));
  	}
}