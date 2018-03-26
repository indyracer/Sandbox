package chapter_8;

/*
 * How to program java
 * Fig 8.14 Definition of class employee
 */


public class Employee extends Object{
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	//constructor to initialize name, birth date and hire date
	public Employee (String first, String last, int birthMonth, int birthDay, int birthYear, int hireMonth, int hireDay, int hireYear){
		
		firstName = first;
		lastName = last;
		birthDate = new Date(birthMonth, birthDay, birthYear);
		hireDate = new Date(hireMonth, hireDay, hireYear);
	}
	
	//convert Employee to string format
	public String toString(){
		return lastName + ", " + firstName + " Hired: " + hireDate.toString() + " BirthDay: " + birthDate.toString();
	}

}
