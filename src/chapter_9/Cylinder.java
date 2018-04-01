package chapter_9;

/*
 * How to program Java
 * Fig 9/14 Definition of Cylinder Class
 */

public class Cylinder extends Circle{
	
	protected double height; //height of Cylinder
	
	//no argument constructor
	public Cylinder(){
		setHeight(0);
	}
	
	//constructor
	public Cylinder(double cylinderHeight, double cylinderRadius, int xCoordinate, int yCoordinate){
		//call super class constructor to set coordinates/radius
		super(cylinderRadius, xCoordinate, yCoordinate);
		
		//set cylinder height
		setHeight(cylinderHeight);
	}
	
	//set height of Cylinder
	public void setHeight(double cylinderHeight){
		height = (cylinderHeight >= 0 ? cylinderHeight : 0);
	}
	
	//get height of Cylinder
	public double getHeight(){
		return height;
	}
	
	//calculate area of Cylinder (i.e. surface area)
	public double area(){
		return 2 * super.area() + 2 * Math.PI * radius * height;
	}
	
	//calculate volume of Cylinder
	public double volume(){
		return super.area() * height;
	}
	
	//convert the Cylinder to a String
	public String toString(){
		return super.toString() + ": Height = " + height;
	}

}
