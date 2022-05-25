package go;

public class RenjuRule extends Rule {

	@Override
	protected boolean isForbidden(Stone currentStone, Stone[][] board) {
		
		//太难，，日后再想
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
	
	
	@Override
	protected boolean isWin(Stone currentStone, Stone[][] board) {
		int i = 0;
		for (int j = 0; j < 4; j++) {
			Direction direction = Direction.DIRECTIONS[j];
			i = 1;
			i = i + this.search(currentStone, board, direction, true);
			i = i + this.search(currentStone, board, direction, false);
			if (i == 5) {
				return true;
			}
		}
		return false;
	}
}
