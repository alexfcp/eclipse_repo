package calculator_project1;

import javax.swing.JFrame;

/**
* Alex Romero
* 2/13/18
* Comp 585
* Project 1
* @author alex
*/

public class Calc_Main {

	public static void main(String[] args) {
		JFrame frame = new Calc_Frame();
		frame.setTitle("Simple Calculator");
		frame.setSize(310,310);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setFocusable(true);
	    frame.setVisible(true);	
	}	
}
