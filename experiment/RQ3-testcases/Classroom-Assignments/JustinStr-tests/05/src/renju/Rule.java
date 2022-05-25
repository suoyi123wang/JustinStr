package renju;

public class Rule {
	public boolean judge1(Stone currentStone, Board board) {
		// 对每个Direction (ok)
		// i=1 (ok)
		// 正方向 连续同色 -> m, i=i+m (ok)
		// 负方向 连续同色 -> n, i=i+n (ok)
		// if i>=5 win else not win (ok)
		int j = 0;
		int i = 0;
		for (j = 0; j < 4; j++) {
			Direction direction = Direction.DIRECTIONS[j];
			i = 1;
			i = i + this.search(currentStone, board, direction, true);
			i = i + this.search(currentStone, board, direction, false);
			if (i >= 5) {
				return true;
			}
		}
		return false;
	}

	private int search(Stone currentStone, Board board, Direction direction,
			boolean flag) {
		int count = 0;
		int currentX = currentStone.getX() - 1;
		int currentY = currentStone.getY() - 1;
		while (true) {
			if (flag) {
				currentX = currentX + direction.getDeltaX();
				currentY = currentY + direction.getDeltaY();
			} else {
				currentX = currentX - direction.getDeltaX();
				currentY = currentY - direction.getDeltaY();
			}
			if (currentX < 0 || currentX >= Board.MAX_X || currentY < 0
					|| currentY >= Board.MAX_Y) {
				break;
			}
			Stone stone = board.getStones()[currentX][currentY];
			if (stone == null || stone.getColor() != currentStone.getColor()) {
				break;
			}
			count++;
		}
		return count;
	}
	
	
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