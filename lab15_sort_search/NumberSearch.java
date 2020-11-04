//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Find Next Largest

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
      Arrays.sort(numArray);
      int ind = Arrays.binarySearch(numArray,searchNum+1);
      if(ind<0)
         {
            ind = ind*-1;
            ind--;
         }
		return numArray[ind];
	}
}