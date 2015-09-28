// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		g.drawRect(50, 50, 250, 250);
		g.drawRect(150, 150, 275, 275);
		g.drawLine(50, 50, 150, 150);
		g.drawLine(300, 50, 425, 150);
		g.drawLine(50, 300, 150, 425);
		g.drawLine(300,300,425,425);


		// DRAW SPHERE
		g.drawOval(100, 100, 275, 275);
		g.drawArc(110, 110 ,285, 285, 90, 180);




		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE




		// DRAW APCS




		// DRAW PACMEN FLOWER




	}

}

