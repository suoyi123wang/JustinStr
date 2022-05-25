package homework;

import java.util.Scanner;



public class Game {

	UI ui;
	Player player1;
	Player player2;
	final String color1 = "B";
	final String color2 = "W";
	Rule rule;
	ChessRecordManager s = new ChessRecordManager();
	GameRecordManager mng = new GameRecordManager();

	Game() {
		ui = this.chooseUi();
		player1 = ui.player1mode();
		player2 = ui.player2mode();
		rule = ui.chooseRule();
	}

	public UI chooseUi() {
		System.out
				.println("enter the ui mode,1 for console,2 for Graphics.format:1 or 2");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		return (input == 1) ? new ConsoleUI() : new GraphicsUI();
	}

	Game(String inf) {
	
		player1 = (inf.charAt(0) == '1') ? new HumanPlayer() : new AIPlayer();
		player2 = (inf.charAt(1) == '1') ? new HumanPlayer() : new AIPlayer();
		rule = (inf.charAt(2) == '1') ? new GomokuRule() : new RenjuRule();

	}

	/*
	 * use count1 to record the player1's steps. use count2 to record the
	 * player2's step. suse count to record the total steps
	 */
	public int startGame(int count1, int count2, int count) {
		switch (count % 2) {
		case 0:
			while (true) {
				if (s.isSave(count)) {
		
					s.save(count1, count2, player1, player2);
					System.exit(0);
				}
                  boolean w1=this.gamePlayer1(count1, color1, player1, rule);
				if (w1) {
					System.exit(0);
				}
				count1++;
				if (rule.isRemove(count1, count2)) {
					rule.remove(count1, count2);
					count1--;
					count2--;
				}

				count = count1 + count2;
				if (s.isSave(count)) {
				
					s.save(count1, count2, player1, player2);
					System.exit(0);

				}
				 boolean w2=this.gamePlayer2(count2, color2, player2, rule);
				if (w2) {
					System.exit(0);
				}
				count2++;
				if (rule.isRemove(count1, count2)) {
					rule.remove(count1, count2);
					count1--;
					count2--;
				}
				count = count1 + count2;
			}
		case 1:
			while (true) {
				if (s.isSave(count)) {
					
					s.save(count1, count2, player1, player2);
					System.exit(0);

				}
				boolean w3 = this.gamePlayer2(count2, color2, player2, rule);
				if (w3) {
					System.exit(0);
				}
				count2++;

				if (rule.isRemove(count1, count2)) {
					rule.remove(count1, count2);
					count1--;
					count2--;
				}

				count = count1 + count2;
				if (s.isSave(count)) {
					
					s.save(count1, count2, player1, player2);
					System.exit(0);
				}
                 boolean w4=this.gamePlayer1(count1, color1, player1, rule);
				if (w4) {
					System.exit(0);

				}
				count1++;
				if (rule.isRemove(count1, count2)) {
					rule.remove(count1, count2);
					count1--;
					count2--;
				}
				count = count1 + count2;
			}
		}

		return count;
	}

	public boolean gamePlayer1(int count1, String scanner, Player player1,
			Rule rule) {
		player1.parsePlayer1(count1, player1.input());
		rule.choosePlayer1(count1);
		boolean w1 = rule.isPlayer1Win(count1, "Black") || rule.isDraw();

		return w1;
	}

	public boolean gamePlayer2(int count2, String scanner, Player player2,
			Rule rule) {
		player2.parsePlayer2(count2, player2.input());
		rule.choosePlayer2(count2);
		boolean w2 = rule.isPlayer2Win(count2, "White") || rule.isDraw();

		return w2;
	}
}