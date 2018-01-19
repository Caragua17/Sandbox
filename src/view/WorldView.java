package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import model.World;

/**
 * @update 19.01.18
 * @author Thomas
 */

public class WorldView extends JPanel {

	private static final long serialVersionUID = 1L;
	
	// Constructeur par defaut de la vue du Monde
	public WorldView() {

	}
	
	// Gestion de l'affichage du Monde
	public void paintComponent(Graphics g) {
		this.setBackground(Color.WHITE);
		
		for(int i=0; i<World.sizeX; i++) {
			for(int j=0; j<World.sizeY; j++) {
				BlockView.drawBlock(World.getWorld()[i][j],g);
			}
		}
	}
}
