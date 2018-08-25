package chapter_12;
/*
 * How program java
 * Fig 12.19 Using class MouseMotionAdapter
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Painter extends JFrame{
	private int xValue = -10, yValue = -10;

	//set up GUI
	public Painter(){
		super("A simple paint program");
		//create label and place it in SOUTH of BorderLayout
		getContentPane().add(
				new Label("Drag the mouse to draw"),
				BorderLayout.SOUTH);

		addMouseMotionListener(
				//anonymous inner class
				new MouseMotionAdapter(){
					//store dragged coordinates and repaint
					public void mouseDragged(MouseEvent event){
						xValue = event.getX();
						yValue = event.getY();
						repaint();
					}
				}//end anonymous inner class
				);//end call to addMouseMotionListener

		setSize(300,150);
		setVisible(true);
	}

	//draw oval in a 4 by 4 bounding box at the specified location on the window
	public void Paint(Graphics g){
		//Purposely did not call super.paint(g) here to prevent repainting
		g.fillOval(xValue, yValue, 4, 4);
	}

	public static void main(String[] args) {
		Painter application = new Painter();
		application.addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent event){
						System.exit(0);
					}
				}
				);

	}

}
