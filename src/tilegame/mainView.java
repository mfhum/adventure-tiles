package tilegame;

import java.awt.BorderLayout;

import javax.swing.*;

public class mainView extends JFrame{
	private int vWidth;
	private int vHeight;
	private int width;
	private int height;
	private int scale;
	private String position;
	
	JLabel direction = new JLabel();
	

	// Method to initialize the size of the MainView
	// Values come from player.java
	protected void setStartWindow(int _width, int _height,int _scale) {
		setScale(_scale);
		setWidth(_width);
		setHeight(_height);
		setVWidth(this.width, this.scale);
		setVHeight(this.height, this.scale);
		setMainInit();
	}
	// sets scale, width, height, vWidth, vHeight. private because is used from setStartWindow()
	private void setScale(int _scale) {
		this.scale = _scale;
	}
	private void setWidth(int _width) {
		this.width = _width;
	}
	private void setHeight(int _height) {
		this.height = _height;
	}
	private void setVWidth(int _width, int _scale) {
		this.vWidth = _width * _scale;
	}
	private void setVHeight(int _height, int _scale) {
		this.vHeight = _height * _scale;
	}
	// initializes the mainView itself and its
	private void setMainInit() {
		setLayout(new BorderLayout());
		setTitle("TileGame");
		setSize(this.vWidth, this.vHeight);
		setResizable(false);
		add(direction);
		setVisible(true);
		// adding keyListener from keyInput()
		addKeyListener(new keyInput());
	}
	public void setDirection(int _mNr) {
		switch(_mNr) {
		case 1:
			this.position = "Up";
			setDirText(this.position);
			break;
		case 2:
			this.position = "Left";
			setDirText(this.position);
			break;
		case 3:
			this.position = "Down";
			setDirText(this.position);
			break;
		case 4:
			this.position = "Right";
			setDirText(this.position);
			break;
		}
	}
	private void setDirText(String _pos) {
		this.direction.setText(_pos);
	} 

}