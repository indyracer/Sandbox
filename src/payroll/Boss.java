package payroll;

/*
 * How to program java
 * Fig 9.17 Boss class derived from Employee
 */

public final class Boss extends Employee{
	private double weeklySalary;

	//constructor
	public Boss (String first, String last, double salary){
		super(first, last); //call superclass constructor
		setWeeklySalary(salary);
	}
	
	//set Boss's salary
	public void setWeeklySalary(double salary){
		weeklySalary = salary > 0 ? salary : 0;
	}
	
	//get boss's pay
	public double earnings(){
		return weeklySalary;
	}
	
	//get string representation of Boss's name
	public String toString(){
		return "Boss: " + super.toString();
	}
}
