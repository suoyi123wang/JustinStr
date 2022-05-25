package finalhomework;

public class RenjuRule extends Rule {
	int x, y;

	int[][] A = new int[15][15];

	@Override
	public boolean forbidden(Stone stones, int[][] B, int c) {
		boolean isForbidden = false;
		y = stones.getX() - 1;
		x = stones.getY() - 1;
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				A[i][j] = B[i][j];
			}
		}

		if (c % 2 == 1) {
			// white has no disallowed moves.
			return false;
		} else {
			// check black's disallowed moves.

			// disallowed moves--double three and double four.
			int liveNumber = 0;
			// line1
			int k = 1, l = 1;
			while (k < 5 && x - k >= 0 && A[x - k][y] != 2) {
				k++;
			}
			while (l < 5 && x + l < 15 && A[x + l][y] != 2) {
				l++;
			}
			int[] line1 = new int[k + l - 1];
			for (int m = 0; m < line1.length; m++) {
				if (m - k + 1 == 0) {
					line1[m] = 1;
				} else {
					line1[m] = A[x - k + 1 + m][y];
				}
			}
			liveNumber = liveNumber + isLive(line1);

			// line2
			k = 1;
			l = 1;
			while (k < 5 && y - k >= 0 && A[x][y - k] != 2) {
				k++;
			}
			while (l < 5 && y + l < 15 && A[x][y + l] != 2) {
				l++;
			}
			int[] line2 = new int[l + k - 1];
			for (int m = 0; m < line2.length; m++) {
				if (m - k + 1 == 0) {
					line2[m] = 1;
				} else {
					line2[m] = A[x][y - k + 1 + m];
				}

			}
			liveNumber = liveNumber + isLive(line2);

			// line3
			k = 1;
			l = 1;
			while (k < 5 && y - k >= 0 && x - k >= 0 && A[x - k][y - k] != 2) {
				k++;
			}
			while (l < 5 && y + l < 15 && x + l < 15 && A[x + l][y + l] != 2) {
				l++;
			}
			int[] line3 = new int[l + k - 1];
			for (int m = 0; m < line3.length; m++) {
				if (m - k + 1 == 0) {
					line3[m] = 1;
				} else {
					line3[m] = A[x - k + 1 + m][y - k + 1 + m];
				}
			}
			liveNumber = liveNumber + isLive(line3);

			// line4
			k = 1;
			l = 1;
			while (k < 5 && y - k >= 0 && x + k < 15 && A[x + k][y - k] != 2) {
				k++;
			}
			while (l < 5 && y + l < 15 && x - l >= 0 && A[x - l][y + l] != 2) {
				l++;
			}
			int[] line4 = new int[l + k - 1];
			for (int m = 0; m < line4.length; m++) {
				if (m - k + 1 == 0) {
					line4[m] = 1;
				} else {
					line4[m] = A[x + k - 1 - m][y - k + 1 + m];
				}
			}
			liveNumber = liveNumber + isLive(line4);

			if (liveNumber != 0 && liveNumber != 1 && liveNumber != 11
					&& liveNumber != 10 && liveNumber != 100) {
				isForbidden = true;
			}

			// check disallowed moves--overline.
			A[x][y] = (c % 2 == 0) ? 1 : 2;
			boolean out1, out2;
			int count0, count1, count2;

			// line1
			count0 = 1;
			count1 = 1;
			count2 = 1;
			while (count0 <= 15) {
				count0 = count1 + count2 - 1;
				out1 = !(x - count1 >= 0);
				out2 = !(x + count2 < 15);
				if (!out1 && A[x - count1][y] == A[x][y]) {
					count1++;
				} else if (!out2 && A[x + count2][y] == A[x][y]) {
					count2++;
				} else {
					break;
				}
			}
			if (count0 > 5)
				isForbidden = true;

			// line2
			count0 = 1;
			count1 = 1;
			count2 = 1;
			while (count0 <= 15) {
				count0 = count1 + count2 - 1;
				out1 = !(x - count1 >= 0 && y - count1 >= 0);
				out2 = !(x + count1 < 15 && y + count2 < 15);
				if (!out1 && A[x - count1][y - count1] == A[x][y]) {
					count1++;
				} else if (!out2 && A[x + count2][y + count2] == A[x][y]) {
					count2++;
				} else {
					break;
				}
			}
			if (count0 > 5)
				isForbidden = true;

			// line3
			count0 = 1;
			count1 = 1;
			count2 = 1;
			while (count0 <= 15) {
				count0 = count1 + count2 - 1;
				out1 = !(y - count1 >= 0);
				out2 = !(y + count2 < 15);
				if (!out1 && A[x][y - count1] == A[x][y]) {
					count1++;
				} else if (!out2 && A[x][y + count2] == A[x][y]) {
					count2++;
				} else {
					break;
				}
			}
			if (count0 > 5)
				isForbidden = true;

			// line4
			count0 = 1;
			count1 = 1;
			count2 = 1;
			while (count0 <= 15) {
				count0 = count1 + count2 - 1;
				out1 = !(x - count1 >= 0 && y + count1 < 15);
				out2 = !(x + count2 < 15 && y - count2 >= 0);
				if (!out1 && A[x - count1][y + count1] == A[x][y]) {
					count1++;
				} else if (!out2 && A[x + count2][y - count2] == A[x][y]) {
					count2++;
				} else {
					break;
				}
			}
			if (count0 > 5)
				isForbidden = true;
		}

		return isForbidden;
	}

	// check this direction whether to be live 3 or live 4.
	private int isLive(int[] line) {
		if (line.length < 5) {
			return 0;
		} else if (line.length == 5) {
			if (match(line, new int[] { 0, 1, 1, 1, 0 })) {
				return 1;
			} else if (match(line, new int[] { 1, 1, 1, 1, 0 })
					|| match(line, new int[] { 0, 1, 1, 1, 1 })
					|| match(line, new int[] { 1, 1, 1, 0, 1 })
					|| match(line, new int[] { 1, 1, 0, 1, 1 })
					|| match(line, new int[] { 1, 0, 1, 1, 1 })) {
				return 10;
			}
		} else if (line.length == 6) {
			int[][] cases = { { 0, 1, 1, 1, 0, 0 }, { 0, 1, 0, 1, 1, 0 },
					{ 0, 1, 1, 0, 1, 0 }, { 0, 0, 1, 1, 1, 0 },
					{ 1, 1, 1, 1, 0, 0 }, { 1, 1, 1, 0, 1, 0 },
					{ 1, 1, 0, 1, 1, 0 }, { 1, 0, 1, 1, 1, 0 },
					{ 0, 1, 1, 1, 0, 1 }, { 0, 1, 1, 0, 1, 1 },
					{ 0, 1, 0, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1 },

					{ 0, 1, 1, 1, 1, 0 } };

			if (match(line, cases[0]) || match(line, cases[1])
					|| match(line, cases[2]) || match(line, cases[3])
					|| match(line, cases[3])) {
				return 1;
			} else if (match(line, cases[4]) || match(line, cases[5])
					|| match(line, cases[6]) || match(line, cases[7])
					|| match(line, cases[8]) || match(line, cases[9])
					|| match(line, cases[10]) || match(line, cases[11])
					|| match(line, cases[12])) {
				return 10;
			}

		} else {
			int[][] cases0 = { { 0, 1, 0, 1, 1, 1, 0, 1, 0 },
					{ 1, 1, 0, 1, 1, 0, 1, 1, 0 },
					{ 0, 1, 1, 0, 1, 1, 0, 1, 1 },
					{ 1, 1, 1, 0, 1, 0, 1, 1, 1 } };

			if (line.length == 9
					&& (match(line, cases0[0]) || match(line, cases0[1])
							|| match(line, cases0[2]) || match(line, cases0[3]))) {
				return 1000;
			} else {

				int[] cutLine = new int[7];
				for (int j = 0; j < line.length - 6; j++) {
					for (int j2 = 0; j2 < cutLine.length; j2++) {
						cutLine[j2] = line[j + j2];
					}

					int[][] cases = { { 0, 1, 1, 1, 0, 0, 0 },
							{ 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 1, 1, 1, 0 },
							{ 0, 1, 0, 1, 1, 0, 0 }, { 0, 1, 1, 0, 1, 0, 0 },
							{ 0, 0, 1, 0, 1, 1, 0 }, { 0, 0, 1, 1, 0, 1, 0 },
							{ 0, 1, 1, 1, 1, 0, 0 }, { 0, 0, 1, 1, 1, 1, 0 },
							{ 0, 1, 0, 1, 1, 1, 0 }, { 0, 1, 1, 0, 1, 1, 0 },
							{ 0, 1, 1, 1, 0, 1, 0 }, { 1, 1, 1, 1, 0, 0, 0 },
							{ 1, 0, 1, 1, 1, 0, 0 }, { 1, 1, 0, 1, 1, 0, 0 },
							{ 1, 1, 1, 0, 1, 0, 0 }, { 0, 0, 0, 1, 1, 1, 1 },
							{ 0, 0, 1, 1, 1, 0, 1 }, { 0, 0, 1, 1, 1, 0, 1 },
							{ 0, 0, 1, 1, 0, 1, 1 } };

					if (match(cutLine, cases[0]) || match(cutLine, cases[1])
							|| match(cutLine, cases[2])
							|| match(cutLine, cases[3])
							|| match(cutLine, cases[4])
							|| match(cutLine, cases[5])
							|| match(cutLine, cases[6])) {
						return 1;

					} else if (match(cutLine, cases[7])
							|| match(cutLine, cases[8])) {
						return 100;
					} else if (match(cutLine, cases[9])
							|| match(cutLine, cases[10])
							|| match(cutLine, cases[11])) {
						return 10;
					} else {
						if ((match(cutLine, cases[12])
								|| match(cutLine, cases[13])
								|| match(cutLine, cases[14]) || match(cutLine,
									cases[15])) && j == 0) {
							return 10;
						} else if ((match(cutLine, cases[16])
								|| match(cutLine, cases[17])
								|| match(cutLine, cases[18]) || match(cutLine,
									cases[19])) && j == line.length - 7) {
							return 10;
						}
					}
				}
			}

		}
		return 0;
	}

	private boolean match(int[] cutLine, int[] is) {
		for (int i = 0; i < is.length; i++) {
			if (cutLine[i] != is[i]) {
				return false;
			}
		}
		return true;
	}

}
