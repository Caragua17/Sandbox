package view;

import java.awt.Color;

import javax.swing.JFrame;

import model.World;

/**
 * @update 19.01.18
 * @author Thomas
 */

public class Framework extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static String OS = System.getProperty("os.name").toLowerCase();
	public static final int frameX = 64*World.sizeX;
	public static final int frameY = 64*World.sizeY;
	private WorldView world;

	// Constructeur par defaut de la Frame
	public Framework() {
		World.initWorld();
		world = new WorldView();
		
		this.setTitle("Terraria: NewGen");
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		if(OS.indexOf("win") >= 0)
			this.setSize(frameX+6, frameY+29);
		else if(OS.indexOf("mac") >= 0)
			this.setSize(frameX, frameY+22);
		else
			this.setSize(frameX, frameY);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setContentPane(world);
		this.setVisible(true);
	}
	
	public void update() {
		world.repaint();
	}
}
