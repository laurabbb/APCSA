//(c) A+ Computer Science
//www.apluscompsci.com


import static java.lang.System.*; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		System.out.println( CountPairs.pairCounter("ddogccatppig") );
		out.println( CountPairs.pairCounter("dogcatpig"));
      out.println( CountPairs.pairCounter("xxyyzz"));
      out.println(CountPairs.pairCounter("a"));
      out.println( CountPairs.pairCounter("abc"));
      out.println(CountPairs.pairCounter("aabb"));
      out.println( CountPairs.pairCounter("dogcatpigaabbcc"));
      out.println(CountPairs.pairCounter("aabbccdogcatpig"));
      out.println( CountPairs.pairCounter("dogabbcccatpig"));
      out.println(CountPairs.pairCounter("aaaa"));
      out.println(CountPairs.pairCounter("AAAAAAAAA"));
	}
}