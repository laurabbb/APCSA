//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - AB

public class AB
{
	public static boolean check( String s, String a, String b)
	{
      		if(s.indexOf(b)>0)
      		{  
         		if(s.lastIndexOf(a) == s.indexOf(b)-1 || s.indexOf(a) == s.lastIndexOf(b)+1 ||s.indexOf(a) == s.indexOf(b)-1 || s.indexOf(a) == s.indexOf(b)+1)
         		{
			return true;
        		}
         		return false;
      		}
      		else
		   return false;
      
	}
}