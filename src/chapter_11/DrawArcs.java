package chapter_11;

/*
 * How to program java
 * fig. 11.19 Drawing Arcs
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawArcs extends JFrame {
	
	//set window's title bar string and dimensions
	public DrawArcs(){
		super("Drawing Arcs");
		setSize(400, 200);
		setVisible(true);
	}
	
	//draw rectangles and arcs
	public void paint(Graphics g){
		//call superclass paint method
		super.paint(g);
		
		//start at 0 and sweep 360
		g.setColor(Color.yellow);
		g.drawRect(15, 35, 80, 80);
		g.setColor(Color.BLACK);
		g.drawArc(15, 35, 80, 80, 0, 360);
		
		//start at 0 and sweep 110
		g.setColor(Color.yellow);
		g.drawRect(100, 35, 80, 80);
		g.setColor(Color.BLACK);
		g.drawArc(100, 35, 80, 80, 0, 110);
		
		//start at 0 and sweep -270
		g.setColor(Color.yellow);
		g.drawRect(185, 35, 80, 80);
		g.setColor(Color.BLACK);
		g.drawArc(185, 35, 80, 80, 0, -270);
		
		//start at 0 and sweet 360
		g.fillArc(15, 120, 80, 40, 0, 360);
		
		//start at 270 and sweep -90
		g.fillArc(100, 120, 80, 40, 270, -90);
		
		//start at 0 and sweep-270
		g.fillArc(185, 120, 80, 40, 0, -270);
	}

	public static void main(String[] args) {
		
		DrawArcs application = new DrawArcs();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TODO Auto-generated method stub

	}

}
