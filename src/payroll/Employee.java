package payroll;

/*
 * how to program java
 * Fig 9.16 Abstract bse class Employee
 */

public abstract class Employee {
	private String firstName;
	private String lastName;

	//constructor
	public Employee(String first, String last){

		firstName = first;
		lastName = last;
	}
	
	//get methods
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String toString(){
		return firstName + " " + lastName;
	}
	
	//Abstract method that must be implemented for each
	//derived class of Employee from which objects
	//are instatiated
	public abstract double earnings();

}
