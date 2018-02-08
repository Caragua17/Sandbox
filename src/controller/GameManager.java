package controller;

import view.Framework;

/**
 * @update 12.01.18
 * @author Thomas
 */

public class GameManager extends Thread {

	public GameManager() {
		
	}
	
	public static void main(String[] args) {
		GameManager gm = new GameManager();
		gm.start();
	}
	
	public void run() {
		@SuppressWarnings("unused")
		Framework Frame = new Framework();
	}
}
