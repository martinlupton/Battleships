package model;

public class Tile {
	
	boolean occupied;
	boolean hit;
	
	public Tile(){
		
		occupied = false;
		hit = false;
	}
	
	public void setOccupied(boolean occupied){
		this.occupied = occupied;
	}
	
	public void setHit(boolean hit){
		this.hit = hit;
	}

	public void hit(){
		hit = true;
	}
	
	public boolean isOccupied(){
		return occupied;
	}
	
	public boolean isHit(){
		return hit;
	}
}
