package chapter_8;
/*
 * How to program Java
 * Excercise 8.2 Complex number Test program
 */
public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create 2 complex numbers
		Complex number1 = new Complex(8.24455f, 9.54444f);
		Complex number2 = new Complex(4.5677f,2.4988f);
		
		
		System.out.println("The first complex number is " + number1.toString());
		System.out.println("The second complex number is " + number2.toString());
		
		//added 2 complex numbers
		
		System.out.println("First complex number plus second complex number = " + Complex.addTwoComplex(number1, number2));
		System.out.println("First complex number minus second complex number = " + Complex.subtractTwoComplex(number1, number2));

	}

}
