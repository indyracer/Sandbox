package chapter_5;
/*
 * How to program java
 * drawing lines, rectangles or ovals based on user input
 * Figure 5.7 SwitchTest.java
 */


import java.awt.Graphics;
import javax.swing.*;

public class SwitchTest extends JApplet{
	int choice; //users choice of which shape to draw
	
	public void init(){
		String input;  //users input
		
		//obtain users choice
		input = JOptionPane.showInputDialog("Enter 1 to draw line\n" + 
											"Enter 2 to draw rectangle\n" +
											"Enter 3 to draw ovals\n");
		//convert input to an int
		choice = Integer.parseInt(input);
	}
	
	//draw shapes on applet's backgrounds
	public void paint (Graphics g){
		//call inherited version of method paint
		super.paint(g);
		
		//loop 10 times counting from 0 to 9
		for(int i = 0; i < 10; i++){
			//determine shape to draw based on user input
			switch(choice){
			case 1:
				g.drawLine(10, 10, 250, 10 + i * 10);
				break;
				
			case 2:
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + 1 * 10, 50 + i * 10);
				break;
				
			case 3:
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
				
			default:
				g.drawString("Invalid value entered", 10, 20 + i * 15);
			}
		}
	}

}
