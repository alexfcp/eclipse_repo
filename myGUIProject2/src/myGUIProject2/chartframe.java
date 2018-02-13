package myGUIProject2;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class chartframe extends JFrame {

	 private static final int FRAME_WIDTH = 500;
	 private static final int FRAME_HEIGHT = 500;
	
	 private static final double INTEREST_RATE = 5;
	 private static final double INITIAL_BALANCE = 1000;
	 
	 private static final int CHART_WIDTH = 300;
	 private static final int CHART_HEIGHT = 300;
	   
	 private JLabel label;
	 private JTextField text;
	 private JButton button;
	 private chartcomponent chart;
	 private double balance;
	   
	   
	 public chartframe() {
		 balance = INITIAL_BALANCE;
		 chart = new chartcomponent(3* INITIAL_BALANCE);
		 chart.setPreferredSize(new Dimension(CHART_WIDTH,CHART_HEIGHT));
		 chart.append(INITIAL_BALANCE);
		 createTextField();
		 createButton();
		 createPanel();
		 setSize(FRAME_WIDTH, FRAME_HEIGHT);
		 
	 }
	 
	 private void createButton() {
		 button = new JButton("Add Interest");
		 ActionListener 
	 }
	 
	 
	 class AddInterestListener implements ActionListener {
		 public void actionPerformed(Ac)
	 }
	 
	 
	 private void createPanel() {
		 JPanel panel = new JPanel();
		 panel.add
	 }
	 
	 
	 
	 
}
