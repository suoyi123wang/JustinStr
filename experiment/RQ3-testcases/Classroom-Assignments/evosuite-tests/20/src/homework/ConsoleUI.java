package homework;

import java.util.Scanner;

public class ConsoleUI implements UI {

	public static int[] order = new int[3];

	public Player player1mode() {
		System.out
				.println("Please choose the player1's mode(1 for human,2 for computer) format:1 or 2");
		Scanner input = new Scanner(System.in);
		int input1 = input.nextInt();
		order[0] = input1;
		return (input1 == 1) ? new HumanPlayer() : new AIPlayer();
	}

	public Player player2mode() {
		System.out
				.println("Please choose the player2's mode(1 for human,2 for computer) format:1 or 2");
		Scanner input = new Scanner(System.in);
		int input2 = input.nextInt();
		order[1] = input2;
		return (input2 == 1) ? new HumanPlayer() : new AIPlayer();
	}

	public Rule chooseRule() {
		System.out
				.println("Please choose the rule(1 for gomoku（无禁手）,2 for renju(有禁手))");
		Scanner input = new Scanner(System.in);
		int input3 = input.nextInt();
		order[2] = input3;
		return (input3 == 1) ? new GomokuRule() : new RenjuRule();
	}

}
