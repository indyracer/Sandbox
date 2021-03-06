package chapter_12;
/*
 * How to program java
 * Fig. 12.36 Demonstrating GridLayout
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame implements ActionListener {

	private JButton buttons[];
	private String names[] = {"one", "two", "three", "four", "five", "six"};
	private boolean toggle = true;
	private Container container;
	private GridLayout grid1, grid2;

	//set up GUI
	public GridLayoutDemo(){
		super("GridLayou Demo");

		//set up layouts
		grid1 = new GridLayout(2,3,5,5);
		grid2 = new GridLayout(3,2);

		//get content pane and set its layout
		container = getContentPane();
		container.setLayout(grid1);

		//create and add buttons
		buttons = new JButton[names.length];

		for(int count = 0; count < names.length; count++){
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
			container.add(buttons[count]);
		}

		setSize(300, 150);
		setVisible(true);
	}
	
	//handle button events by toggling between layouts
	public void actionPerformed(ActionEvent event){
		if(toggle){
			container.setLayout(grid1);
		} else {
			container.setLayout(grid2);
		}
		
		toggle = !toggle; //set toggle to opposite value
		container.validate();
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayoutDemo application = new GridLayoutDemo();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
