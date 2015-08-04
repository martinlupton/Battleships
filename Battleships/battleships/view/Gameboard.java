package view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Gameboard extends Canvas {

	private static final long serialVersionUID = -2359315854228551550L;
	
	Canvas canvas;

	public Gameboard() {

		setSize(505, 505);
		setBackground(Color.gray);

	}

	public void paint(Graphics g) {
		
		g.setColor(Color.blue);

		for (int x = 0; x < 10; x++)
			for (int y = 0; y < 10; y++)
				g.fillRect((x*50)+5, (y*50)+5, 45, 45);

	}

}
