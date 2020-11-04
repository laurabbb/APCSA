//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - WordList Part I and WordList Part II

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   				               							//why is it static?
   
   private String word = "";

	//create a constructor
   public Word(String a)
   {
      word = a;
   }
   
   public void setWord(String a)
   {
      word = a;
   }
	
   public int getNumVowels()
   {
      int total = 0;
      for(int a = 0; a < word.length(); a++)
      {
         for(int b = 0; b < vowels.length(); b++)
            if(word.charAt(a) == vowels.charAt(b))
               total++;
      }
         return total;
   
   }
   
   public int getLength()
   {
      return word.length();
   }
   
   public String toString()
   {
      return word;
   }

	//create a toString method
}