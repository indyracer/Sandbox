package chapter_9;

/*
 * How to program java
 * Fig 9.6 Demonstrating the "is a" relationship
 */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class InheritanceTest {

	public static void main(String[] args) {
		Point point1, point2;
		Circle circle1, circle2;
		
		point1 = new Point(30, 50);
		circle1 = new Circle(2.7, 120, 89);
		
		String output = "Point point1: " + point1.toString() + 
				"\nCircle circle1: " + circle1.toString();
		
		//use "is a" relationship to refer to a Circle
		//with a Point reference
		point2 = circle1;  //Assigns Circle to a Point reference
		
		output += "\n\nCircle circle1 (via point2 reference): " + point2.toString();
		
		//use downcasting (casting a superclass reference to a subclass data type) to assign point2 to circle2
		circle2 = (Circle) point2;
		
		output += "\nCircle circle1 (via circle2): " + circle2.toString();
		
		DecimalFormat precision2 = new DecimalFormat("0.00");
		output += "\nArea of c (via circle2): " + precision2.format(circle2.area());
		
		//attempt to refer to Point object with Circle reference
		if(point1 instanceof Circle){
			circle2 = (Circle) point1;
			output += "\n\ncast successful";
		}
		else{
			output += "\n\npoint1 does not refer to a Circle";
		}
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating the \"is a\" relationship", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
