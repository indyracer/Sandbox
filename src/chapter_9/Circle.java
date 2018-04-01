package chapter_9;

/*
 * How to program Java
 * Fig 9.5 Definition of class Circle 
 */
public class Circle extends Point{ //inherits from Point
	protected double radius;
	
	//no arguement construtor
	public Circle(){
		//implicit call to superclass constructor occurs here
		setRadius(0);
	}
	
	//constructor
	public Circle(double circleRadius, int xCoordinate, int yCoordinate){
		//call super class to set coordinates
		super(xCoordinate, yCoordinate);
		
		//set radius
		setRadius(circleRadius);
	}
	
	//set radius of Circle
	public void setRadius(double circleRadius){
		radius = (circleRadius >= 0.0 ? circleRadius : 0.0);
	}
	
	//get radius of circle
	public double getRadius(){
		return radius;
	}
	
	//calculate area of Circle
	public double area(){
		return Math.PI * radius * radius;
	}
	
	//convert to Circle to a String
	public String toString(){
		return "Center = [" + x + ", " + y + "]; Radius = " + radius;
	}

}
