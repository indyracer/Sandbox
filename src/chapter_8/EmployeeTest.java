package chapter_8;

/*
 * How to program java
 * Fig 8/15 Demonstrating an object with a member object
 */

import javax.swing.JOptionPane;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test class Employee
		Employee employee = new Employee("Bob", "Jones", 7, 24, 49, 3, 12, 88);
		
		JOptionPane.showMessageDialog(null, employee.toString(), "Testing Class Employee", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
