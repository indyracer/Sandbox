package chapter_8;
/*
 * How to program Java
 * Exercise 8.2  Complex Number class
 */

public class Complex {
	
	private float realPart;
	private float imaginaryPart;
	private float i = (float) Math.sqrt(-1);
	

	//constructor  to be initialized when declared
	public Complex (float realPart, float imaginaryPart){
		
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	//constructor with default values
	
	public Complex(){
		realPart = 0;
		imaginaryPart = 0;
	}
	
	public float getRealPart(){
		return this.realPart;
	}
	
	public Complex setRealPart(float realPart){
		this.realPart = realPart;
		return this;
	}
	
	public float getImiginaryPart(){
		return this.imaginaryPart;
	}
	
	public Complex setImiginaryPart(float imaginaryPart){
		this.imaginaryPart = imaginaryPart;
		return this;
	}
	
	//methods
	//adds real part and imaginary parts
	public static Complex addTwoComplex(Complex complex1, Complex complex2){
		
		Complex temp = new Complex(); 
		float addedRealPart = complex1.getRealPart() + complex2.getRealPart();
		 float addedImiginaryPart = complex1.getImiginaryPart() + complex2.getImiginaryPart();
		 
		 return temp.setRealPart(addedRealPart).setImiginaryPart(addedImiginaryPart);
	}
	
	
	//subtracts two complex numbers, realPart substracts realPart, imiginaryPart subtracts imiginaryPart
	public static Complex subtractTwoComplex(Complex complex1, Complex complex2){
		float subRealPart = complex1.getRealPart() - complex2.getRealPart();
		float subImiginaryPart = complex1.getImiginaryPart() - complex2.getImiginaryPart();
		
		return new Complex(subRealPart, subImiginaryPart);
	}
	
	//to string method
	public String toString(){
		return "(" + this.realPart + ", " + this.imaginaryPart + ")";
	}

}
