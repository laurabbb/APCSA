//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Letter or Vowel

public class LetterOrVowel
{
	public static boolean check( String s )
	{
      		int a = s.charAt(0);
      		//or could be a switch case
      		if(a==65||a==69||a==73||a==79||a==85||a==97||a==101||a==105||a==111||a==117)
			return true;
      		else if(a>=48 && a<=57)
         		return true;
      		else
         		return false;

	}

}