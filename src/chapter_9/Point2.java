package chapter_9;

public class Point2 {

	protected int x, y;
	
	//no argument constructor
	public Point2(){
		 x = 0;
		 y = 0;
		 
		 System.out.println("Point2 constructor: " + this);
	}
	
	//constructor
	public Point2(int xCoordinate, int yCoordinate){
		
		x = xCoordinate;
		y = yCoordinate;
		System.out.println("Point2 constructor: " + this);
	}
	
	//finalizer
	protected void finalize(){
		System.out.println("Point finalizer: " + this);
	}
	
	//convert point into a string representation
	public String toString(){
		return "[" + x + ", " + y + "]";
	}
}
