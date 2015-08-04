package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = -6407555342199534454L;

	public MainWindow(){
		
		this.setName("Battleships");
		this.setSize(new Dimension(400, 200));
		this.setLocationRelativeTo(null);
				
		JButton newGame = new JButton("New Game");
		newGame.addActionListener(this);
		newGame.setActionCommand("New Game");
		
		JPanel menuPane = new JPanel();
		menuPane.add(newGame);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(5,1));
		this.setVisible(true);
		this.add(new JPanel());
		this.add(new JPanel());
		this.add(menuPane);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("New Game")){
			GameSetUpView suv = new GameSetUpView();
			pack();
			this.setSize(new Dimension(660, 550));
			this.setLocationRelativeTo(null);
			suv.setVisible(true);
			this.setContentPane(suv);
			
			this.validate(); 
		}
	}
	

}
