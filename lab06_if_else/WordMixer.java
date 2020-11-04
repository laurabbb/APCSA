//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Word Mixer

import static java.lang.System.*;

public class WordMixer
{
	public static String moveEmAround(String a, int x)
	{
      		if(x<a.length()-1)
      		{
			return a.substring(x)+a.substring(0,x);
      		}
      		else
         		return "no can do";
		}
}