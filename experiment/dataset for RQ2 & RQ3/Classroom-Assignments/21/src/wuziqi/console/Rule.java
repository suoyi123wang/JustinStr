package wuziqi.console;

public abstract class Rule {
	
	protected abstract int isvictory(String[][] board);

	protected abstract int forbidden_chess_input_longconnection(Chess inputChess,String[][] board);
	protected abstract int forbidden_chess_input_44(Chess inputChess, String[][] board) ;
	public abstract boolean forbiddeninput(Chess inputChess, String[][] board);
	
	public boolean legalinput(int x,int y) {
		boolean islegal = false;
		
		if (x <= 14 && x >= 0 && y <= 14 && y >= 0) {
			islegal = true;
		} else {
			islegal = false;
		}
		return islegal;
	}

	public boolean islegaltoadd(int x, int y, String[][] board) { // 判断下子位置是否为空
		boolean cando = false;
		
		if (board[x][y].equals("+ ")) {
			cando = true;
		} else {
			cando = false;
		}
		return cando;
	}
	

}
