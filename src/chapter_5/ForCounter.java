package chapter_5;


/*
 * how to program java
 * ForCounter Fig. 5.2
 */

import java.awt.Graphics;
import javax.swing.JApplet;

public class ForCounter extends JApplet{
	
	//draw lines on applet's background
	public void paint(Graphics g){
		//inherited version of method paint
		super.paint(g); 
		
		//initialization, repetition condition and incrementing are all included in the for structure header
		for(int counter = 1; counter <= 10; counter++){
			g.drawLine(10, 10, 250, counter * 10);
		}
	}

}
