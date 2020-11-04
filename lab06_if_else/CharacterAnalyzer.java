//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Character Analyzer

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
      		theChar = '\u0000';   
	}

	public CharacterAnalyzer(char c)
	{
      		theChar = c;
	}

	public void setChar(char c)
	{
      		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
      		if(theChar >= 65 && theChar <= 90)
      		{
			return true;
      		}
      		else
      		{
      			return false;
      		}
	}

	public boolean isLower()
	{  
      		if(theChar >= 97 && theChar <= 122)
			return true;
      		else
      			return false;
	}
	
	public boolean isNumber( )
	{  
      		if(theChar >=48 && theChar <= 57)
      			return true;
      		else
			return false;
	}	

	public int getASCII( )
	{
		return (int)theChar;
	}

	public String toString()
	{
      		if(isUpper() == true)
     		{
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
      		}
      		if(isLower() == true)
      		{
         		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
	   	}
      		if(isNumber() == true)
      		{
      			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
      		}
      		return "Error. Please Retry";

	}

}