package wuziqi;



public class Rule {
	public void rule(){
		
	}
	public boolean onBoard(Stone stone){
		
		return stone.getX() >= 1 && stone.getX() <= Board.MAX_X
				&& stone.getY() >= 1 && stone.getY() <= Board.MAX_Y;
	}
	public boolean judge(Stone stone, Board board) {

		int j = 0;
		int i = 0;
		for (j = 0; j < 4; j++) {
			Direction direction = Direction.DIRECTIONS[j];
			i = 1;
			i = i + this.search(stone, board, direction, true);
			i = i + this.search(stone, board, direction, false);
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

}
