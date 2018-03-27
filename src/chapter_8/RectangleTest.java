package chapter_8;

/*
 * how to program java
 * Excercise 8.8 test Rectangle class
 */

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(5.0f, 6.0f);
		
		System.out.println("Rectangle 1 - Width: " + rec1.getWidth() + " Length: " + rec1.getLength());
		System.out.println("Rectangle 1 - Perimeter: " + rec1.perimeter(rec1.getWidth(), rec1.getLength()));
		System.out.println("Rectangle 1 - Area: " + rec1.area(rec1.getWidth(), rec1.getLength()));
		
		System.out.println();
		
		System.out.println("Rectangle 2 - Width: " + rec2.getWidth() + " Length: " + rec2.getWidth());
		//reset width and length
		System.out.println("Reset Rectangle 2 width and length.  Width set to 25, to throw invalid message");
		
		rec2.setLength(15.0f);
		rec2.setWidth(25f); //should throw invalid message
				
		
		System.out.println("Rectangle 2 reset Width to " + rec2.getWidth() + " and length to " + rec2.getLength());
		
		//reset width to new valid number
		rec2.setWidth(10.0f);
		
		System.out.println("Rectangle 2 Width reset to " + rec2.getWidth());
		
		System.out.println();
		
		System.out.println("Rectangle 2 - Perimeter " + rec2.perimeter(rec2.getWidth(), rec2.getLength()));
		System.out.println("Rectangle 2 - Area " + rec2.area(rec2.getWidth(), rec2.getLength()));

	}

}
