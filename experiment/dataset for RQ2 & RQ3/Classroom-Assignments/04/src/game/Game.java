package game;

import judge.*;
import player.*;
import record.Record;
import unseen.*;

public class Game {
	private Board board = new Board();
	private Rule judge;
	public static Player player1;
	public static Player player2;
	private boolean ifWin = false;
	java.util.Scanner input = new java.util.Scanner(System.in);

	Game() {
	}

	void game() {
		board.resetChess();
		board.resetNumberOfChess();
		board.resetChessBoard();
		Start.ui.printChessBoard();
		boolean ifBack = false;
		while (ifWin == false) {
			do {
				player1.enterChess();
				Start.ui.printChessBoard();
				ifWin = judge.judge();
				judge.result();
				if (ifWin == true) {
					Back();
					System.exit(0);
				}
				ifBack = Start.ui.ifBack();
				Start.ui.printChessBoard();
			} while (ifBack == true);
			Board.setNumberOfChess();
			if (Board.getNumberOfChess() == 226) {
				System.out.println("\nno one wins!");
				break;
			}
			do {
				player2.enterChess();
				Start.ui.printChessBoard();
				ifWin = judge.judge();
				judge.result();
				if (ifWin == true) {
					Back();
					System.exit(0);
				}
				ifBack = Start.ui.ifBack();
				Start.ui.printChessBoard();
			} while (ifBack == true);
			Board.setNumberOfChess();
		}
		Back();
	}

	private void PvP() {
		Start.ui.printMessage("enter p1 name");
		String name1 = input.nextLine();
		player1 = new HumanPlayer(name1, 1);
		Start.ui.printMessage("enter p2 name");
		String name2 = input.nextLine();
		player2 = new HumanPlayer(name2, 2);
	}

	void PvP1() {
		PvP();
		judge = new GomokuRule();
	}

	void PvP2() {
		PvP();
		judge = new RenjuRule();
	}

	private void PvE() {
		Start.ui.printMessage("p1 is H or AI?");
		boolean ifCorrect = false;
		do {
			String p1 = input.nextLine();
			if (p1.equals("H")) {
				Start.ui.printMessage("enter p1 name");
				String name1 = input.nextLine();
				player1 = new HumanPlayer(name1, 1);
				ifCorrect = true;
			} else if (p1.equals("AI")) {
				player1 = new AIPlayer("AI", 1);
				ifCorrect = true;
			} else {
				Start.ui.printMessage("invalid input");
				ifCorrect = false;
			}
		} while (ifCorrect == false);

		Start.ui.printMessage("p2 is H or AI?");
		do {
			String p2 = input.nextLine();
			if (p2.equals("H")) {
				Start.ui.printMessage("enter p2 name");
				String name2 = input.nextLine();
				player2 = new HumanPlayer(name2, 2);
				ifCorrect = true;
			} else if (p2.equals("AI")) {
				player2 = new AIPlayer("AI", 2);
				ifCorrect = true;
			} else {
				Start.ui.printMessage("invalid input");
				ifCorrect = false;
			}
		} while (ifCorrect == false);
	}

	void PvE1() {
		PvE();
		judge = new GomokuRule();
	}

	void PvE2() {
		PvE();
		judge = new RenjuRule();
	}

	void Back() {
		Record manual = new Record();
		manual.getManual();
	}
}
