package chapter_11;
/*
 * How to Program java
 * Fig 11.14
 * Drawing lines, rectangles and ovals
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LinesRectOvals extends JFrame{
	
	//set window title bar String and Dimensions
	public LinesRectOvals(){
		super("Drawing Lines, Rectangles and Ovals");
		setSize(400, 165);
		setVisible(true);
	}
	
	//display various lines, rectangles and ovals
	public void paint (Graphics g){
		//call superclass's paint method
		super.paint(g);
		
		g.setColor(Color.red);
		g.drawLine(5, 30, 350, 30);
		
		g.setColor(Color.blue);
		g.drawRect(5, 40, 90, 55);
		g.fillRect(100, 40, 90, 55);
		
		g.setColor(Color.cyan);
		g.fillRoundRect(195, 40, 90, 55, 50, 50);
		g.drawRoundRect(290, 40, 90, 55, 20, 20);
		
		g.setColor(Color.yellow);
		g.draw3DRect(5, 100, 90, 55, true);
		g.fill3DRect(100, 100, 90, 55, false);
		
		g.setColor(Color.magenta);
		g.drawOval(195, 100, 90, 55);
		g.fillOval(290, 100, 90, 55);
	}
	
	//execute application
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinesRectOvals application = new LinesRectOvals();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
