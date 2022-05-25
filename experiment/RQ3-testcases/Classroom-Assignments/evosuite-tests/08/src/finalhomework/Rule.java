package finalhomework;

public abstract class Rule {
	private int a, b;

	public boolean isWin(Stone stone, int[][] A) {

		boolean line1 = false, line2 = false, line3 = false, line4 = false;
		b = stone.getX()-1;
		a = stone.getY()-1;

		// check whether win.
		boolean out1, out2;
		int count = 1;
		int count1 = 1;
		int count2 = 1;

		// line1
		while (count < 5) {
			count = count1 + count2 - 1;
			out1 = !(a - count1 > 0);
			out2 = !(a + count2 < 15);
			if (!out1 && A[a - count1][b] == A[a][b]) {
				count1++;
			} else if (!out2 && A[a + count2][b] == A[a][b]) {
				count2++;
			} else {
				break;
			}
		}
		if (count == 5) {
			line1 = true;
		}

		// line2
		count = 1;
		count1 = 1;
		count2 = 1;
		while (count < 5) {
			count = count1 + count2 - 1;
			out1 = !(a - count1 > 0 && b - count1 > 0);
			out2 = !(a + count1 <15 && b + count2 < 15);
			if (!out1 && A[a - count1][b - count1] == A[a][b]) {
				count1++;
			} else if (!out2 && A[a + count2][b + count2] == A[a][b]) {
				count2++;
			} else {
				break;
			}
		}
		if (count == 5) {
			line2 = true;
		}

		// line3
		count = 1;
		count1 = 1;
		count2 = 1;
		while (count < 5) {
			count = count1 + count2 - 1;
			out1 = !(b - count1 > 0);
			out2 = !(b + count2 <15);
			if (!out1 && A[a][b - count1] == A[a][b]) {
				count1++;
			} else if (!out2 && A[a][b + count2] == A[a][b]) {
				count2++;
			} else {
				break;
			}
		}
		if (count == 5) {
			line3 = true;
		}

		// line4
		count = 1;
		count1 = 1;
		count2 = 1;
		while (count < 5) {
			count = count1 + count2 - 1;
			out1 = !(a - count1 > 0 && b + count1 <15);
			out2 = !(a + count2 <15 && b - count2 > 0);
			if (!out1 && A[a - count1][b + count1] == A[a][b]) {
				count1++;
			} else if (!out2 && A[a + count2][b - count2] == A[a][b]) {
				count2++;
			} else {
				break;
			}
		}
		if (count == 5) {
			line4 = true;
		}
		if (line1 || line2 || line3 || line4)
			return true;
		else
			return false;
	}

	public abstract boolean forbidden(Stone stone, int[][] A, int c);

}
