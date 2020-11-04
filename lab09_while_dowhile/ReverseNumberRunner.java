//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Reverse Number

import static java.lang.System.*;

public class ReverseNumberRunner
{
	public static void main( String args[] )
	{
		//add test cases 
      ReverseNumber test = new ReverseNumber(234);
      out.println(test);
      ReverseNumber test1 = new ReverseNumber(10000);
      out.println(test1);
      ReverseNumber test2 = new ReverseNumber(111);
      out.println(test2);
      ReverseNumber test3 = new ReverseNumber(9005);
      out.println(test3);
      ReverseNumber test4 = new ReverseNumber(84645);
      out.println(test4);
      ReverseNumber test5 = new ReverseNumber(8547);
      out.println(test5);
      ReverseNumber test6 = new ReverseNumber(123456789);
      out.println(test6);
	}
}