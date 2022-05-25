package homework;

public class Record {
	private int count;
	private Stone[] stones;

	public int getCount() {
		return count;
	}

	private void setCount(int count) {
		this.count = count;
	}

	public Stone[] getStones() {
		return stones;
	}

	private void setStones(Stone[] stones) {
		this.stones = stones;
	}

	public Record() {
		this.setCount(0);
		this.setStones(new Stone[Board.MAX_X * Board.MAX_Y]);
	}

	public void placeStone(Stone stone) {
		this.getStones()[this.getCount()] = stone;
		this.setCount(this.getCount() + 1);
	}

	public void print() {
		System.out.println("本局棋谱：");
		int i = 0;
		for (i = 0; i < this.getCount(); i++) {
			Stone stone = this.getStones()[i];
			String message = "";
			message = message + "颜色："
					+ (stone.getColor() == Stone.BLACK ? "黑色" : "白色") + " ";
			message = message + "坐标：" + (char) (stone.getY() + 'A' - 1)
					+ stone.getX();
			System.out.println(message);
		}
		if (this.getCount() < Board.MAX_X * Board.MAX_Y) {
			Stone stone = this.getStones()[this.getCount() - 1];
			System.out.println("胜利方是："
					+ (stone.getColor() == Stone.BLACK ? "黑方" : "白方"));
		}
	}
}
