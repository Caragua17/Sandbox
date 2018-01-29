package model;

public class Player {

	private int posX;
	private int posY;
	private String direction; // front-back-left-right
	
	// Constructeur par defaut
	public Player() {
		this.posX = 0;
		this.posY = 0;
		this.direction = "front";
	}
	
	// Constructeur par copie
	public Player(int x, int y) {
		this.posX = x;
		this.posY = y;
		this.direction = "front";
	}
	
	public void move(String move) {
		this.direction = move;
		
		switch(move) {
		case "right":
			this.posX += 1;
			break;
		case "left":
			this.posX -= 1;
			break;
		}
	}
	
	// GET position x
	public int getX() {
		return this.posX;
	}
	
	// GET position y
	public int getY() {
		return this.posY;
	}
	
	// GET Direction du joueur
	public String getDirection() {
		return this.direction;
	}
	
	// SET position x
	public void setX(int n) {
		this.posX = n;
	}
	
	// SET position y
	public void setY(int n) {
		this.posY = n;
	}
	
	// SET Direction du joueur
	public void setDirection(String d) {
		this.direction = d;
	}
}