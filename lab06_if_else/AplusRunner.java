//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - AB

import static java.lang.System.out;

public class AplusRunner
{
	public static void main( String args[] )
	{
		System.out.println( AB.check( "chicken", "a", "b" ) );
		out.println( AB.check( "frog", "f", "g" ) );
      		out.println( AB.check( "chicken", "c", "k" ) );
		out.println( AB.check( "apluscompsci", "a", "s" ) );
      		out.println( AB.check( "apluscompsci", "a", "p" ) );
      		out.println( AB.check( "apluscompsci", "s", "c" ) );
     		 out.println( AB.check( "apluscompsci", "c", "p" ) );
	}
}