//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Matrix Summing II

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming2Runner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("matsum.dat"));
      int[][] mat = new int[2][6];
		MatrixSumming2 test = new MatrixSumming2();
      out.println("Matrix values");
      out.println(test);
      out.println("The sum of 2,2 is "+test.sum(2,2)+".");
      out.println("The sum of 0,0 is "+test.sum(0,0)+".");
      out.println("The sum of 4,3 is "+test.sum(4,3)+".");
      out.println("The sum of 4,4 is "+test.sum(4,4)+".");
      out.println("The sum of 2,4 is "+test.sum(2,4)+".");
      out.println("The sum of 1,3 is "+test.sum(1,3)+".");
		// reference slideshow 13 
		// for help on file input
	}
}



