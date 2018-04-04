package shape;

/*
 * How to program Java
 * Fig 9.23 Definition of class Point
 */

public class Point extends Shape{
	protected int x, y;  //coordinates of the point
	
	//no argument constructor
	public Point(){
		setPoint(0,0);
	}
	
	//constructor
	public Point(int xCoordinate, int yCoordinate){
		setPoint(xCoordinate, yCoordinate);
	}
	
	//set x and y coordinates
	public void setPoint(int xCoordinate, int yCoordinate){
		
		x = xCoordinate;
		y = yCoordinate;
		
	}
	
	//get x coordinate
	public int getX(){
		return x;
	}
	
	//get y coordinate
	public int getY(){
		return y;
	}
	
	//convert point into string representation
	public String toString(){
		return "[" + x + ", " + y + "]";
	}
	
	//return shape name
	public String getName(){
		return "Point";
	}

}
