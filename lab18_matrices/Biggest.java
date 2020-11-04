//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Biggest

public class Biggest
{
    public static int getBig(int[][] m)
    {
      int bigg = Integer.MIN_VALUE;
      for(int i = 0;i<m.length;i++)
      {
         for(int k = 0;k<m[i].length;k++)
         {
            if(m[i][k]>bigg)
               bigg = m[i][k];
         }
      }
		return bigg;
    }
}
