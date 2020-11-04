//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Spiral Matrix

import static java.lang.System.*;

public class SpiralMatrix
{
	//define a matrix
   private int[][] mat;

	public SpiralMatrix()
	{
      mat[0][0]= 1;
	}

	public SpiralMatrix(int size)
	{
      mat = new int[size][size];
	}
	
	public void setSize(int size)
	{
      mat = new int[size][size];
	}

	public void createSpiral()
	{
      for(int i = 0;i<mat.length;i++)
      {
         for(int k = 0;k<mat[i].length;k++)
         {
            mat[i][k] = (int)(Math.random()*50);
         }
      }
	}

	public String toString( )
	{
		String output="";
      for(int i = 0;i<mat.length;i++)
      {
         for(int k = 0;k<mat[i].length;k++)
         {
            if(mat[i][k]<10)
            {
               output=output+mat[i][k]+ "     ";
            }
            else
               output+=mat[i][k]+"    ";
         }
         output+= "\n";
      }
		return output;
	}
}