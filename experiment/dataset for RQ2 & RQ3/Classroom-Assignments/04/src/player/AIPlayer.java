package player;

import unseen.Board;
import player.Player;

public class AIPlayer extends Player {
	private double[][] score = new double[225][2];// score[][1]进攻分 0为防守分
	private int x = 0;
	private int y = 0;
	private int p = 0;
	private int count = 0;
	private int minus = 0;

	public AIPlayer() {
	}

	public AIPlayer(String id, int color) {
		super(id, color);
	}

	public void enterChess() {
		if (Board.getNumberOfChess() == 1) {
			Board.setChess(1, 7, 7, 1);
			Board.setLocation(7, 7, 1);
		} else {
			Board.setChess(Board.getNumberOfChess(), calculate() % 15,
					calculate() / 15, (Board.getNumberOfChess() + 1) % 2 + 1);

			Board.setLocation(calculate() % 15, calculate() / 15,
					(Board.getNumberOfChess() + 1) % 2 + 1);
		}
	}

	private int calculate() {
		resetScore();
		resetP();
		while (p < 225) {
			x = p % 15;
			y = p / 15;
			if (Board.getLocation(x, y) != 0) {
				score[p][0] = -10;
				score[p][1] = -10;
			} else {
				int mine = 2;
				int other = 2 / mine;
				// 进攻
				// row
				count = 0;
				minus = 0;
				for (int i = 1; i < 5; i++) {
					if (x + i <= 14) {
						if (Board.getLocation(x + i, y) == mine) {
							count++;
						} else if (Board.getLocation(x + i, y) == other) {
							minus++;
						} else {
							break;
						}
					}
				}
				for (int i = 1; i < 5; i++) {
					if (x - i >= 0) {
						if (Board.getLocation(x - i, y) == mine) {
							count++;
						} else if (Board.getLocation(x - i, y) == other) {
							minus++;
						} else {
							break;
						}
					}
				}

				if (count >= 4) {
					return p;
				}
				score[p][mine - 1] = (scoreForCount(count, mine))
						/ Math.pow(2, minus) + score[p][mine - 1];

				//
				count = 0;
				minus = 0;
				for (int i = 1; i < 5; i++) {
					if (y + i <= 14) {
						if (Board.getLocation(x, y + i) == mine) {
							count++;
						} else if (Board.getLocation(x, y + i) == other) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}
				for (int i = 1; i < 5; i++) {
					if (y - i >= 0) {
						if (Board.getLocation(x, y - i) == mine) {
							count++;
						} else if (Board.getLocation(x, y - i) == other) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}

				if (count >= 4) {
					return p;
				}
				score[p][mine - 1] = scoreForCount(count, mine)
						/ Math.pow(2, minus) + score[p][mine - 1];

				//
				count = 0;
				minus = 0;

				for (int i = 1; i < 5; i++) {
					if (x - i >= 0 && y - i >= 0) {
						if (Board.getLocation(x - i, y - i) == mine) {
							count++;
						} else if (Board.getLocation(x - i, y - i) == other) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}
				for (int i = 1; i < 5; i++) {
					if (x + i <= 14 && y + i <= 14) {
						if (Board.getLocation(x + i, y + i) == mine) {
							count++;
						} else if (Board.getLocation(x + i, y + i) == other) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}

				if (count >= 4) {
					return p;
				}
				score[p][mine - 1] = scoreForCount(count, mine)
						/ Math.pow(2, minus) + score[p][mine - 1];

				//
				count = 0;
				minus = 0;

				for (int i = 1; i < 5; i++) {
					if (x - i >= 0 && y + i <= 14) {
						if (Board.getLocation(x - i, y + i) == mine) {
							count++;
						} else if (Board.getLocation(x - i, y + i) == other) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}
				for (int i = 1; i < 5; i++) {
					if (x + i <= 14 && y - i >= 0) {
						if (Board.getLocation(x + i, y - i) == mine) {
							count++;
						} else if (Board.getLocation(x + i, y - i) == other) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}

				if (count >= 4) {
					return p;
				}
				score[p][mine - 1] = scoreForCount(count, mine)
						/ Math.pow(2, minus) + score[p][mine - 1];
				//
				// 防守
				// row
				count = 0;
				minus = 0;
				for (int i = 1; i < 5; i++) {
					if (x + i <= 14) {
						if (Board.getLocation(x + i, y) == other) {
							count++;
						} else if (Board.getLocation(x + i, y) == mine) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}
				for (int i = 1; i < 5; i++) {
					if (x - i >= 0) {
						if (Board.getLocation(x - i, y) == other) {
							count++;
						} else if (Board.getLocation(x - i, y) == mine) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}

				if (count >= 4) {
					return p;
				}
				score[p][other - 1] = scoreForCount(count, other)
						/ Math.pow(2, minus) + score[p][other - 1];

				//
				count = 0;
				minus = 0;
				for (int i = 1; i < 5; i++) {
					if (y + i <= 14) {
						if (Board.getLocation(x, y + i) == other) {
							count++;
						} else if (Board.getLocation(x, y + i) == mine) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}
				for (int i = 1; i < 5; i++) {
					if (y - i >= 0) {
						if (Board.getLocation(x, y - i) == other) {
							count++;
						} else if (Board.getLocation(x, y - i) == mine) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}

				if (count >= 4) {
					return p;
				}
				score[p][other - 1] = scoreForCount(count, other)
						/ Math.pow(2, minus) + score[p][other - 1];

				//
				count = 0;
				minus = 0;

				for (int i = 1; i < 5; i++) {
					if (x - i >= 0 && y - i >= 0) {
						if (Board.getLocation(x - i, y - i) == other) {
							count++;
						} else if (Board.getLocation(x - i, y - i) == mine) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}
				for (int i = 1; i < 5; i++) {
					if (x + i <= 14 && y + i <= 14) {
						if (Board.getLocation(x + i, y + i) == other) {
							count++;
						} else if (Board.getLocation(x + i, y + i) == mine) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}

				if (count >= 4) {
					return p;
				}
				score[p][other - 1] = scoreForCount(count, other)
						/ Math.pow(2, minus) + score[p][other - 1];

				//
				count = 0;
				minus = 0;

				for (int i = 1; i < 5; i++) {
					if (x - i >= 0 && y + i <= 14) {
						if (Board.getLocation(x - i, y + i) == other) {
							count++;
						} else if (Board.getLocation(x - i, y + i) == mine) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}
				for (int i = 1; i < 5; i++) {
					if (x + i <= 14 && y - i >= 0) {
						if (Board.getLocation(x + i, y - i) == other) {
							count++;
						} else if (Board.getLocation(x + i, y - i) == mine) {
							minus++;
							break;
						} else {
							break;
						}
					}
				}

				if (count >= 4) {
					return p;
				}
				score[p][other - 1] = scoreForCount(count, other)
						/ Math.pow(2, minus) + score[p][other - 1];
			}
			p++;
		}

		resetP();
		for (int a = 1; a < 225; a++) {
			if (score[p][0] < score[a][0]) {
				p = a;
			} else if (score[p][0] == score[a][0]
					&& score[p][0] + score[p][1] <= score[a][0] + score[a][1]) {
				p = a;
			}
			// System.out.println("now " + (a % 15 + 1) + "," + (a / 15 + 1)
			// + "fire" + score[a][1] + "defend " + score[a][0]);
		}
		return p;
	}

	private void resetP() {
		p = 0;
	}

	private void resetScore() {
		for (int i = 0; i < 225; i++) {
			score[i][0] = 0;
			score[i][1] = 0;
		}
	}

	private double scoreForCount(int count, int m) {
		double score = 0;
		if (m == 1) {
			if (count == 1) {
				score = score + 1;
			} else if (count == 2) {
				score = score + 3;
			} else if (count == 3) {
				score = score + 6;
			} else if (count >= 4) {
				score = score + 15;
			}
		}
		if (m == 2) {
			if (count == 1) {
				score = score + 0.8;
			} else if (count == 2) {
				score = score + 2.7;
			} else if (count == 3) {
				score = score + 5.5;
			} else if (count >= 4) {
				score = score + 12;
			}
		}
		return score;
	}

}
