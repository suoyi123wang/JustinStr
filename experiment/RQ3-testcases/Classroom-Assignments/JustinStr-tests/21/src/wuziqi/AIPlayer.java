package wuziqi;

import java.util.Random;

public class AIPlayer extends Player {

	public boolean quitandsave() {
		boolean quitandsave = false;
		return quitandsave;
	}
	
	public boolean regret(){
		boolean regret = false;
		return regret;
	}

	public void setcolor(String color) {
		if (color.equals("B")) {
			selfcolor = "● ";
			rivalcolor = "o ";
		} else if (color.equals("W")) {
			selfcolor = "o ";
			rivalcolor = "● ";
		}

	}

	public void setmode(String mode) {
		if(mode.equals("attack")){
			rivalweightmultiple = 0.01;
		}else if(mode.equals("balance")){
			rivalweightmultiple = 1;
		}else if(mode.equals("defend")){
			rivalweightmultiple = 100;
		}
	}

	public Chesswithoutcolor Playerinput(String[][] board) {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		double[][] weightboard = new double[15][15];
		Chesswithoutcolor finalChess = null;

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {

			}
		}

		try {

		} catch (Exception e) {

		}


		// 一子连珠
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				if (board[i][j].equals(selfcolor)) {
					try {
						if (board[i - 1][j - 1].equals("+ ")) {
							weightboard[i - 1][j - 1] = 1;
						}
					} catch (Exception e) {
						 
					}
					try {
						if (board[i - 1][j].equals("+ ")) {
							weightboard[i - 1][j] = 1;
						}

					} catch (Exception e) {
						 
					}
					try {
						if (board[i - 1][j + 1].equals("+ ")) {
							weightboard[i - 1][j + 1] = 1;
						}

					} catch (Exception e) {
						 
					}
					try {
						if (board[i][j - 1].equals("+ ")) {
							weightboard[i][j - 1] = 1;
						}
					} catch (Exception e) {
						 
					}
					try {
						if (board[i][j + 1].equals("+ ")) {
							weightboard[i][j + 1] = 1;
						}

					} catch (Exception e) {
						 
					}
					try {
						if (board[i + 1][j - 1].equals("+ ")) {
							weightboard[i + 1][j - 1] = 1;
						}

					} catch (Exception e) {
						 
					}
					try {
						if (board[i + 1][j].equals("+ ")) {
							weightboard[i + 1][j] = 1;
						}

					} catch (Exception e) {
						 
					}
					try {
						if (board[i + 1][j + 1].equals("+ ")) {
							weightboard[i + 1][j + 1] = 1;
						}

					} catch (Exception e) {
						 
					}

				}
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				if (board[i][j].equals(rivalcolor)) {
					try {
						if (board[i - 1][j - 1].equals("+ ")
								&& weightboard[i - 1][j - 1] < rivalweightmultiple) {
							weightboard[i - 1][j - 1] = rivalweightmultiple;
						}
					} catch (Exception e) {
						
					}
					try {
						if (board[i - 1][j].equals("+ ")
								&& weightboard[i - 1][j] < rivalweightmultiple) {
							weightboard[i - 1][j] = rivalweightmultiple;
						}

					} catch (Exception e) {
						
					}
					try {
						if (board[i - 1][j + 1].equals("+ ")
								&& weightboard[i - 1][j + 1] < rivalweightmultiple) {
							weightboard[i - 1][j + 1] = rivalweightmultiple;
						}

					} catch (Exception e) {
						
					}
					try {
						if (board[i][j - 1].equals("+ ")
								&& weightboard[i][j - 1] < rivalweightmultiple) {
							weightboard[i][j - 1] = rivalweightmultiple;
						}
					} catch (Exception e) {
						
					}
					try {
						if (board[i][j + 1].equals("+ ")
								&& weightboard[i][j + 1] < rivalweightmultiple) {
						
							weightboard[i][j + 1] = rivalweightmultiple;
						}

					} catch (Exception e) {
						
					}
					try {
						if (board[i + 1][j - 1].equals("+ ")
								&& weightboard[i + 1][j - 1] < rivalweightmultiple) {
							weightboard[i + 1][j - 1] = rivalweightmultiple;
						}

					} catch (Exception e) {
						
					}
					try {
						if (board[i + 1][j].equals("+ ")
								&& weightboard[i + 1][j] < rivalweightmultiple) {
							weightboard[i + 1][j] = rivalweightmultiple;
						}

					} catch (Exception e) {
						
					}
					try {
						if (board[i + 1][j + 1].equals("+ ")
								&& weightboard[i + 1][j + 1] < rivalweightmultiple) {
							weightboard[i + 1][j + 1] = rivalweightmultiple;
						}

					} catch (Exception e) {
						
					}
				}
			}
		}
		// 二子连珠

		// 二子连珠己方判断：
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i][j + 1].equals(selfcolor)) {
						try {
							if (board[i][j - 1].equals("+ ")) {
								weightboard[i][j - 1] = 100;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i][j + 2].equals("+ ")) {
								weightboard[i][j + 2] = 100;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)

					&& board[i][j + 2].equals(selfcolor)) {
						try {
							if (board[i][j + 1].equals("+ ")) {
								weightboard[i][j + 1] = 100;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j].equals(selfcolor)) {
						try {
							if (board[i - 1][j].equals("+ ")) {
								weightboard[i - 1][j] = 100;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 2][j].equals("+ ")) {
								weightboard[i + 2][j] = 100;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)

					&& board[i + 2][j].equals(selfcolor)) {
						try {
							if (board[i + 1][j].equals("+ ")) {
								weightboard[i + 1][j] = 100;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j + 1].equals(selfcolor)) {
						try {
							if (board[i - 1][j - 1].equals("+ ")) {
								weightboard[i - 1][j - 1] = 100;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 2][j + 2].equals("+ ")) {
								weightboard[i + 2][j + 2] = 100;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)

					&& board[i + 2][j + 2].equals(selfcolor)) {
						try {
							if (board[i + 1][j + 1].equals("+ ")) {
								weightboard[i + 1][j + 1] = 100;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i - 1][j + 1].equals(selfcolor)) {
						try {
							if (board[i + 1][j - 1].equals("+ ")) {
								weightboard[i + 1][j - 1] = 100;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i - 2][j + 2].equals("+ ")) {
								weightboard[i - 2][j + 2] = 100;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)

					&& board[i - 2][j + 2].equals(selfcolor)) {
						try {
							if (board[i - 1][j + 1].equals("+ ")) {
								weightboard[i - 1][j + 1] = 100;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
			}
		}
		// 二子连珠对方判断：
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i][j + 1].equals(rivalcolor)) {
						try {
							if (board[i][j - 1].equals("+ ")
									&& weightboard[i][j - 1] < 100 * rivalweightmultiple) {
								weightboard[i][j - 1] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i][j + 2].equals("+ ")
									&& weightboard[i][j + 2] < 100 * rivalweightmultiple) {
								weightboard[i][j + 2] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)

					&& board[i][j + 2].equals(rivalcolor)) {
						try {
							if (board[i][j + 1].equals("+ ")
									&& weightboard[i][j + 1] < 100 * rivalweightmultiple) {
								weightboard[i][j + 1] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j].equals(rivalcolor)) {
						try {
							if (board[i - 1][j].equals("+ ")
									&& weightboard[i - 1][j] < 100 * rivalweightmultiple) {
								weightboard[i - 1][j] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 2][j].equals("+ ")
									&& weightboard[i + 2][j] < 100 * rivalweightmultiple) {
								weightboard[i + 2][j] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)

					&& board[i + 2][j].equals(rivalcolor)) {
						try {
							if (board[i + 1][j].equals("+ ")
									&& weightboard[i + 1][j] < 100 * rivalweightmultiple) {
								weightboard[i + 1][j] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j + 1].equals(rivalcolor)) {
						try {
							if (board[i - 1][j - 1].equals("+ ")
									&& weightboard[i - 1][j - 1] < 100 * rivalweightmultiple) {
								weightboard[i - 1][j - 1] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 2][j + 2].equals("+ ")
									&& weightboard[i + 2][j + 2] < 100 * rivalweightmultiple) {
								weightboard[i + 2][j + 2] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)

					&& board[i + 2][j + 2].equals(rivalcolor)) {
						try {
							if (board[i + 1][j + 1].equals("+ ")
									&& weightboard[i + 1][j + 1] < 100 * rivalweightmultiple) {
								weightboard[i + 1][j + 1] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i - 1][j + 1].equals(rivalcolor)) {
						try {
							if (board[i + 1][j - 1].equals("+ ")
									&& weightboard[i + 1][j - 1] < 100 * rivalweightmultiple) {
								weightboard[i + 1][j - 1] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i - 2][j + 2].equals("+ ")
									&& weightboard[i - 2][j + 2] < 100 * rivalweightmultiple) {
								weightboard[i - 2][j + 2] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)

					&& board[i - 2][j + 2].equals(rivalcolor)) {
						try {
							if (board[i - 1][j + 1].equals("+ ")
									&& weightboard[i - 1][j + 1] < 100 * rivalweightmultiple) {
								weightboard[i - 1][j + 1] = 100 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
			}
		}
		// 三子连珠
		// 三子连珠己方判断：
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i][j + 1].equals(selfcolor)
							&& board[i][j + 2].equals(selfcolor)) {
						try {
							if (board[i][j - 1].equals("+ ")) {
								weightboard[i][j - 1] = 10000;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i][j + 3].equals("+ ")) {
								weightboard[i][j + 3] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)

					&& board[i][j + 2].equals(selfcolor)
							&& board[i][j + 3].equals(selfcolor)) {
						try {
							if (board[i][j + 1].equals("+ ")) {
								weightboard[i][j + 1] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)
							&& board[i][j + 1].equals(selfcolor)

							&& board[i][j + 3].equals(selfcolor)) {
						try {
							if (board[i][j + 2].equals("+ ")) {
								weightboard[i][j + 2] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j].equals(selfcolor)
							&& board[i + 2][j].equals(selfcolor)) {
						try {
							if (board[i - 1][j].equals("+ ")) {
								weightboard[i - 1][j] = 10000;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 3][j].equals("+ ")) {
								weightboard[i + 3][j] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)

					&& board[i + 2][j].equals(selfcolor)
							&& board[i + 3][j].equals(selfcolor)) {
						try {
							if (board[i + 1][j].equals("+ ")) {
								weightboard[i + 1][j] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j].equals(selfcolor)

							&& board[i + 3][j].equals(selfcolor)) {
						try {
							if (board[i + 2][j].equals("+ ")) {
								weightboard[i + 2][j] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j + 1].equals(selfcolor)
							&& board[i + 2][j + 2].equals(selfcolor)) {
						try {
							if (board[i - 1][j - 1].equals("+ ")) {
								weightboard[i - 1][j - 1] = 10000;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 3][j + 3].equals("+ ")) {
								weightboard[i + 3][j + 3] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				
				try {
					if (board[i][j].equals(selfcolor)
							
							&& board[i + 2][j + 2].equals(selfcolor)
							&& board[i + 3][j + 3].equals(selfcolor)) {
						try {
							if (board[i + 1][j + 1].equals("+ ")) {
								weightboard[i + 1][j + 1] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j + 1].equals(selfcolor)
							
							&& board[i + 3][j + 3].equals(selfcolor)) {
						try {
							if (board[i + 2][j + 2].equals("+ ")) {
								weightboard[i + 2][j + 2] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}


				try {
					if (board[i][j].equals(selfcolor)
							&& board[i - 1][j + 1].equals(selfcolor)
							&& board[i - 2][j + 2].equals(selfcolor)) {
						try {
							if (board[i + 1][j - 1].equals("+ ")) {
								weightboard[i + 1][j - 1] = 10000;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i - 3][j + 3].equals("+ ")) {
								weightboard[i - 3][j + 3] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				
				try {
					if (board[i][j].equals(selfcolor)
							
							&& board[i - 2][j + 2].equals(selfcolor)
							&& board[i - 3][j + 3].equals(selfcolor)) {
						try {
							if (board[i - 1][j + 1].equals("+ ")) {
								weightboard[i - 1][j + 1] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i - 1][j + 1].equals(selfcolor)
							
							&& board[i - 3][j + 3].equals(selfcolor)) {
						try {
							if (board[i - 2][j + 2].equals("+ ")) {
								weightboard[i - 2][j + 2] = 10000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

			}
		}
		// 三子连珠对方判断：
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i][j + 1].equals(rivalcolor)
							&& board[i][j + 2].equals(rivalcolor)) {
						try {
							if (board[i][j - 1].equals("+ ") && weightboard[i][j - 1] < 10000*rivalweightmultiple) {
								weightboard[i][j - 1] = 10000*rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i][j + 3].equals("+ ") && weightboard[i][j + 3] < 10000*rivalweightmultiple) {
								weightboard[i][j + 3] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)

					&& board[i][j + 2].equals(rivalcolor)
							&& board[i][j + 3].equals(rivalcolor)) {
						try {
							if (board[i][j + 1].equals("+ ") && weightboard[i][j + 1] < 10000*rivalweightmultiple) {
								weightboard[i][j + 1] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i][j + 1].equals(rivalcolor)

							&& board[i][j + 3].equals(rivalcolor)) {
						try {
							if (board[i][j + 2].equals("+ ") && weightboard[i][j + 2] < 10000*rivalweightmultiple) {
								weightboard[i][j + 2] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j].equals(rivalcolor)
							&& board[i + 2][j].equals(rivalcolor)) {
						try {
							if (board[i - 1][j].equals("+ ") && weightboard[i - 1][j] < 10000*rivalweightmultiple) {
								weightboard[i - 1][j] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 3][j].equals("+ ") && weightboard[i + 3][j] < 10000*rivalweightmultiple) {
								weightboard[i + 3][j] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)

					&& board[i + 2][j].equals(rivalcolor)
							&& board[i + 3][j].equals(rivalcolor)) {
						try {
							if (board[i + 1][j].equals("+ ") && weightboard[i + 1][j] < 10000*rivalweightmultiple) {
								weightboard[i + 1][j] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j].equals(rivalcolor)

							&& board[i + 3][j].equals(rivalcolor)) {
						try {
							if (board[i + 2][j].equals("+ ") && weightboard[i + 2][j] < 10000*rivalweightmultiple) {
								weightboard[i + 2][j] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j + 1].equals(rivalcolor)
							&& board[i + 2][j + 2].equals(rivalcolor)) {
						try {
							if (board[i - 1][j - 1].equals("+ ") && weightboard[i - 1][j - 1] < 10000*rivalweightmultiple) {
								weightboard[i - 1][j - 1] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 3][j + 3].equals("+ ") && weightboard[i + 3][j + 3] < 10000*rivalweightmultiple) {
								weightboard[i + 3][j + 3] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				
				try {
					if (board[i][j].equals(rivalcolor)
							
							&& board[i + 2][j + 2].equals(rivalcolor)
							&& board[i + 3][j + 3].equals(rivalcolor)) {
						try {
							if (board[i + 1][j + 1].equals("+ ") && weightboard[i + 1][j + 1] < 10000*rivalweightmultiple) {
								weightboard[i + 1][j + 1] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j + 1].equals(rivalcolor)
							
							&& board[i + 3][j + 3].equals(rivalcolor)) {
						try {
							if (board[i + 2][j + 2].equals("+ ") && weightboard[i + 2][j + 2] < 10000*rivalweightmultiple) {
								weightboard[i + 2][j + 2] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}


				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i - 1][j + 1].equals(rivalcolor)
							&& board[i - 2][j + 2].equals(rivalcolor)) {
						try {
							if (board[i + 1][j - 1].equals("+ ") && weightboard[i + 1][j - 1] < 10000*rivalweightmultiple) {
								weightboard[i + 1][j - 1] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i - 3][j + 3].equals("+ ") && weightboard[i - 3][j + 3] < 10000*rivalweightmultiple) {
								weightboard[i - 3][j + 3] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				
				try {
					if (board[i][j].equals(rivalcolor)
							
							&& board[i - 2][j + 2].equals(rivalcolor)
							&& board[i - 3][j + 3].equals(rivalcolor)) {
						try {
							if (board[i - 1][j + 1].equals("+ ") && weightboard[i - 1][j + 1] < 10000*rivalweightmultiple) {
								weightboard[i - 1][j + 1] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i - 1][j + 1].equals(rivalcolor)
							
							&& board[i - 3][j + 3].equals(rivalcolor)) {
						try {
							if (board[i - 2][j + 2].equals("+ ") && weightboard[i - 2][j + 2] < 10000*rivalweightmultiple) {
								weightboard[i - 2][j + 2] = 10000*rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

			}
		}
		// 四子连珠

		// 四子连珠己方判断：
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i][j + 1].equals(selfcolor)
							&& board[i][j + 2].equals(selfcolor)
							&& board[i][j + 3].equals(selfcolor)) {
						try {
							if (board[i][j - 1].equals("+ ")) {
								weightboard[i][j - 1] = 1000000;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i][j + 4].equals("+ ")) {
								weightboard[i][j + 4] = 1000000;
							}

						} catch (Exception e) {
							 
						}

					}

				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)

					&& board[i][j + 2].equals(selfcolor)
							&& board[i][j + 3].equals(selfcolor)
							&& board[i][j + 4].equals(selfcolor)) {
						try {

							if (board[i][j + 1].equals("+ ")) {
								weightboard[i][j + 1] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i][j + 1].equals(selfcolor)

							&& board[i][j + 3].equals(selfcolor)
							&& board[i][j + 4].equals(selfcolor)) {
						try {
							if (board[i][j + 2].equals("+ ")) {
								weightboard[i][j + 2] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i][j + 1].equals(selfcolor)
							&& board[i][j + 2].equals(selfcolor)

							&& board[i][j + 4].equals(selfcolor)) {
						try {
							if (board[i][j + 3].equals("+ ")) {
								weightboard[i][j + 3] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}

				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j].equals(selfcolor)
							&& board[i + 2][j].equals(selfcolor)
							&& board[i + 3][j].equals(selfcolor)) {
						try {
							if (board[i - 1][j].equals("+ ")) {
								weightboard[i - 1][j] = 1000000;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 4][j].equals("+ ")) {
								weightboard[i + 4][j] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}

				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)

					&& board[i + 2][j].equals(selfcolor)
							&& board[i + 3][j].equals(selfcolor)
							&& board[i + 4][j].equals(selfcolor)) {
						try {
							if (board[i + 1][j].equals("+ ")) {
								weightboard[i + 1][j] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j].equals(selfcolor)

							&& board[i + 3][j].equals(selfcolor)
							&& board[i + 4][j].equals(selfcolor)) {
						try {
							if (board[i + 2][j].equals("+ ")) {
								weightboard[i + 2][j] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j].equals(selfcolor)
							&& board[i + 2][j].equals(selfcolor)

							&& board[i + 4][j].equals(selfcolor)) {
						try {
							if (board[i + 3][j].equals("+ ")) {
								weightboard[i + 3][j] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j + 1].equals(selfcolor)
							&& board[i + 2][j + 2].equals(selfcolor)
							&& board[i + 3][j + 3].equals(selfcolor)) {
						try {
							if (board[i - 1][j - 1].equals("+ ")) {
								weightboard[i - 1][j - 1] = 1000000;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 4][j + 4].equals("+ ")) {
								weightboard[i + 4][j + 4] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}

				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)

					&& board[i + 2][j + 2].equals(selfcolor)
							&& board[i + 3][j + 3].equals(selfcolor)
							&& board[i + 4][j + 4].equals(selfcolor)) {
						try {
							if (board[i + 1][j + 1].equals("+ ")) {
								weightboard[i + 1][j + 1] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j + 1].equals(selfcolor)

							&& board[i + 3][j + 3].equals(selfcolor)
							&& board[i + 4][j + 4].equals(selfcolor)) {
						try {
							if (board[i + 2][j + 2].equals("+ ")) {
								weightboard[i + 2][j + 2] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i + 1][j + 1].equals(selfcolor)
							&& board[i + 2][j + 2].equals(selfcolor)

							&& board[i + 4][j + 4].equals(selfcolor)) {
						try {
							if (board[i + 3][j + 3].equals("+ ")) {
								weightboard[i + 3][j + 3] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)
							&& board[i - 1][j + 1].equals(selfcolor)
							&& board[i - 2][j + 2].equals(selfcolor)
							&& board[i - 3][j + 3].equals(selfcolor)) {
						try {
							if (board[i + 1][j - 1].equals("+ ")) {
								weightboard[i + 1][j - 1] = 1000000;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i - 4][j + 4].equals("+ ")) {
								weightboard[i - 4][j + 4] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(selfcolor)

					&& board[i - 2][j + 2].equals(selfcolor)
							&& board[i - 3][j + 3].equals(selfcolor)
							&& board[i - 4][j + 4].equals(selfcolor)) {
						try {
							if (board[i - 1][j + 1].equals("+ ")) {
								weightboard[i - 1][j + 1] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i - 1][j + 1].equals(selfcolor)

							&& board[i - 3][j + 3].equals(selfcolor)
							&& board[i - 4][j + 4].equals(selfcolor)) {
						try {
							if (board[i - 2][j + 2].equals("+ ")) {
								weightboard[i - 2][j + 2] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(selfcolor)
							&& board[i - 1][j + 1].equals(selfcolor)
							&& board[i - 2][j + 2].equals(selfcolor)

							&& board[i - 4][j + 4].equals(selfcolor)) {
						try {
							if (board[i - 3][j + 3].equals("+ ")) {
								weightboard[i - 3][j + 3] = 1000000;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

			}
		}

		// 四子连珠对方判断
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i][j + 1].equals(rivalcolor)
							&& board[i][j + 2].equals(rivalcolor)
							&& board[i][j + 3].equals(rivalcolor)) {
						try {
							if (board[i][j - 1].equals("+ ")
									&& weightboard[i][j - 1] < 1000000 * rivalweightmultiple) {
								weightboard[i][j - 1] = 1000000 * rivalweightmultiple;
							}
						} catch (Exception e) {
							 
						}
						try {
							if (board[i][j + 4].equals("+ ")
									&& weightboard[i][j + 4] < 1000000 * rivalweightmultiple) {
								weightboard[i][j + 4] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}

					}

				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)

					&& board[i][j + 2].equals(rivalcolor)
							&& board[i][j + 3].equals(rivalcolor)
							&& board[i][j + 4].equals(rivalcolor)) {
						try {

							if (board[i][j + 1].equals("+ ")
									&& weightboard[i][j + 1] < 1000000 * rivalweightmultiple) {
								weightboard[i][j + 1] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i][j + 1].equals(rivalcolor)

							&& board[i][j + 3].equals(rivalcolor)
							&& board[i][j + 4].equals(rivalcolor)) {
						try {
							if (board[i][j + 2].equals("+ ")
									&& weightboard[i][j + 2] < 1000000 * rivalweightmultiple) {
								weightboard[i][j + 2] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i][j + 1].equals(rivalcolor)
							&& board[i][j + 2].equals(rivalcolor)

							&& board[i][j + 4].equals(rivalcolor)) {
						try {
							if (board[i][j + 3].equals("+ ")
									&& weightboard[i][j + 3] < 1000000 * rivalweightmultiple) {
								weightboard[i][j + 3] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}

				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j].equals(rivalcolor)
							&& board[i + 2][j].equals(rivalcolor)
							&& board[i + 3][j].equals(rivalcolor)) {
						try {
							if (board[i - 1][j].equals("+ ")
									&& weightboard[i - 1][j] < 1000000 * rivalweightmultiple) {
								weightboard[i - 1][j] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 4][j].equals("+ ")
									&& weightboard[i + 4][j] < 1000000 * rivalweightmultiple) {
								weightboard[i + 4][j] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}

				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)

					&& board[i + 2][j].equals(rivalcolor)
							&& board[i + 3][j].equals(rivalcolor)
							&& board[i + 4][j].equals(rivalcolor)) {
						try {
							if (board[i + 1][j].equals("+ ")
									&& weightboard[i + 1][j] < 1000000 * rivalweightmultiple) {
								weightboard[i + 1][j] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j].equals(rivalcolor)

							&& board[i + 3][j].equals(rivalcolor)
							&& board[i + 4][j].equals(rivalcolor)) {
						try {
							if (board[i + 2][j].equals("+ ")
									&& weightboard[i + 2][j] < 1000000 * rivalweightmultiple) {
								weightboard[i + 2][j] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j].equals(rivalcolor)
							&& board[i + 2][j].equals(rivalcolor)

							&& board[i + 4][j].equals(rivalcolor)) {
						try {
							if (board[i + 3][j].equals("+ ")
									&& weightboard[i + 3][j] < 1000000 * rivalweightmultiple) {
								weightboard[i + 3][j] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j + 1].equals(rivalcolor)
							&& board[i + 2][j + 2].equals(rivalcolor)
							&& board[i + 3][j + 3].equals(rivalcolor)) {
						try {
							if (board[i - 1][j - 1].equals("+ ")
									&& weightboard[i - 1][j - 1] < 1000000 * rivalweightmultiple) {
								weightboard[i - 1][j - 1] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i + 4][j + 4].equals("+ ")
									&& weightboard[i + 4][j + 4] < 1000000 * rivalweightmultiple) {
								weightboard[i + 4][j + 4] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}

				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)

					&& board[i + 2][j + 2].equals(rivalcolor)
							&& board[i + 3][j + 3].equals(rivalcolor)
							&& board[i + 4][j + 4].equals(rivalcolor)) {
						try {
							if (board[i + 1][j + 1].equals("+ ")
									&& weightboard[i + 1][j + 1] < 1000000 * rivalweightmultiple) {
								weightboard[i + 1][j + 1] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j + 1].equals(rivalcolor)

							&& board[i + 3][j + 3].equals(rivalcolor)
							&& board[i + 4][j + 4].equals(rivalcolor)) {
						try {
							if (board[i + 2][j + 2].equals("+ ")
									&& weightboard[i + 2][j + 2] < 1000000 * rivalweightmultiple) {
								weightboard[i + 2][j + 2] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i + 1][j + 1].equals(rivalcolor)
							&& board[i + 2][j + 2].equals(rivalcolor)

							&& board[i + 4][j + 4].equals(rivalcolor)) {
						try {
							if (board[i + 3][j + 3].equals("+ ")
									&& weightboard[i + 3][j + 3] < 1000000 * rivalweightmultiple) {
								weightboard[i + 3][j + 3] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i - 1][j + 1].equals(rivalcolor)
							&& board[i - 2][j + 2].equals(rivalcolor)
							&& board[i - 3][j + 3].equals(rivalcolor)) {
						try {
							if (board[i + 1][j - 1].equals("+ ")
									&& weightboard[i + 1][j - 1] < 1000000 * rivalweightmultiple) {
								weightboard[i + 1][j - 1] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
						try {
							if (board[i - 4][j + 4].equals("+ ")
									&& weightboard[i - 4][j + 4] < 1000000 * rivalweightmultiple) {
								weightboard[i - 4][j + 4] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

				try {
					if (board[i][j].equals(rivalcolor)

					&& board[i - 2][j + 2].equals(rivalcolor)
							&& board[i - 3][j + 3].equals(rivalcolor)
							&& board[i - 4][j + 4].equals(rivalcolor)) {
						try {
							if (board[i - 1][j + 1].equals("+ ")
									&& weightboard[i - 1][j + 1] < 1000000 * rivalweightmultiple) {
								weightboard[i - 1][j + 1] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i - 1][j + 1].equals(rivalcolor)

							&& board[i - 3][j + 3].equals(rivalcolor)
							&& board[i - 4][j + 4].equals(rivalcolor)) {
						try {
							if (board[i - 2][j + 2].equals("+ ")
									&& weightboard[i - 2][j + 2] < 1000000 * rivalweightmultiple) {
								weightboard[i - 2][j + 2] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}
				try {
					if (board[i][j].equals(rivalcolor)
							&& board[i - 1][j + 1].equals(rivalcolor)
							&& board[i - 2][j + 2].equals(rivalcolor)

							&& board[i - 4][j + 4].equals(rivalcolor)) {
						try {
							if (board[i - 3][j + 3].equals("+ ")
									&& weightboard[i - 3][j + 3] < 1000000 * rivalweightmultiple) {
								weightboard[i - 3][j + 3] = 1000000 * rivalweightmultiple;
							}

						} catch (Exception e) {
							 
						}
					}
				} catch (Exception e) {
					 
				}

			}
		}

//		System.out.println("weightboard");
//		for (int i = 0; i < 15; i++) {
//		for (int j = 0; j < 15; j++) {
//		 if(weightboard[i][j] == 0){
//		 System.out.print("_ ");
//		 }else{
//		 System.out.print(weightboard[i][j]+" ");
//		 }
//		 }
//		 System.out.println(" ");
//		 }

		double maxweight = 0;
		for (int i = 0; i < 15; i++) {// 找最大权重
			for (int j = 0; j < 15; j++) {
				if (weightboard[i][j] >= maxweight) {
					maxweight = weightboard[i][j];
				}
			}
		}
		int count = 0;
		int selectchess = 0;
		Chesswithoutcolor[] rawchess = new Chesswithoutcolor[225];// 所以权重最高的点列
		if (maxweight == 0) {
			finalChess = new Chesswithoutcolor(7, 7);
		} else {

			for (int i = 0; i < 15; i++) {// 找最大权重点坐标
				for (int j = 0; j < 15; j++) {
					if (weightboard[i][j] == maxweight) {
						rawchess[count] = new Chesswithoutcolor(i, j);
						count++;
					}
				}
			}

			Random random = new Random();
			selectchess = random.nextInt(count);
			finalChess = rawchess[selectchess];
		}
//		System.out.println("rivalweight" + rivalweightmultiple + "selfcolor:"
//				+ selfcolor + " count:" + count + " random:" + selectchess);
//		for (int i = 0; i < count; i++) {
//			if (null == rawchess[i]) {
//				System.out.println(i + " " + "null");
//			} else {
//				System.out.println(i + " " + "exist");
//			}
//		}
//		int x = finalChess.getX();
//		int y = finalChess.getY();
//		System.out.println("rivalweight" + rivalweightmultiple + "selfcolor:"
//				+ selfcolor + "坐标：" + x + "," + y + " count:" + count
//				+ " random:" + selectchess);
		return finalChess;
	}
}
