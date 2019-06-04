package tilegame;

import java.awt.event.*;


public class tilegame extends KeyAdapter {

	
	public static void main(String[] args) {
		looper loop = new looper();
		int[] pixels;
		
	}
	public void keyPressed(KeyEvent e) {
		addKeyListener(new input(this));
		int key = e.getKeyCode();
		looper loop = null;
		player p = new player(0, 0);
		switch(key) {
		case KeyEvent.VK_W:
			loop.setPos("Up");
			p.setY(p.getY() + 1);
			System.out.println("Up");
			break;
		case KeyEvent.VK_A:
			loop.setPos("Left");
			p.setX(p.getX() - 1);
			break;
		case KeyEvent.VK_S:
			loop.setPos("Down");
			p.setY(p.getY() - 1);
			break;
		case KeyEvent.VK_D:
			loop.setPos("Right");
			p.setX(p.getX() + 1);
			break;
		}
	}
	
	private void addKeyListener(input input) {
		// TODO Auto-generated method stub
		
	}


	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		looper loop = null;
		player p = new player(0, 0);
		switch(key) {
		case KeyEvent.VK_W:
			loop.direction.setText("Up");
			p.setY(p.getY() + 1);
			break;
		case KeyEvent.VK_A:
			loop.direction.setText("Left");
			p.setX(p.getX() - 1);
			break;
		case KeyEvent.VK_S:
			loop.direction.setText("Down");
			p.setY(p.getY() - 1);
			break;
		case KeyEvent.VK_D:
			loop.direction.setText("Right");
			p.setX(p.getX() + 1);
			break;
		}
	}
}
