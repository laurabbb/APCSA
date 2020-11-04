//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Ground Changer

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Ground 
{
	private ArrayList<Image> tiles;
	
	public Ground() throws IOException
	{
		//point the tiles at new array list
      tiles = new ArrayList<Image>();
		
		//add in each of the images for the grass.gif, gtoroad.gif, road.gif, rtograss.gif
      tiles.add(ImageIO.read(new File("grass.gif")) );
      tiles.add(ImageIO.read(new File("road.gif")) );
      tiles.add(ImageIO.read(new File("gtoroad.gif")) );
      tiles.add(ImageIO.read(new File("rtograss.gif")) );
	
	}
	
	public void drawGround(Graphics2D g)
	{
		//draw the ground on the screen
      
      //ground
      for(int y = 0;y<=550;y+=50)
      {
         for(int x = 0;x<800;x+=50)
         {
            if(y<100)
               g.drawImage(tiles.get(0),x,y,null);
           if(y>=100&&y<150)
               g.drawImage(tiles.get(2),x,y,null); 
            if(y>=150&&y<500)
               g.drawImage(tiles.get(1),x,y,null);
            if(y>=500&&y<550)
               g.drawImage(tiles.get(3),x,y,null);
            if(y>=550&&y<600)
               g.drawImage(tiles.get(0),x,y,null);
     
         }
      }
      	
	}	
}