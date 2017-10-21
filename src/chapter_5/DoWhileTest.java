package chapter_5;

/*
 * How to Program Java
 * DoWhileTest.Java
 * Fig 5.9 Using the do/while repetition structure
 */

import java.awt.Graphics;
import javax.swing.JApplet;

public class DoWhileTest extends JApplet{

	//draw lines on applet's background
	public void paint (Graphics g){
		//call inherited version of method paint
		super.paint(g);
		
		int counter = 1;
		
		do{
			g.drawOval(110 - counter * 10, 110 - counter * 10, counter * 20, counter * 20);
			counter++;
		} while (counter <= 10);
			
		
	}
}
