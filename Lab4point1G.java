//FINAL - CODE
//*************************************************
//   Lab4point1G.java
//
//   The program will demonstrate basic drawing
//   methods and the use of color.
//
//*************************************************

import java.applet.Applet;
import java.awt.*;
import java.util.*;


public class Lab4point1G extends java.applet.Applet
{
	
	Random rand = new Random();
	int y = 1000;
	
    public void paint (Graphics page)
    {
		// Set the background color
		setBackground (Color.white);		

		for (int i=1; i <= 1000; i++)
		{
			page.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
			page.fillArc(rand.nextInt(500), rand.nextInt(500), rand.nextInt(500),rand.nextInt(500), rand.nextInt(500), rand.nextInt(500));

			if(new Random().nextInt(100) == 0)
			{			
				Font font  = new Font("Times New Roman", Font.PLAIN, new Random().nextInt(50));			
				page.setFont(font);
				page.setColor(new Color(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256)));
				page.drawString(String.valueOf(new Date().getTime()), new Random().nextInt(700), new Random().nextInt(500));
				sleep(300);
			
			}
			
			sleep((i - y) / 4);
			
			y--;			

		}

	}
	
	public void sleep(double ms)
	{
			try
			{
				Thread.sleep((int)(ms));
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
} 
