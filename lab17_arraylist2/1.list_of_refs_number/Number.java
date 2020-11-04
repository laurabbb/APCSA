//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Odd Even Part I and Odd Even Part II

//write the Number class
//use the handout and
//sample runner code
//to guide you
import java.util.*;

class Number
{
   private int number;
   
   public Number(int num)
   {
      number = num;
   }
   
   public boolean isOdd()
   {
      if(number%2 !=0)
         return true;
      else
         return false;
   }
   
   public boolean isEven()
   {
      if(number%2 == 0)
         return true;
      else
         return false;
   }
   
   public boolean isPerfect()
   {
      int sumOfD = 0;
      for(int i = 1; i<number;i++)
      {
         if(number%i==0)
            sumOfD+=i;
      }
      if(number == sumOfD)
         return true;
      else
         return false;
   }
     public String toString()
     {
         return number+"";
     }
}