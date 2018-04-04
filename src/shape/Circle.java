package shape;

/*
 * How to program Java
 * Fig 9.24 Definiation of Circle class
 */

public class Circle extends Point{
	protected double radius;
	
	//no argument constructor
	public Circle(){
		setRadius(0);
	}
	
	//constructor
	public Circle(double circleRadius, int xCoordinate, int yCoordinate){
		//call superclass constructor
		super(xCoordinate, yCoordinate);
		setRadius(circleRadius);
	}
	
	//set radius of Circle
	public void setRadius(double circleRadius){
		radius = circleRadius >= 0 ? circleRadius : 0;
	}
	
	//get radius of circle
	public double getRadius(){
		return radius;
	}
	
	//calculate area of Circle
	public double area(){
		return Math.PI * radius * radius;
	}
	
	//convert Circle to a String representation
	public String toString(){
		return "Center = " + super.toString() + ": Radius = " + radius;
	}
	
	public String getName(){
		return "Circle";
	}

}
