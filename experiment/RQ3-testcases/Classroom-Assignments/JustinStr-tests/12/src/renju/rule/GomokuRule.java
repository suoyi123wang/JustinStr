package renju.rule;

import renju.Board;
import renju.Direction;
import renju.QiZi;



public class GomokuRule extends Rule {

	private int search(QiZi currentStone, Direction direction,QiZi[][] stone,
			boolean flag) {
		int count = 0;
		int currentX = currentStone.getX();
		int currentY = currentStone.getY();
		while (true) {
			if (flag) {
				currentX = currentX + direction.getDeltaX();
				currentY = currentY + direction.getDeltaY();
			} else {
				currentX = currentX - direction.getDeltaX();
				currentY = currentY - direction.getDeltaY();
			}
			if (currentX < 0 || currentX > Board.MAX_X-1 || currentY < 0
					|| currentY > Board.MAX_Y-1) {
				break;
			}
			QiZi qizi = stone[currentX][currentY];
			if (qizi == null || !(qizi.getColor()).equals(currentStone.getColor())) {
				break;
			}
			count++;
		}
		return count;
	}

	

	@Override
	protected boolean isForbidden(QiZi currentStone, QiZi[][] stone) {
		return false;
	}

	@Override
	public boolean isWin(QiZi currentStone, QiZi[][] stone) {
		int j = 0;
		int i = 0;
		for (j = 0; j < 4; j++) {
			Direction direction = Direction.DIRECTIONS[j];
			i = 1;
			i = i + this.search(currentStone,direction,stone, true);
			i = i + this.search(currentStone,direction,stone,false);
			if (i >= 5) {
				return true;
			}
		}
		return false;
	}

}
