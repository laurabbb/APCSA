//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Total Em Up

public class RayTotal
{
	public static int go(int[] ray)
	{
      int total = 0;
      for(int item : ray)
      {
         total+=item;
      }
		return total;
	}
}