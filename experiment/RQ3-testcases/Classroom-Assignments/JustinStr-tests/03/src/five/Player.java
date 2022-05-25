package five;

public abstract class Player {

	public String player = new String();
	public int color;
	protected Board board = new Board();

	public void putChess(int player, int row, int line){
		board.putChess(player, row, line);
	}

	public void moveChess() {
		board.moveChess(2);
	}

	public abstract int getRow();

	public abstract int getLine();

	public abstract void getPosition();

}
