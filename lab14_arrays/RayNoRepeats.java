//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - No Repeats

public class RayNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go(int[] ray)
	{
      for(int i = 0; i<ray.length;i++)
      {
         for(int k = 0; k<ray.length; k++)
         {
            if(i!=k&&ray[i]==ray[k])
               return false;
         }
      }
		return true;
	}
}