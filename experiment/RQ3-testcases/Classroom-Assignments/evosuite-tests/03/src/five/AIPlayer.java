package five;

public class AIPlayer extends Player {

	public int row, line;
	public int chess;

	public AIPlayer(int chess, String player) {
		this.chess = chess;
		this.player = player;
	}

	public void getPosition() {
		int max = -1;
		for (int i = 1; i <= 15; i++)
			for (int j = 1; j <= 15; j++) {
				if (!Board.board[0][i][j]) {
					int tem = value(trans(chess, i, j)) / 3
							+ value(trans(3 - chess, i, j)) + base(i, j);
					if (tem > max) {
						max = tem;
						row = i;
						line = j;
					}
				}
			}
	}

	public int base(int row, int line) {
		if (row > 8)
			row = 16 - row;
		if (line > 8)
			line = 16 - line;
		return row * line / 10;
	}

	public int getRow() {
		return row;
	}

	public int getLine() {
		return line;
	}

	public String[] trans(int player, int thisRow, int thisLine) {
		StringBuilder row = new StringBuilder("B");
		StringBuilder line = new StringBuilder("B");
		StringBuilder diag = new StringBuilder("B");
		StringBuilder backDiag = new StringBuilder("B");
		for (int i = 1; i <= 15; i++) {
			if (Board.board[player][thisRow][i])
				row.append("R");
			else if (Board.board[3 - player][thisRow][i])
				row.append("W");
			else if (i == thisLine)
				row.append("T");
			else
				row.append("N");
			if (Board.board[player][i][thisLine])
				line.append("R");
			else if (Board.board[3 - player][i][thisLine])
				line.append("W");
			else if (i == thisRow)
				line.append("T");
			else
				line.append("N");
			try {
				if (Board.board[player][thisRow + thisLine - i][i])
					diag.append("R");
				else if (Board.board[3 - player][thisRow + thisLine - i][i])
					diag.append("W");
				else if (i == thisLine)
					diag.append("T");
				else if (thisRow + thisLine - i != 0)
					diag.append("N");
			} catch (Exception e) {
			}
			try {
				if (Board.board[player][thisRow - thisLine + i][i])
					backDiag.append("R");
				else if (Board.board[3 - player][thisRow - thisLine + i][i])
					backDiag.append("W");
				else if (i == thisLine)
					backDiag.append("T");
				else if (thisRow - thisLine + i != 0)
					backDiag.append("N");
			} catch (Exception e) {
			}
		}
		row.append("B");
		line.append("B");
		diag.append("B");
		backDiag.append("B");
		String[] lines = new String[4];
		lines[0] = row.toString();
		lines[1] = line.toString();
		lines[2] = diag.toString();
		lines[3] = backDiag.toString();
		return lines;
	}

	public int value(String[] lines) {
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			if (lines[i].matches(".*[WT][WT][WT][WT][WT].*")) {
				sum += 50000000;
			}
			if (lines[i].matches(".*N[WT][WT][WT][WT]N.*")) {
				sum += 500000;

			}
			if (lines[i].matches(".*R[WT][WT][WT][WT]N.*")) {
				sum += 16384;
			}
			if (lines[i].matches(".*N[WT][WT][WT][WT]R.*")) {
				sum += 16384;
			}
			if (lines[i].matches(".*[WT]N[WT][WT][WT].*")) {
				sum += 16384;
			}
			if (lines[i].matches(".*[WT][WT][WT]N[WT].*")) {
				sum += 16384;
			}
			if (lines[i].matches(".*[WT][WT]N[WT][WT].*")) {
				sum += 16384;
			}
			if ((lines[i].matches(".*WTNWW.*") && lines[i].matches(".*WWNWT.*"))
					|| (lines[i].matches(".*TWNWW.*") && lines[i]
							.matches(".*WWNTW.*"))) {
				sum += 16384;
			}
			if (lines[i].matches(".*NN[WT][WT][WT]N.*")) {
				sum += 8192;
			}
			if (lines[i].matches(".*N[WT][WT][WT]NN.*")) {
				sum += 8192;
			}
			if (lines[i].matches(".*N[WT]N[WT][WT]N.*")) {
				sum += 8192;
			}
			if (lines[i].matches(".*N[WT][WT]N[WT]N.*")) {
				sum += 8192;
			}
			if (lines[i].matches(".*N[WT][WT][WT]NR.*")) {
				sum += 4096;
			}
			if (lines[i].matches(".*RN[WT][WT][WT]N.*")) {
				sum += 4096;
			}
			if (lines[i].matches(".*NN[WT][WT][WT]R.*")) {
				sum += 4096;
			}
			if (lines[i].matches(".*R[WT][WT][WT]NN.*")) {
				sum += 4096;
			}
			if (lines[i].matches(".*N[WT]N[WT][WT]R.*")) {
				sum += 2048;
			}
			if (lines[i].matches(".*R[WT][WT]N[WT]N.*")) {
				sum += 2048;
			}
			if (lines[i].matches(".*N[WT][WT]N[WT]R.*")) {
				sum += 2048;
			}
			if (lines[i].matches(".*R[WT]N[WT][WT]N.*")) {
				sum += 2048;
			}
			if (lines[i].matches(".*N[WT]N[WT]N.*")) {
				sum += 1024;
			}
			if (lines[i].matches(".*NNN[WT][WT].*")) {
				sum += 512;
			}
			if (lines[i].matches(".*[WT][WT]NNN.*")) {
				sum += 512;
			}
			if (lines[i].matches(".*N[WT][WT]NN.*")) {
				sum += 512;
			}
			if (lines[i].matches(".*NN[WT][WT]N.*")) {
				sum += 512;
			}
			if (lines[i].matches(".*NN[WT]N[WT].*")) {
				sum += 256;
			}
			if (lines[i].matches(".*[WT]N[WT]NN.*")) {
				sum += 256;
			}
			if (lines[i].matches(".*N[WT]NN[WT].*")) {
				sum += 128;
			}
			if (lines[i].matches(".*[WT]NN[WT]N.*")) {
				sum += 128;
			}
			if (lines[i].matches(".*NNNN[WT].*")) {
				sum += 64;
			}
			if (lines[i].matches(".*[WT]NNNN.*")) {
				sum += 64;
			}
			if (lines[i].matches(".*NNN[WT]N.*")) {
				sum += 64;
			}
			if (lines[i].matches(".*N[WT]NNN.*")) {
				sum += 64;
			}
			if (lines[i].matches(".*NN[WT]NN.*")) {
				sum += 64;
			}
		}
		return sum;
	}

}
