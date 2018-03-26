package chapter_8;

/*
 * How to program java
 * Fig 8.20 Definition of class employee,using static class variable
 */


public class Employee2 extends Object{
	private String firstName;
	private String lastName;
	private static int count; //number of objects in memory
	
	
	//constructor to initialize name, birth date and hire date
	public Employee2 (String first, String last){
		
		firstName = first;
		lastName = last;
		++count; //increment static count of employees
		
		System.out.println("Employee object constructor: " + firstName + " " + lastName);
	}
	
	//subtract 1 from static count when garbage collector
	//calls finalize to clean up object and output String
	//indicating that finalize was called
	
	protected void finalize(){
		--count;
		System.out.println("Employee object finalizer: " + firstName + " " + lastName + "; count = " + count);
	}
	
	//get firstName
	public String getFirstName(){
		return firstName;
	}
	
	//get lastName
	public String getLastName(){
		return lastName;
	}
	
	//static method to get static count value
	public static int getCount(){
		return count;
	}

}
