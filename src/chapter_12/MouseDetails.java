package chapter_12;
/*
 * How to program java
 * Fig 12.20 Demonstrating mouse clicks and distinguishing between mouse buttons
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDetails extends JFrame{
	private int xPos, yPos;
	
	//set title bar String, register mouse listener and size and show window
	public MouseDetails(){
		super ("Mouse clicks and buttons");
		
		addMouseListener(new MouseClickHandler());
		
		setSize(350, 150);
		setVisible(true);
	}
	
	//draw String at location where mouse was clicked
	public void point(Graphics g){
		//call superclass paint method
		super.paint(g);
		g.drawString("Clicked @ [" + xPos + ", " + yPos + "]", xPos, yPos);
	}

	public static void main(String[] args) {
		MouseDetails application = new MouseDetails();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	//inner class to handle mouse events
	private class MouseClickHandler extends MouseAdapter{
		//handle mouse click event and determine which mouse
		//button was clicked
		public void mouseClick(MouseEvent event){
			xPos = event.getX();
			yPos = event.getY();
			
			String title = "Clicked " + event.getClickCount() + " time(s)";
			
			//right mouse button
			if(event.isMetaDown()){
				title += " with right mouse button";
			}
			else if(event.isAltDown()){
				title += " with center mouse button";
			}
			else{
				title += " with left mouse button";
			}
			
			setTitle(title); //set the title bar of window
			repaint();
		}
	}

}
