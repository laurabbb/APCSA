//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Spiral Matrix

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpiralMatrixRunner
{
	public static void main( String args[] ) throws IOException
	{
      SpiralMatrix test = new SpiralMatrix(5);
      test.setSize(5);
      test.createSpiral();
      out.println(test);
      
      SpiralMatrix testy = new SpiralMatrix(7);
      testy.createSpiral();
      out.println(testy);
	}
}