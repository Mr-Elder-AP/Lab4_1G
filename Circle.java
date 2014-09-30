//*FINAL CODE*******************************************
// Circle.java
// Write a class Circle that will draw circles
//*******************************************************
import java.awt.*;
import static java.lang.System.out;
import java.util.Random;

public class Circle
{
  private int radius;
  private int xCoor;
  private int yCoor;
  private int color;
  private static Random radiusGen = new Random();
  private static Random xCoorGen = new Random();
  private static Random yCoorGen = new Random();
  private static Random colorGen = new Random();
  //----------------------------------------------
  //Constructor -- 
  //----------------------------------------------
  public Circle()
  {
    radius = (radiusGen.nextInt(100)) + 101;
    xCoor = (xCoorGen.nextInt(600));
    yCoor = (yCoorGen.nextInt(400));
    color = (colorGen.nextInt(10) + 1);
  }

  //----------------------------------------------
  // Draw a Circle
  //----------------------------------------------
  public void drawCircle(Graphics page)
  {
    switch (color)
    {
    	case 1: page.setColor (Color.white);break;
    	case 2: page.setColor (Color.blue);break;
    	case 3: page.setColor (Color.cyan);break;
    	case 4: page.setColor (Color.gray);break;
    	case 5: page.setColor (Color.green);break;
    	case 6: page.setColor (Color.magenta);break;
    	case 7: page.setColor (Color.orange);break;
    	case 8: page.setColor (Color.pink);break;
    	case 9: page.setColor (Color.red);break;
    	case 10: page.setColor (Color.yellow);break;
    }
    
	if (color == 1 || color == 3 || color == 4 )
	{
		page.drawOval(xCoor, yCoor, radius, radius);
	}
		
	if (color == 2 || color == 5 || color == 6 || color == 7 || color == 8 || color == 9 || color == 10 )
	{
   		page.fillOval(xCoor, yCoor, radius, radius);
   	}	
   
  }

}

 
