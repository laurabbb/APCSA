//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Matrix Count I
import static java.lang.System.out;

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		//add code
      MatrixCount1 test = new MatrixCount1();
      out.println("Matrix values");
      out.println(test);
      out.println("The 7 count is :: "+ test.count(7));
      out.println("The 8 count is :: "+ test.count(8));
      out.println("The 6 count is :: "+ test.count(6));
      out.println("The 21 count is :: "+ test.count(21));
	}
}



