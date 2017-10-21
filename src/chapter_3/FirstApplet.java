package chapter_3;

/*
 * How to Program Java
 * Chapeter 3
 * Fig 3.6 Welcome Applet.java
 */

//Java core packages
import java.awt.Graphics; //import class Graphics

//Java extension packages
import javax.swing.JApplet;  //import class JApplet




public class FirstApplet extends JApplet{
	
	//draw text in applets background
	public void paint(Graphics g){
		//call inherited version of method paint
		super.paint(g);
		
		//draw a string a x-coord 25 and y-coord 25
		g.drawLine(15, 10, 210, 10);
		g.drawLine(15, 30, 210, 30);
		g.drawString("Welcome to Java Programming", 25, 25);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
