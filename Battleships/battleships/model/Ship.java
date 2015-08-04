package model;

public class Ship {
private String mName;
private int mLength;
private int mHits;
private boolean isSunk;
	
	public Ship (String name, int length){
		mName = name;
		mLength = length;
		mHits = 0;
		isSunk = false;
		
	}
	
	public void hit(){
		
		mHits++;
	}
}
