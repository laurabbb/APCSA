//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Total Row

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
      ArrayList<Integer> totals = new ArrayList<Integer>();
      int sum = 0;
     for(int i = 0;i<m.length;i++)
      {
         for(int k = 0;k<m[i].length;k++)
         {
            sum += m[i][k];
         }
         totals.add(sum);
         sum = 0;
      }
		return totals;
    }
}
