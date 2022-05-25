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

		System.out.println("��Ϸ��ʼ����Ϸ�����������ʽΪ��" + "\n���硰A 3��,��A����������꣬��ΧA-O��"
				+ "\n��3������������,��Χ1-15." + "\n��Ϸ�����롰0���˳���Ϸ,"
				+ "\n���롰_rec���������ף�������Ϸ," + "\n���롰_reg������");

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
				System.out.println("����");
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
					System.out.println("�����������������롣");
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
					System.out.println("���ӽ��֣����������롣");
					continue;
				} else {
					if (chessBoard.outBoard(stone)) {
						System.out.println("���ӳ��磬���������롣");
						continue;
					}
					chessBoard.addStone(stone, count);
					qipu.addStone(stone, count + "-0");
					System.out.println(chessBoard.printChessboard());
					if (count % 2 == 0) {
						System.out.println("�ڷ�����" + finalline[stone.getX() - 1]
								+ stone.getY() + "\n");
					} else {
						System.out.println("�׷�����" + finalline[stone.getX() - 1]
								+ stone.getY() + "\n");
					}

					win = rule.isWin(stone, chessBoard.chessBoardInt);
					if (win) {
						if (count % 2 == 0)
							System.out.println("�ڷ���һ�ʤ,������Ϸ����");
						else
							System.out.println("�׷���һ�ʤ,������Ϸ����");
					} else {
						count++;
					}
				}
			}

		}

		System.out.println("�Ƿ�浵��  \n  0.��       1.��");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a == 0) {
			try {
				new Record().newRecord(qipu.qipuArray, info);

			} catch (Exception e) {
				System.out.println("���ִ���������ѡ��");

			}
		}

	}

}
