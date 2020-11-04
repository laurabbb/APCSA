//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Find Smallest

public class RaySmallest
{
	public static int go(int[] ray)
	{
      int smallest = 10000;
      for(int i = 0; i<ray.length;i++)
      {
         for(int k = 0; k<ray.length;k++)
         {
            if(ray[k]<ray[i]&&ray[k]<smallest||ray.length<=2)
               smallest = ray[k];
            else if(ray[i]<ray[k]&&ray[i]<smallest)
               smallest = ray[i];
         }
      }
		return smallest;
	}
}