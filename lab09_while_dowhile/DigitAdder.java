
//Name - Laura Barnes
//Class - AP CSA
//Lab  - Summing Digits

import static java.lang.System.*;

public class DigitAdder
{
   public static int go(int num)
   {
      int n = num;
      int total = 0;
      while(n>0)
      {
      int place = 0;
      place = n%10;
      total += place;
      n = n/10;
      }
      return total;
   }
}