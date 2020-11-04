//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Decreasing Word

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
	   TriangleOne obj1 = new TriangleOne("hippo");
      obj1.setWord("hippo");
      obj1.print();
      
      TriangleOne obj2 = new TriangleOne("abcd");
      obj2.setWord("abcd");
      obj2.print();
     
      TriangleOne obj3 = new TriangleOne("it");
      obj3.setWord("it");
      obj3.print();
      
      TriangleOne obj4 = new TriangleOne("a");
      obj4.setWord("a");
      obj4.print();
      out.println();
      out.println();
      
      TriangleOne obj5 = new TriangleOne("chicken");
      obj5.setWord("chicken");
      obj5.print();
	}
}