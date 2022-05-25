package five;

public class GomokuRule extends Rule {

	public GomokuRule() {
		Board.rule = "Gomoku";
	}

	public boolean isValid(int player, int row, int line) {
		return !Board.board[0][row][line];
	}

}
