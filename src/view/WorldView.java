package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import model.Player;
import model.World;

/**
 * @update 19.01.18
 * @author Thomas
 */

public class WorldView extends JPanel implements KeyListener {

	private static final long serialVersionUID = 1L;
	private Player player = new Player(4,4);
	
	// Constructeur par defaut de la vue du Monde
	public WorldView() {
		this.setBackground(Color.WHITE);
		this.addKeyListener(this);
		this.setFocusable(true);
		this.setFocusTraversalKeysEnabled(false);
	}
	
	// Gestion de l'affichage du Monde
	public void paintComponent(Graphics g) {
		for(int i=0; i<World.sizeX; i++) {
			for(int j=0; j<World.sizeY; j++) {
				BlockView.drawBlock(World.getWorld()[i][j],g);
			}
		}
		PlayerView.drawPlayer(player, g);
	}

	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		System.out.println(key);
		
		switch(key) {
		case 39:
			player.move("right");
			System.out.println("right");
			break;
		case 37:
			player.move("left");
			System.out.println("left");
			break;
		}
		this.repaint();
	}

	public void keyReleased(KeyEvent e) {

	}

	public void keyTyped(KeyEvent e) {

	}
}
