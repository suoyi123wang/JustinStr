package homework;

import java.util.Scanner;

public abstract class Rule {

	int a[] = new int[5];
	int b[] = new int[5];

	// choose five stones from player1 and judge

	public boolean choosePlayer1(int i) {
		boolean w1 = false;
		if (i >= 4) {
			for (int k = 0; k < i; k++) {
				for (int j = k + 1; j < i; j++) {
					for (int h = j + 1; h < i; h++) {
						for (int p = h + 1; p < i; p++) {
							a[0] = ChessRecord.a1[k];
							b[0] = ChessRecord.a2[k];
							a[1] = ChessRecord.a1[j];
							b[1] = ChessRecord.a2[j];
							a[2] = ChessRecord.a1[h];
							b[2] = ChessRecord.a2[h];
							a[3] = ChessRecord.a1[p];
							b[3] = ChessRecord.a2[p];
							a[4] = ChessRecord.a1[i];
							b[4] = ChessRecord.a2[i];
							if (this.isWin()) {
								w1 = true;

							}

						}
					}

				}
			}

		}

		return w1;
	}

	// 玩家赢了之后，打印玩家连城直线的棋子
	public boolean isPlayer1Win(int count, String color) {
		boolean w = this.choosePlayer1(count);
		if (w) {
			System.out.println("player1 (" + color + ") is winner");
			System.out.println("同色且五子相连的是：");
			for (int q = 0; q < 5; q++) {
				char b1 = (char) (b[q] + 64);
				System.out.println(b1 + " " + a[q] + "  ");
			}
		}
		return w;
	}

	// choose five stones from player2 and judge
	public boolean choosePlayer2(int i) {
		boolean w2 = false;
		if (i >= 4) {
			for (int k = 0; k < i; k++) {
				for (int j = k + 1; j < i; j++) {
					for (int h = j + 1; h < i; h++) {
						for (int p = h + 1; p < i; p++) {
							a[0] = ChessRecord.b1[k];
							b[0] = ChessRecord.b2[k];
							a[1] = ChessRecord.b1[j];
							b[1] = ChessRecord.b2[j];
							a[2] = ChessRecord.b1[h];
							b[2] = ChessRecord.b2[h];
							a[3] = ChessRecord.b1[p];
							b[3] = ChessRecord.b2[p];
							a[4] = ChessRecord.b1[i];
							b[4] = ChessRecord.b2[i];
							if (this.isWin()) {
								w2 = true;

							}

						}
					}

				}
			}
		}
		return w2;
	}

	public boolean isPlayer2Win(int count, String color) {
		boolean w = this.choosePlayer2(count);
		if (w) {
			System.out.println("player2 (" + color + ") is winner");
			System.out.println("同色且五子相连的是：");
			for (int q = 0; q < 5; q++) {
				char b1 = (char) (b[q] + 64);
				System.out.println(b1 + " " + a[q] + "  ");
			}
		}
		return w;
	}

	public boolean isWin() {

		boolean w = true;
		for (int n = 0; n < 3; n++) {
			int j1, j2, k1, k2;
			j1 = a[4] - a[n];
			j2 = a[4] - a[n + 1];
			k1 = b[4] - b[n];
			k2 = b[4] - b[n + 1];
			if (j1 * k2 != j2 * k1) {
				w = false;
				break;
			}

		}

		for (int h = 0; h < 5; h++) {
			for (int u = h + 1; u < 5; u++) {
				if (Math.abs(a[h] - a[u]) >= 5 || Math.abs(b[h] - b[u]) >= 5) {
					w = false;
					break;
				}
			}
		}
		return w;
	}

	public boolean isDraw() {
		boolean w = true;
		for (int i = 0; i < ChessRecord.Length; i++) {
			for (int j = 0; j < ChessRecord.Width; j++) {
				if (Board.chess[i][j] == 0)
					w = false;
			}
		}
		if (w)
			System.out.print("Draw, no winner");
		return w;
	}

	public boolean isRemove(int count1, int count2) {
		if (count1 > 0 && count2 > 0) {
			System.out.println("是否悔棋：是(Y or y)，否(N or n)");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine().toUpperCase();
			return (input.equals("Y"));
		} else {
			return false;
		}
	}

	// 下面方法中的count指的是步数，需减1
	public void remove(int count1, int count2) {

		count1 = count1 - 1;
		count2 = count2 - 1;
		System.out.println("悔棋取消的是：");
		System.out.print((char) (ChessRecord.a2[count1] + 64));
		System.out.println((ChessRecord.a1[count1] + 64));
		System.out.print((char) (ChessRecord.b2[count2] + 64));
		System.out.println((ChessRecord.b1[count2] + 64));

		Board.chess[ChessRecord.a1[count1] - 1][ChessRecord.a2[count1] - 1] = 0;
		Board.chess[ChessRecord.b1[count2] - 1][ChessRecord.b2[count2] - 1] = 0;
		ChessRecord.a1[count1] = 0;
		ChessRecord.a2[count1] = 0;
		ChessRecord.b1[count2] = 0;
		ChessRecord.b2[count2] = 0;
		Board.printBoard();

	}
}
