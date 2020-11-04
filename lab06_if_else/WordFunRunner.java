//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - String Fun I

import static java.lang.System.*;

public class WordFunRunner
{
	public static void main( String args[] )
	{
      
		WordFun test = new WordFun("Hello World");
		out.println(test);
		test.makeUpper();
      		out.println("");
		out.println(test);
      		out.println("");
	   	test.addHyphen();
	   	out.println(test);
      		out.println("");
	   	//add more test cases
      		WordFun test1 = new WordFun("Jim Bob");
      		out.println(test1);
	   	test1.makeUpper();
      		out.println("");
	   	out.println(test1);
      		out.println("");
	   	test1.addHyphen();
	   	out.println(test1);
      		out.println("");
      
      		WordFun test2 = new WordFun("Computer Science");
      		out.println(test2);
	   	test2.makeUpper();
      		out.println("");
	   	out.println(test2);
      		out.println("");
	   	test2.addHyphen();
	   	out.println(test2);
      		out.println("");
      
      		WordFun test3 = new WordFun("UIL TECA");
      		out.println(test3);
	   	test3.makeUpper();
      		out.println("");
	   	out.println(test3);
      		out.println("");
	   	test3.addHyphen();
	   	out.println(test3);
      		out.println("");
      
      		WordFun test4 = new WordFun("State Champions");
      		out.println(test4);
	   	test4.makeUpper();
      		out.println("");
	   	out.println(test4);
      		out.println("");
	   	test4.addHyphen();
	   	out.println(test4);
	}
}