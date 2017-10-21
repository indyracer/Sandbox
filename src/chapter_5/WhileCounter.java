package chapter_5;
/*
 * How to program java
 * Fig. 5.1 WhileCounter
 */

import java.awt.Graphics;
import javax.swing.JApplet;

public class WhileCounter extends JApplet{
	
	//draw lines on applets background
	public void paint(Graphics g){
		//call inherited version of method paint
		super.paint(g);
		
		int counter = 1; //initialization
		
		while(++counter <= 10){
			g.drawLine(10, 10, 250, counter * 10); //repetition condition
			
		}
	}

}
