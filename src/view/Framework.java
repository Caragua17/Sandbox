package view;

import javax.swing.JFrame;

import model.World;

/**
 * @update 19.01.18
 * @author Thomas
 */

public class Framework extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private WorldView world;

	// Constructeur par defaut de la Frame
	public Framework() {
		World.initWorld();
		world = new WorldView();
		
		this.setTitle("Terraria: NewGen");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(200, 200);
		//this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setContentPane(world);
		this.setVisible(true);
	}
}
