//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Total Row
import static java.lang.System.out;

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		//add code here
      out.println("Row Totals are :: "+TotalRow.getRowTotals(new int[][] {{1,2,3},{5,5,5,5}}));
      out.println("Row Totals are :: "+TotalRow.getRowTotals(new int[][] {{1,2,3},{5},{1},{2,2}}));
      out.println("Row Totals are :: "+TotalRow.getRowTotals(new int[][] {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}}));
      	
	}
}



