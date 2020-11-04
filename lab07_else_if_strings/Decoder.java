//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Decoder
{
	private char letter;

	public Decoder()
	{
      		letter = 'n';
	}

	public Decoder(char let)
	{
      		letter = let;
	}

	public void setLetter(char let)
	{
      		letter = let;

	}

	public char deCode()
	{
      		char result = 0;
      		if (letter<97 && letter>=65)
      		{  
         		return Character.toLowerCase(letter);
      		}
      		else if (letter>=97&& letter<= 122)
      		{
         		return Character.toUpperCase(letter);
      		}
      
     		if (letter<65 || letter <90 || letter>128)
      		{
         		switch (letter)
         		{
            			case '0': 
               				return 'A';
            			case '1':
               				return 'B';
            			case '2':
               				return 'C';
            			case '3':
               				return 'D';
            			case '4':
               				return 'E';
            			case '5':
               				return 'F';
            			case '6':
               				return 'G';
            			case '7':
               				return 'H';
            			case '8':
               				return 'I';
            			case '9':
               				return 'J';
               
            			default:
               				return '#';

        		}

		}
		return result;

	}

	public String toString()
	{
		return letter + " decodes to " + deCode();
	}
}