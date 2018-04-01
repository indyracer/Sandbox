package chapter_9;

/*
 * How to program java
 * Fig 9.9 Demonstrates when superclass and subclass
 * constructors and finalizers are called
 */

public class Test {

	public static void main(String[] args) {
		Circle2 circle1, circle2;
		
		circle1 = new Circle2 (4.5, 72, 29);
		circle2 = new Circle2 (10, 5, 5);
		
		circle1 = null; //mark for garbage collection
		circle2 = null; //mark for garbage collection
		
		System.gc();

	}

}
