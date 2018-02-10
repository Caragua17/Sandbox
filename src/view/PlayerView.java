package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.Player;

/**
 * @update 10.02.18
 * @author Thomas
 */

public class PlayerView extends JPanel {

	private static final long serialVersionUID = 1L;
	
	// Methode Drawplayer() pour dessiner le player sur la Frame
	public static void drawPlayer(Player p, Graphics g) {
		Image img = null;
		
		try {
			img = ImageIO.read(new File("img/player/" + p.getDirection() + ".png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		g.drawImage(img, p.getX()*64, p.getY()*64, null);
	}
}
