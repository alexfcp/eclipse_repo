package myGUIProject2;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;



public class chartcomponent extends JComponent {
	
	public ArrayList<Double> values;
	private double maxValue;
	
	
public chartcomponent (double max)	{
	values = new ArrayList<Double>();
	this.maxValue = maxValue;
}

	public void append(double value) {
		values.add(value);
		repaint();
	}


	@Override
	public void paintComponent(Graphics  g) {
		final int GAP = 5;
		final int BAR_HEIGHT = 10;
		int y = GAP, barwidth = 0;
		for (double value :values) {
			barwidth = (int) (getWidth() * value / maxValue);
			g.fillRect(0, y, barwidth, BAR_HEIGHT);
			y += BAR_HEIGHT + GAP;
		}
		
	}
	
	
	
}
