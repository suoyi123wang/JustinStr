package go;

import go.Board;
import go.Direction;
import go.Stone;

public class GomokuRule extends Rule {
	
	@Override
	protected boolean isForbidden(Stone currentStone, Stone[][] board) {
		return false;
	}

    @Override
	public boolean isWin(Stone currentStone, Stone[][] board) {
		int i = 0;
		for (int j = 0; j < 4; j++) {
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
	
	int search(Stone currentStone, Stone[][] board, Direction direction,
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
				if (currentX < 0 || currentX >= 15 || currentY < 0
						|| currentY >= 15) {
					break;
				}
				Stone stone = board[currentX][currentY];
				if (stone == null || stone.getColour() != currentStone.getColour()) {
					break;
				}
				count++;
			}
			return count;
		
	}

	public Result judge(Stone currentStone, Stone[][] board) {
		if (this.isForbidden(currentStone, board) == true) {
			return Result.FORBIDDEN;
		}
		if (this.isWin(currentStone, board)) {
			return Result.WIN;
		}
		if (this.isFull(board) == true) {
			return Result.DRAW;
		}
		return Result.NEXT;
		
	}
	
}
