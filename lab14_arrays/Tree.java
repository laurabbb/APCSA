//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Make A Tree

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Canvas;
import java.util.*;
import java.awt.*;
import java.lang.*;

public class Tree extends Canvas
{
	public Tree()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		window.drawString("Lab14h - Tree Lab", 50, 50);
		
		tree(window);
      star(window);
      ornaments(window);
      presents(window);



	}
	
	public void tree(Graphics window)
	{
		int[] treeXPoints = {400,200,600};
		int[] treeYPoints = {100,500,500};
		Polygon tree = new Polygon(treeXPoints,treeYPoints,treeXPoints.length);
		window.setColor(Color.GREEN);
		window.fillPolygon(tree);


	}

	public void star(Graphics window)
	{
      int[] starXPoints = {400,425,450,425,415,400,385,375,350,375};
      int[] starYPoints = {50,75,85,95,105,95,105,95,85,75};
      Polygon star = new Polygon(starXPoints,starYPoints,starXPoints.length);
      window.setColor(Color.YELLOW);
      window.fillPolygon(star);
	}
   
   public void ornaments(Graphics window)
   {
   int widthAndHeight = 25;
   int[] x = {400,225,550,420,325,350,375,375,300,430};
   int[] y = {400,450,425,430,350,205,180,350,400,250};
   
   for(int i = 0;i<x.length;i++)
     {
         int R = (int)(Math.random()*256);
         int G = (int)(Math.random()*256);
         int B = (int)(Math.random()*256);
         Color randomColor = new Color(R,G,B);
         window.setColor(randomColor);
      window.fillOval(x[i],y[i],widthAndHeight,widthAndHeight);
     }

   }
   
   public void presents(Graphics window)
   {
      int[] x= {700,50,200,650};
      int[] y = {500,500,525,500};
      int[] width = {25,50,75,25};
      int[] height = {50,50,25,50};
      
      for(int i = 0; i<x.length;i++)
      {
      //why is the random color not working??
         int R = (int)(Math.random()*256);
         int G = (int)(Math.random()*256);
         int B = (int)(Math.random()*256);
         Color randomColor = new Color(R,G,B);
         window.setColor(randomColor);
         
         window.fillRect(x[i],y[i],width[i],height[i]);
      }
   }
}
