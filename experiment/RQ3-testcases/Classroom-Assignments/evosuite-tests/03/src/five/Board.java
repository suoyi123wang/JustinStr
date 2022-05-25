package five;

public class Board {

	public static boolean[][][] board = new boolean[3][16][16];
	public static int[][] step = new int[256][3];
	public static int steps = 0;
	public static int lineOld1, lineOld2, rowOld1, rowOld2;
	public static String rule = new String();

	public static void var() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 16; j++)
				for (int k = 0; k < 16; k++)
					board[i][j][k] = false;
		for (int i = 0; i < 256; i++)
			for (int j = 0; j < 3; j++)
				step[i][j] = 0;
		steps = 0;
	}

	public void putChess(int player, int row, int line) {
		if (player == 1) {
			rowOld1 = row;
			lineOld1 = line;
		} else if (player == 2) {
			rowOld2 = row;
			lineOld2 = line;
		}
		board[0][row][line] = true;
		board[player][row][line] = true;
		record(player, row, line);
	}

	public void record(int player, int row, int line) {
		step[steps][0] = player;
		step[steps][1] = row;
		step[steps][2] = line;
		steps++;
	}

	public void moveChess(int n) {
		if (steps < n)
			return;
		for (int i = 1; i <= n; i++) {
			steps--;
			board[0][step[steps][1]][step[steps][2]] = false;
			board[step[steps][0]][step[steps][1]][step[steps][2]] = false;
			step[steps][0] = 0;
			step[steps][1] = 0;
			step[steps][2] = 0;
		}
	}

}
