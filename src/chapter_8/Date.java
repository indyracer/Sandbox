package chapter_8;

/*
 * How to Program Java
 * Fig 8.13 Declaration of the Date class
 */

public class Date {
	
	private int month;  //1 - 12
	private int day;  //1 - 31 based on month
	private int year;  // any year
	
	//constructor:  confirm proper value for each month
	//call method checkDay to confirm proper
	//value for day
	
	public Date(int theMonth, int theDay, int theYear){
		
		if(theMonth > 0 && theMonth <= 12) // validate month
		{
			month = theMonth;			
		}
		else {
			month = 1;
			System.out.println("Month " + theMonth + " invalid.  Set to month 1.");
		}
		
		year = theYear;
		day = checkDay(theDay);  //validates day
		
		System.out.println("Date object constructor for date " + toString());
	}
	
	//utility method to confirm proper day value
	//based on month and year
	private int checkDay(int testDay){
		int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//check if day in range for month
		if(testDay > 0 && testDay <= daysPerMonth[month]){
			return testDay;
		}
		
		//check if leap year
		if(month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
			return testDay;
		}
		
		System.out.println("Day " + testDay + " invalid.  Set to day 1");
		
		return 1; //leave object in consistent state
	}
	
	//create a string of the form month/day/year
	public String toString(){
		return month + "/" + day + "/" + year;
	}

}
