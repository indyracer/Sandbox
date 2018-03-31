package chapter_9;

/*
 * How to program java
 * Fig 9.4 Definition of class Point
 */

public class Point {
	
	protected int x, y; //coordinates of Point
	
	//no argument constructor
	public Point(){
		setPoint(0,0);
	}
	
	//constructor
	public Point (int xCoordinate,int yCoordinate){
		setPoint(xCoordinate, yCoordinate);
	}
	
	//set x and y coordinates of Point
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
	
	//convert into a String representation
	public String toString(){
		return "[" + x + "," + " " + y + "]";
	}

}
