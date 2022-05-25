package Chess;



public class Board {
	public static final int MAX_X = 15;
	public static final int MAX_Y = 15;

	// Stone[] -> Stone[][]
	private Stone[][] stones;
	private int count;

	public Stone[][] getStones() {
		return stones;
	}

	private void setStones(Stone[][] stones) {
		this.stones = stones;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Board() {
		// Stone[MAX_X*MAX_Y] -> Stone[MAX_X][MAX_Y]
		this.setStones(new Stone[Board.MAX_X][Board.MAX_Y]);
	}

	public static boolean onBoard(Stone stone) {
		return stone.getX() >= 1 && stone.getX() <= Board.MAX_X&& stone.getY() >= 1 && stone.getY() <= Board.MAX_Y;
	}

	public boolean placeStone(Stone stone) {
		if (!Board.onBoard(stone)) {
			return false;
		}
		if (this.getStones()[stone.getX() - 1][stone.getY() - 1] != null) {
			return false;
		}
		this.getStones()[stone.getX() - 1][stone.getY() - 1] = stone;
		return true;
	}

	public void paintBoard() {
		int i, j;

		System.out.print("   ");
		for (i = 0; i < 15; i++) {
			System.out.print((char) ('A' + i) + "  ");
		}
		System.out.println();

		for (i = 0; i < Board.MAX_X; i++) {
			System.out.printf("%2d ", i + 1);
			for (j = 0; j < Board.MAX_Y; j++) {
				if (this.getStones()[i][j] == null) {
					System.out.print("+  ");
				} else {
					this.printStone(this.getStones()[i][j]);
				}
			}
			System.out.println();
		}
	}

	private void printStone(Stone currentStone) {
		if (currentStone.getColor() == Stone.BLACK) {
			System.out.print("B  ");
		} else if (currentStone.getColor() == Stone.WHITE) {
			System.out.print("W  ");
		}
	}
}
