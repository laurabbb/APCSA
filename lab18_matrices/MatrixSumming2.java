//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Matrix Summing II

import java.util.*;
import java.io.*; 

public class MatrixSumming2
{
    private int[][] m = {{1,2,3,4,5},{6, 7, 8, 9, 0},{6, 7, 1, 2, 5},{6, 7, 8, 9, 0},{5, 4, 3, 2, 1}};   //load in the matrix values

    public int sum( int r, int c )
    {
      int num=m[r][c];
      if(r>0&&r<4&&c>0&&c<4)
      {
         num+=m[r-1][c-1]+m[r-1][c]+m[r-1][c+1];//rowabouve
         num+=m[r][c-1]+m[r][c+1];//rowin
         num+=m[r+1][c-1]+m[r+1][c]+m[r+1][c+1];//rowaft
      }
      if(r<1&&c<1)
      {
         num+=m[r][c+1];//row
         num+=m[r+1][c]+m[r+1][c+1];
      }
      if(r>3&&c<4)
      {
         num+=m[r][c-1]+m[r][c+1];
         num+=m[r-1][c-1]+m[r-1][c]+m[r-1][c+1];
      }
      if(r>3&&c>3)
      {
         num+=m[r][c-1];
         num+=m[r-1][c-1]+m[r-1][c];
      }
      if(r>0&&r<4&&c>3)
      {
         num+=m[r-1][c-1]+m[r-1][c];
         num+=m[r][c-1];
         num+=m[r+1][c-1]+m[r+1][c];
      }
      return num;
    }

    public String toString()
    {
      String a ="";
      for(int i = 0;i<m.length;i++)
      {
         for(int k=0;k<m[i].length;k++)
         {
            a+=m[i][k]+" ";
         }
         a+="\n";
      }
    	return a;
    }
}
