package chapter_9;

/*
 * How to program Java
 * Fig 9.8 Def of Circle class, finalizer of subclasses
 */

public class Circle2 extends Point2 {
	protected double radius;
	
	//no argument constructor
	public Circle2(){
		//implicit call to superclass constructor here
		radius = 0;
		System.out.println("Circle2 constructor: " + this);
	}
	
	//constructor
	public Circle2 (double circleRadius, int xCoordinate, int yCoordinate){
		
		//call superclass constructor
		super(xCoordinate, yCoordinate);
		
		radius = circleRadius;
		System.out.println("Circle2 constructor: " + this);
	}
	
	//finalizer
	protected void finalize(){
		System.out.println("Circle2 finalizer: " + this);
		super.finalize();
	}
	
	//convert to Circle to a String
	public String toString(){
		return "Center = " + super.toString() + "; Radius = " + radius;
	}
	

}
