package chapter_5;

public class Chapter5SelfReviewExcercises {

	public static int question52a(int count){
		int sum = 0;
		for(int i = 1; i <= count; i++){
			if(i % 2 != 0){
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static double question52b(){
		return Math.pow(2.5, 3);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//question 5.2.a
		System.out.println("Answer to 5.2.a is " + question52a(100));
		System.out.println("Answer to 5.2.b is " + question52b());
		
		//x is the counter variable
		int x = 1;
		System.out.println("Question 5.2.c using While loop");
		while(x <= 20){
			if(x % 5 != 0){
				System.out.print(x + " ");
				x++;
			}
			else{
				System.out.println(x);
				x++;
			}
		}
		
		System.out.println("Question 5.2.d using For loop");
		for(int i = 1; i <= 20; i++){
			System.out.print(i);
			if(i % 5 == 0){
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}
		

	}
}
