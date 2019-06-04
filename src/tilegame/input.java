package tilegame;

import java.awt.event.*;

public class input extends KeyAdapter{

	
	tilegame game;
	
	public input(tilegame game) {
		this.game = game;
	}
	public void keyPressed(KeyEvent e) {
		game.keyPressed(e);
	}
	
	public void keyReleased(KeyEvent e) {
		game.keyReleased(e);
	}
}
 