package go;

import go.Stone;

public class Stone {
	//棋子颜色静态常量
	public static final String BLACK = "Black";
	public static final String WHITE = "White";
	
	String coordinate;
	
	public Stone() {
	}
	
	
	int x;
	int y;
	int color;
	
	private void setX(int x) {
		this.x = x;
	}

	private void setY(int y) {
		this.y = y;
	}

	private void setColour(int color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getColour() {
		return color;
	}

	
	
	//带有三个值得棋子构造方法
	public Stone(int newX , int newY, int newColor) {
		this.setX(newX);
		this.setY(newY);
		this.setColour(newColor);
	}
}
