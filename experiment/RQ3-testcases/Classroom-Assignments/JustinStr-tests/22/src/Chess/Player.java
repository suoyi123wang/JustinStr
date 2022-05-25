package Chess;



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

	// A1 B2 C3
	public Stone parseStone(String stone) {
		try {
			int x = Integer.parseInt(stone.substring(1, stone.length()));
			int y = stone.charAt(0) - 'A' + 1;
			return Stone.create(x, y, this.getColor());
		} catch (Exception exception) {
			return null;
		}
	}
}
