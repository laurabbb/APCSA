//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - First Repeats

public class First
{
   public static String go( String a )
	{  
		if (a.lastIndexOf(a.charAt(0))>0)
      		{
         		return "yes";
      		}
      		else
      		{
			return "no";
      		}

	}

}



/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/