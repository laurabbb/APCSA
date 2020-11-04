//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - First Repeats

public class RayFirst
{
	public static boolean go(int[] ray)
	{
      for(int i =1; i< ray.length;i++)
      {
         if(ray[0]==ray[i])
         {
            return true;
         }
      }
		return false;
	}
}