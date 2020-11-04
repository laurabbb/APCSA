// (c) A+ Computer Science
// www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - WordList Part II

import static java.lang.System.*;

public class WordsRunner
{
	public static void main( String args[] )
	{
		String[] wrds = "one two three four five six seven alligator".split(" ");
		Words test = new Words( wrds );
		out.println(test);
		out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test.countWordsWithXChars(3));		
		out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test.countWordsWithXChars(5));
		int vowelsRemoved = test.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");
				
		String[] wrds1 = "fun fly four six times ten plus eight".split(" ");
		Words test1 = new Words( wrds1 );
		out.println(test1);
		out.println("word with 2 vowels = "+test1.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test1.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test1.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test1.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test1.countWordsWithXChars(3));		
		out.println("word with 4 chars = "+test1.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test1.countWordsWithXChars(5));
		vowelsRemoved = test1.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test1);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");
      
      String[] wrds2 = "alligator chicken dog cat pig buffalo".split(" ");
		Words test2 = new Words( wrds2 );
		out.println(test2);
		out.println("word with 2 vowels = "+test2.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test2.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test2.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test2.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test2.countWordsWithXChars(3));		
		out.println("word with 4 chars = "+test2.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test2.countWordsWithXChars(5));
		vowelsRemoved = test2.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test2);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");
	
	}
}