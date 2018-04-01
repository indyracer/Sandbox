package payroll;

/*
 * How to Program Java
 * Fig 9.21 Driver for Employee hierarchy
 */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee; //superclass reference
		String output = "";
		
		Boss boss = new Boss("John", "Smith", 800);
		CommissionWorker commissionWorker = new CommissionWorker("Sue", "Jones", 400, 3, 150);
		PieceWorker pieceWorker = new PieceWorker("Bob", "Lewis", 2.5, 200);
		HourlyWorker hourlyWorker = new HourlyWorker("Karen", "Price", 13.75, 40);
		
		DecimalFormat precision2 = new DecimalFormat("0.00");
		
		//employee reference to a Boss
		employee = boss;
		
		output += employee.toString() + " earned $" + 
		precision2.format(employee.earnings()) + "\n" + 
				boss.toString() + " earned $" + precision2.format(boss.earnings()) + "\n";
		
		//employee reference to a CommissionWorker
		employee = commissionWorker;
		
		output += employee.toString() + " earned $" +precision2.format(employee.earnings()) + 
				"\n" + commissionWorker.toString() + " earned $" + precision2.format(commissionWorker.earnings()) + "\n";
		
		//employee reference to pieceWorker
		employee = pieceWorker;
				
		output += employee.toString() + " earned $" +precision2.format(employee.earnings()) + 
				"\n" + pieceWorker.toString() + " earned $" + precision2.format(pieceWorker.earnings()) + "\n";
		
		//employee reference to HourlyWorker
		employee = hourlyWorker;
		
		output += employee.toString() + " earned $" +precision2.format(employee.earnings()) + 
				"\n" + hourlyWorker.toString() + " earned $" + precision2.format(hourlyWorker.earnings()) + "\n";
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating Polymorphism", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}
