//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Boxes

import static java.lang.System.*;

public class Box
{
   private String let;
   private int size;

   public Box()
   {
      let = "l";
      size = 0;
   }
   
   public Box(String a, int num)
   {
      let = a;
      size = num;
   }

	public String toString()
	{
		String output="";
      for(int i = 0;i<size;i++)//lines
      {
         for(int m = 0;m<size;m++)
         {
            output= output+let;
         }
         output = output+"\n";
      }



		return output+"\n";
	}
}