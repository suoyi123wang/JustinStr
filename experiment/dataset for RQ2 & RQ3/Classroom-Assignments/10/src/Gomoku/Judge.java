package Gomoku;

public class Judge {
	int i = 0;
	int j = 0;
	String[][] piece = new String[15][15];
	{
		while (i < 15) {
			while (j < 15) {
				piece[i][j] = "Z0A";
				j++;
			}
			i++;
			j = 0;
		}
	}

	public boolean IsHang(String a) {
		int b1 = Piece.Hang(a);
		int b2 = Piece.List(a);
		String b3 = Piece.Color(a);
		String b;
		String c;
		boolean h = true;
		boolean result = false;
		int i = 1;
		int j = 1;
		int k = 1;
		while (j < 5 && h == true && j + b2 +1< 15) {
			b = piece[b1-1][b2-1 + j];
			c = Piece.Color(b);
			if (c.equals(b3)) {
				i++;
			} else {
				h = false;
			}
			j++;
		}
		h=true;
		if (i == 5) {
			result = true;
		} else {
			while (k < 5 && h == true && b2 - k -1>= 0) {
				b = piece[b1-1][b2-1 - k];
				c = Piece.Color(b);
				if (c.equals(b3)) {
					i++;
				} else {
					h = false;
				}
				k++;
			}
			if (i > 4) {
				result = true;
			}
		}
		return result;
	}

	public boolean IsList(String a) {
		int b1 = Piece.Hang(a);
		int b2 = Piece.List(a);
		String b3 = Piece.Color(a);
		String b;
		String c;
		boolean h = true;
		boolean result = false;
		int i = 0;
		int j = 1;
		int k = 1;
		while (j < 5 && h == true && b1 + j+1 < 15) {
			b = piece[b1-1 + j][b2-1];
			c = Piece.Color(b);
			if (c.equals(b3)) {
				i++;
			} else {
				h = false;
			}
			j++;
		}
		h = true;
		if (i == 5) {
			result = true;
		} else {
			while (k < 5 && h == true && b1 - k-1 >= 0) {
				b = piece[b1-1 - k][b2-1];
				c = Piece.Color(b);
				if (c.equals(b3)) {
					i++;
				} else {
					h = false;
				}
				k++;
			}
			if (i > 4) {
				result = true;
			}
		}
		return result;
	}

	public boolean IsLean1(String a) {
		int b1 = Piece.Hang(a);
		int b2 = Piece.List(a);
		String b3 = Piece.Color(a);
		String b;
		String c;
		boolean h = true;
		boolean result = false;
		int i = 0;
		int j = 1;
		int k = 1;
		while (j < 5 && h == true && b1 + j +1< 15 && b2 + j +1< 15) {
			b = piece[b1 -1+ j][b2 -1+ j];
			c = Piece.Color(b);
			if (c.equals(b3)) {
				i++;
			} else {
				h = false;
			}
			j++;
		}
		h = true;
		if (i == 5) {
			result = true;
		} else {
			while (k < 5 && h == true && b1 - k -1>= 0 && b2 - k-1 >= 0) {
				b = piece[b1 -1- k][b2 -1- k];
				c = Piece.Color(b);
				if (c.equals(b3)) {
					i++;
				} else {
					h = false;
				}
				k++;
			}
			if (i > 4) {
				result = true;
			}
		}
		return result;
	}

	public boolean IsLean2(String a) {
		int b1 = Piece.Hang(a);
		int b2 = Piece.List(a);
		String b3 = Piece.Color(a);
		String b;
		String c;
		boolean h = true;
		boolean result = false;
		int i = 0;
		int j = 1;
		int k = 1;
		while (j < 5 && h == true && b1 + j +1< 15 && b2 - j -1>=0) {
			b = piece[b1 -1+ j][b2 -1- j];
			c = Piece.Color(b);
			if (c.equals(b3)) {
				i++;
			} else {
				h = false;
			}
			j++;
		}
		h = true;
		if (i == 5) {
			result = true;
		} else {
			while (k < 5 && h == true && b1 - k -1>= 0 && b2 + k+1 <15) {
				b = piece[b1 -1- k][b2 -1+ k];
				c = Piece.Color(b);
				if (c.equals(b3)) {
					i++;
				} else {
					h = false;
				}
				k++;
			}
			if (i > 4) {
				result = true;
			}
		}
		return result;
	}
}
