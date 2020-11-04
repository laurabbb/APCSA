//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Odd Even Part II

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
   public NumberAnalyzer(int[] a)
   {
      list = new ArrayList<Number>();
      for(int num:a)
         {
            list.add(new Number(num));
         }
   }

	//write count odds
   public int countOdds()
      {
         int count = 0;
         for(Number num: list)
            {
               if(num.isOdd()==true)
                  count++;
            }
         return count;
      }

	//write count evens
   public int countEvens()
   {
      int count = 0;
      for(Number num:list)
         {
            if(num.isEven()==true)
               count++;
         }
      return count;
   }

	//write count perfects
	public int countPerfects()
   {
      int count =0;
      for(Number num:list)
      {
         if(num.isPerfect()==true)
            count++;
      }
      return count;
   }
	//write a toString
   public String toString()
   {
      return list+"";
   }
}