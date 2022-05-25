package unseen;

public class Board {
	
	private static int numberOfChess = 1;
	public static Chess[] chess = new Chess[226];
	private static int[][] location = new int[15][15];
	
	public void resetChessBoard() {
		for (int a = 0; a < 15; a++) {
			for (int b = 0; b < 15; b++) {
				location[a][b] = 0;
			}
		}
	}

	public static int getLocation(int 	a, int b) {
		return location[a][b];
	}

	//public static void resetLocation(int a, int b) {
		//location[a][b] = 0;
	//}
	
	public static void setLocation(int a, int b,int c) {
		location[a][b] = c;
	}
	public static void setChess(int a,int x,int y, int c) {
		chess[a].setX(x);
		chess[a].setY(y);
		chess[a].setC(c);
	}


	public void resetChess() {
		for (int i = 0; i < 226; i++) {
			chess[i] = new Chess();
			chess[i].setX(0);
			chess[i].setY(0);
			chess[i].setC(0);
		}
	}

	// 棋子数相关方法
	public static int getNumberOfChess() {
		return numberOfChess;
	}

	public void resetNumberOfChess() {
		numberOfChess = 1;
	}

	public static void setNumberOfChess() {
		numberOfChess++;
	}
	
}
