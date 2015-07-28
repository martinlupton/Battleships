package model;

import java.util.Observable;

public class GameState {
	
	Observable r = new Observable();
	
	Grid playerOne = new Grid();
	Grid playerTwo = new Grid();
	
	public GameState(){
		
		playerOne = new Grid();
		playerTwo = new Grid();
		
	}

}