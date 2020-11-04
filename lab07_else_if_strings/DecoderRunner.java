//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Decoder

import static java.lang.System.*; 
import java.util.Scanner;

public class DecoderRunner
{
	public static void main( String args[] )
	{

		//add test cases
      		for(int i=0;i<7;i++)
     		{
      			Scanner key = new Scanner(in);
      			out.print("Enter a letter :: ");
      			char letter = key.next().charAt(0);
      			Decoder let = new Decoder(letter);
      			out.println(let.toString());
      			out.println("");
      		}
	}
}