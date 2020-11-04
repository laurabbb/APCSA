//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - First Repeats

import static java.lang.System.out;
public class FirstRunner
{
	public static void main( String args[] )
	{
      out.println(RayFirst.go(new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345}));
      out.println(RayFirst.go(new int[] {10,9,8,7,6,5,4,3,2,1,-99}));
      out.println(RayFirst.go(new int[] {10,20,30,40,50,-11818,40,30,20,10}));
      out.println(RayFirst.go(new int[] {32767}));
      out.println(RayFirst.go(new int[] {7,7,7,7}));
      out.println(RayFirst.go(new int[] {9,10,-88,100,-555,1000}));
      out.println(RayFirst.go(new int[] {10,10,10,11,456}));
      out.println(RayFirst.go(new int[] {-111,1,2,3,9,11,20,30}));
      out.println(RayFirst.go(new int[] {9,8,7,6,5,4,3,2,0,-2,9,9}));
      out.println(RayFirst.go(new int[] {12,15,18,21,23,1000}));
      out.println(RayFirst.go(new int[] {250,19,17,15,13,11,10,9,6,3,2,1,-455}));
      out.println(RayFirst.go(new int[] {}));
      
	}
}