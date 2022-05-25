package five;

public abstract class Rule {

	public static int winner = 0;
	public static boolean isDraw;

	public boolean isIn(int row, int line) {
		return (row >= 1 && row <= 15 && line >= 1 && line <= 15);
	}

	public abstract boolean isValid(int player, int row, int line);

	public void isWin(int player, int row, int line) {
		int x = 0, y = 0, z = 0, w = 0;
		isDraw = true;
		for (int i = 1; i <= 15; i++)
			for (int j = 1; j <= 15; j++) {
				isDraw = isDraw & Board.board[0][i][j];
				if (i == row) {
					if (Board.board[player][i][j])
						x++;
					else
						x = 0;
					if (x == 5)
						winner = player;
				}
				if (j == line) {
					if (Board.board[player][i][j])
						y++;
					else
						y = 0;
					if (y == 5)
						winner = player;
				}
				if ((i + j) == (row + line)) {
					if (Board.board[player][i][j])
						z++;
					else
						z = 0;
					if (z == 5)
						winner = player;
				}
				if ((i - j) == (row - line)) {
					if (Board.board[player][i][j])
						w++;
					else
						w = 0;
					if (w == 5)
						winner = player;
				}
			}
	}

}
