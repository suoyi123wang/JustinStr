package wuziqi.console;

public class YangRule extends Rule {

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

	protected int forbidden_chess_input_longconnection(Chess inputChess,
			String[][] board) {// 禁手判负 // 长连禁手
		int result = 0;
		int inputX = inputChess.getX();
		int inputY = inputChess.getY();
		int[][] chess = new int[15][15];
		for (int i = 0; i <= 14; i++) {
			for (int j = 0; j <= 14; j++) {
				if (board[i][j].equals("● ")) {
					chess[i][j] = 1;
				} else if (board[i][j].equals("+ ")) {
					chess[i][j] = 0;
				} else if (board[i][j].equals("o ")) {
					chess[i][j] = -1;
				}
			}
		}

		// 长连禁手
		longconnect: for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {

				try {
					if (chess[i][j] == 1 && chess[i + 1][j] == 0
							&& chess[i + 2][j] == 1 && chess[i + 3][j] == 1
							&& chess[i + 4][j] == 1 && chess[i + 5][j] == 1) {
						if (inputX == i + 1 && inputY == j) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j] == 1
							&& chess[i + 2][j] == 0 && chess[i + 3][j] == 1
							&& chess[i + 4][j] == 1 && chess[i + 5][j] == 1) {
						if (inputX == i + 2 && inputY == j) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j] == 1
							&& chess[i + 2][j] == 1 && chess[i + 3][j] == 0
							&& chess[i + 4][j] == 1 && chess[i + 5][j] == 1) {
						if (inputX == i + 3 && inputY == j) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j] == 1
							&& chess[i + 2][j] == 1 && chess[i + 3][j] == 1
							&& chess[i + 4][j] == 0 && chess[i + 5][j] == 1) {
						if (inputX == i + 4 && inputY == j) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}

				try {
					if (chess[i][j] == 1 && chess[i][j + 1] == 0
							&& chess[i][j + 2] == 1 && chess[i][j + 3] == 1
							&& chess[i][j + 4] == 1 && chess[i][j + 5] == 1) {
						if (inputX == i && inputY == j + 1) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i][j + 1] == 1
							&& chess[i][j + 2] == 0 && chess[i][j + 3] == 1
							&& chess[i][j + 4] == 1 && chess[i][j + 5] == 1) {
						if (inputX == i && inputY == j + 2) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i][j + 1] == 1
							&& chess[i][j + 2] == 1 && chess[i][j + 3] == 0
							&& chess[i][j + 4] == 1 && chess[i][j + 5] == 1) {
						if (inputX == i && inputY == j + 3) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i][j + 1] == 1
							&& chess[i][j + 2] == 1 && chess[i][j + 3] == 1
							&& chess[i][j + 4] == 0 && chess[i][j + 5] == 1) {
						if (inputX == i && inputY == j + 4) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j + 1] == 0
							&& chess[i + 2][j + 2] == 1
							&& chess[i + 3][j + 3] == 1
							&& chess[i + 4][j + 4] == 1
							&& chess[i + 5][j + 5] == 1) {
						if (inputX == i + 1 && inputY == j + 1) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j + 1] == 1
							&& chess[i + 2][j + 2] == 0
							&& chess[i + 3][j + 3] == 1
							&& chess[i + 4][j + 4] == 1
							&& chess[i + 5][j + 5] == 1) {
						if (inputX == i + 2 && inputY == j + 2) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j + 1] == 1
							&& chess[i + 2][j + 2] == 1
							&& chess[i + 3][j + 3] == 0
							&& chess[i + 4][j + 4] == 1
							&& chess[i + 5][j + 5] == 1) {
						if (inputX == i + 3 && inputY == j + 3) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j + 1] == 1
							&& chess[i + 2][j + 2] == 1
							&& chess[i + 3][j + 3] == 1
							&& chess[i + 4][j + 4] == 0
							&& chess[i + 5][j + 5] == 1) {
						if (inputX == i + 4 && inputY == j + 4) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}

				try {
					if (chess[i][j] == 1 && chess[i + 1][j - 1] == 0
							&& chess[i + 2][j - 2] == 1
							&& chess[i + 3][j - 3] == 1
							&& chess[i + 4][j - 4] == 1
							&& chess[i + 5][j - 5] == 1) {
						if (inputX == i + 1 && inputY == j - 1) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j - 1] == 1
							&& chess[i + 2][j - 2] == 0
							&& chess[i + 3][j - 3] == 1
							&& chess[i + 4][j - 4] == 1
							&& chess[i + 5][j - 5] == 1) {
						if (inputX == i + 2 && inputY == j - 2) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j - 1] == 1
							&& chess[i + 2][j - 2] == 1
							&& chess[i + 3][j - 3] == 0
							&& chess[i + 4][j - 4] == 1
							&& chess[i + 5][j - 5] == 1) {
						if (inputX == i + 3 && inputY == j - 3) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j - 1] == 1
							&& chess[i + 2][j - 2] == 1
							&& chess[i + 3][j - 3] == 1
							&& chess[i + 4][j - 4] == 0
							&& chess[i + 5][j - 5] == 1) {
						if (inputX == i + 4 && inputY == j - 4) {
							result = -1;
							break longconnect;
						}
					}
				} catch (Exception e) {

				}

			}
		}

		return result;
	}

	protected int forbidden_chess_input_44(Chess inputChess, String[][] board) {// 禁手判负//
																				// 四四禁手
		int result = 0;
		int inputX = inputChess.getX();
		int inputY = inputChess.getY();
		int[][] chess = new int[15][15];
		for (int i = 0; i <= 14; i++) {
			for (int j = 0; j <= 14; j++) {
				if (board[i][j].equals("● ")) {
					chess[i][j] = 1;
				} else if (board[i][j].equals("+ ")) {
					chess[i][j] = 0;
				} else if (board[i][j].equals("o ")) {
					chess[i][j] = -1;
				}
			}
		}

		// 四四禁手
		doublefourconnect: for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {

				try {
					if (chess[i][j] == 1 && chess[i + 1][j] == 0
							&& chess[i + 2][j] == 1 && chess[i + 3][j] == 0
							&& chess[i + 4][j] == 1 && chess[i + 5][j] == 0
							&& chess[i + 6][j] == 1) {
						if (inputX == i + 3 && inputY == j) {
							result = -1;
							break doublefourconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i][j + 1] == 0
							&& chess[i][j + 2] == 1 && chess[i][j + 3] == 0
							&& chess[i][j + 4] == 1 && chess[i][j + 5] == 0
							&& chess[i][j + 6] == 1) {
						if (inputX == i && inputY == j + 3) {
							result = -1;
							break doublefourconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j + 1] == 0
							&& chess[i + 2][j + 2] == 1
							&& chess[i + 3][j + 3] == 0
							&& chess[i + 4][j + 4] == 1
							&& chess[i + 5][j + 5] == 0
							&& chess[i + 6][j + 6] == 1) {
						if (inputX == i + 3 && inputY == j + 3) {
							result = -1;
							break doublefourconnect;
						}
					}
				} catch (Exception e) {

				}
				try {
					if (chess[i][j] == 1 && chess[i + 1][j - 1] == 0
							&& chess[i + 2][j - 2] == 1
							&& chess[i + 3][j - 3] == 0
							&& chess[i + 4][j - 4] == 1
							&& chess[i + 5][j - 5] == 0
							&& chess[i + 6][j - 6] == 1) {
						if (inputX == i + 3 && inputY == j - 3) {
							result = -1;
							break doublefourconnect;
						}
					}
				} catch (Exception e) {

				}
			}
		}
		return result;
	}

	public boolean forbiddeninput(Chess inputChess, String[][] board) {
		int result1 = forbidden_chess_input_44(inputChess, board);
		int result2 = forbidden_chess_input_longconnection(inputChess, board);
		boolean result = false;
		
		if(result1 == -1 || result2 == -1){
			result = true;
		}

		return result;
	}
}
