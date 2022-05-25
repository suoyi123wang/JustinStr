package work;

public class ChessPieces {
	public static final String BLACK = "B";
	public static final String WHITE = "W";

	private int x;
	private int y;
	private String color;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getColor() {
		return color;
	}

	private void setX(int x) {
		this.x = x;
	}

	private void setY(int y) {
		this.y = y;
	}

	private void setColor(String color) {
		this.color = color;
	}

	public ChessPieces(int x, int y, String color) {
		this.setX(x);
		this.setY(y);
		this.setColor(color);
	}

}
