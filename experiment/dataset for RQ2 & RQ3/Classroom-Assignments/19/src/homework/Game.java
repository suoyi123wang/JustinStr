package homework;

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

	public static Game create(Player playerOne, Player playerTwo, Rule rule) {
		return new Game(playerOne, playerTwo, new Board(), rule);
	}

	public void start() {
		Record record = new Record();
		while (true) {
			boolean win;
			Stone stone;
			Player one = this.getPlayerOne();
			stone = one.nextStone(board);
			board.placeStone(stone);
			record.placeStone(stone);
			win = this.getJudge().judge(stone, this.getBoard());
			UI.paintBoard(this.getBoard());
			if (win) {
				if (judge.isFull(board)) {
					System.out.println("和棋");
				} else {
					System.out.println("黑方胜利");
				}
				break;
			}

			Player two = this.getPlayerTwo();
			stone = two.nextStone(board);
			board.placeStone(stone);
			record.placeStone(stone);
			win = this.getJudge().judge(stone, this.getBoard());
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
		record.print();
	}
}
