/*
 * This applet displays a black banner moving across the screen
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import javax.swing.*;

public class Banner extends JApplet
	implements ActionListener
{
	private int xPos, yPos; // hold the coordinates of the banner
	
	public void init ()
	{
		Container c = getContentPane ();
		c.setBackground(Color.WHITE);
		xPos = c.getWidth ();
		yPos = c.getHeight ();
		Timer clock = new Timer(30, this); //Fires every 30 milliseconds
		clock.start();
	}
	
	//called automatically after repaint request
	public void paint (Graphics g)
	{
		super.paint (g);
		(g).setColor(Color.BLACK);
		g.drawRect(0, 50, xPos, yPos);
		g.fillRect(0, 50, xPos, yPos);
		//Correct! 
	}
	
	// Called automatically when the timer fires 
	public void actionPerformed (ActionEvent e)
	{
		Container c = getContentPane();
		
		// Adjust the horizontal position of the banner:
		xPos--;
		if (xPos < -100)
		{
			xPos = c.getWidth();
		}
		
		//Set the vertical position of the banner:
		yPos = c.getHeight() / 2;
		
		repaint();
	}

}


