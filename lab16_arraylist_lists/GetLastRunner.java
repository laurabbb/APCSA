//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Get Values > Last

import java.util.*;
import static java.lang.System.out;

public class GetLastRunner
{
	public static void main( String args[] )
	{
   out.println(ListGetLast.go(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5)));
   out.println(ListGetLast.go(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));
   out.println(ListGetLast.go(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10)));
   out.println(ListGetLast.go(Arrays.asList(32767)));
   out.println(ListGetLast.go(Arrays.asList(255,255)));
   out.println(ListGetLast.go(Arrays.asList(9,10,-88,100,-555,2)));
   out.println(ListGetLast.go(Arrays.asList(10,10,10,11,456)));
   out.println(ListGetLast.go(Arrays.asList(-111,1,2,3,9,11,20,1)));
   out.println(ListGetLast.go(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6)));
   out.println(ListGetLast.go(Arrays.asList(12,15,18,21,23,1000)));
   out.println(ListGetLast.go(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0)));
   out.println(ListGetLast.go(Arrays.asList(9,10,-8,10000,-5000,-3000)));

	}
}