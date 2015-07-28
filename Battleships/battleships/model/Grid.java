package model;

public class Grid {

	Tile[][] grid;

	public Grid() {

		for (int x = 0; x < 10; x++)
			for (int y = 0; y < 10; y++) {
				grid[x][y] = new Tile();
			}
	}

	/**
	 * This method assigns an occupied state to a specified tile. For example
	 * setOccupied(0,0,true) would set the occupied state of the top left tile
	 * to true indicating that a tile is occupied.
	 * 
	 * @param x
	 *            the x coordinate of the tile
	 * @param y
	 *            the y coordinate of the tile
	 * @param state
	 *            the state being assigned to the tile
	 */
	public void setOccupied(int x, int y, boolean occupied) {
		grid[x][y].setOccupied(occupied);
	}

	/**
	 * This method assigns a hit state to a specified tile. For example
	 * setHit(0,0,true) would specify that the tip left tile has been hit.
	 * 
	 * @param x
	 *            the x coordinate of the tile
	 * @param y
	 *            the y coordinate of the tile
	 * @param hit
	 *            the state being assigned to the tile
	 */
	public void setHit(int x, int y, boolean hit) {
		grid[x][y].setHit(hit);
	}

}