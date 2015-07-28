package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GameSetUpView extends JPanel implements ActionListener{
	
	
	private static final long serialVersionUID = 5012558309801422224L;

	public GameSetUpView(){
		JButton aircraftCarrier = new JButton("Aircraft Carrier");
		JButton battleship = new JButton("Battleship");
		JButton submarine = new JButton("Submarine");
		JButton destroyer = new JButton("Destroyer");
		JButton patrolBoat = new JButton("Patrol Boat");
		
		this.setLayout(new BorderLayout());
		JPanel options = new JPanel();
		this.add(options, BorderLayout.WEST);
		
		options.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		options.setLayout(new GridLayout(5,1));
		
		options.add(aircraftCarrier);
		options.add(battleship);
		options.add(submarine);
		options.add(destroyer);
		options.add(patrolBoat);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
