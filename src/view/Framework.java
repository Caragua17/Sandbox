package view;

import javax.swing.JFrame;

import model.World;

/**
 * @update 19.01.18
 * @author Thomas
 */

public class Framework extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static final int borderTop = 22;
	public static final int frameX = 64*World.sizeX;
	public static final int frameY = 64*World.sizeY + borderTop;
	private WorldView world;

	// Constructeur par defaut de la Frame
	public Framework() {
		World.initWorld();
		world = new WorldView();
		
		this.setTitle("Terraria: NewGen");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(frameX, frameY);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setContentPane(world);
		this.setVisible(true);
	}
}
