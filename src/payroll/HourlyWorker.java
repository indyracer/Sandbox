package payroll;

/*
 * how to program java
 * Fig 9.19 HourlyWorker class derived from Employee
 */

public final class HourlyWorker extends Employee{
	private double wage; //wage per hour
	private double hours; //hours worked each week
	
	public HourlyWorker(String first, String last, double wagePerHour, double hoursWorked){
		super(first, last);
		setWage(wagePerHour);
		setHours(hoursWorked);
	}
	
	//set methods
	public void setWage(double wagePerHour){
		wage = wagePerHour > 0 ? wagePerHour : 0;
	}
	
	public void setHours(double hoursWorked){
		hours = hoursWorked >= 0 && hoursWorked < 168 ? hoursWorked : 0;
	}
	
	public double earnings(){
		return wage * hours;
	}
	
	public String toString(){
		return "Hourly worker: " + super.toString();
	}

}
