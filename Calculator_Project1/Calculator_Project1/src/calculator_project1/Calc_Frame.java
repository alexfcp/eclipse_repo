package calculator_project1;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
* Alex Romero
* 2/13/18
* Comp 585
* Project 1
* @author alex
*/

public class Calc_Frame extends JFrame implements ActionListener, KeyListener {
	
	//Initial vars
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
	JTextField textField;
	JPanel keypadPanel;
	JPanel buttonPanel;
	Font calcFont;
	
	//to remove trailing zeros after decimal
	DecimalFormat dec = new DecimalFormat("0.#############");
	
	//Menu
	private JMenuBar menuBar;
	private JMenu app;
	private JMenu help;
	private JMenuItem exit;
	private JMenuItem about;
	
	//Case variables
	static double a=0,b=0,result=0;
	static int operator=0;
	
	//Constructor
	public Calc_Frame() {
	
		keypadPanel = new JPanel(); 
		keypadPanel.setLayout(new BorderLayout());
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,4));
		textField = new JTextField();
		calcFont = new Font("SansSerif", Font.BOLD, 25);
		textField.setFont(calcFont);
		textField.setEditable(false);
		addKeyListener(this);
		buildMenu();
		addMenuListeners();
		setJMenuBar(menuBar);
		
		b1 = new JButton("DEL");
		b2 = new JButton("POW");
		b3 = new JButton("MOD");
		b4 = new JButton("C");
		b5 = new JButton("7");
		b6 = new JButton("8");
	    b7 = new JButton("9");
	    b8 = new JButton("/");
	    b9 = new JButton("4");
	    b10 = new JButton("5");
	    b11 = new JButton("6");
	    b12 = new JButton("x");
		b13 = new JButton("1");
		b14 = new JButton("2");
	    b15 = new JButton("3");
	    b16 = new JButton("-");
	    b17 = new JButton("0");
	    b18 = new JButton(".");
	    b19 = new JButton("=");
	    b20 = new JButton("+");
	    
	    buttonPanel.add(b1);
	    buttonPanel.add(b2);
	    buttonPanel.add(b3);
	    buttonPanel.add(b4);
	    buttonPanel.add(b5);
	    buttonPanel.add(b6);
	    buttonPanel.add(b7);
	    buttonPanel.add(b8);
	    buttonPanel.add(b9);
	    buttonPanel.add(b10);
	    buttonPanel.add(b11);
	    buttonPanel.add(b12);
	    buttonPanel.add(b13);
	    buttonPanel.add(b14);
	    buttonPanel.add(b15);
	    buttonPanel.add(b16);
	    buttonPanel.add(b17);
	    buttonPanel.add(b18);
	    buttonPanel.add(b19);
	    buttonPanel.add(b20);
	    
	    b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
	    
	    keypadPanel.add(buttonPanel, BorderLayout.CENTER);
	    keypadPanel.add(textField, BorderLayout.NORTH);        
	    
	    // order matters! be careful.
	    add(keypadPanel);
	    pack();
	}
	
	//Method required with ActionListener
	public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b13)
            textField.setText(textField.getText().concat("1"));
        
        if(e.getSource()==b14)
        	textField.setText(textField.getText().concat("2"));
        
        if(e.getSource()==b15)
        	textField.setText(textField.getText().concat("3"));
        
        if(e.getSource()==b9)
        	textField.setText(textField.getText().concat("4"));
        
        if(e.getSource()==b10)
        	textField.setText(textField.getText().concat("5"));
        
        if(e.getSource()==b11)
        	textField.setText(textField.getText().concat("6"));
        
        if(e.getSource()==b5)
        	textField.setText(textField.getText().concat("7"));
        
        if(e.getSource()==b6)
        	textField.setText(textField.getText().concat("8"));
        
        if(e.getSource()==b7)
        	textField.setText(textField.getText().concat("9"));
        
        if(e.getSource()==b17)
        	textField.setText(textField.getText().concat("0"));
        
        if(e.getSource()==b18)
        	textField.setText(textField.getText().concat("."));
        
        if(e.getSource()==b20) {
            a=Double.parseDouble(textField.getText());
            operator=1;
            textField.setText("");
        } 
        
        if(e.getSource()==b16) {
            a=Double.parseDouble(textField.getText());
            operator=2;
            textField.setText("");
        }
        
        if(e.getSource()==b12) {
            a=Double.parseDouble(textField.getText());
            operator=3;
            textField.setText("");
        }
        
        if(e.getSource()==b8)
        {
            a=Double.parseDouble(textField.getText());
            operator=4;
            textField.setText("");
        }
        
        if(e.getSource()==b2)
        {
            a=Double.parseDouble(textField.getText());
            operator=5;
            textField.setText("");
        }
        
        if(e.getSource()==b3)
        {
            a=Double.parseDouble(textField.getText());
            operator=6;
            textField.setText("");
        }
        
        
        if(e.getSource()==b19) {
            b=Double.parseDouble(textField.getText());
        
            switch(operator) {
        	case 1: result = Calc_Business_Logic.add(a,b);
            	break;
        
            case 2: result = Calc_Business_Logic.subtract(a,b);
                break;
        
            case 3: result = Calc_Business_Logic.multiply(a,b);
                break;
        
            case 4: result = Calc_Business_Logic.divide(a,b);
                break;
                
            case 5: result = Calc_Business_Logic.pow(a,b);
        		break; 
                
            case 6: result = Calc_Business_Logic.mod(a,b);
            	break;    
                
            default: result=0;
        }
        
            textField.setText(""+dec.format(result));
        }
        
        if(e.getSource()==b4)
        	textField.setText("");
        
        if(e.getSource()==b1) {
            String s=textField.getText();
            textField.setText("");
            for(int i=0;i<s.length()-1;i++)
            textField.setText(textField.getText()+s.charAt(i));
        }        
    }
	
	//Method required with KeyListener
	public void keyPressed(KeyEvent e) {
		char x = e.getKeyChar();
		
		if(x=='1')
			textField.setText(textField.getText().concat("1"));
	        
	    if(x=='2')
	        textField.setText(textField.getText().concat("2"));
	        
	    if(x=='3')
	        textField.setText(textField.getText().concat("3"));
	        
	    if(x=='4')
	        textField.setText(textField.getText().concat("4"));
	        
	    if(x=='5')
	        textField.setText(textField.getText().concat("5"));
	        
	    if(x=='6')
	        textField.setText(textField.getText().concat("6"));
	        
	    if(x=='7')
	        textField.setText(textField.getText().concat("7"));
	        
	    if(x=='8')
	        textField.setText(textField.getText().concat("8"));
	        
	    if(x=='9')
	        textField.setText(textField.getText().concat("9"));
	        
	    if(x=='0')
	        textField.setText(textField.getText().concat("0"));
	        
	    if(x=='.')
	        textField.setText(textField.getText().concat("."));
	        
	    if(x=='+') {
	        a=Double.parseDouble(textField.getText());
	        operator=1;
	        textField.setText("");
	    } 
	        
	    if(x=='-') {
	        a=Double.parseDouble(textField.getText());
	        operator=2;
	        textField.setText("");
	    }
	        
	    if((x=='*') || (x=='x') || (x=='X')) {
	        a=Double.parseDouble(textField.getText());
	        operator=3;
	        textField.setText("");
	    }
	        
	    if(x=='/') {
	        a=Double.parseDouble(textField.getText());
	        operator=4;
	        textField.setText("");
	    }
	    
	    if((x=='p') || (x=='P')) {
	        a=Double.parseDouble(textField.getText());
	        operator=5;
	        textField.setText("");
	    }
	    if((x=='m') || (x=='M')) {
	        a=Double.parseDouble(textField.getText());
	        operator=6;
	        textField.setText("");
	    }
	        
	    if(x=='=') {
	        b=Double.parseDouble(textField.getText());
	        
	        switch(operator) {
	        	case 1: result = Calc_Business_Logic.add(a,b);
	            	break;
	        
	            case 2: result = Calc_Business_Logic.subtract(a,b);
	                break;
	        
	            case 3: result = Calc_Business_Logic.multiply(a,b);
	                break;
	        
	            case 4: result = Calc_Business_Logic.divide(a,b);
	                break;
	                
	            case 5: result = Calc_Business_Logic.pow(a,b);
            		break;  
            		
	            case 6: result = Calc_Business_Logic.mod(a,b);
        			break;    
            
                
	            default: result=0;
	        }
	        
	        textField.setText(""+dec.format(result));
	    }
	        
	    if((x=='c') || (x=='C'))
	        textField.setText("");        	    		
	}
	//Menu methods and listeners
	private void addMenuListeners() {
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				exitActionPerformed();
			}
		});
		
		about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				aboutActionPerformed();
			}
		});		
	}
	
	private void exitActionPerformed() {
		dispose();
	}
	
	private void aboutActionPerformed() {
		JOptionPane.showMessageDialog(this, "this is a simple calculator.");
	}
	//build menu helper method
	
	private void buildMenu() {
		menuBar = new JMenuBar();
		app = new JMenu("App");
		help = new JMenu("Help");
		exit = new JMenuItem("Exit");
		about = new JMenuItem("About");
		app.add(exit);
		help.add(about);
		menuBar.add(app);
		menuBar.add(help);
	}
	
	//Unused Methods required to implement KeyListener
	public void keyTyped(KeyEvent e) {
		}
	
	public void keyReleased(KeyEvent e) {
		}
	
}
