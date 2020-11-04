//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Valid Password

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
      password = null;
	}
   
   public PasswordCheck(String p)
   {
      password = p;
   }
   public void setPasswordCheck(String p)
   {
      password = p;
   }

	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
      String guess = "";
      do
      {
      out.print("Enter the password :: ");
      guess = keyboard.next();
      if(guess.equals(password))
         out.println("VALID");
      else
         out.println("INVALID");
      }while(!guess.equals(password));
	}
}