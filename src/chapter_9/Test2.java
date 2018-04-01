package chapter_9;

/*
 * How to program Java
 * Applet to test class Point (from Fig 9.4)
 */

import javax.swing.JOptionPane;

public class Test2 {

	public static void main(String[] args) {
		Point point = new Point(72, 115);
		
		//get coordinates
		String output = "X coordinate is " + point.getX() + " \nY coordinate is " + point.getY();
		
		//set coordinates
		point.setPoint(10, 10);
		
		//use implicit call to point.toString()
		output += "\n\nThe new location of point is " + point;
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating Class Point", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
