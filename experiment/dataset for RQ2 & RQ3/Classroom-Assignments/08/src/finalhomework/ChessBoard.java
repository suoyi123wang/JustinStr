package finalhomework;

public class ChessBoard {
	String[][] printChessboard = {
			{ "   ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ",
					" 9 ", " 10", " 11", " 12", " 13", " 14", " 15" },
			{ " A ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " B ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " C ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " D ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " E ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " F ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " G ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " H ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " I ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " J ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " K ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " L ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " M ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " N ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " },
			{ " O ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ",
					" + ", " + ", " + ", " + ", " + ", " + ", " + " } };
	int[][] chessBoardInt = new int[15][15];

	public boolean superposition(Stone stone) {
		if (chessBoardInt[stone.getY() - 1][stone.getX() - 1] != 0) {
			return true;
		} else
			return false;

	}

	public void addStone(Stone stone, int count) {
		if (count % 2 == 0) {
			chessBoardInt[stone.getY() - 1][stone.getX() - 1] = 1;
			printChessboard[stone.getX()][stone.getY()] = " B ";
		} else {
			chessBoardInt[stone.getY() - 1][stone.getX() - 1] = 2;
			printChessboard[stone.getX()][stone.getY()] = " W ";
		}
	}

	public void regret(int[][] a) {
		chessBoardInt[a[0][1] - 1][a[0][0] - 1] = 0;
		chessBoardInt[a[1][1] - 1][a[1][0] - 1] = 0;
		printChessboard[a[0][0]][a[0][1]] = " + ";
		printChessboard[a[1][0]][a[1][1]] = " + ";
	}

	public String printChessboard() {

		// change array to string, convenient to print.
		String chessboardsString = "";
		int i = 0;
		while (i < 16) {
			int j = 0;
			while (j < 16) {
				chessboardsString = chessboardsString + printChessboard[j][i];
				j++;
			}
			chessboardsString = chessboardsString + "\n";
			i++;
		}
		return chessboardsString;
	}

	public boolean outBoard(Stone stone) {
		if (stone.getX() <= 0 || stone.getX() > 15 || stone.getY() <= 0
				|| stone.getY() > 15) {
			return true;
		}
		return false;
	}
}
