package chapter_12;
/*
 * How to program Java
 * Fig 12.14
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListTest extends JFrame{
	private JList colorList;
	private Container container;
	
	private String colorNames[] = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Light Gray", "Magenta", 
			"Orange", "Pink", "Red", "White", "Yellow"};
	
	private Color colors[] = {Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.lightGray,
			Color.magenta, Color.orange, Color.pink, Color.red, Color.white, Color.yellow};
	
	//set up GUI
	public ListTest(){
		super("List Test");
		
		//get content pane and set its layout
		container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//create a list with items in colorNames array
		colorList = new JList(colorNames);
		colorList.setVisibleRowCount(colorNames.length / 3);
		
		//do not allow multiple selections
		colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//add a JScrollPane containing JList to content pane
		container.add(new JScrollPane(colorList));
		
		//set up event handler
		colorList.addListSelectionListener(
				//anonymous inner class for list selection events
				new ListSelectionListener(){
					//handle list selection events
					public void valueChanged(ListSelectionEvent event){
						container.setBackground(colors[colorList.getSelectedIndex()]);
					}
				});
		
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTest application = new ListTest();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
