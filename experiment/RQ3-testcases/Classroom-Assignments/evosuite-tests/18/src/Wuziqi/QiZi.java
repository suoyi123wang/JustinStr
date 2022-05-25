package Wuziqi;

public class QiZi {
	public static final int BLACK = 1;
	public static final int WHITE = 2;
	
	private int x;
	private int y;
	private int color;
	
	public QiZi(){}
	public QiZi(int x , int y , int color){
		this.x = x;
		this.y = y;
		this.color = color;
		
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
	public static QiZi NewQiZi(int x, int y, int color){
		return new QiZi( x, y, color);
	}

}
