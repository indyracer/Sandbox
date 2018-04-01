package payroll;

/*
 * how to program java
 * Fig 9.19 PieceWorker class derived from Employee
 */
public final class PieceWorker extends Employee{
	private double wagePerPiece; //wage per piece output
	private int quantity; //output each week
	
	public PieceWorker(String first, String last, double wage, int numberOfItems){
		super(first, last);
		setWage(wage);
		setQuantity(numberOfItems);
	}
	
	//set methods
	public void setWage(double wage){
		wagePerPiece = wage > 0 ? wage : 0;
	}
	
	public void setQuantity(int numberOfItems){
		quantity = numberOfItems > 0 ? numberOfItems : 0;
	}
	
	public double earnings(){
		return wagePerPiece * quantity;
	}
	
	public String toString(){
		return "Piece worker: " + super.toString();
	}

}
