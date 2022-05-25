package finalhomework;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AIPlayer extends Player {
	int[][] scores = new int[15][15];
	int[][] focus = new int[5][5];
	int h, v;
	String finalline = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public Stone getStone(int[][] A, int a, int count0, Rule rule) {
		int[][] copyChessboard = new int[15][15];
		int count = count0;
		if (count == 0) {
			int x = (int) Math.random() * 3 + 7;
			int y = (int) Math.random() * 3 + 7;
			return new Stone(x, y);
		} else {
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++)
					if (A[i][j] == 0
							&& rule.forbidden(new Stone(j + 1, i + 1), A, count)) {
						copyChessboard[i][j] = -1;
					} else
						copyChessboard[i][j] = A[i][j];
			}
		}
		focus = new int[5][5];
		scores = new int[15][15];
		for (int n = 0; n < 2 * a - 1; n++) {

			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {

					if (copyChessboard[i][j] == 0
							&& !rule.forbidden(new Stone(j + 1, i + 1), A,
									count)) {
						for (int k = 0; k < 5; k++) {
							for (int l = 0; l < 5; l++) {
								if (i - k + l >= 0 && i - k + l < 15) {
									focus[k][l] = copyChessboard[i - k + l][j];
								} else {
									focus[k][l] = -1;
								}
							}
						}
						scores[i][j] = scores[i][j] + getScore(focus);

						for (int k = 0; k < 5; k++) {
							for (int l = 0; l < 5; l++) {
								if (j - k + l >= 0 && j - k + l < 15) {
									focus[k][l] = copyChessboard[i][j - k + l];
								} else {
									focus[k][l] = -1;
								}
							}
						}
						scores[i][j] = scores[i][j] + getScore(focus);

						for (int k = 0; k < 5; k++) {
							for (int l = 0; l < 5; l++) {
								if (j - k + l >= 0 && j - k + l < 15
										&& i - k + l >= 0 && i - k + l < 15) {
									focus[k][l] = copyChessboard[i - k + l][j
											- k + l];
								} else {
									focus[k][l] = -1;
								}
							}
						}
						scores[i][j] = scores[i][j] + getScore(focus);

						for (int k = 0; k < 5; k++) {
							for (int l = 0; l < 5; l++) {
								if (j - k + l >= 0 && j - k + l < 15
										&& i + k - l >= 0 && i + k - l < 15) {
									focus[k][l] = copyChessboard[i + k - l][j
											- k + l];
								} else {
									focus[k][l] = -1;
								}
							}
						}
						scores[i][j] = scores[i][j] + getScore(focus);

					} else
						scores[i][j] = -1;
				}

			}

			if (count % 2 == 0) {
				copyChessboard[Max(scores).getX() - 1][Max(scores).getY() - 1] = 1;
			} else {
				copyChessboard[Max(scores).getX() - 1][Max(scores).getY() - 1] = 2;
			}
			count++;
		}

		return Max(scores);
	}

	private int getScore(int[][] B) {
		int totalScore = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				B[j][j] = i;
				if (!(match(focus, j, -1) || match(focus, j, (i == 1) ? 2 : 1))) {
					if (B[j][0] == 0) {
						if (B[j][1] == 0) {
							if (B[j][2] == 0) {
								if (B[j][3] == 0) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 0;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 1;
									}
								} else if (B[j][3] == i) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 10;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 10;
									}
								}
							} else if (B[j][2] == i) {

								if (B[j][3] == 0) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 10;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 10;
									}
								} else if (B[j][3] == i) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 100;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 100;
									}
								}

							}
						} else if (B[j][1] == i) {

							if (B[j][2] == 0) {
								if (B[j][3] == 0) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 10;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 10;
									}
								} else if (B[j][3] == i) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 100;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 100;
									}
								}
							} else if (B[j][2] == i) {

								if (B[j][3] == 0) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 100;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 100;
									}
								} else if (B[j][3] == i) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 10000;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 100000;
									}
								}

							}

						}
					} else if (B[j][0] == i) {
						if (B[j][1] == 0) {
							if (B[j][2] == 0) {
								if (B[j][3] == 0) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 1;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 10;
									}
								} else if (B[j][3] == i) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 10;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 10;
									}
								}
							} else if (B[j][2] == i) {
								if (B[j][3] == 0) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 10;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 100;
									}
								} else if (B[j][3] == i) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 100;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 10000;
									}
								}
							}
						} else if (B[j][1] == i) {
							if (B[j][2] == 0) {
								if (B[j][3] == 0) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 10;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 100;
									}
								} else if (B[j][3] == i) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 100;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 10000;
									}
								}
							} else if (B[j][2] == i) {
								if (B[j][3] == 0) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 1000;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 10000;
									}
								} else if (B[j][3] == i) {
									if (B[j][4] == 0) {
										totalScore = totalScore + 100000;
									} else if (B[j][4] == i) {
										totalScore = totalScore + 1000000;
									}
								}
							}
						}
					}
				}
			}
		}
		return totalScore;
	}

	public Stone getStone1(int[][] A, int a, int count, Rule rule) {
		int[][] copyChessboard = new int[15][15];
		int count1 = count;
		if (count1 == 0) {
			int x = (int) Math.random() * 3 + 7;
			int y = (int) Math.random() * 3 + 7;
			return new Stone(x, y);
		} else {
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++)
					copyChessboard[i][j] = A[i][j];
			}
		}
		scores = new int[15][15];
		for (int n = 0; n < 2 * a - 1; n++) {

			for (int h = 0; h < 2; h++) {

				for (int i = 0; i < 15; i++) {
					for (int j = 0; j < 15; j++) {
						if (A[i][j] == 0
								&& !rule.forbidden(new Stone(j + 1, i + 1), A,
										count)) {

							// line1
							int k = 1, l = 1;
							while (k < 5
									&& i - k >= 0
									&& A[i - k][j] != (((count1 + h) % 2 == 0) ? 2
											: 1)) {
								k++;
							}
							while (l < 5
									&& i + l < 15
									&& A[i + l][j] != (((count1 + h) % 2 == 0) ? 2
											: 1)) {
								l++;
							}
							int[] line1 = new int[k + l - 1];
							for (int m = 0; m < line1.length; m++) {
								if (m - k + 1 == 0) {
									line1[m] = ((count1 + h) % 2 == 0) ? 1 : 2;
								} else {
									line1[m] = A[i - k + 1 + m][j];
								}
							}
							scores[i][j] = scores[i][j]
									+ getScore1(line1, (count1 + h), h);

							// line2
							k = 1;
							l = 1;
							while (k < 5
									&& j - k >= 0
									&& A[i][j - k] != (((count1 + h) % 2 == 0) ? 2
											: 1)) {
								k++;
							}
							while (l < 5
									&& j + l < 15
									&& A[i][j + l] != (((count1 + h) % 2 == 0) ? 2
											: 1)) {
								l++;
							}
							int[] line2 = new int[l + k - 1];
							for (int m = 0; m < line2.length; m++) {
								if (m - k + 1 == 0) {
									line2[m] = ((count1 + h) % 2 == 0) ? 1 : 2;
								} else {
									line2[m] = A[i][j - k + 1 + m];
								}

							}
							scores[i][j] = scores[i][j]
									+ getScore1(line2, (count1 + h), h);

							// line3
							k = 1;
							l = 1;
							while (k < 5
									&& j - k >= 0
									&& i - k >= 0
									&& A[i - k][j - k] != (((count1 + h) % 2 == 0) ? 2
											: 1)) {
								k++;
							}
							while (l < 5
									&& j + l < 15
									&& i + l < 15
									&& A[i + l][j + l] != (((count1 + h) % 2 == 0) ? 2
											: 1)) {
								l++;
							}
							int[] line3 = new int[l + k - 1];
							for (int m = 0; m < line3.length; m++) {
								if (m - k + 1 == 0) {
									line3[m] = ((count1 + h) % 2 == 0) ? 1 : 2;
								} else {
									line3[m] = A[i - k + 1 + m][j - k + 1 + m];
								}
							}
							scores[i][j] = scores[i][j]
									+ getScore1(line3, (count1 + h), h);

							// line4
							k = 1;
							l = 1;
							while (k < 5
									&& j - k >= 0
									&& i + k < 15
									&& A[i + k][j - k] != (((count1 + h) % 2 == 0) ? 2
											: 1)) {
								k++;
							}
							while (l < 5
									&& j + l < 15
									&& i - l >= 0
									&& A[i - l][j + l] != (((count1 + h) % 2 == 0) ? 2
											: 1)) {
								l++;
							}
							int[] line4 = new int[l + k - 1];
							for (int m = 0; m < line4.length; m++) {
								if (m - k + 1 == 0) {
									line4[m] = ((count1 + h) % 2 == 0) ? 1 : 2;
								} else {
									line4[m] = A[i + k - 1 - m][j - k + 1 + m];
								}
							}
							scores[i][j] = scores[i][j]
									+ getScore1(line4, (count1 + h), h);
						}
					}
				}
			}

			if (count % 2 == 0) {
				copyChessboard[Max(scores).getX() - 1][Max(scores).getY() - 1] = 1;
			} else {
				copyChessboard[Max(scores).getX() - 1][Max(scores).getY() - 1] = 2;
			}
			count1++;

		}
		return Max(scores);
	}

	private int getScore1(int[] line, int count, int h) {
		int totalscore = 0;
		int[][] score = { { 1, 1 }, { 5, 4 }, { 50, 40 }, { 600, 400 },
				{ 700, 450 }, { 1500, 1200 }, { 10000, 8000 } };

		if (line.length < 5) {
			totalscore = totalscore + 0;
		} else if (line.length == 5) {
			int a = numbers(line, ((count - h + h) % 2 == 0 ? 1 : 2));
			if (a == 1 || a == 2) {
				totalscore = totalscore + 0;
			} else if (a == 3) {
				totalscore = totalscore + score[2][h];
			} else if (a == 4) {
				totalscore = totalscore + score[4][h];
			} else if (a == 5) {
				totalscore = totalscore + score[6][h];
			}
		} else {
			totalscore = totalscore + getscore2(line, count, h);
		}

		return totalscore;

	}

	private int getscore2(int[] line, int count, int i) {
		int[] cutLine = new int[6];
		int score = 0;
		int maxScore = 0;
		int cur = (count % 2 == 0) ? 1 : 2;
		int[][] scores = { { 1, 1 }, { 5, 4 }, { 10, 5 }, { 15, 10 },
				{ 50, 40 }, { 600, 400 }, { 700, 450 }, { 1500, 1200 },
				{ 10000, 8000 } };
		for (int j = 0; j < line.length - 5; j++) {
			for (int j2 = 0; j2 < cutLine.length; j2++) {
				cutLine[j2] = line[j + j2];
			}
			if (numbers(cutLine, cur) == 1) {
				score = 0;
			} else if (numbers(cutLine, cur) == 2) {
				int[][] cases = { { cur, 0, 0, 0, cur, 0 },
						{ cur, 0, 0, 0, 0, cur }, { 0, cur, 0, 0, 0, cur },
						{ cur, cur, 0, 0, 0, 0 }, { cur, 0, cur, 0, 0, 0 },
						{ cur, 0, 0, cur, 0, 0 }, { 0, 0, cur, 0, 0, cur },
						{ 0, 0, 0, cur, 0, cur }, { 0, 0, 0, 0, cur, cur },
						{ 0, 0, cur, 0, cur, 0 }, { 0, cur, 0, cur, 0, 0 },
						{ 0, cur, cur, 0, 0, 0 }, { 0, 0, cur, cur, 0, 0 },
						{ 0, 0, 0, cur, cur, 0 }, { 0, cur, 0, 0, cur, 0 } };
				for (int k = 0; k < 15; k++) {
					if (match(cutLine, cases[k])) {
						if (k < 3) {
							score = 0;
						} else if (k < 9) {
							score = 1;
						} else if (k < 11) {
							score = scores[2][i];
						} else if (k < 14) {
							score = scores[3][i];
						} else {
							score = scores[1][i];
						}
					}
				}
			} else if (numbers(cutLine, cur) == 3) {
				int[][] cases = { { cur, cur, 0, 0, 0, cur },
						{ cur, 0, cur, 0, 0, cur }, { cur, 0, 0, cur, 0, cur },
						{ cur, 0, 0, 0, cur, cur }, { cur, 0, 0, cur, cur, 0 },
						{ 0, cur, cur, 0, 0, cur }, { 0, cur, cur, cur, 0, 0 },
						{ 0, cur, 0, cur, cur, 0 }, { 0, cur, cur, 0, cur, 0 },
						{ 0, 0, cur, cur, cur, 0 } };
				boolean is = false;
				for (int k = 0; k < 10; k++) {
					if (match(cutLine, cases[k])) {
						if (k < 4) {
							score = 1;
						} else if (k < 6) {
							score = scores[1][i];
						} else {
							score = scores[5][i];
						}
						is = true;
					}
				}
				if (!is) {
					score = scores[4][i];
				}
			} else if (numbers(cutLine, cur) == 4) {
				int[][] cases = { { cur, cur, cur, 0, 0, cur },
						{ cur, cur, 0, cur, 0, cur },
						{ cur, cur, 0, 0, cur, cur },
						{ cur, 0, cur, cur, 0, cur },
						{ cur, 0, cur, 0, cur, cur },
						{ cur, 0, 0, cur, cur, cur },
						{ 0, cur, cur, cur, cur, 0 } };
				boolean is = false;
				for (int k = 0; k < 7; k++) {
					if (match(cutLine, cases[k])) {
						if (k < 6) {
							score = scores[4][i];
						} else {
							score = scores[7][i];
						}
						is = true;
					}
				}
				if (!is) {
					score = scores[6][i];
				}
			} else {
				int[][] cases = { { cur, cur, cur, cur, cur, 0 },
						{ 0, cur, cur, cur, cur, cur } };

				if (match(cutLine, cases[0]) || match(cutLine, cases[1])) {
					score = scores[8][i];
				} else {
					score = scores[7][i];
				}
			}

			if (score > maxScore) {
				maxScore = score;
			}
		}
		return maxScore;
	}

	private boolean match(int[] cutLine, int[] is) {
		for (int i = 0; i < is.length; i++) {
			if (cutLine[i] != is[i]) {
				return false;
			}
		}
		return true;
	}

	private boolean match(int[][] b, int j, int a) {
		for (int i = 0; i < 5; i++) {

			if (b[j][i] == a) {
				return true;
			}
		}
		return false;
	}

	private int numbers(int[] line, int i) {

		int k = 0;
		for (int j = 0; j < line.length; j++) {
			if (line[j] == i) {
				k++;
			}
		}
		return k;
	}

	private Stone Max(int[][] scores1) {
		int max = 0, x = 0, y = 0;

		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 15; i++) {
				if (scores1[i][j] >= max) {
					max = scores1[i][j];
					y = i + 1;
					x = j + 1;
				}
			}
		}
		return new Stone(x, y);
	}

	@Override
	public Stone input(int count, int[][] stones, int[] info,
			int difficultyInt, Rule rule) {
		if (count % 2 == 0) {

			// human put stone.
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("玩家落子,请输入坐标");
			String stoneString = input.next();

			if (stoneString.equals("_rec")) {
				// record.
				try {
					new Record().newRecord(stones, info);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				System.out.println("保存成功！！！");
				return input(count, stones, info, difficultyInt, rule);
			} else if (stoneString.equals("_reg")) {
				// undoing.
				return new Stone(-1, -1);
			} else if (stoneString.equals("0")) {
				// exit this game.
				return new Stone(0, 0);
			} else {
				// get horizontal coordinate.
				String firstLetter = stoneString.substring(0, 1);
				String upperFirstLetter = firstLetter.toUpperCase();
				h = finalline.indexOf(upperFirstLetter) + 1;

				// get vertical coordinate.
				String a1 = stoneString.replaceFirst(firstLetter, "0");
				v = (int) Double.parseDouble(a1);
				return new Stone(h, v);
			}
		} else {
			// AI put stone.
			if (difficultyInt == 0) {
				return getStone1(stones, 1, count, rule);
			} else {
				return getStone(stones, 1, count, rule);
			}
		}

	}
}
