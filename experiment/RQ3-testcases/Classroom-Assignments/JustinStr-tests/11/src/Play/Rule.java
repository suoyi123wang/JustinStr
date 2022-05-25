package Play;

import Main.Game;
import UI.ConsoleUI;
import UI.UI;

public abstract class Rule {
	UI ui;
	public static final int Gomoku = 1;
	public static final int Renju = 2;
	public abstract boolean isLeagal(Stone stone, Stone[] x);

	public boolean notOccupied(Stone c) {
		if ((Board.getBoard()[c.getX() - 1][c.getY() - 1].getCircle()).compareTo("+") != 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isInBoard(Stone c) {
		try {
			Board.getBoard()[c.getX() - 1][c.getY() - 1] = Board.getBoard()[c
					.getX() - 1][c.getY() - 1];
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Stone[] near(int Direction, Stone currStone){
		Stone[] N = new Stone[5];
		int a = currStone.getX();
		int b = currStone.getY();
		switch(Direction){
		//分8个方向判断胜负条件和禁手之类的
		//棋子在边缘处的情况还没写
		case 1:
			for(int i = 0; i<6; i++){
				N[i] = Board.getBoard()[a][b+i];
				System.out.println(N[i].getX()+"   "+N[i].getY()+"   "+N[i].getCircle());
		}
		case 2:
			for(int i = 0; i<5; i++){
				N[i]= Board.getBoard()[a+i][b+i];
			}
		case 3:
			for(int i = 0; i<5; i++){
				N[i] = Board.getBoard()[a+i][b];
			}
		case 4:
			for(int i = 0; i<5; i++){
				N[i] = Board.getBoard()[a+i][b-i];
			}
		case 5:
			for(int i = 0; i<5; i++){
				N[i] = Board.getBoard()[a][b-i];
			}
		case 6:
			for(int i = 0; i<5; i++){
				N[i] = Board.getBoard()[a-i][b-i];
			}
		case 7:
			for(int i = 0; i<5; i++){
				N[i] = Board.getBoard()[a-i][b];
			}
		case 8:
			for(int i = 0; i<5; i++){
				N[i] = Board.getBoard()[a-i][b+i];
			}
		}
		return N;
	}
	
	
	public boolean judge(int count, Stone[] x, Player player) {
		if (count < 8) {
			return false;
		} else {
			Stone[] temp;
			String[] winner = new String[5];
			boolean isWin = false;
			if (count % 2 == 1) {
				temp = new Stone[(count + 1) / 2];
				for (int i = 0; i < temp.length; i++) {
					temp[i] = x[2 * i + 1];
				}
			} else {
				temp = new Stone[(count + 2) / 2];
				for (int i = 0; i < temp.length; i++) {
					temp[i] = x[2 * i];
				}
			}
			for (int a = 0; a < temp.length; a = a + 1) {
				for (int b = a + 1; b < temp.length; b = b + 1) {
					for (int c = b + 1; c < temp.length; c = c + 1) {
						for (int d = c + 1; d < temp.length; d = d + 1) {
							for (int e = d + 1; e < temp.length; e = e + 1) {
								int[] p = { a, b, c, d, e };
								int[] h = new int[5];
								int[] z = new int[5];
								for (int i = 0; i < 5; i = i + 1) {
									h[i] = temp[p[i]].getX();
									z[i] = temp[p[i]].getY();
								}
								boolean isExist = true;
								for (int i = 0; i < 3; i = i + 1) {
									if (((z[i] - z[4]) * (h[3] - h[4])) != ((z[3] - z[4]) * (h[i] - h[4]))) {
										isExist = false;
									}
								}
								for (int i = 0; i < 5; i = i + 1) {
									for (int j = i + 1; j < 5; j = j + 1) {
										if ((Math.abs(h[i] - h[j]) > 4)
												|| (Math.abs(z[i] - z[j]) > 4)) {
											isExist = false;
										}
									}
								}
								if (isExist) {
									isWin = true;
									for (int i = 0; i < 5; i = i + 1) {
										winner[i] = ((char) (temp[p[i]]
												.getY() + 64))
												+ ""
												+ temp[p[i]].getX()
												+ " ";
									}
								}
							}
						}
					}
				}
			}
			return isWin;
		}
	}

	public int getRuleType(Game game) {
		return game.GomokuOrRenju;
	}

}
