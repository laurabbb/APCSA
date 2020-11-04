//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Word Mixer

import static java.lang.System.*;

public class WordMixerRunner
{
	public static void main( String args[] )
	{
		WordMixer s = new WordMixer();
	   	System.out.println( s.moveEmAround("apluscompsci",3) );
		System.out.println( s.moveEmAround("apluscompsci",5) );
		System.out.println( s.moveEmAround("apluscompsci",1) );
		System.out.println( s.moveEmAround("apluscompsci",2) );
		System.out.println( s.moveEmAround("apluscompsci",30) );
		System.out.println( s.moveEmAround("apluscompsci",4) );	   
	}
}