//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Date - September 17th, 2019
//Lab  - Smiley Face

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		//instantiate a Shape
      Shape og = new Shape(100,100,65,65,Color.RED);
		//tell your shape to draw
      og.draw(window);
      
		//instantiate a Shape
      Shape uno = new Shape(200,200, 65, 65, Color.CYAN);
      uno.draw(window);
      
      
		//instantiate a Shape
      Shape dos = new Shape (400,400,85,65, Color.PINK);
      dos.draw(window);
		//tell your shape to draw
      
      Shape tres = new Shape (550,500,100,100, Color.BLUE);
      tres.draw(window);
      
      
  	}
}