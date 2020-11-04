//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Histogram

import java.util.Scanner;

public class Histogram
{
   private int[] array;
   
   public Histogram(int[] ray)
   {
      array = ray;
   }
   
   public void setArray(int[] ray)
   {
      array = ray;
   }
   public String toString()
   {
      String answer = "";
      int count = 0;
      for(int i = 0;i<10;i++)
      {
       count = 0;
       for(int k = 0;k<array.length;k++)
       {
         if(i==array[k])
            count++;
       }
       answer = answer+ i+" - "+count+"\n";
      }
      return answer;
   }

}