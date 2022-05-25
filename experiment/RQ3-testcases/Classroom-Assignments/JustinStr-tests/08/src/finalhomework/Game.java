package finalhomework;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton regretButton = new JButton("      悔棋      ");
	private JButton returnButton = new JButton("返回主菜单");
	private JButton recordButton = new JButton("      存档      ");
	private JButton tishiButton = new JButton("      提示      ");
	private JLabel curturn = new JLabel("current turn: ");
	private JLabel curturnColor = new JLabel("               ");
	boolean win = false;
	int gameInt, playerInt, ruleInt, orderInt, colorInt, soundInt,
			difficultyInt, isWin;
	int count = 0, x = 0, y = 0;
	Rule rule;
	ChessBoard chessBoard = new ChessBoard();
	Qipu qipu = new Qipu();
	int[][] record;
	JPanel panel2;
	String playerString, ruleString, difficultyString, orderString;

	public Game(int gameInt, int playerInt, int ruleInt, int orderInt,
			int difficultyInt, int colorInt, int soundInt)
			throws FileNotFoundException {

		this.gameInt = gameInt;

		if (gameInt == 0) {
			this.playerInt = playerInt;
			this.ruleInt = ruleInt;
			this.orderInt = orderInt;
			this.difficultyInt = difficultyInt;
			this.colorInt = colorInt;
			this.soundInt = soundInt;
		} else {
			try {
				record = new Record().selectRecord();
			} catch (Exception e) {
				new GUI().start();
				return;
			}

			this.playerInt = record[0][1];
			this.ruleInt = record[1][1];
			this.orderInt = record[2][1];
			this.difficultyInt = record[3][1];
			this.colorInt = record[4][1];
			this.soundInt = record[5][1];
			this.isWin = record[6][1];
			int i = 7;
			while (record[i][0] != 0) {

				Stone stone = new Stone(record[i][0], record[i][1]);
				chessBoard.addStone(stone, i - 7);
				qipu.addStone(stone, String.valueOf(i - 7) + "-0");
				i++;
				count++;
				repaint();
			}

			if (isWin == 1)
				win = true;

		}

		Sound sound = new Sound(this.soundInt);
		int a = this.difficultyInt;

		int[] info = new int[] { this.playerInt, this.ruleInt, this.orderInt,
				this.difficultyInt, this.colorInt, this.soundInt, this.isWin };

		if (this.ruleInt == 0) {
			rule = new GomokuRule();
			ruleString = "无禁手";
		} else {
			rule = new RenjuRule();
			ruleString = "有禁手";
		}

		setLayout(new BorderLayout(0, 0));

		JPanel panel1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				if (count % 2 == 0)
					g.setColor(Color.black);
				else
					g.setColor(Color.white);
				g.fillOval(250, 5, 20, 20);
			}
		};
		panel1.setBackground(Color.gray);
		panel1.add(curturn);
		panel1.add(curturnColor);
		add(panel1, BorderLayout.NORTH);

		panel2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawRect(20, 20, 430, 430);
				for (int i = 0; i < 15; i++) {
					g.drawLine(25, 30 * i + 25, 444, 30 * i + 25);
					g.drawLine(30 * i + 25, 25, 30 * i + 25, 444);
				}
				g.fillOval(231, 231, 8, 8);
				g.fillOval(111, 111, 8, 8);
				g.fillOval(111, 351, 8, 8);
				g.fillOval(351, 111, 8, 8);
				g.fillOval(351, 351, 8, 8);

				for (int i = 0; i < count; i++) {
					if (i % 2 == 0) {
						g.setColor(Color.black);
					} else {
						g.setColor(Color.white);
					}
					g.fillOval((qipu.qipuArray[i][0] - 1) * 30 + 12,
							(qipu.qipuArray[i][1] - 1) * 30 + 12, 26, 26);
					g.setColor(Color.black);
					g.drawString("棋子总数：  " + (count), 50, 470);

					if (i == count - 2 || i == count - 1) {
						if (i % 2 == 1) {
							g.setColor(Color.black);
						} else {
							g.setColor(Color.white);
						}
						g.fillOval((qipu.qipuArray[i][0] - 1) * 30 + 22,
								(qipu.qipuArray[i][1] - 1) * 30 + 22, 6, 6);
					}

					if (qipu.qipuArray[i + 1][2] == 1) {
						g.drawRect((qipu.qipuArray[i + 1][0] - 1) * 30 + 12,
								(qipu.qipuArray[i + 1][1] - 1) * 30 + 12, 26,
								26);
						qipu.qipuArray[i + 1][2] = 0;

					}
				}
			}
		};
		panel2.setBackground(getColor(this.colorInt));

		if (this.playerInt == 1) {
			if (this.difficultyInt == 0) {
				difficultyString = "困难AI//";
			} else {
				difficultyString = "简单AI//";
			}
			playerString = "人机对战//";
			AIPlayer player = new AIPlayer();
			if (this.orderInt == 1) {
				orderString = "玩家持白子//";
				x = (int) Math.random() * 3 + 7;
				y = (int) Math.random() * 3 + 7;
				Stone stone = new Stone(x, y);
				qipu.addStone(stone, String.valueOf(count) + "-0");
				chessBoard.addStone(stone, count);
				count++;
				repaint();
			} else {
				orderString = "玩家持黑子//";
			}
			panel2.addMouseListener(new MouseAdapter() {

				public void mouseClicked(MouseEvent e) {

					if (!win) {

						if (e.getX() < 460 && e.getY() < 460) {

							x = (e.getX() + 15 - 25) / 30 + 1;
							y = (e.getY() + 15 - 25) / 30 + 1;
							Stone stone = new Stone(x, y);
							boolean illegel = chessBoard.superposition(stone);
							if (!illegel) {
								boolean isForbidden = rule.forbidden(stone,
										chessBoard.chessBoardInt, count);
								if (!isForbidden) {
									qipu.addStone(stone, count + "-0");
									chessBoard.addStone(stone, count);
									count++;
									repaint();
									sound.playStone();
									win = rule.isWin(stone,
											chessBoard.chessBoardInt);

									if (!win) {

										if (a == 0) {
											stone = player.getStone1(
													chessBoard.chessBoardInt,
													1, count, rule);
										} else {
											stone = player.getStone(
													chessBoard.chessBoardInt,
													1, count, rule);
										}

										qipu.addStone(stone, count + "-0");
										chessBoard.addStone(stone, count);
										count++;
										repaint();
										win = rule.isWin(stone,
												chessBoard.chessBoardInt);
									}

								} else {
									JOptionPane.showMessageDialog(null,
											"落子禁手，请重新落子！！！");
								}

							}

							if (win) {
								info[6] = 1;

								int option;
								if ((count + orderInt) % 2 == 1) {
									sound.playWin();
									option = JOptionPane.showConfirmDialog(
											null, "您赢了！！！\n是否存档？");
								} else {
									sound.playLose();
									option = JOptionPane.showConfirmDialog(
											null, "您输了！！！\n是否存档？");
								}

								if (option == JOptionPane.YES_OPTION) {
									try {
										new Record().newRecord(qipu.qipuArray,
												info);
									} catch (FileNotFoundException e1) {
										e1.printStackTrace();
									}
									close();
								}

							}
						}
					}

				}

			});
		} else {
			difficultyString = "";
			playerString = "人人对战//";
			panel2.addMouseListener(new MouseAdapter() {

				public void mouseClicked(MouseEvent e) {

					if (!win) {

						if (e.getX() < 460 && e.getY() < 460) {

							x = (e.getX() + 15 - 25) / 30 + 1;
							y = (e.getY() + 15 - 25) / 30 + 1;
							Stone stone = new Stone(x, y);
							boolean illegel = chessBoard.superposition(stone);
							if (!illegel) {
								boolean isForbidden = rule.forbidden(stone,
										chessBoard.chessBoardInt, count);
								if (!isForbidden) {
									qipu.addStone(stone, count + "-0");
									chessBoard.addStone(stone, count);
									count++;
									repaint();

									sound.playStone();

									win = rule.isWin(stone,
											chessBoard.chessBoardInt);
								} else {
									JOptionPane.showMessageDialog(null,
											"落子禁手，请重新落子！！！");
								}

							}

							if (win) {
								int option;
								info[6] = 1;
								if (count % 2 == 1) {
									option = JOptionPane.showConfirmDialog(
											null, "黑方获胜！！！\n是否存档？");
								} else
									option = JOptionPane.showConfirmDialog(
											null, "白方获胜！！！\n是否存档？");

								if (option == JOptionPane.YES_OPTION) {
									try {
										new Record().newRecord(qipu.qipuArray,
												info);
									} catch (FileNotFoundException e1) {
										e1.printStackTrace();
									}
									close();
								}

							}
						}
					}

				}
			});
		}

		add(panel2, BorderLayout.CENTER);

		JPanel panel3 = new JPanel();
		panel3.add(recordButton);
		panel3.add(regretButton);
		panel3.add(tishiButton);
		panel3.add(returnButton);
		add(panel3, BorderLayout.SOUTH);

		recordButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					new Record().newRecord(qipu.qipuArray, info);
				} catch (Exception e1) {
				}

			}
		});

		regretButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (count > 1 && !win) {
					chessBoard.regret(qipu.lastStone(count));
					qipu.regret(count);
					count--;
					count--;
					repaint();
				}

			}
		});

		tishiButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Stone stone = new AIPlayer().getStone1(
						chessBoard.chessBoardInt, 1, count, rule);
				qipu.addStone(stone, count + "-1");
				repaint();

			}
		});

		returnButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new GUI().start();
				close();
			}
		});

		setTitle("五子棋//" + playerString + orderString + difficultyString
				+ ruleString);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(485, 600);
		setVisible(true);
		setLocation(450, 100);
	}

	private Color getColor(int a) {
		switch (a) {
		case 0:
			return Color.orange;
		case 1:
			return Color.pink;
		case 2:
			return Color.gray;
		case 3:
			return Color.cyan;
		case 4:
			return Color.yellow;
		case 5:
			return Color.green;
		case 6:
			return Color.magenta;
		default:
			return null;
		}
	}

	private void close() {
		this.dispose();
	}

}
