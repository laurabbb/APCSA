//(c) A+ Computer Science
//www.apluscompsci.com


import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
      yPos = y;
      width = wid;
      height = ht;
      color = col;
		//finish this constructor
   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      window.fillArc(xPos+20,yPos-20,width,height,width/2,height/2);
      window.setColor(Color.BLACK);
      window.drawLine(xPos+(width/4),yPos+(height/3),xPos+(width/4),yPos+((height/3)*2));
      window.drawLine(xPos+((width/4)*3),yPos+(height/3),xPos+((width/4)*3),yPos+((height/3)*2));
      window.drawLine(xPos+(width/4),yPos+((height/4)*3),xPos+((width/4)*3),yPos+((height/4)*3));
   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}