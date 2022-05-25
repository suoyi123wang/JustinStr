package five;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Game {
	Player player1;
	Player player2;
	UI ui = new GraphicsUI();
	Record record = new Record();
	Board board = new Board();
	Rule rule;

	public void var() {
		Board.var();
		Record.var();
		Rule.winner = 0;
	}

	public void start() {
		var();
		Record.loadAll();
		rule = new GomokuRule();
		int tem = ui.start();
		if (tem == 1) {
			int ruleTem = ui.chooseRule();
			if (ruleTem == 2)
				rule = new RenjuRule();
			else if (ruleTem == 3) {
				Record.saveAll();
				start();
			}
			int player = ui.choosePlayer();
			if (player == 1) {
				runPlayer1(1);
			} else if (player == 2) {
				runPlayer2(1);
			} else if (player == 3) {
				Record.saveAll();
				start();
			}
		} else if (tem == 2) {
			runPlayer(Record.load() - 1);
		} else if (tem == 3) {
			Record.saveAll();
			System.exit(0);
		}
		end();
	}

	public void end() {
		if (Rule.winner == 1)
			ui.printFinal(player1.player);
		else if (Rule.winner == 2)
			ui.printFinal(player2.player);
		else if (Rule.winner == 0)
			ui.printFinal(null);
		if (JOptionPane.showConfirmDialog(null, "Save?") == 0) {
			int position = 0;
			do {
				try {
					position = new java.util.Scanner(
							JOptionPane
									.showInputDialog("Which position would you like to save?\nInput 1~100:"))
							.nextInt();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Invalid position.");
				}
			} while (!(position >= 1 && position <= 100));
			Record.save(position - 1, player1.player, player2.player);
		}
		Record.saveAll();
		if (JOptionPane.showConfirmDialog(null, "Again?") == 0) {
			Record.saveAll();
			start();
		} else
			System.exit(0);
	}

	public int run(int player) {
		if (player == 1) {
			boolean canGo = false;
			do {
				String tem = new String();
				if (!new StringBuilder()
						.append(player1.player, 1, player1.player.length())
						.toString().equals("Computer")) {
					tem = ui.print(player1.player);

					if (tem == null || tem.equals("")) {
						JOptionPane.showMessageDialog(null, "No input.");
					} else if (tem.equals("undo")) {
						player1.moveChess();
					} else if (tem.equals("save")) {
						int position = 0;
						do {
							try {
								position = new java.util.Scanner(
										JOptionPane
												.showInputDialog("Which position would you like to save?\nInput 1~100:"))
										.nextInt();
							} catch (Exception e) {
								JOptionPane.showMessageDialog(null,
										"Invalid position.");
							}
						} while (!(position >= 1 && position <= 100));
						Record.save(position - 1, player1.player,
								player2.player);
					} else if (tem.equals("back")) {
						Record.saveAll();
						start();
					} else if (ui.transform(tem)) {
						if (rule.isIn(player1.getRow(), player1.getLine())
								&& rule.isValid(1, player1.getRow(),
										player1.getLine())) {
							canGo = true;
						} else
							JOptionPane.showMessageDialog(null,
									"You can't put chess here.");
					} else
						JOptionPane.showMessageDialog(null, "Invalid input.");
				} else {
					player1.getPosition();
					canGo = true;
				}
			} while (!canGo);
			player1.putChess(1, player1.getRow(), player1.getLine());
			rule.isWin(1, player1.getRow(), player1.getLine());
		} else if (player == 2) {
			boolean canGo = false;
			do {
				String tem = new String();
				if (!new StringBuilder()
						.append(player2.player, 1, player2.player.length())
						.toString().equals("Computer")) {
					tem = ui.print(player2.player);

					if (tem.equals(null) || tem.equals("")) {
						JOptionPane.showMessageDialog(null, "No input.");
					} else if (tem.equals("undo")) {
						player2.moveChess();
					} else if (tem.equals("save")) {
						int position = 0;
						do {
							try {
								position = new java.util.Scanner(
										JOptionPane
												.showInputDialog("Which position would you like to save?\nInput 1~100:"))
										.nextInt();
							} catch (Exception e) {
								JOptionPane.showMessageDialog(null,
										"Invalid position.");
							}
						} while (!(position >= 1 && position <= 100));
						Record.save(position - 1, player1.player,
								player2.player);
					} else if (tem.equals("back")) {
						start();
					} else if (ui.transform(tem)) {
						if (rule.isIn(player2.getRow(), player2.getLine())
								&& rule.isValid(2, player2.getRow(),
										player2.getLine())) {
							canGo = true;
						}
					} else
						JOptionPane.showMessageDialog(null, "Invalid input.");
				} else {
					player2.getPosition();
					canGo = true;
				}
			} while (!canGo);
			player2.putChess(2, player2.getRow(), player2.getLine());
			rule.isWin(2, player2.getRow(), player2.getLine());
		}
		return 3 - player;
	}

	public void runPlayer(int position) {
		if (position == -5) {
			Record.saveAll();
			start();
		}
		File file = new File(Record.saving[position][0]
				+ Record.saving[position][1] + ".txt");
		try {
			Scanner scanner = new Scanner(file);
			String name1 = scanner.next();
			String name2 = scanner.next();
			if (name1.length() != 1
					&& new StringBuilder().append(name1, 1, name1.length())
							.toString().equals("Computer"))
				player1 = new AIPlayer(1, name1);
			else
				player1 = new HumanPlayer(name1);
			if (name2.length() != 1
					&& new StringBuilder().append(name2, 1, name2.length())
							.toString().equals("Computer"))
				player2 = new AIPlayer(2, name2);
			else
				player2 = new HumanPlayer(name2);
			Board.steps = scanner.nextInt();
			for (int i = 0; i < Board.steps; i++) {
				Board.step[i][0] = scanner.nextInt();
				Board.step[i][1] = scanner.nextInt();
				Board.step[i][2] = scanner.nextInt();
				Board.board[0][Board.step[i][1]][Board.step[i][2]] = true;
				Board.board[Board.step[i][0]][Board.step[i][1]][Board.step[i][2]] = true;
				ui.print("Replay");
			}
			Board.rule = scanner.next();
			if (Board.rule.equals("Gomoku"))
				;
			else if (Board.rule.equals("Renju"))
				rule = new RenjuRule();
			int player;
			if (Board.steps < 2)
				player = Board.steps + 1;
			else
				player = Board.step[Board.steps - 2][0];
			do {
				player = run(player);
			} while (Rule.winner == 0 && !Rule.isDraw);

			scanner.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File not found.");
			e.printStackTrace();
		}
	}

	public void runPlayer1(int player) {
		int chess = ui.chooseChess();
		if (chess == 1) {
			player1 = new HumanPlayer(1);
			player2 = new AIPlayer(2, FIR.CHESS[1] + "Computer");
		} else if (chess == 2) {
			player2 = new HumanPlayer(2);
			player1 = new AIPlayer(1, FIR.CHESS[0] + "Computer");
		}
		do {
			player = run(player);
		} while (Rule.winner == 0 && !Rule.isDraw);
	}

	public void runPlayer2(int player) {
		// player1 = new HumanPlayer(1);
		// player2 = new HumanPlayer(2);
		player1 = new AIPlayer4(1, FIR.CHESS[0] + "Computer");
		player2 = new AIPlayer4(2, FIR.CHESS[1] + "Computer");

		do {
			player = run(player);
		} while (Rule.winner == 0 && !Rule.isDraw);
	}

}
