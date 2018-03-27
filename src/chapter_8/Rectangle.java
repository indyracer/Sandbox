package chapter_8;

/*
 * How to program Java
 * Exercise 8.10 Rectangle
 */

public class Rectangle {
	
	private float width;
	private float length;
	
	//no argument constructor
	public Rectangle(){
		
		this.width = 1.0f;
		this.length = 1.0f;		
	}
	
	//argument constructor
	public Rectangle (float width, float length){
		
		this.width = width;
		this.length = length;
	}
	
	//get and set methods
	public void setWidth(float width){
		
		if(width < 0 || width > 20){
			System.out.println("Invalid input, width set to default value of 1");
			this.width = 1.0f;
		}
		else{
		this.width = width;
		}		
	}
	
	public float getWidth(){
		return this.width;
	}
	
	public void setLength(float length){
		
		if(length < 0 || length > 20){
			System.out.println("Invalid input, length set to default value of 1");
			this.length = 1.0f;
		}
		else{
		this.length = length;
		}
	}
	
	public float getLength(){
		return this.length;
	}
	
	public float perimeter(float width, float length){
		return (width + length) * 2;
	}
	
	public float area(float width, float length){
		return  width * length;
	}

}
