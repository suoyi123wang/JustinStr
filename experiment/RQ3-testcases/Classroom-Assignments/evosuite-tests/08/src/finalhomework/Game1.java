package finalhomework;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game1 {
	String[] finalline = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
			"K", "L", "M", "N", "O" };
	int gameInt, playerInt, ruleInt, orderInt, difficultyInt, isWin;
	int count = 0, x = 0, y = 0;
	Rule rule;
	Player player;
	Qipu qipu = new Qipu();
	int[][] record;
	boolean win = false;
	ChessBoard chessBoard = new ChessBoard();
	Stone stone = new Stone(0, 0);

	public void start(int gameInt, int playerInt, int ruleInt, int orderInt,
			int difficultyInt) {
		if (gameInt == 0) {
			this.playerInt = playerInt;
			this.ruleInt = ruleInt;
			this.orderInt = orderInt;
			this.difficultyInt = difficultyInt;
		} else {
			try {
				record = new Record().selectRecord();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			this.playerInt = record[0][1];
			this.ruleInt = record[1][1];
			this.orderInt = record[2][1];
			this.difficultyInt = record[3][1];
			this.isWin = record[6][1];
			int i = 7;
			while (record[i][0] != 0) {
				Stone stone = new Stone(record[i][0], record[i][1]);
				chessBoard.addStone(stone, i - 7);
				qipu.addStone(stone, i - 7 + "-0");
				i++;
				count++;
			}
			System.out.println(chessBoard.printChessboard());

			if (isWin == 1)
				win = true;
		}

		System.out.println("游戏开始，游戏中输入坐标格式为，" + "\n例如“A 3”,“A”代表横坐标，范围A-O，"
				+ "\n“3”代表纵坐标,范围1-15." + "\n游戏中输入“0”退出游戏,"
				+ "\n输入“_rec”保存棋谱，继续游戏," + "\n输入“_reg”悔棋");

		int[] info = new int[] { this.playerInt, this.ruleInt, this.orderInt,
				this.difficultyInt, 1, 1, this.isWin };

		if (this.ruleInt == 0) {
			rule = new GomokuRule();
		} else {
			rule = new RenjuRule();
		}

		if (this.playerInt == 0) {
			player = new HumanPlayer();
		} else {
			player = new AIPlayer();
		}

		while (!win) {
			if (count >= 225) {
				System.out.println("和棋");
			} else {
				try {
					if (this.orderInt == 1) {
						if (count == 0) {
							stone = new Stone((int) Math.random() * 3 + 7,
									(int) Math.random() * 3 + 7);
						} else if (this.playerInt == 1) {
							count++;
							stone = player.input(count,
									chessBoard.chessBoardInt, info,
									this.difficultyInt, rule);
							count--;
						}
					} else
						stone = player.input(count, chessBoard.chessBoardInt,
								info, this.difficultyInt, rule);

				} catch (Exception e) {
					System.out.println("输入有误，请重新输入。");
					continue;
				}
				if (stone.getX() == -1) {
					chessBoard.regret(qipu.lastStone(count));
					qipu.regret(count);
					count--;
					count--;
					System.out.println(chessBoard.printChessboard());
					continue;
				} else if (stone.getX() == 0) {
					break;
				}
				if (this.rule.forbidden(stone, chessBoard.chessBoardInt, count)) {
					System.out.println("黑子禁手，请重新输入。");
					continue;
				} else {
					if (chessBoard.outBoard(stone)) {
						System.out.println("落子出界，请重新输入。");
						continue;
					}
					chessBoard.addStone(stone, count);
					qipu.addStone(stone, count + "-0");
					System.out.println(chessBoard.printChessboard());
					if (count % 2 == 0) {
						System.out.println("黑方落子" + finalline[stone.getX() - 1]
								+ stone.getY() + "\n");
					} else {
						System.out.println("白方落子" + finalline[stone.getX() - 1]
								+ stone.getY() + "\n");
					}

					win = rule.isWin(stone, chessBoard.chessBoardInt);
					if (win) {
						if (count % 2 == 0)
							System.out.println("黑方玩家获胜,本次游戏结束");
						else
							System.out.println("白方玩家获胜,本次游戏结束");
					} else {
						count++;
					}
				}
			}

		}

		System.out.println("是否存档？  \n  0.是       1.否");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a == 0) {
			try {
				new Record().newRecord(qipu.qipuArray, info);

			} catch (Exception e) {
				System.out.println("出现错误，请重新选择");

			}
		}

	}

}
