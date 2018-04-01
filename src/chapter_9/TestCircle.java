package chapter_9;

/*
 * How to program java
 * Fig 9.13 Applet to test class Circle
 */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class TestCircle {

	public static void main(String[] args) {
		//create a Circle
		Circle circle = new Circle(2.5,37,43);
		DecimalFormat precision2 = new DecimalFormat("0.00");
		
		//get coordinate and radius
		
		String output = "X coordinate is " + circle.getX() +
				"\nY coordinate is " + circle.getY() + 
				"\nRadius is " + circle.getRadius();
		
		//set coordinates and radius
		circle.setPoint(2, 2);
		circle.setRadius(4.25);
		
		//get String representation of circle and calculate area
		output += "\n\nThe new location and radius of the circle is " + circle + 
				"\nArea is " + precision2.format(circle.area());
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating Class Circle", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
