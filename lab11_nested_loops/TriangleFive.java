//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Triangle Five

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
      letter = 'n';
      amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
      letter = c;
      amount = amt;
	}

	public void setLetter(char c)
	{
      letter = c;
	}

	public void setAmount(int amt)
	{
      amount = amt;
	}

	public String toString()
	{
		String output="";
      char let = letter;
      
      for(int i = amount;i>=0;i--)
      {
         for(int k = 0; k<i; k++)
         {
            for(int j = k;j < amount;j++)//letters
            {
               output= output+let;
            }
            output = output+" ";
            if(let=='Z')
            {
             let = 65;
            }
            else
               let++;
       
         }
         output=output+"\n";
         let = letter;
         
      }
		return output;
	}
}