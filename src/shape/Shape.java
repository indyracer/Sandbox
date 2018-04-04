package shape;
/*
 * How to program Java
 * Fig 9.22 Definition of abstract base class Shape
 */
public abstract class Shape extends Object{
	
	//return shape's area
	public double area(){
		return 0.0;
	}
	
	//return shape's volume
	public double volume(){
		return 0.0;
	}
	
	//abstract method must be defined by concrete subclasses
	//to return appropriate shape name
	public abstract String getName();

}
