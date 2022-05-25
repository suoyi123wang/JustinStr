package renju;

public class Player {
	private int id;
	private int color;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public Player(int id, int color) {
		this.setId(id);
		this.setColor(color);
	}

	public Stone nextStone(Board board) {
		return null;
	}
}
