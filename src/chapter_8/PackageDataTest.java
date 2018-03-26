package chapter_8;

/*
 * How to program Java
 * Fig 8.16 Classes in same package(i.e., same directory) can use package access data of other classes in the same package
 */

import javax.swing.JOptionPane;

public class PackageDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PackageData packageData = new PackageData();
		
		//append String representation of packageData to output
		String output = "After instantiation: \n" + packageData.toString();
		
		//change package access to data in packagedata object
		packageData.number = 77;
		packageData.string = "Goodbye";
		
		//append string representatin of packageData to output
		output += "\nAfter changing values\n" + packageData.toString();
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating Package Access", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}

//class with package access instance variables
class PackageData {
	int number;  //package access instance variables
	String string;  //package access instance variables
	
	//constructor
	public PackageData(){
		number = 0;
		string = "Hello";
	}
	
	//convert PackageData object to String representation
	public String toString(){
		return "number: " + number + " string: " + string;
	}
}
