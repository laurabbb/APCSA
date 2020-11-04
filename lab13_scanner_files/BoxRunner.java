//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Boxes

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class BoxRunner
{
	public static void main( String args[] ) throws IOException
	{
      Scanner file = new Scanner(new File("box.dat"));
      int size = file.nextInt();
		file.nextLine();
      for(int i = size; i>0;i--)
      {
  
      Box help = new Box(file.next(),file.nextInt());
      out.println(help.toString());
      }
	}
}