//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - WordList Part II

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
   words = new ArrayList<Word>();
      for(String a:wordList)
         words.add(new Word(a));
	}

	public int countWordsWithXChars(int size)
	{
      int count = 0;
      for(Word a:words)
      {
         if(a.getLength()==size)
            count++;
      }
      return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
      int numOVow = 0;
      for(int i=0; i<words.size();i++)
      {
         if(words.get(i).getLength()==size)
         {
            numOVow += words.get(i).getNumVowels();
            words.remove(i);
            i--;
         }
      }
		return numOVow;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
      for(Word a:words)
         if(a.getNumVowels()==numVowels)
            count++;
		return count;
	}
   
   public String toString()
   {
      return words+"";
   }
}
