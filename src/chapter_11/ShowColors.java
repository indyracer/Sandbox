package chapter_11;

/*
 * How to program Java
 * Fig 11.5 Demonstrating Color
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowColors extends JFrame {
	
	//constructor sets windows title bar string and dimensions
	public ShowColors(){
		super("Using colors");
		
		setSize(431, 240);
		setVisible(true);
	}
	
	//draw rectangles and Strings in different colors
	public void paint (Graphics g){
		//call superclass's paint method
		super.paint(g);
		
		//set new drawing color using integers
		g.setColor(new Color(255, 0, 0));
		g.fillRect(25, 25, 100, 20);
		g.drawString("Current RGB: " + g.getColor(), 130, 40);
		
		//set new drawing color using floats
		g.setColor(new Color(0.0f, 1.0f, 0.0f));
		g.fillRect(25, 50, 100, 20);
		g.drawString("Current RGB: " + g.getColor(), 130, 65);
		
		//set new drawing color using static Color objects
		g.setColor(Color.blue);
		g.fillRect(25, 75, 100, 20);
		g.drawString("Current RGB: " + g.getColor(), 130, 90);
		
		//display individual RGB values
		Color color = Color.magenta;
		g.setColor(color);
		g.fillRect(25, 100, 100, 20);
		g.drawString("Current values: " + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue(), 130, 115);
		
	}

	public static void main(String[] args) {
		
		ShowColors application = new ShowColors();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
