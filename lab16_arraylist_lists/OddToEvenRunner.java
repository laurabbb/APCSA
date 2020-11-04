//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Odd to Even

import java.util.*;
import java.lang.*;
import static java.lang.System.out;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
   List<Integer> ray = new ArrayList<Integer>(
   Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
   System.out.println(ListOddToEven.go(ray));
   
   out.println(ListOddToEven.go(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7)));
   out.println(ListOddToEven.go(Arrays.asList(10,20,30,40,5,41,31,20,11,7)));
   out.println(ListOddToEven.go(Arrays.asList(32767,70,4,5,6,7)));
   out.println(ListOddToEven.go(Arrays.asList(2,7,11,21,5,7)));
   out.println(ListOddToEven.go(Arrays.asList(7,255,11,255,100,3,2)));
   out.println(ListOddToEven.go(Arrays.asList(9,11,11,11,7,1000,3)));
   out.println(ListOddToEven.go(Arrays.asList(7,7,7,11,2,7,7,11,11,2)));
   out.println(ListOddToEven.go(Arrays.asList(2,4,6,8,8)));
	}
}