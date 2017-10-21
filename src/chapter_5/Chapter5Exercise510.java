package chapter_5;

/*
 * How to Program Java
 * Exercise 5.10 print out shapes using for loops
 */

public class Chapter5Exercise510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//figure (a)
		System.out.println("Figure A");
		for(int i = 1; i <=9; i++){
			for(int j = 1; j <= i; j++){
				if(j != i){
					System.out.print("*");
				}
				else{
					System.out.println("*");
				}
			}
		}
		
		System.out.println();
		
		//figure (b)
		System.out.println("Figure B");
		int columns = 9;
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= columns; j++){
				if(j != columns){
					System.out.print("*");
				} else {
					System.out.println("*");
				}
			}
			columns--;
		}
		
		System.out.println();
		
		//figure C
		System.out.println("Figure C");
		
	}

}
