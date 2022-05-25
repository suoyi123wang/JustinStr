package renju;

import java.io.FileNotFoundException;

public class Game {
	// private Input input;
	private Player playerOne;
	private Player playerTwo;
	private Rule judge;
	private Board board;

	// getInput , setInput
	public Player getPlayerOne() {
		return playerOne;
	}

	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}

	public Player getPlayerTwo() {
		return playerTwo;
	}

	public void setPlayerTwo(Player playerTwo) {
		this.playerTwo = playerTwo;
	}

	public Rule getJudge() {
		return judge;
	}

	private void setJudge(Rule judge) {
		this.judge = judge;
	}

	public Board getBoard() {
		return board;
	}

	private void setBoard(Board board) {
		this.board = board;
	}

	// private Game(Player input,Board board, Judge judge)
	private Game(Player playerOne, Player playerTwo, Board board, Rule judge) {
		this.setPlayerOne(playerOne);
		this.setPlayerTwo(playerTwo);
		this.setBoard(board);
		this.setJudge(judge);
	}

	public static Game create(Player playerOne, Player playerTwo) {
		return new Game(playerOne, playerTwo, new Board(), new Rule());
	}

	public void start() throws FileNotFoundException {
		Record record = new Record();
		while (true) {
			boolean win;
			Stone stone;
			Player one = this.getPlayerOne();
			stone = one.nextStone(board);
			board.placeStone(stone);
			record.placeStone(stone);
			win = this.getJudge().judge1(stone, this.getBoard());
			UI.paintBoard(this.getBoard());
			if (win) {
				if (judge.isFull(board)) {
					System.out.println("和棋");
				} else {
					System.out.println("黑方胜利");
				}
				break;
			}
			if (one instanceof HumanPlayer) {
				UI.writeLine("是否悔棋？ YorN");
				String answer = UI.readLine();
				if (answer.equals("Y")) {
					UI.undo(stone);
					UI.paintBoard(this.getBoard());
					UI.writeLine("悔棋成功");
					stone = one.nextStone(board);
					board.placeStone(stone);
					record.placeStone(stone);
					win = this.getJudge().judge1(stone, this.getBoard());
					UI.paintBoard(this.getBoard());
					if (win) {
						if (judge.isFull(board)) {
							System.out.println("和棋");
						} else {
							System.out.println("黑方胜利");
						}
						break;
					}
				}
			}
			Player two = this.getPlayerTwo();
			stone = two.nextStone(board);
			board.placeStone(stone);
			record.placeStone(stone);
			win = this.getJudge().judge1(stone, this.getBoard());
			UI.paintBoard(this.getBoard());
			if (win) {
				if (judge.isFull(board)) {
					System.out.println("和棋");
				} else {
					System.out.println("白方胜利");
				}
				break;
			}
			if (two instanceof HumanPlayer) {
				UI.writeLine("是否悔棋？ YorN");
				String answer = UI.readLine();
				if (answer.equals("Y")) {
					UI.undo(stone);
					UI.paintBoard(this.getBoard());
					UI.writeLine("悔棋成功");
					stone = two.nextStone(board);
					board.placeStone(stone);
					record.placeStone(stone);
					win = this.getJudge().judge1(stone, this.getBoard());
					UI.paintBoard(this.getBoard());
					if (win) {
						if (judge.isFull(board)) {
							System.out.println("和棋");
						} else {
							System.out.println("白方胜利");
						}
						break;
					}
				}
			}
		}
		record.print();
		record.save();
	}
}
