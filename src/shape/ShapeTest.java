package shape;

/*
 * How to program java
 * Fig 9.26 Class to test Shape, point, Circle, Cylinder hierarchy
 */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ShapeTest {

	public static void main(String[] args) {
		//create shapes
		Point point = new Point(7, 11);
		Circle circle = new Circle(3.5,22,8);
		Cylinder cylinder = new Cylinder(10,3.3, 10, 10);
		
		//create shape array
		Shape arrayOfShapes[] = new Shape [3]; 
		
		//fill array with the shapes
		arrayOfShapes[0] = point;
		arrayOfShapes[1] = circle;
		arrayOfShapes[2] = cylinder;
		
		//get name and String representation of each shape
		String output = point.getName() + ": " + point.toString() + "\n" +
		circle.getName() + ": " + circle.toString() + "\n" +
				cylinder.getName() + ": " + cylinder.toString();
		
		DecimalFormat precision2 = new DecimalFormat("0.00");
		
		//Loop through arrayOfShape and get name, area and volume of each shape shape
		for(int i = 0; i < arrayOfShapes.length; i++){
			output += "\n\n" + arrayOfShapes[i].getName() + ": " + arrayOfShapes[i].toString() +
					"\nArea = " + precision2.format(arrayOfShapes[i].area()) + 
					"\nVolume = " + precision2.format(arrayOfShapes[i].volume());
		}
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating Polymorphism", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
