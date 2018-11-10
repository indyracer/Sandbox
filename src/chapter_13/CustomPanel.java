package chapter_13;
/*
 * how to program java
 * Fig 13.2 customized JPanel class
 */

import java.awt.*;
import javax.swing.*;

public class CustomPanel extends JPanel{
	public final static int CIRCLE = 1, SQUARE = 2;
	private int shape;
	
	//use shape to draw an oval or rectangle
	public void paintCompenent(Graphics g){
		super.paintComponent(g);
		
		if(shape == CIRCLE){
			g.fillOval(50, 10, 60, 60);
		}
		else if(shape == SQUARE){
			g.fillRect(50, 10, 60, 60);
			g.setColor(Color.black);
		}
		
	}
	
	public void draw (int shapeToDraw){
		shape = shapeToDraw;
		repaint();
	}

}
