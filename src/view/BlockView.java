package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.Block;

/**
 * @update 19.01.18
 * @author Thomas
 */

public class BlockView extends JPanel {

	private static final long serialVersionUID = 1L;
	
	// Méthode DrawBlock() pour dessiner un Block sur la Frame
	public static void drawBlock(Block b, Graphics g) {
		Image img = null;
		
		if(b.getID() == 0) {
			img = null;
		}
		else {
			try {
				img = ImageIO.read(new File("img/block/" + b.getID() + ".png"));
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

		g.drawImage(img, b.getX()*64, b.getY()*64, null);
	}
}
