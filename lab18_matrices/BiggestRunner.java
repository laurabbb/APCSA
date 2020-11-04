//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Biggest

import static java.lang.System.out;

public class BiggestRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] f = {{1,2,3},{5,5,5,5}};
		System.out.println( "The biggest number is :: " + Biggest.getBig( f ) );
      
      int[][] a = {{1,2,3},{-5},{11},{21,2}};
      out.println("The biggest number is :: "+ Biggest.getBig(a));
      
      int[][] b = {{1,2},{-5,5},{5,5},{4,5,6,7},{123124,12312}};
      out.println("The biggest number is :: "+ Biggest.getBig(b));
      
      int[][] c = {{-20, -40},{-234,-234234 } };
      out.println("The biggest number is :: "+ Biggest.getBig(c));
		
		//add more code and test cases		
	}
}



