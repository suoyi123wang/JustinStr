package renju;

public class Direction {
	public static final Direction[] DIRECTIONS = new Direction[] {
			new Direction(0, 1), new Direction(1, 0), new Direction(1, 1),
			new Direction(1, -1) };

	private int deltaX;
	private int deltaY;

	public int getDeltaX() {
		return deltaX;
	}

	public void setDeltaX(int deltaX) {
		this.deltaX = deltaX;
	}

	public int getDeltaY() {
		return deltaY;
	}

	public void setDeltaY(int deltaY) {
		this.deltaY = deltaY;
	}

	public Direction(int deltaX, int deltaY) {
		this.setDeltaX(deltaX);
		this.setDeltaY(deltaY);
	}
}
