//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Histogram

import static java.lang.System.out;

public class HistogramRunner
{
	public static void main(String args[])
	{
      int[] array= new int[] {1, 5 ,3, 4, 5, 5, 5, 4,3, 2, 5, 5, 5, 3};
      Histogram obj = new Histogram(array);
      out.println(obj.toString());
      
     array = new int[] {2,3,4,5,6,7,8,9,0,2,3,4,5,6,8,8,8,9,4,5};
     obj.setArray(array);
     out.println(obj.toString());
     
     array = new int[] {7,7,7,7,7,7,7,7,5,6,7,8,2,0,2,3,5,1,2,3,4,5,6,5};
     obj.setArray(array);
     out.println(obj.toString());

	}
}