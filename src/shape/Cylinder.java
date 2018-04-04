package shape;

/*
 * How to program java
 * fig 9.25 Definition of Cylinder Class
 */

public class Cylinder extends Circle{
	protected double height; //height of Cylinder
	
	//no argument constructor
	public Cylinder(){
		setHeight(0);  //implicit call to superclass constructor
	}
	
	public Cylinder(double cylinderHeight, double cylinderRadius, int xCoordinate, int yCoordinate){
		//call superclass constructor
		super(cylinderRadius, xCoordinate, yCoordinate);
		setHeight(cylinderHeight);
	}
	
	//set height of cylinder
	public void setHeight(double cylinderHeight){
		height = cylinderHeight > 0 ? cylinderHeight : 0;
	}
	
	//get height of Cylinder
	public double getHeight(){
		return height;
	}
	
	//calculate area of Cylinder (i.e. surface area)
	public double area(){
		return 2 * super.area() + 2 * Math.PI * radius * radius;
	}
	
	//calculate volume of Cylinder
	public double volume(){
		return super.area() * height;
	}
	
	//Convert Cylinder to a String representation
	public String toString(){
		return super.toString() + "; Height = " + height;
	}
	
	//return shape name
	public String getName(){
		return "Cylinder";
	}
	
	

}
