package homework;

public class Rule {
	public boolean judge(Stone currentStone, Board board) {
		return this.isFull(board);
	}

	public boolean isFull(Board board) {
		int count = 0;
		int i = 0, j = 0;
		for (i = 0; i < Board.MAX_X; i++) {
			for (j = 0; j < Board.MAX_Y; j++) {
				if (board.getStones()[i][j] == null) {
					count++;
				}
			}
		}
		return count == 0;
	}
}
