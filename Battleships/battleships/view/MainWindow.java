package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = -6407555342199534454L;

	public MainWindow(){
		
		this.setName("Battleships");
		this.setSize(new Dimension(500, 500));
		JPanel menuPane = new JPanel(new BorderLayout());
		menuPane.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JButton newGame = new JButton("New Game");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		newGame.addActionListener(this);
		newGame.setActionCommand("New Game");
		
		this.setVisible(true);
		this.setContentPane(menuPane);
		menuPane.add(newGame, BorderLayout.CENTER);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("New Game")){
			GameSetUpView suv = new GameSetUpView();
			pack();
			this.setSize(new Dimension(500, 500));
			suv.setVisible(true);
			this.setContentPane(suv);
			this.validate();
		}
	}
	

}
