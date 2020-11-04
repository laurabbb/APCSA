//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
//Lab  -  

import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinary
{
   private char hexa;
	public static String getBinary( char hex )
	{
   String num = null;
      switch (hex)
      {
      case 'A' : num = "1010"; break;
      case 'B' : num = "1011"; break;
      case 'C' : num = "1100"; break;
      case 'D' : num = "1101"; break;
      case 'E' : num = "1110"; break;
      case 'F' : num = "1111"; break;
      default : num = "ERROR"; break;
      }
		return hex + " is " + num + " in binary!\n";
	}
}