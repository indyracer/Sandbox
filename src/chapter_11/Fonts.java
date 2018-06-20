package chapter_11;

/*
 * How to program java
 * Fig 11.9  Using Fonts
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fonts extends JFrame {
	
	//set windows title bar and dimensions
	public Fonts() {
		super("Using fonts");
		
		setSize(420,125);
		setVisible(true);
	}
	
	//display strings in different fonts
	public void paint(Graphics g){
		//call superclass's paint method
		super.paint(g);
		
		//set current font to Serif (Times), bold, 12pt
		//and draw a string
		g.setFont(new Font("Serif", Font.BOLD, 12));
		g.drawString("Serif 12 point bold", 20, 50);
		
		//set current font to Monospace (Courier)
		//italic, 24 pt and draw string
		g.setFont(new Font("Monospace", Font.ITALIC, 24));
		g.drawString("Monospaced 24 point italic", 20, 70);
		
		//set current font to Serif (times)
		//bold/italic 18pt and draw string
		g.setColor(Color.red);
		g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
		g.drawString(g.getFont().getName() + " " + g.getFont().getSize() + "point bold italic.", 20, 110);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fonts application = new Fonts();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
