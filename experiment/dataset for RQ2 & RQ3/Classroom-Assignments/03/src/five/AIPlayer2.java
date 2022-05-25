package five;

public class AIPlayer2 extends Player {

	public int row, line;

	public AIPlayer2(int color, String player) {
		this.color = color;
		this.player = player;
	}

	public int base(int row, int line) {
		if (row > 8)
			row = 16 - row;
		if (line > 8)
			line = 16 - line;
		return row * line;
	}

	public int getRow() {
		return row;
	}

	public int getLine() {
		return line;
	}

	public void getPosition() {
		int max = -1;
		for (int i = 1; i <= 15; i++)
			for (int j = 1; j <= 15; j++) {
				if (!Board.board[0][i][j]) {
					int tem = value(type(trans(color, i, j)));
					if (tem > max) {
						max = tem;
						row = i;
						line = j;
					}
				}
			}
		if (Board.steps == 0) {
			row = 8;
			line = 8;
		}
	}

	public String[] trans(int player, int thisRow, int thisLine) {
		StringBuilder row = new StringBuilder("B");
		StringBuilder line = new StringBuilder("B");
		StringBuilder diag = new StringBuilder("B");
		StringBuilder backDiag = new StringBuilder("B");
		for (int i = 1; i <= 15; i++) {
			if (Board.board[player][thisRow][i])
				row.append("R");
			else if (Board.board[3 - player][thisRow][i])
				row.append("W");
			else if (i == thisLine)
				row.append("T");
			else
				row.append("N");
			if (Board.board[player][i][thisLine])
				line.append("R");
			else if (Board.board[3 - player][i][thisLine])
				line.append("W");
			else if (i == thisRow)
				line.append("T");
			else
				line.append("N");
			try {
				if (Board.board[player][thisRow + thisLine - i][i])
					diag.append("R");
				else if (Board.board[3 - player][thisRow + thisLine - i][i])
					diag.append("W");
				else if (i == thisLine)
					diag.append("T");
				else if (thisRow + thisLine - i != 0)
					diag.append("N");
			} catch (Exception e) {
			}
			try {
				if (Board.board[player][thisRow - thisLine + i][i])
					backDiag.append("R");
				else if (Board.board[3 - player][thisRow - thisLine + i][i])
					backDiag.append("W");
				else if (i == thisLine)
					backDiag.append("T");
				else if (thisRow - thisLine + i != 0)
					backDiag.append("N");
			} catch (Exception e) {
			}
		}
		row.append("B");
		line.append("B");
		diag.append("B");
		backDiag.append("B");
		String[] lines = new String[4];
		lines[0] = row.toString();
		lines[1] = line.toString();
		lines[2] = diag.toString();
		lines[3] = backDiag.toString();
		return lines;
	}

	public int[][][] type(String[] lines) {
		int x1 = 0, x2 = 0, x3 = 0;
		int[][][] x = new int[4][2][3];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 1)
					lines[i] = new StringBuilder(lines[i]).reverse().toString();
				if (lines[i].matches(".*TRRRRN.*")) {
					x1 = 0;
					x2 = 0;
					x3 = 3;
				}
				if (lines[i].matches(".*TRRRN.*")) {
					x1 = 0;
					x2 = 0;
					x3 = 2;
				}
				if (lines[i].matches(".*TRRN.*")) {
					x1 = 0;
					x2 = 0;
					x3 = 1;
				}
				if (lines[i].matches(".*TRN.*")) {
					x1 = 0;
					x2 = 0;
					x3 = 0;
				}

				if (lines[i].matches(".*TRRRRW.*")) {
					x1 = 0;
					x2 = 1;
					x3 = 3;
				}
				if (lines[i].matches(".*TRRRW.*")) {
					x1 = 0;
					x2 = 1;
					x3 = 2;
				}
				if (lines[i].matches(".*TRRW.*")) {
					x1 = 0;
					x2 = 1;
					x3 = 1;
				}
				if (lines[i].matches(".*TRW.*")) {
					x1 = 0;
					x2 = 1;
					x3 = 0;
				}

				if (lines[i].matches(".*TNRRRRN.*")) {
					x1 = 0;
					x2 = 2;
					x3 = 3;
				}
				if (lines[i].matches(".*TNRRRN.*")) {
					x1 = 0;
					x2 = 2;
					x3 = 2;
				}
				if (lines[i].matches(".*TNRRN.*")) {
					x1 = 0;
					x2 = 2;
					x3 = 1;
				}
				if (lines[i].matches(".*TNRN.*")) {
					x1 = 0;
					x2 = 2;
					x3 = 0;
				}

				if (lines[i].matches(".*TNRRRRW.*")) {
					x1 = 0;
					x2 = 3;
					x3 = 3;
				}
				if (lines[i].matches(".*TNRRRW.*")) {
					x1 = 0;
					x2 = 3;
					x3 = 2;
				}
				if (lines[i].matches(".*TNRRW.*")) {
					x1 = 0;
					x2 = 3;
					x3 = 1;
				}
				if (lines[i].matches(".*TNRW.*")) {
					x1 = 0;
					x2 = 3;
					x3 = 0;
				}

				if (lines[i].matches(".*TWWWWN.*")) {
					x1 = 1;
					x2 = 0;
					x3 = 3;
				}
				if (lines[i].matches(".*TWWWN.*")) {
					x1 = 1;
					x2 = 0;
					x3 = 2;
				}
				if (lines[i].matches(".*TWWN.*")) {
					x1 = 1;
					x2 = 0;
					x3 = 1;
				}
				if (lines[i].matches(".*TWN.*")) {
					x1 = 1;
					x2 = 0;
					x3 = 0;
				}

				if (lines[i].matches(".*TWWWWR.*")) {
					x1 = 1;
					x2 = 1;
					x3 = 3;
				}
				if (lines[i].matches(".*TWWWR.*")) {
					x1 = 1;
					x2 = 1;
					x3 = 2;
				}
				if (lines[i].matches(".*TWWR.*")) {
					x1 = 1;
					x2 = 1;
					x3 = 1;
				}
				if (lines[i].matches(".*TWR.*")) {
					x1 = 1;
					x2 = 1;
					x3 = 0;
				}

				if (lines[i].matches(".*TNWWWWN.*")) {
					x1 = 1;
					x2 = 2;
					x3 = 3;
				}
				if (lines[i].matches(".*TNWWWN.*")) {
					x1 = 1;
					x2 = 2;
					x3 = 2;
				}
				if (lines[i].matches(".*TNWWN.*")) {
					x1 = 1;
					x2 = 2;
					x3 = 1;
				}
				if (lines[i].matches(".*TNWN.*")) {
					x1 = 1;
					x2 = 2;
					x3 = 0;
				}

				if (lines[i].matches(".*TNWWWWR.*")) {
					x1 = 1;
					x2 = 3;
					x3 = 3;
				}
				if (lines[i].matches(".*TNWWWR.*")) {
					x1 = 1;
					x2 = 3;
					x3 = 2;
				}
				if (lines[i].matches(".*TNWWR.*")) {
					x1 = 1;
					x2 = 3;
					x3 = 1;
				}
				if (lines[i].matches(".*TNWR.*")) {
					x1 = 1;
					x2 = 3;
					x3 = 0;
				}

				if (lines[i].matches(".*TNN.*")) {
					x1 = 0;
					x2 = 0;
					x3 = -1;
				}
				if (lines[i].matches(".*TNB")) {
					x1 = 0;
					x2 = 0;
					x3 = -2;
				}
				if (lines[i].matches(".*TB")) {
					x1 = 0;
					x2 = 0;
					x3 = -3;
				}
				x[i][j][0] = x1;
				x[i][j][1] = x2;
				x[i][j][2] = x3;
				if (j == 1) {
					int X1 = x[i][0][0] * 100 + x[i][0][1] * 10 + x[i][0][2];
					int X2 = x[i][1][0] * 100 + x[i][1][1] * 10 + x[i][1][2];
					if (X1 > X2) {
						int tem;
						tem = x[i][0][0];
						x[i][0][0] = x[i][1][0];
						x[i][1][0] = tem;
						tem = x[i][0][1];
						x[i][0][1] = x[i][1][1];
						x[i][1][1] = tem;
						tem = x[i][0][2];
						x[i][0][2] = x[i][1][2];
						x[i][1][2] = tem;
					}
				}
			}
		}
		return x;
	}

	public int value(int[][][] x) {
		int k = 0;
		int[][][] a = {
				{ { 40, 400, 3000, 10000 }, { 6, 10, 600, 10000 },
						{ 20, 120, 200, 0 }, { 6, 10, 500, 0 } },
				{ { 30, 300, 2500, 5000 }, { 2, 8, 300, 8000 },
						{ 26, 160, 0, 0 }, { 4, 20, 300, 0 } } };
		for (int i = 0; i < 4; i++) {
			int X1 = x[i][0][0], Y1 = x[i][0][1], Z1 = x[i][0][2];
			int X2 = x[i][1][0], Y2 = x[i][1][1], Z2 = x[i][1][2];
			int K1 = X1 * 100 + Y1 * 10 + Z1;
			int K2 = X2 * 100 + Y2 * 10 + Z2;
			if (K1 == -1) {
				if (K2 < 0) {
					k += 0;
					continue;
				} else
					k += a[X2][Y2][Z2] + 5;
				continue;
			}

			if (K1 == -2) {
				if (K2 < 0) {
					k += 0;
					continue;
				} else
					k += a[X2][Y2][Z2] / 2;
				continue;
			}

			if (K1 == -3) {
				if (K2 < 0) {
					k += 0;
					continue;
				} else
					k += a[X2][Y2][Z2] / 3;
				continue;
			}

			if (((K1 > -1 && K1 < 4) && ((K2 > -1 && K2 < 4) || (K2 > 9 && K2 < 14)))
					|| ((K1 > 99 && K1 < 104) && ((K2 > 99 && K2 < 104) || (K2 > 109 && K2 < 114)))) {

				if (Z1 + Z2 >= 2) {
					k += a[X2][Y2][3];
					continue;
				}

				else {
					k += a[X2][Y2][Z1 + Z2 + 1];
					continue;
				}

			}

			if (((K1 > 9 && K1 < 14) && (K2 > 9 && K2 < 14))
					|| ((K1 > 109 && K1 < 114) && (K2 > 109 && K2 < 114))) {

				if (Z1 + Z2 >= 2) {
					k += 10000;
					continue;
				}

				else {
					k += 0;
					continue;
				}

			}

			if (((K1 > -1 && K1 < 4) && ((K2 > 99 && K2 < 104) || (K2 > 109 && K2 < 114)))
					|| ((K1 > 9 && K1 < 14) && ((K2 > 99 && K2 < 104) || (K2 > 109 && K2 < 114)))) {

				if (Z1 == 3 || Z2 == 3) {
					k += 10000;
					continue;
				}

				else {
					k += a[X2][Y2][Z2] + a[X1][Y1][Z1] / 4;
					continue;
				}

			}

			else {
				k += a[X1][Y1][Z1] + a[X2][Y2][Z2];
				continue;
			}

		}
		return k;
	}

}
