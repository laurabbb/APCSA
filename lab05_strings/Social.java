//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Valid Social


public class Social
{
   public static String go( String a )
	{
      		if(a.indexOf("-")==3 && a.lastIndexOf("-")==6)
         	{
        		return a.substring(a.length()-4);
         	}
      		else
      		{
			return "bad";
      		}
	}
}



/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/