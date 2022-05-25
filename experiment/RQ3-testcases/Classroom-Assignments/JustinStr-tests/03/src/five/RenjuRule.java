package five;

public class RenjuRule extends Rule {

	public RenjuRule() {
		Board.rule = "Renju";
	}

	public boolean isValid(int player, int thisRow, int thisLine) {
		if (player == 2)
			return !Board.board[0][thisRow][thisLine];
		StringBuilder row = new StringBuilder("W");
		StringBuilder line = new StringBuilder("W");
		StringBuilder diag = new StringBuilder("W");
		StringBuilder backDiag = new StringBuilder("W");
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
				else
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
				else
					backDiag.append("N");
			} catch (Exception e) {
			}
		}
		row.append("W");
		line.append("W");
		diag.append("W");
		backDiag.append("W");
		String[] lines = new String[4];
		lines[0] = row.toString();
		lines[1] = line.toString();
		lines[2] = diag.toString();
		lines[3] = backDiag.toString();
		return !Board.board[0][thisRow][thisLine] && doubleThree(lines)
				&& doubleFour(lines) && longLink(lines);
	}

	public boolean doubleThree(String[] lines) {
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			if (lines[i].matches(".*NNTRRN.*"))
				sum++;
			if (lines[i].matches(".*NNRTRN.*"))
				sum++;
			if (lines[i].matches(".*NNRRTN.*"))
				sum++;
			if (lines[i].matches(".*NTNRRN.*"))
				sum++;
			if (lines[i].matches(".*NRNTRN.*"))
				sum++;
			if (lines[i].matches(".*NRNRTN.*"))
				sum++;
			if (lines[i].matches(".*NTRNRN.*"))
				sum++;
			if (lines[i].matches(".*NRTNRN.*"))
				sum++;
			if (lines[i].matches(".*NRRNTN.*"))
				sum++;
			if (lines[i].matches(".*NTRRNN.*"))
				sum++;
			if (lines[i].matches(".*NRTRNN.*"))
				sum++;
			if (lines[i].matches(".*NRRTNN.*"))
				sum++;
		}
		if (sum >= 2)
			return false;
		return true;
	}

	public boolean doubleFour(String[] lines) {
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			if (lines[i].matches(".*NTRRRN.*"))
				sum++;
			if (lines[i].matches(".*NRTRRN.*"))
				sum++;
			if (lines[i].matches(".*NRRTRN.*"))
				sum++;
			if (lines[i].matches(".*NRRRTN.*"))
				sum++;
			if (lines[i].matches(".*NTRRRW.*"))
				sum++;
			if (lines[i].matches(".*NRTRRW.*"))
				sum++;
			if (lines[i].matches(".*NRRTRW.*"))
				sum++;
			if (lines[i].matches(".*NRRRTW.*"))
				sum++;
			if (lines[i].matches(".*TNRRR.*"))
				sum++;
			if (lines[i].matches(".*RNTRR.*"))
				sum++;
			if (lines[i].matches(".*RNRTR.*"))
				sum++;
			if (lines[i].matches(".*RNRRT.*"))
				sum++;
			if (lines[i].matches(".*TRNRR.*"))
				sum++;
			if (lines[i].matches(".*RTNRR.*"))
				sum++;
			if (lines[i].matches(".*RRNTR.*"))
				sum++;
			if (lines[i].matches(".*RRNRT.*"))
				sum++;
			if (lines[i].matches(".*TRRNR.*"))
				sum++;
			if (lines[i].matches(".*RTRNR.*"))
				sum++;
			if (lines[i].matches(".*RRTNR.*"))
				sum++;
			if (lines[i].matches(".*RRRNT.*"))
				sum++;
			if (lines[i].matches(".*WTRRRN.*"))
				sum++;
			if (lines[i].matches(".*WRTRRN.*"))
				sum++;
			if (lines[i].matches(".*WRRTRN.*"))
				sum++;
			if (lines[i].matches(".*WRRRTN.*"))
				sum++;
		}
		if (sum >= 2)
			return false;
		return true;
	}

	public boolean longLink(String[] lines) {
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			if (lines[i].matches("TRRRRR") || lines[i].matches("RTRRRR")
					|| lines[i].matches("RRTRRR") || lines[i].matches("RRRTRR")
					|| lines[i].matches("RRRRTR") || lines[i].matches("RRRRRT"))
				sum++;
		}
		if (sum >= 1)
			return false;
		return true;
	}

}
