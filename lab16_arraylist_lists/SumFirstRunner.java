//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Sum Values > First

import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class SumFirstRunner
{
	public static void main( String args[] )
	{
   List<Integer> array = new ArrayList<Integer>(
   Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
   System.out.println(ListSumFirst.go(array));
   
   List<Integer> array2 = new ArrayList<Integer>(
   Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
   System.out.println(ListSumFirst.go(array2));
   
   List<Integer> array3 = new ArrayList<Integer>(
   Arrays.asList(10,20,30,40,50,-22828,40,30,20,10));
   System.out.println(ListSumFirst.go(array3));
   
   List<Integer> array4 = new ArrayList<Integer>(
   Arrays.asList(32767));
   System.out.println(ListSumFirst.go(array4));
   
   List<Integer> array5 = new ArrayList<Integer>(
   Arrays.asList(255,255));
   System.out.println(ListSumFirst.go(array5));
   
   List<Integer> array6 = new ArrayList<Integer>(
   Arrays.asList(9,10,-88,100,-55,2));
   System.out.println(ListSumFirst.go(array6));
   
   List<Integer> array7 = new ArrayList<Integer>(
   Arrays.asList(10,10,10,11,456));
   System.out.println(ListSumFirst.go(array7));
   
   List<Integer> array8 = new ArrayList<Integer>(
   Arrays.asList(-111,1,2,3,9,11,20,1));
   System.out.println(ListSumFirst.go(array8));
   
   List<Integer> array9 = new ArrayList<Integer>(
   Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6));
   System.out.println(ListSumFirst.go(array9));
   
   List<Integer> array10 = new ArrayList<Integer>(
   Arrays.asList(12,15,18,21,23,1000));
   System.out.println(ListSumFirst.go(array10));
   
   List<Integer> array11 = new ArrayList<Integer>(
   Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0));
   System.out.println(ListSumFirst.go(array11));
   
   List<Integer> array12 = new ArrayList<Integer>(
   Arrays.asList(9,10,-8,10000,-5000,-3000));
   System.out.println(ListSumFirst.go(array12));
   
   
   
   
	}
}