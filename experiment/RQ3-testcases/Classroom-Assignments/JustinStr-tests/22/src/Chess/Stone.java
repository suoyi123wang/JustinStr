package Chess;


public class Stone {
	public static final int BLACK = 1;
	public static final int WHITE = 2;

	private int x;
	private int y;
	private int color;

	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	public int getColor() {
		return color;
	}

	private void setColor(int color) {
		this.color = color;
	}

	private Stone(int x, int y, int color) {
		this.setX(x);
		this.setY(y);
		this.setColor(color);
	}

	private static boolean checkColor(int color) {
		return (color == Stone.BLACK || color == Stone.WHITE);
	}

	private static boolean checkX(int x) {
		return x > 0;
	}

	private static boolean checkY(int y) {
		return y > 0;
	}

	public static Stone create(int x, int y, int color) {
		if (!Stone.checkColor(color)) {
			return null;
		}
		if (!Stone.checkX(x)) {
			return null;
		}
		if (!Stone.checkY(y)) {
			return null;
		}
		return new Stone(x, y, color);
	}
}
