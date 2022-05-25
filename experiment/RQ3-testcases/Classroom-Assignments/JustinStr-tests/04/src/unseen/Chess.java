package unseen;

public class Chess {
	//private static int ChessForPlayer1 = 1;// " ¡ñ"
	//private static int ChessForPlayer2 = 2;// " ¡ð"
	//private static int ChessForNull = 0;// " `"

	private int x = 0;
	private int y = 0;
	private int colour = 0;

	public Chess() {
		this.x = this.getX();
		this.y = this.getY();
		this.colour = this.getC();
	}

	public void resetChess() {
		this.x = 0;
		this.y = 0;
		this.colour = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int p) {
		this.x = p;
	}

	public int getY() {
		return y;
	}

	public void setY(int p) {
		this.y = p;
	}

	public int getC() {
		return colour;
	}

	public void setC(int p) {
		colour = p;
	}



}