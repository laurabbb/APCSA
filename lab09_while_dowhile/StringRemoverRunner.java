//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - String Cleaner

import static java.lang.System.*;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases
      StringRemover test = new StringRemover("xR-MxR-MHelloxR-M","R-M");
      out.println(test.toString());
      StringRemover test1 = new StringRemover("sxsssxssxsxssexssxsesss","xs");
      out.println(test1.toString());
      StringRemover test2 = new StringRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn","qwerty");
      out.println(test2.toString());

											
	}
}