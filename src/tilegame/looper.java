package tilegame;

import javax.swing.JFrame;

public class looper extends JFrame{
	int width = 100;
	int heigth = 20;
	int scale = 8;
	
	mainView mView = new mainView();
	public looper(){
		mView.setStartWindow(width, heigth, scale);
	}
	
	
}