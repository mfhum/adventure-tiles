package tilegame;

public class player {
	int x;
	int y;
	
	public player(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
		System.out.println("X: " + getX());
	}
	public void setY(int y) {
		this.y = y;
		System.out.println("Y: " + getY());
	}
}
