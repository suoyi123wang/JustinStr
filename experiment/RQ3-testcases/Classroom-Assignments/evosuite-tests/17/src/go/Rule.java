package go;

import go.Board;
import go.Result;
import go.Stone;



public abstract class Rule {
	protected abstract boolean isForbidden(Stone currentStone, Stone[][] board);
	protected abstract boolean isWin(Stone currentStone , Stone[][] board);
	
	Stone stone =  new Stone(); 
	String rule;
	Player currentPlayer;

	private Board board;
	
	
	
	public Result judge(Stone currentStone, Stone[][] board) {
		if (this.isForbidden(currentStone, board) == false) {
			return Result.ILLEGAL;
		}
		if (this.isWin(currentStone, board)) {
			return Result.WIN;
		}
		if (this.isFull(board) == true) {
			return Result.DRAW;
		}
		return Result.NEXT;
		
	}

	public boolean isFull(Stone[][] board) {
		boolean full = true;
		int i = 0, j = 0;
		for (i = 0; i < 15; i++) {
			for (j = 0; j < 15; j++) {
				if (board[i][j] == null) {
					full = false;
				} else {
					full = true;
			    }
		    }
	    }
	return full;



}
}
