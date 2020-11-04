//Name - Laura Barnes
//Class - AP CSA
//Lab  - Matrix Summing I

import java.util.*;
import java.io.*; 

public class MatrixSumming1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int sum(  )
    {
		//add code here
      int sum = 0;
      for(int i = 0;i<m.length;i++)//rows
      {
         for(int k = 0;k<m[i].length;k++)
            sum += m[i][k];
      }
		return sum;
    }
    
    public String toString()
    {
      String a = "";
      for(int i = 0;i<m.length;i++)
      {
         for(int k = 0;k<m[i].length;k++)
         {
            a+= m[i][k] + " ";
         }
         a+= "\n";
      }
      return a;
    }
}
