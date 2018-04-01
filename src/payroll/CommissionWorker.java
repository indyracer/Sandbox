package payroll;

/*
 * How to program Java
 * Fig 9.18 CommissionWorker class derived from Employee
 */
public final class CommissionWorker extends Employee{
	
	private double salary;  //base salary per week
	private double commission;  //amount per item sold
	private int quantity;  //total items sold for week
	
	//constructor for class CommissionWorker
	public CommissionWorker(String first, String last, double salary, double commission, int quantity){
		super(first, last);
		setSalary(salary); 
		setCommission(commission);
		setQuantity(quantity);
	}
	
	//set weekly base salary
	public void setSalary(double weeklySalary){
		salary = weeklySalary > 0 ? salary : 0;
	}
	
	//set commission
	public void setCommission(double itemCommission){
		commission = itemCommission > 0 ? itemCommission : 0;
	}
	
	//set quantity
	public void setQuantity(int totalSold){
		quantity = totalSold > 0 ? totalSold : 0;
	}
	
	//determine earnings
	public double earnings(){
		return salary + (commission * quantity);
	}
	
	//get string representation of CommissionWorker's name
	public String toString(){
		return "Commission worker: " + super.toString();
	}

}
