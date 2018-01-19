package model;

/**
 * @update 19.01.18
 * @author Thomas
 */

public class Block {

	private int posX;
	private int posY;
	private int ID;
	
	// Constructeur par defaut
	public Block() {
		this.posX = 0;
		this.posY = 0;
		this.ID = 0;
	}
	
	// Constructeur par copie
	public Block(int x, int y, int ID) {
		this.posX = x;
		this.posY = y;
		this.ID = ID;
	}
	
	// GET position x
	public int getX() {
		return this.posX;
	}
	
	// GET position y
	public int getY() {
		return this.posY;
	}
	
	// GET ID du block
	public int getID() {
		return this.ID;
	}
}
