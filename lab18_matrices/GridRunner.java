//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Count Letters

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
   String[] list = new String[]{"a","b","c","x","1","2","3","4","5","6","7","8","9","0"};
   Grid test = new Grid(4,4,list);
   out.println(test);
   out.println("a count is "+test.countVals("a"));
   out.println("b count is "+test.countVals("b"));
   out.println("c count is "+test.countVals("c"));
   out.println("7 count is "+test.countVals("9"));
   out.println("x count is "+test.countVals("x"));
   out.println("2 count is "+test.countVals("2"));
   out.println(test.findMax(list));
   
	}
}