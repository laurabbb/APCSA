//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Rock, Paper, Scissors

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
         String answer = "";
         boolean ask = true;
		do
      {
			out.print("Rock-Paper-Scissors [R,P,S] :: ");
         player = keyboard.next();
		
			RockPaperScissors game = new RockPaperScissors(player);
         game.setPlayers(player);
         out.println(game);
         
         out.print("\nDo you want to play again? ");
         answer = keyboard.next();
         out.println();
         if(answer.equalsIgnoreCase("n"))
            ask = false;
      }while(ask == true);
	}
}



