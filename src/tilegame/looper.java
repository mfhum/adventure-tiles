package tilegame;

import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;

public class looper extends JFrame{
	int BREITE;
	int HOEHE;
	int width = 100;
	int scale = 8;
	int[] pixels;
	
	JLabel direction = new JLabel();
	
	public looper() {
		setLayout(new BorderLayout());
		
		BREITE = width * scale;
		HOEHE = width * scale;
		pixels = new int[BREITE * HOEHE];
		
		setTitle("TileGame");
		setSize(BREITE, HOEHE);
		setResizable(false);
		
		add(direction);
		
		setVisible(true);
	}
	public void setPos(String pos) {
		direction.setText(pos);
	}

	public void draw() {
		
	}
	
	public void render() {
		
	}
	
	
}