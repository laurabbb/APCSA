//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Date - September 17th, 2019
//Lab  - Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
      		Scanner input = new Scanner(in);
      		out.print("Enter a whole number :: ");
      		int num = input.nextInt();
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num+" is even :: " + NumberVerify.isEven(num));
		
		//add in more test cases
	}
}