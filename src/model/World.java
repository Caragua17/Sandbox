package model;

/**
 * @update 19.01.18
 * @author Thomas
 */

public class World {
	
	// Constantes pour definir la taille du monde
	public final static int sizeX = 10;
	public final static int sizeY = 10;
	
	private static Block[][] world = new Block[sizeX][sizeY];
	
	// initialisation du tableau representant le monde
	public static void initWorld() {
		
		for(int i=0; i<sizeX; i++) {
			for(int j=0; j<sizeY; j++) {
				world[i][j] = new Block(i,j,1);
			}
		}
	}
	
	// GET World en totalité
	public static Block[][] getWorld(){
		return world;
	}
}
