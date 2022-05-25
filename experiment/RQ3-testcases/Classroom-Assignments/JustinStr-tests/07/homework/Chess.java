package homework;

public class Chess {

	private int x, y;
	private String color;

	public Chess(Chesswithoutcolor chesswithoutcolor, String color) {
		this.x = chesswithoutcolor.getX();
		this.y = chesswithoutcolor.getY();
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getColor() {
		return color;
	}
}
