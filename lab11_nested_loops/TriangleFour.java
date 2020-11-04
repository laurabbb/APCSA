//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Triangle Four

import static java.lang.System.*;

public class TriangleFour
{
   private int size;
   private String letter;

	public TriangleFour()
	{
      size = 0;
      letter = "a";
	}

	public TriangleFour(int count, String let)
	{
      size = count;
      letter = let;
	}

	public void setTriangle( String let, int sz )
	{
      letter = let;
      size = sz;
	}

	public String getLetter() 
	{
		return letter;
	}

	public String toString()
	{
		String output="";
      for(int i = 1;i<=size;i++)
      {
         for(int k = i;k>1;k--)//spaces
         {
            output = output + " ";
         }
         
         for(int j = i;j<=size;j++)//letters
         {
            output = output + letter;
         }
         output = output + "\n";
      }
		return output;
	}
}