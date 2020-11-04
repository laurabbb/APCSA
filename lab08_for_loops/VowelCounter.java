//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Vowel Counter

import static java.lang.System.*;
import java.util.*;

public class VowelCounter
{
	public static String getNumberString( String s)
	{
     char[] check = {'A', 'E','I','O','U'};
     StringBuffer string = new StringBuffer(s);
     int count = 0;
     for(int x = 0; x < s.length(); x++)
     {
         for (char c : check)
         {
            if(c == Character.toUpperCase(s.charAt(x)))
            {
            string.replace(x,x+1,""+count++);
            if(count>9)
               count = 0;
            }
         }
     }
     return string.toString();
	}
}


