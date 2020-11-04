//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Fibonacci

import java.util.*;

public class Fibonacci
{
	//instance variable
   private int[] array;
   private int number;
   
   Fibonacci(int num)
   {
      number = num;
      array = new int[num];
   }
	
   
   public void setArray(int num)
   {
      number = num;
      array = new int[num];
      
   }

	//get method
   public int[] getArray(int[] ray)
   {
      return array;
   }

	//toString
   public String toString(int numeral)
   {
      String output = "";
      array[0]=1;
      if(number>2)
         array[1]=1;
      for(int i = 2;i<array.length;i++)//actual fibonacci
      {
         array[i] = array[i-2]+array[i-1];
      }
      if(number>numeral)
         return Integer.toString(array[numeral]);
      else
         return "-1";
   }
}