package wuziqi;

public class GomokuRule extends Rule {

	public int forbidden_chess_input_longconnection(Chess inputChess,String[][] board){
		int result = 0;
		return result;
	}
	public int forbidden_chess_input_44(Chess inputChess, String[][] board) {
		int result = 0;
		return result;
	}
	public boolean forbiddeninput(Chess inputChess, String[][] board){
		boolean result = false;
		return result;
	}
	
	public int isvictory(String[][] board) {
		int result = 0;
		int[][] chess = new int[23][23];// �ж�ʱ����һ����������̷�ֹ����,���������ԭ15��15�����̱��ϼ�������������ɵ�
		for (int i = 0; i <= 14; i++) {
			for (int j = 0; j <= 14; j++) {
				if (board[i][j].equals("o ")) {
					chess[i + 4][j + 4] = 1;
				} else if (board[i][j].equals("+ ")) {
					chess[i + 4][j + 4] = 0;
				} else if (board[i][j].equals("�� ")) {
					chess[i + 4][j + 4] = -1;
				}
			}
		}

		isvictory:

		for (int i = 4; i <= 18; i++) {
			for (int j = 4; j <= 18; j++) {
				if (chess[i][j] == 1 && chess[i + 1][j + 1] == 1
						&& chess[i + 2][j + 2] == 1 && chess[i + 3][j + 3] == 1
						&& chess[i + 4][j + 4] == 1) {
					result = 1;// y=x����
					break isvictory;
				} else if (chess[i][j] == 1 && chess[i + 1][j] == 1
						&& chess[i + 2][j] == 1 && chess[i + 3][j] == 1
						&& chess[i + 4][j] == 1) {
					result = 1;// ˮƽ����
					break isvictory;
				} else if (chess[i][j] == 1 && chess[i][j + 1] == 1
						&& chess[i][j + 2] == 1 && chess[i][j + 3] == 1
						&& chess[i][j + 4] == 1) {
					result = 1;// ��ֱ����
					break isvictory;
				} else if (chess[i][j] == 1 && chess[i + 1][j - 1] == 1
						&& chess[i + 2][j - 2] == 1 && chess[i + 3][j - 3] == 1
						&& chess[i + 4][j - 4] == 1) {
					result = 1;// y=-x����
					break isvictory;
				}

				else if (chess[i][j] == -1 && chess[i + 1][j + 1] == -1
						&& chess[i + 2][j + 2] == -1
						&& chess[i + 3][j + 3] == -1
						&& chess[i + 4][j + 4] == -1) {
					result = -1;// y=x����
					break isvictory;
				} else if (chess[i][j] == -1 && chess[i + 1][j] == -1
						&& chess[i + 2][j] == -1 && chess[i + 3][j] == -1
						&& chess[i + 4][j] == -1) {
					result = -1;// ˮƽ����
					break isvictory;
				} else if (chess[i][j] == -1 && chess[i][j + 1] == -1
						&& chess[i][j + 2] == -1 && chess[i][j + 3] == -1
						&& chess[i][j + 4] == -1) {
					result = -1;// ��ֱ����
					break isvictory;
				} else if (chess[i][j] == -1 && chess[i + 1][j - 1] == -1
						&& chess[i + 2][j - 2] == -1
						&& chess[i + 3][j - 3] == -1
						&& chess[i + 4][j - 4] == -1) {
					result = -1;// y=-x����
					break isvictory;
				}
			}
		}
		return result;
	}

}
