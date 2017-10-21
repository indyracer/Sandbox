package chapter_5;

public class Chapter5Exercise511 {
	
	static public int square (int y){
		return y * y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 10; i++){
			System.out.println("The square of " + i + " is " + square(i));
		}
	}

}
