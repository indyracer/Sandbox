package chapter_5;

/*
 * How to program java
 * Counter controlled repetition with the for structure, Figure 5.5
 * NOTE:  rather than using JOptionPane to ask for input, utilized System.out.print to console
 */

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sums all even integers between 2 and 100
		int sum = 0;
		
		for (int i = 2; i <= 100; i +=2){
			sum += i;
		}
		
		System.out.println("The sum of all even integers between 2 to 100 is " + sum);

	}

}
