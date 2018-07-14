package chapter_11;

/*
 * fig 11.12
 * Demonstrating methods of class FontMetrics and
 * class Graphics useful for obtaining font metrics
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Metrics extends JFrame {
	
	//set windows's title bar String and dimensions
	public Metrics(){
		super("Demonstrating FontMetrics");
		setSize(510, 210);
		setVisible(true);
	}
	
	//display font metrics
	public void paint (Graphics g){
		//call superclass's paint method
		super.paint(g);
		
		g.setFont(new Font("SansSerif", Font.BOLD, 12));
		FontMetrics metrics = g.getFontMetrics();
		g.drawString("Current font:" + g.getFont(), 10, 40);
		g.drawString("Ascent: "+ metrics.getAscent(), 10, 55);
		g.drawString("Descent: " + metrics.getDescent(), 10, 70);
		g.drawString("Height: " + metrics.getHeight(), 10, 85);
		g.drawString("Leading: " + metrics.getLeading(), 10, 100);
		
		Font font = new Font("Serif", Font.ITALIC, 14);
		metrics = g.getFontMetrics(font);
		g.setFont(font);
		g.drawString("Current font:" + g.getFont(), 10, 130);
		g.drawString("Ascent: "+ metrics.getAscent(), 10, 145);
		g.drawString("Descent: " + metrics.getDescent(), 10, 160);
		g.drawString("Height: " + metrics.getHeight(), 10, 175);
		g.drawString("Leading: " + metrics.getLeading(), 10, 190);
	}
	
	//execute application
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Metrics application = new Metrics();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
