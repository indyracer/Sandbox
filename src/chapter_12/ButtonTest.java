package chapter_12;
/*
 * How to program Java
 * Fig 12.10 Creating JButtons
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest extends JFrame {
	
	private JButton plainButton, fancyButton;
	
	//set up gui
	public ButtonTest(){
		super("Testing Buttons");
		
		//get content pane and set its layout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//create buttons
		plainButton = new JButton("Plain Button");
		container.add(plainButton);
		
		Icon bug1 = new ImageIcon(this.getClass().getResource("/smallBug.png"));
		Icon bug2 =  new ImageIcon(this.getClass().getResource("/smallBug2.png"));;
		fancyButton = new JButton("Fancy Button", bug1);
		fancyButton.setRolloverIcon(bug2);
		container.add(fancyButton);
		
		//create instance of inner class ButtonHandler to use for button event handling
		ButtonHandler handler = new ButtonHandler();
		fancyButton.addActionListener(handler);
		plainButton.addActionListener(handler);
		
		setSize(500, 250);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		ButtonTest application = new ButtonTest();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	//inner class for button event handling
	private class ButtonHandler implements ActionListener{
		//handle button event
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, "You pressed: " + event.getActionCommand());
		}
	}

}
