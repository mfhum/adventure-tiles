package tilegame;

import java.awt.event.*;

public class keyInput implements KeyListener{

	mainView mView;
	player p = new player(0, 0);
	
	public keyInput (mainView _mainView) {
		this.mView = _mainView;
	}
		public void keyPressed(KeyEvent e) {
			
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(Character.toLowerCase(e.getKeyChar()));
			switch(Character.toLowerCase(e.getKeyChar())) {
			case 'w':
				mView.setDirection(1);
				break;
			case 'a':
				mView.setDirection(2);
				p.setX(p.getX() - 1);
				break;
			case 's':
				mView.setDirection(3);
				p.setY(p.getY() - 1);
				break;
			case 'd':
				mView.setDirection(4);
				p.setX(p.getX() + 1);
				break;
			}
		}

	
}