package wuziqi.gui;

public class GomokuRule extends Rule {

	
	
	public int isvictory(String[][] board) {
		int result = 0;
		int[][] chess = new int[23][23];// 判断时构造一个更大的棋盘防止出错,这个棋盘是原15×15的棋盘边上加上四行四列组成的
		for (int i = 0; i <= 14; i++) {
			for (int j = 0; j <= 14; j++) {
				if (board[i][j].equals("o ")) {
					chess[i + 4][j + 4] = 1;
				} else if (board[i][j].equals("+ ")) {
					chess[i + 4][j + 4] = 0;
				} else if (board[i][j].equals("● ")) {
					chess[i + 4][j + 4] = -1;
				}
			}
		}

		isvictory:

		for (int i = 4; i <= 18; i++) {
			for (int j = 4; j <= 18; j++) {
				if (chess[i][j] == 1 && chess[i + 1][j + 1] == 1
						&& chess[i + 2][j + 2] == 1 && chess[i + 3][j + 3] == 1
						&& chess[i + 4][j + 4] == 1) {
					result = 1;// y=x方向
					break isvictory;
				} else if (chess[i][j] == 1 && chess[i + 1][j] == 1
						&& chess[i + 2][j] == 1 && chess[i + 3][j] == 1
						&& chess[i + 4][j] == 1) {
					result = 1;// 水平方向
					break isvictory;
				} else if (chess[i][j] == 1 && chess[i][j + 1] == 1
						&& chess[i][j + 2] == 1 && chess[i][j + 3] == 1
						&& chess[i][j + 4] == 1) {
					result = 1;// 竖直方向
					break isvictory;
				} else if (chess[i][j] == 1 && chess[i + 1][j - 1] == 1
						&& chess[i + 2][j - 2] == 1 && chess[i + 3][j - 3] == 1
						&& chess[i + 4][j - 4] == 1) {
					result = 1;// y=-x方向
					break isvictory;
				}

				else if (chess[i][j] == -1 && chess[i + 1][j + 1] == -1
						&& chess[i + 2][j + 2] == -1
						&& chess[i + 3][j + 3] == -1
						&& chess[i + 4][j + 4] == -1) {
					result = -1;// y=x方向
					break isvictory;
				} else if (chess[i][j] == -1 && chess[i + 1][j] == -1
						&& chess[i + 2][j] == -1 && chess[i + 3][j] == -1
						&& chess[i + 4][j] == -1) {
					result = -1;// 水平方向
					break isvictory;
				} else if (chess[i][j] == -1 && chess[i][j + 1] == -1
						&& chess[i][j + 2] == -1 && chess[i][j + 3] == -1
						&& chess[i][j + 4] == -1) {
					result = -1;// 竖直方向
					break isvictory;
				} else if (chess[i][j] == -1 && chess[i + 1][j - 1] == -1
						&& chess[i + 2][j - 2] == -1
						&& chess[i + 3][j - 3] == -1
						&& chess[i + 4][j - 4] == -1) {
					result = -1;// y=-x方向
					break isvictory;
				}
			}
		}
		return result;
	}

	@Override
	protected int forbidden_chess_input_longconnection(String[][] board) {
		// TODO 自动生成的方法存根
		return 0;
	}

}
