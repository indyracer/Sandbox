package chapter_11;
/*
 * How to program Java
 * fig. 11.22 Demonstratig some Java2D shapes
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;

public class Shapes extends JFrame{
	
	//set window's title bar string and dimesions
	public Shapes(){
		super("Drawing 2D Shapes");
		
		setSize(425,160);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		//call superclass paint method
		super.paint(g);
		
		//crate 2d by casting g to Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		
		//draw 2d ellipse filled  blue-yellow gradient
		g2d.setPaint(new GradientPaint(5,30, Color.blue, 35, 100, Color.yellow,true));
		g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));
		
		//draw 2d rectangle in red
		g2d.setPaint(Color.red);
		g2d.setStroke(new BasicStroke(10.0f));
		g2d.draw(new Rectangle2D.
				Double(80, 30, 65, 100));
		
		//draw 2d round rectangle with a buffered background
		BufferedImage buffImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
		
		Graphics2D gg = buffImage.createGraphics();
		
		gg.setColor(Color.yellow); //draw in yellow
		gg.fillRect(0, 0, 10, 10);// draw a filled rectangle
		gg.setColor(Color.black);  //draw in black
		gg.drawRect(1, 1, 6, 6); //draw a rectangle
		gg.setColor(Color.blue); //draw in blue
		gg.fillRect(1, 1, 3, 3);  //draw a filled rect
		gg.setColor(Color.RED); //draw in red
		gg.fillRect(4, 4, 3, 3); //draw a filled rect
		
		//paint buffImage onto the JFrame
		g2d.setPaint(new TexturePaint(buffImage, new Rectangle(10,10)));
		g2d.fill(new RoundRectangle2D.Double(155, 30, 75, 100, 50, 50));
		
		//draw 2d pie-shaped arcin white
		g2d.setPaint(Color.white);
		g2d.setStroke(new BasicStroke(6.0f));
		g2d.draw(new Arc2D.Double(240, 30, 75,100,0,270, Arc2D.PIE));
		
		//draw 2d lines in green and yellow
		g2d.setPaint(Color.green);
		g2d.draw(new Line2D.Double(395, 30, 320, 150));
		
		float dashes[] = {10};
		
		g2d.setPaint(Color.yellow);
		g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND,BasicStroke.CAP_ROUND, 10, dashes, 0));
		g2d.draw(new Line2D.Double(320, 30, 395, 150));
	}

	public static void main(String[] args) {
		Shapes application = new Shapes();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
