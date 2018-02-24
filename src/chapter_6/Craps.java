package chapter_6;

/*
 * How to program Java
 * Fig. 6.9 Craps
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Craps extends JApplet implements ActionListener{

	//constant variables for game status
	final int WON = 0, LOST = 1, CONTINUE = 2;

	//other variables used
	boolean firstRoll = true; //true of first roll of dice
	int sumOfDice = 0;
	int myPoint = 0;  //point if no win/loss on first roll
	int gameStatus = CONTINUE; //game not over yet

	//graphical user interface components
	JLabel die1Label, die2Label, sumLabel, pointLabel;
	JTextField die1Field, die2Field, sumField, pointField;
	JButton rollButton;

	//set up GUI components
	public void init(){
		//obtain content pane and change its layout to a FlowLayout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		//create label and text field for die 1
		die1Label = new JLabel("Die 1");
		container.add(die1Label);
		die1Field = new JTextField(10);
		die1Field.setEditable(false);
		container.add(die1Field);

		//create label and text field for die 2
		die2Label = new JLabel("Die 2");
		container.add(die2Label);
		die2Field = new JTextField(10);
		die2Field.setEditable(false);
		container.add(die2Field);

		//create label and text field for sum
		sumLabel = new JLabel("Sum");
		container.add(sumLabel);
		sumField = new JTextField(10);
		sumField.setEditable(false);
		container.add(sumField);

		//create label and text field for point
		pointLabel = new JLabel("Point");
		container.add(pointLabel);
		pointField = new JTextField(10);
		pointField.setEditable(false);
		container.add(pointField);

		//create button user clicks to roll dice
		rollButton = new JButton("Roll Dice");
		rollButton.addActionListener(this);
		container.add(rollButton);		
	}

	//process one roll of dice
	public void actionPerformed(ActionEvent actionEvent){
		//first roll of dice
		if(firstRoll){
			sumOfDice = rollDice(); //roll dice

			switch (sumOfDice){
			//win on first roll
			case 7: case 11:
				gameStatus = WON;
				pointField.setText(""); //clear point field
				break;

				//lose on first roll
			case 2: case 3: case 12:
				gameStatus = LOST;
				pointField.setText("");// clear point field
				break;

			default:
				gameStatus = CONTINUE;
				myPoint = sumOfDice;
				pointField.setText(Integer.toString(myPoint));
				firstRoll = false;
				break;
			}
		}

		//subsequent roll of dice
		else {
			sumOfDice = rollDice(); //roll dice
			
			//determine game status
			if(sumOfDice == myPoint){
				gameStatus = WON;
			}
			if (sumOfDice == 7){
				gameStatus = LOST;
			}
		}
		//display message indicating game status
		displayMessage();
	}
	
	//roll dice, calculate sum and display results
	public int rollDice(){
		int die1, die2, sum;
		
		//pick random die values
		die1 = 1 + (int) (Math.random() * 6);
		die2 = 1 + (int) (Math.random() * 6);
		sum = die1 + die2;
		
		//display results
		die1Field.setText(Integer.toString(die1));
		die2Field.setText(Integer.toString(die2));
		sumField.setText(Integer.toString(sum));
		
		return sum;
	}
	
	//determine game status and display appropriate message in status bar
	public void displayMessage(){
		//game should continue
		if(gameStatus == CONTINUE){
			showStatus("Roll Again");
		}
		
		//game won or lost
		else { 
			if (gameStatus == WON){
			showStatus("Player Wins. " + "Click Roll Dice to play again.");
			}
			else {
			showStatus("Player loses. " + "Click Roll Dice to play again.");
			}
				
			//next roll is first roll of new game
			firstRoll = true;
			}
	}
}