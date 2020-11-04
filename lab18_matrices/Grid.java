//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Count Letters

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
   grid = new String[rows][cols];
   for(int i = 0;i<grid.length;i++)
   {
      for(int k = 0;k<grid[i].length;k++)
      {
        grid[i][k]=vals[(int)(Math.random()*vals.length)];
      }
   }
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
      String val = "null";
      int large = 0;
      int[] abc = new int[vals.length];
      
 
       for(int i = 0; i < vals.length; i++)
       {
       
         abc[i] = countVals(vals[i]);
       }
       
       for(int z = 0; z<values.length; z++)
       {
         if (values[z]> large)
         {
            large = abc[z];
            val = vals[z];
            
         }
       }
       return val + " occurs the most.";
      
	}

	//returns a count of how many times val occurs in the matrix
	public int countVals( String val )
	{
      int num = 0;
      for(int i = 0;i<grid.length;i++)
      {
         for(int k = 0;k<grid[i].length;k++)
         {
            if(grid[i][k].equals(val))
               num++;
         }
      }
		return num;
	}

	//display the grid
	public String toString()
	{
		String output="";
      for(int i =0;i<grid.length;i++)
      {
         for(int k =0;k<grid[i].length;k++)
         {
            output+= grid[i][k] + " ";
         }
         output+="\n";
      }
		return output;
	}
}