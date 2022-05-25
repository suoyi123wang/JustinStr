package Play;

public class Stone {
	public static final int BLACK = 1;
    public static final int WHITE = 2;
	public static final int EMPTY = 0;
	private int x;
	private int y;
	private int color;
	private String Color;

	
	public Stone(int x, int y, int color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public static Stone setStone(int x,int y,int color){
		
		return new Stone(x,y,color);
	}

	
	public String getCircle() {
		
		switch (this.color) {
		case BLACK:
			this.Color = "¡ñ";
			break;
		case WHITE:
			this.Color = "¡ð";
			break;
		case EMPTY:
			this.Color = "+";
		}
		return Color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getcolor() {
		return color;
	}
	
	
}
