//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Laura Barnes
//Class - AP CSA
//Lab  - Dodging Enemies

import java.awt.Font;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class Enemies 
{
	private ArrayList<Enemy> enemies;
	private Person guy;
	
	public Enemies(Person p)
	{
		enemies = new ArrayList<Enemy>();
		guy = p;		
	}
	
	// DRAW AND COLLISION METHOD
	public void drawAndCollision(Graphics2D g) throws IOException
	{
		// ADD ENEMIES
      if(numEnemies()<10)
         addEnemy();
		// REMOVE ENEMIES THAT GO OUT OF BOUND
		for(int i=0;i<enemies.size();i++)
      {
         if(enemies.get(i).getX()>800||enemies.get(i).getY()>600)
            enemies.remove(i);
      }
		// GO THROUGH THE LIST OF ENEMIES AND CALL THEIR draw() and move() method and check if their collide with guy if so then call the GAMEOVER() METHOD
		for(Enemy a:enemies)
      {
         a.move();
         a.draw(g);
         if(guy.collide(a.getX(),a.getY())==true)
            GAMEOVER(g);
      }
		// IF THE PLAYER REACHES THE GRASS ON THE BOTTOM SIDE CALL THE VICTORY() method
      if(guy.getY()>=550)
         VICTORY(g);	
	}
	
	public void GAMEOVER(Graphics2D g)
	{
		Game.RUNNING = false;
		Font f = new Font("Dialog", Font.PLAIN, 24);
		g.setFont(f);
		g.drawString("GAME OVER!", 400, 300);
	}
	
	public void VICTORY(Graphics2D g)
	{
		Font f = new Font("Dialog", Font.PLAIN, 24);
		g.setFont(f);
		g.drawString("VICTORY!", 400, 300);
		Game.RUNNING = false;
	}
	
	// ADDS AN ENEMY TO THE ENEMY LIST
	public void addEnemy() throws IOException
	{
		enemies.add(new Enemy(0,(int)(Math.random()*300)+150,(int)(Math.random()*10)+1));
   }
	
	// RETURN HOW MANY ENEMIES THERE ARE
	public int numEnemies()
	{
		return enemies.size();
	}
}
