package chapter_8;
/*
 * how to program java
 * fig 8.21 Test Employee2 class with static class variable
 * static class method and dynamic memory
 */

import javax.swing.*;
public class EmployeeTest2 {

	public static void main(String[] args) {
		// prove count is 0 before creating employee
		String output = "Employees before instantiation: " + Employee2.getCount();
		
		//create two Employee2; count should increase to 2
		Employee2 e1 = new Employee2 ("Susan", "Baker");
		Employee2 e2 = new Employee2 ("Bob", "Jones");
		
		/*
		 * prove that count is 2 after creating 2 employees.
		 * NOTE: static methods should be called only via the
		 * class name for the class in which they are defined 
		 */
		output += "\n\n Employees after instantiation: " +
		 "\nvia e1.getCount(): " + e1.getCount() + 
		 "\nvia e2.getCount(): " + e2.getCount() + 
		 "\nvia Employee2.getCount(): " + Employee2.getCount();
		
		//get names of employees
		output += "\n\nEmployee 1:  " + e1.getFirstName() + " " + e1.getLastName() +
				"\nEmployee 2:  " + e2.getFirstName() + " " + e2.getLastName();
		
		/*
		 * If there is only one reference to each employee (as
		 * on this example) the following statements mark those
		 * objects for garbage collection. Otherwise,
		 * these statements simply decrement the reference count
		 * for each object
		 */
		
		e1 = null;
		e2 = null;
		
		System.gc(); //suggest call to garbage collector
		
		/*
		 * Show employee count after calling garbage collector
		 * Count displayed may be 1, 0 or 2 depending on 
		 * whether garbage collector executed immediately and
		 * number of Employee2 objects is collects
		 */
		
		output += "\n\nEmployees after System.gc(): " + Employee2.getCount();
		
		JOptionPane.showMessageDialog(null, output, "Static Members and Garbage Collection", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
