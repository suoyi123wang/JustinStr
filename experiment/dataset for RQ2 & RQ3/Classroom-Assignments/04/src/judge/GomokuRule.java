package judge;

import unseen.Board;
import judge.Rule;

public class GomokuRule extends Rule {
	public boolean judge() {
		int count = 0;
		int point = Board.getNumberOfChess();
		int x = Board.chess[Board.getNumberOfChess()].getX();
		int y = Board.chess[Board.getNumberOfChess()].getY();
		boolean ifWin = false;

		// 行
		for (int i = 0; i < 15; i++) {
			if (Board.getLocation(i, y) == Board.chess[point].getC()) {
				count++;
			} else {
				count = 0;
			}
			if (count == 5) {
				ifWin = true;
				return ifWin;
			}
		}

		// 列
		count = 0;
		for (int i = 0; i < 15; i++) {
			if (Board.getLocation(x, i) == Board.chess[point].getC()) {
				count++;
			} else {
				count = 0;
			}
			if (count == 5) {
				ifWin = true;
				return ifWin;
			}
		}

		// 斜 左上右下
		count = 0;
		for (int i = 0; i < 15; i++) {
			if (y - x + i >= 0 && y - x + i < 15) {
				if (Board.getLocation(i, y - x + i) == Board.chess[point]
						.getC()) {
					count++;
				} else {
					count = 0;
				}
				if (count == 5) {
					ifWin = true;
					return ifWin;
				}
			}
		}

		// 斜 左下右上
		count = 0;
		for (int i = 0; i < 15; i++) {
			if (x + y - i >= 0 && x + y - i < 15) {
				if (Board.getLocation(i, x + y - i) == Board.chess[point]
						.getC()) {
					count++;
				} else {
					count = 0;
				}
				if (count == 5) {
					ifWin = true;
					return ifWin;
				}
			}
		}
		return ifWin;
	}

	public void result() {
		boolean ifWin = judge();
		if (ifWin == true) {
			super.result();
		}
	}

}
