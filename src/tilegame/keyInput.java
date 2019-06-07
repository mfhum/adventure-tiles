package tilegame;

import java.awt.event.*;

public class keyInput implements KeyListener{

	mainView mView = new mainView();
	player p = new player(0, 0);
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			switch(key) {
			case KeyEvent.VK_W:
				mView.setDirection(1);
				break;
			case KeyEvent.VK_A:
				mView.setDirection(2);
				p.setX(p.getX() - 1);
				break;
			case KeyEvent.VK_S:
				mView.setDirection(3);
				p.setY(p.getY() - 1);
				break;
			case KeyEvent.VK_D:
				mView.setDirection(4);
				p.setX(p.getX() + 1);
				break;
			}
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

	
}