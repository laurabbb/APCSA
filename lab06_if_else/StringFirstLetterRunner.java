//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - String First Letter

import static java.lang.System.*;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		//add test cases
      		StringFirstLetterCheck test = new StringFirstLetterCheck("hello","howdy");
      		out.println(test);
      
      		StringFirstLetterCheck test1 = new StringFirstLetterCheck("one","two");
      		out.println(test1);
      
      		StringFirstLetterCheck test2 = new StringFirstLetterCheck("three","two");
      		out.println(test2);
      
      		StringFirstLetterCheck test3 = new StringFirstLetterCheck("TCEA","UIL");
     		out.println(test3);
      
      		StringFirstLetterCheck test4 = new StringFirstLetterCheck("State","Champions");
      		out.println(test4);
      
      		StringFirstLetterCheck test5 = new StringFirstLetterCheck("ABC","DEF");
      		out.println(test5);

	}
}