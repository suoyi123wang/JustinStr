package Play;
import Play.Stone;
public class Board {
	public static final int EMPTY = 0;
	public static final int BLACE = 1;
	public static final int WHITE = 2;
	public int x;
	public int y;
	public int color;
	Stone stone = new Stone(x,y,color);
	public static final int Length = 15;
	public static final int Width = 15;
	private static Stone[][] board = new Stone[Width][Length];

	public static void boardInitialize() {
		for (int i = 0; i < Width; i = i + 1) {
			for (int j = 0; j < Length; j = j + 1) {
				getBoard()[i][j] = new Stone(i,j,EMPTY);
			}
		}
	}

	public static void putOnBoard(Stone c) {
		getBoard()[c.getX() - 1][c.getY() - 1] = new Stone(c.getX()-1,c.getY()-1,c.getcolor());
	}

	public static void regret(Stone c) {
		getBoard()[c.getX() - 1][c.getY() - 1] = new Stone(c.getX()-1,c.getY()-1,EMPTY);
	}

	public static boolean isFull() {
		boolean isfull = true;
		for (int i = 0; i < Length; i = i + 1) {
			for (int j = 0; j < Width; j = j + 1) {
				if (getBoard()[i][j].getcolor() == EMPTY) {
					isfull = false;
				}
			}
		}
		return isfull;
	}
	
	
	public static Stone[][] getBoard() {
		return board;
	}

	public static void setBoard(Stone[][] board) {
		Board.board = board;
	}

}
