package renju;

//5����Ա���� stoneOne~Five => 1��һά���� stones
//�޸�placeStone��ֻ����һ������stone => stones[this.count++]=stone;
//�޸�paintBoard���������滻
public class Board {
	public static final int MAX_X = 15;
	public static final int MAX_Y = 15;

	// Stone[] -> Stone[][]
	private static Stone[][] stones;
	private int count;

	public static Stone[][] getStones() {
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
		return stone.getX() >= 1 && stone.getX() <= Board.MAX_X
				&& stone.getY() >= 1 && stone.getY() <= Board.MAX_Y;
	}

	public boolean valid(Stone stone) {
		if (!Board.onBoard(stone)) {
			return false;
		}
		if (this.getStones()[stone.getX() - 1][stone.getY() - 1] != null) {
			return false;
		}
		return true;
	}

	public void placeStone(Stone stone) {
		this.getStones()[stone.getX() - 1][stone.getY() - 1] = stone;
	}
	public static void undoStone(Stone stone){
		Board.getStones()[stone.getX() - 1][stone.getY() - 1] = null;
	}

}
