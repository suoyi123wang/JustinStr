package homework;

import java.util.Random;

public class AIreal{

	int[][] weightboard = new int[23][23];

	public Chesswithoutcolor Playerinput() {// 要分辨敌我！

		Chesswithoutcolor finalchess = null;

		Random random = new Random();

		Chesswithoutcolor[] aichess4 = new Chesswithoutcolor[225];
		int chess4record = 0;
		Chesswithoutcolor[] aichess3 = new Chesswithoutcolor[225];
		int chess3record = 0;
		Chesswithoutcolor[] aichess2 = new Chesswithoutcolor[225];
		int chess2record = 0;
		Chesswithoutcolor[] aichess1 = new Chesswithoutcolor[225];
		int chess1record = 0;

		for (int i = 4; i <= 18; i++) {
			for (int j = 4; j <= 18; j++) {// 只检索真正在棋盘内部的，去掉了4周宽为4的防错边界,防错棋盘中的坐标为真正棋盘坐标的+4，+4

				if (weightboard[i][j] == 1000) {
					aichess4[chess4record] = new Chesswithoutcolor(i - 4, j - 4);
					chess4record++;
				} else if (weightboard[i][j] == 100) {
					aichess4[chess3record] = new Chesswithoutcolor(i - 4, j - 4);
					chess3record++;
				} else if (weightboard[i][j] == 10) {
					aichess4[chess2record] = new Chesswithoutcolor(i - 4, j - 4);
					chess2record++;
				} else if (weightboard[i][j] == 1) {
					aichess4[chess1record] = new Chesswithoutcolor(i - 4, j - 4);
					chess1record++;
				}

			}
		}

		if (chess4record != 0) {
			int i = random.nextInt(chess4record);
			finalchess = aichess4[i];

		} else if (chess3record != 0) {
			int i = random.nextInt(chess3record);
			finalchess = aichess3[i];

		} else if (chess2record != 0) {
			int i = random.nextInt(chess2record);
			finalchess = aichess2[i];

		} else if (chess1record != 0) {
			int i = random.nextInt(chess1record);
			finalchess = aichess1[i];

		}

		return finalchess;
	}

	public int[][] judgeboardcreator(String[][] board, String WB) {
		int[][] judgeboard = new int[23][23];// 根据judgeboard得到权重棋盘。
		if (WB.equals("B")) {// AI是黑方
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					if (board[i][j].equals("● ")) {
						judgeboard[i + 4][j + 4] = 1;
					} else if (board[i][j].equals("o ")) {
						judgeboard[i + 4][j + 4] = -1;
					} else {
						judgeboard[i + 4][j + 4] = 0;
					}
				}
			}
		} else {
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					if (board[i][j].equals("o ")) {
						judgeboard[i + 4][j + 4] = 1;
					} else if (board[i][j].equals("● ")) {
						judgeboard[i + 4][j + 4] = -1;
					} else {
						judgeboard[i + 4][j + 4] = 0;// 空
					}
				}
			}
		}

		// 此时已经得到了judgeboard棋盘，AI方为1

		return judgeboard;
	}

	public void AIjudge1(int[][] judgeboard) {
		for (int i = 4; i <= 18; i++) {
			for (int j = 4; j <= 18; j++) {
				if (judgeboard[i][j] == 1) {

					if (weightboard[i - 1][j - 1] == 0) {
						weightboard[i - 1][j - 1] = 1;
					}

					if (weightboard[i - 1][j] == 0) {
						weightboard[i - 1][j] = 1;
					}

					if (weightboard[i - 1][j + 1] == 0) {
						weightboard[i - 1][j + 1] = 1;
					}

					if (weightboard[i][j - 1] == 0) {
						weightboard[i][j - 1] = 1;
					}

					if (weightboard[i][j + 1] == 0) {
						weightboard[i][j + 1] = 1;
					}

					if (weightboard[i + 1][j + 1] == 0) {
						weightboard[i + 1][j + 1] = 1;
					}

					if (weightboard[i + 1][j] == 0) {
						weightboard[i + 1][j] = 1;
					}

					if (weightboard[i + 1][j - 1] == 0) {
						weightboard[i + 1][j - 1] = 1;
					}

				}
			}
		}

	}

	public void AIjudge2(int[][] judgeboard) {
		for (int i = 4; i <= 18; i++) {
			for (int j = 4; j <= 18; j++) {

				if (judgeboard[i][j] == 1 && judgeboard[i + 1][j + 1] == 1) {
					// y=x方向
					if (judgeboard[i - 1][j - 1] == 0) {
						if (weightboard[i - 1][j - 1] < 10) {
							weightboard[i - 1][j - 1] = 10;
						}
					}
					if (judgeboard[i + 2][j + 2] == 0) {
						if (weightboard[i + 2][j + 2] < 10) {
							weightboard[i + 2][j + 2] = 10;
						}
					}

				}
				if (judgeboard[i][j] == 1 && judgeboard[i + 1][j] == 1) {
					// 水平方向
					if (judgeboard[i - 1][j] == 0) {
						if (weightboard[i - 1][j] < 10) {
							weightboard[i - 1][j] = 10;
						}
					}
					if (judgeboard[i + 2][j] == 0) {
						if (weightboard[i + 2][j] < 10) {
							weightboard[i + 2][j] = 10;
						}
					}

				}
				if (judgeboard[i][j] == 1 && judgeboard[i][j + 1] == 1) {
					// 竖直方向
					if (judgeboard[i][j - 1] == 0) {
						if (weightboard[i][j - 1] < 10) {
							weightboard[i][j - 1] = 10;
						}
					}
					if (judgeboard[i][j + 3] == 0) {
						if (weightboard[i][j + 2] < 10) {
							weightboard[i][j + 2] = 10;
						}
					}

				}
				if (judgeboard[i][j] == 1 && judgeboard[i + 1][j - 1] == 1) {
					// y=-x方向
					if (judgeboard[i - 1][j + 1] == 0) {
						if (weightboard[i - 1][j + 1] < 10) {
							weightboard[i - 1][j + 1] = 10;
						}
					}
					if (judgeboard[i + 3][j - 3] == 0) {
						if (weightboard[i + 2][j - 2] < 10) {
							weightboard[i + 2][j - 2] = 10;
						}
					}

				}

			}
		}

	}

	public void AIjudge3(int[][] judgeboard) {

		for (int i = 4; i <= 18; i++) {
			for (int j = 4; j <= 18; j++) {

				if (judgeboard[i][j] == 1 && judgeboard[i + 1][j + 1] == 1
						&& judgeboard[i + 2][j + 2] == 1) {
					// y=x方向
					if (judgeboard[i - 1][j - 1] == 0) {
						if (weightboard[i - 1][j - 1] < 100) {
							weightboard[i - 1][j - 1] = 100;
						}
					}
					if (judgeboard[i + 3][j + 3] == 0) {
						if (weightboard[i + 3][j + 3] < 100) {
							weightboard[i + 3][j + 3] = 100;
						}
					}

				}
				if (judgeboard[i][j] == 1 && judgeboard[i + 1][j] == 1
						&& judgeboard[i + 2][j] == 1) {
					// 水平方向
					if (judgeboard[i - 1][j] == 0) {
						if (weightboard[i - 1][j] < 100) {
							weightboard[i - 1][j] = 100;
						}
					}
					if (judgeboard[i + 3][j] == 0) {
						if (weightboard[i + 3][j] < 100) {
							weightboard[i + 3][j] = 100;
						}
					}

				}
				if (judgeboard[i][j] == 1 && judgeboard[i][j + 1] == 1
						&& judgeboard[i][j + 2] == 1) {
					// 竖直方向
					if (judgeboard[i][j - 1] == 0) {
						if (weightboard[i][j - 1] < 100) {
							weightboard[i][j - 1] = 100;
						}
					}
					if (judgeboard[i][j + 3] == 0) {
						if (weightboard[i][j + 3] < 100) {
							weightboard[i][j + 3] = 100;
						}
					}

				}
				if (judgeboard[i][j] == 1 && judgeboard[i + 1][j - 1] == 1
						&& judgeboard[i + 2][j - 2] == 1) {
					// y=-x方向
					if (judgeboard[i - 1][j + 1] == 0) {
						if (weightboard[i - 1][j + 1] < 100) {
							weightboard[i - 1][j + 1] = 100;
						}
					}
					if (judgeboard[i + 3][j - 3] == 0) {
						if (weightboard[i + 3][j - 3] < 100) {
							weightboard[i + 3][j - 3] = 100;
						}
					}

				}

			}
		}

	}

	public void AIjudge4(int[][] judgeboard) {// 四连珠判断
		for (int i = 4; i <= 18; i++) {
			for (int j = 4; j <= 18; j++) {

				if (judgeboard[i][j] == 1 && judgeboard[i + 1][j + 1] == 1
						&& judgeboard[i + 2][j + 2] == 1
						&& judgeboard[i + 3][j + 3] == 1) {
					// y=x方向
					if (judgeboard[i - 1][j - 1] == 0) {
						weightboard[i - 1][j - 1] = 1000;
					}
					if (judgeboard[i + 4][j + 4] == 0) {
						weightboard[i + 4][j + 4] = 1000;
					}

				}
				if (judgeboard[i][j] == 1 && judgeboard[i + 1][j] == 1
						&& judgeboard[i + 2][j] == 1
						&& judgeboard[i + 3][j] == 1) {
					// 水平方向
					if (judgeboard[i - 1][j] == 0) {
						weightboard[i - 1][j] = 1000;
					}
					if (judgeboard[i + 4][j] == 0) {
						weightboard[i + 4][j] = 1000;
					}

				}
				if (judgeboard[i][j] == 1 && judgeboard[i][j + 1] == 1
						&& judgeboard[i][j + 2] == 1
						&& judgeboard[i][j + 3] == 1) {
					// 竖直方向
					if (judgeboard[i][j - 1] == 0) {
						weightboard[i][j - 1] = 1000;
					}
					if (judgeboard[i][j + 4] == 0) {
						weightboard[i][j + 4] = 1000;
					}

				}
				if (judgeboard[i][j] == 1 && judgeboard[i + 1][j - 1] == 1
						&& judgeboard[i + 2][j - 2] == 1
						&& judgeboard[i + 3][j - 3] == 1) {
					// y=-x方向
					if (judgeboard[i - 1][j + 1] == 0) {
						weightboard[i - 1][j + 1] = 1000;
					}
					if (judgeboard[i + 4][j - 4] == 0) {
						weightboard[i + 4][j - 4] = 1000;
					}

				}

			}
		}

	}
}
