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

public class NumberSearchRunner
{
	public static void main( String args[] ) throws IOException
	{
			int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
			int find = 5;
         for(int i = 0;i<array.length;i++)
            out.print(array[i]+ " ");
			out.println("\nThe next largest value after " + find + " is " + NumberSearch.getNextLargest(array, find) + "\n");
         
          int [] aray = {10, 30, 20, 40, 50, 15};
         find = 12;
         for(int i = 0;i<aray.length;i++)
            out.print(aray[i]+ " ");
			out.println("\nThe next largest value after " + find + " is " + NumberSearch.getNextLargest(aray, find) + "\n");
         
         int []ray = {3, 4, 5, 6, 8, 9, 10, 11, 2,3, 4, 65};
         find = 25;
         for(int i = 0;i<ray.length;i++)
            out.print(ray[i]+ " ");
			out.println("\nThe next largest value after " + find + " is " + NumberSearch.getNextLargest(ray, find) + "\n");
         
         int []y = {100, 110, 1000, 25000, 65535};
         find = 32767;
         for(int i = 0;i<y.length;i++)
            out.print(y[i]+ " ");
			out.println("\nThe next largest value after " + find + " is " + NumberSearch.getNextLargest(y, find) + "\n");


			//add more case
	}
}



