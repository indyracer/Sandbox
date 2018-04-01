package chapter_9;
/*
 * How to program java
 * Fig 9.15 application to test Cylinder Class
 */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TestCylinder {

	public static void main(String[] args) {
		//create Cylinder
		Cylinder cylinder = new Cylinder(5.7, 2.5, 12, 23);
		DecimalFormat precision2 = new DecimalFormat("0.00");
		
		//get coordinates, radius and height
		String output = "X coordinate is " + cylinder.getX() +
				"\nY coordinate is " + cylinder.getY() + 
				"\nRadius is " + cylinder.getRadius() + 
				"\nHeight is " + cylinder.getHeight();
		
		//set coordinates, radius and height
		cylinder.setPoint(2, 2);
		cylinder.setHeight(10);
		cylinder.setRadius(4.25);
		
		//get string representation of Cylinder and calculate
		//area and volume
		output += "\n\nThe new location, radius and height of cylinder are\n" + cylinder +
				"\nArea is " + precision2.format(cylinder.area()) +
				"\nVolume is " + precision2.format(cylinder.volume());
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating Class Cylinder", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
