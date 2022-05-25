package go;

import go.Stone;

public class Stone {
	//������ɫ��̬����
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

	
	
	//��������ֵ�����ӹ��췽��
	public Stone(int newX , int newY, int newColor) {
		this.setX(newX);
		this.setY(newY);
		this.setColour(newColor);
	}

	public static Stone create(int i, int j, int color2) {
		Stone stone = new Stone(i, j, color2);
		return stone;
	}
}
