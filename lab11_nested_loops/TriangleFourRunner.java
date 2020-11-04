//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Triangle Four

import static java.lang.System.*;

public class TriangleFourRunner
{
   public static void main( String args[] )
   {
      TriangleFour test = new TriangleFour(3,"R");
      out.println(test.toString());
      test.setTriangle("B",3);
      out.println(test.toString());
      test.setTriangle("X",5);
      out.println(test.toString());
      test.setTriangle("E",2);
      out.println(test.toString());
      test.setTriangle("T",1);
      out.println(test.toString());
   }
}