package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
		
		Gameboard p1Board = new Gameboard();
		Gameboard p2Board = new Gameboard();
		
		aircraftCarrier.setActionCommand("Aircraft Carrier");
		battleship.setActionCommand("Battleship");
		submarine.setActionCommand("Submarine");
		destroyer.setActionCommand("Destroyer");
		patrolBoat.setActionCommand("Patrol Boat");
		
		this.setLayout(new BorderLayout());
		
		JPanel leftPane = new JPanel();
		leftPane.setLayout(new FlowLayout());
		leftPane.setPreferredSize(new Dimension(130, 500));
		
		JPanel rightPane = new JPanel();
		rightPane.add(p1Board, BorderLayout.NORTH);
		rightPane.setVisible(true);
		
		JPanel optionsPane = new JPanel();
		optionsPane.setLayout(new GridLayout(7,1));
		((GridLayout) optionsPane.getLayout()).setVgap(20);
		
		leftPane.add(optionsPane);
		this.add(leftPane, BorderLayout.WEST);
		this.add(rightPane, BorderLayout.EAST);
			
		optionsPane.add(aircraftCarrier);
		optionsPane.add(battleship);
		optionsPane.add(submarine);
		optionsPane.add(destroyer);
		optionsPane.add(patrolBoat);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Aircraft Carrier")){
			
		}
		
		if(e.getActionCommand().equals("Battleship")){
			
		}
	}

}
