//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Fibonacci

import static java.lang.System.out;

public class FibonacciRunner
{
	public static void main(String args[])
	{
		//add test cases
      Fibonacci test = new Fibonacci(50);
      System.out.println(test.toString(1));
      System.out.println(test.toString(2));
      System.out.println(test.toString(3));
      System.out.println(test.toString(4));
      System.out.println(test.toString(5));
      System.out.println(test.toString(6));
      System.out.println(test.toString(11));
      System.out.println(test.toString(16));
      System.out.println(test.toString(21));
      System.out.println(test.toString(31));
      System.out.println(test.toString(41));
      System.out.println(test.toString(46));
      
      test = new Fibonacci(1);
      System.out.println(test.toString(1));
      
      test = new Fibonacci(2);
      System.out.println(test.toString(1));
      System.out.println(test.toString(2));
      System.out.println(test.toString(11));
	}
}