package wuziqi;

public class AIPlayer extends Player {
	private byte x;
	private byte y;

	boolean setPosition(Element[][] a,String input) {
		boolean cont = true;
		while (cont) {
			x = (byte) (15 * Math.random());
			y = (byte) (15 * Math.random());
			if (Main.M[x][y].color.equals("0")) {
				cont = false;
			}
		}
		return false;
	}

	byte getX() {
		return x;
	}

	byte getY() {
		return y;
	}


}
