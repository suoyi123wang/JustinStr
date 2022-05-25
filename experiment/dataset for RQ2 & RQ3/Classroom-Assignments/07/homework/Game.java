package homework;

public class Game {

	public Game(String p1, String p2, String rule) {
		String[][] board = new String[15][15];
		int victory = 0;
		for (int i = 0; i <= 14; i++) {
			for (int j = 0; j <= 14; j++) {
				board[i][j] = "+ ";
			}
		}

		Player player1 = null;//player1是先手，2是后手
		Player player2 = null;
		GraphicsUI boardprinter = new GraphicsUI();
		Rule referee = null;

		if (p1.equals("human")) {
			player1 = new HumanPlayer();

		} else if (p1.equals("AI")) {
			player1 = new AIPlayer();

		}

		if (p2.equals("human")) {
			player2 = new HumanPlayer();

		} else if (p2.equals("AI")) {
			player2 = new AIPlayer();

		}
		
		player1.color = "B";
		player2.color = "W";

		if (rule.equals("G")) {
			referee = new GomokuRule();

		} else if (rule.equals("R")) {
			// referee = new RenjuRule();
			referee = new GomokuRule();
		}

		boardprinter.boardprinter(board);

		System.out.printf("%n");
		System.out.printf("%n");
		System.out.println("游戏开始！");

		Game:

		while (true) {
			int result = 0;
			Chesswithoutcolor chesswithoutcolor1 = player1.Playerinput(board);
			Chess chess1 = new Chess(chesswithoutcolor1, "● ");
			int x1 = chess1.getX();
			int y1 = chess1.getY();
			board[x1][y1] = chess1.getColor();
			boardprinter.boardprinter(board);
			result = referee.isvictory(board);
			if (result != 0) {
				victory = result;
				break Game;
			}

			Chesswithoutcolor chesswithoutcolor2 = player2.Playerinput(board);
			Chess chess2 = new Chess(chesswithoutcolor2, "o ");
			int x2 = chess2.getX();
			int y2 = chess2.getY();
			board[x2][y2] = chess2.getColor();
			boardprinter.boardprinter(board);
			result = referee.isvictory(board);
			if (result != 0) {
				victory = result;
				break Game;
			}

		}

		if (victory == 1) {
			System.out.println("游戏结束！");
			System.out.println("白棋胜！");
		} else if (victory == -1) {
			System.out.println("游戏结束！");
			System.out.println("黑棋胜！");
		}
	}
}
