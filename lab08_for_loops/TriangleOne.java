//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Decreasing Word

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
      word = s;
	}

	public void setWord(String s)
	{
      word = s;
	}

	public void print( )
	{
   for(int i = 0; i<=word.length();i++)
      {
      if(word.length()>1)
      out.println(word.substring(0,word.length()-i));
      else
      out.println(word.substring(0,i));
      }
	}
}