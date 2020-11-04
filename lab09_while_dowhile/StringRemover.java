//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - String Cleaner

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

	//add in constructors
   public StringRemover()
   {
      sentence = null;
      remove = null;
   }
   
   public StringRemover(String s, String r)
   {
      sentence = s;
      remove = r;
   }
	

	public void setRemover(String s, String rem)
	{
      sentence = s;
      remove = rem;
	}

	public String removeStrings()
	{
      String clean = sentence;
      int val = clean.indexOf(remove);
      while(val>-1)
      { 
         clean = clean.substring(0,val-1)+clean.substring(val+remove.length());
         val = clean.indexOf(remove);
      }
      return clean;
	}

	public String toString()
	{
		return sentence + " - String to remove "+ remove+ "\n"+ removeStrings() +"\n\n";
	}
}