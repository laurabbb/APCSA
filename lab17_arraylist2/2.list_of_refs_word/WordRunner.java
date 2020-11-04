//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - WordList Part I

import static java.lang.System.*;

public class WordRunner
{
	public static void main(String[] args)
	{
      Word one = new Word("chicken");
      out.println(one);
      out.println("num vowels == " + one.getNumVowels());
      out.println("num chars == " + one.getLength());

      one.setWord("alligator");
      out.println("\n\n"+one);
      out.println("num vowels == " + one.getNumVowels());
      out.println("num chars == " + one.getLength());

      one.setWord("elephant");
      out.println("\n\n"+one);
      out.println("num vowels == " + one.getNumVowels());
      out.println("num chars == " + one.getLength());
	}
}