//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Rock, Paper, Scissors

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
      playChoice = null;
      playChoice = null;
	}

	public RockPaperScissors(String player)
	{
      playChoice = player;
	}

	public void setPlayers(String player)
	{
     playChoice = player;
     int num = (int)(Math.random()*3);
     switch(num)
     {
     case 0: compChoice = "R"; break;
     case 1: compChoice = "P"; break;
     case 2: compChoice = "S"; break;
     }
	}

	public String determineWinner()
	{
		String winner="";
      if(playChoice.equals(compChoice))
      {
         winner = "!Draw Game!";
      }
      else if(playChoice.equals("R"))
         {
            if(compChoice.equals("P"))
            {
               winner = "!Computer wins <<Paper Covers Rock>>!";
            }
            else if(compChoice.equals("S"))
            {
               winner = "!Player wins <<Rock Breaks Scissors>>!";
            }
         }
      else if(playChoice.equals("P"))
      {
         if(compChoice.equals("R"))
            {
               winner = "!Player wins <<Paper Covers Rock>>!";
            }
            else if(compChoice.equals("S"))
            {
               winner = "!Computer wins <<Scissors Cuts Paper>>!";
            }
      }
      else if(playChoice.equals("S"))
      {
         if(compChoice.equals("R"))
            {
               winner = "!Computer wins <<Rock Breaks Scissors>>!";
            }
            else if(compChoice.equals("P"))
            {
               winner = "!Player wins <<Scissors Cuts Paper>>!";
            }
      }

		return winner;
	}

	public String toString()
	{
		String output= "player had "+playChoice +"\ncomputer had "+compChoice+ "\n"+determineWinner();
		return output;
	}
}