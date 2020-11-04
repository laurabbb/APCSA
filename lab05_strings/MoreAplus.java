//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - More APlus

public class MoreAplus
{
   public static String go( String a )
	{
   		if(a.indexOf("aplus")>=0 && a.lastIndexOf("aplus")>a.indexOf("aplus"))
   		{
   			return "yes";
   		}
   		else
   		{
   			return "no";
   		}
	}
}
