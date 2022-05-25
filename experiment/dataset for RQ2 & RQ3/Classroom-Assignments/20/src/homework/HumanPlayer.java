package homework;

import java.util.Scanner;

public class HumanPlayer extends Player {

	Board board = new Board();
	ChessRecord record = new ChessRecord();

	public String parsePlayer1(int count, String scanner) {
		while (true) {
			int a = scanner.toUpperCase().charAt(0) - 'A' + 1;
			int b = Integer.parseInt(scanner.substring(1));
			boolean w = this.isNoRepeat(count, scanner);
			if (w) {
			
				Board.chess[b - 1][a - 1] = SetLevel.BLACK_CHESS;
				ChessRecord.a1[count] = b;
				ChessRecord.a2[count] = a;
				Board.printBoard();
				record.printStones1(count);
				break;
			} else {
				scanner = this.input();
			}
		}
		return scanner;
	}

	public String parsePlayer2(int count, String scanner) {

		while (true) {

			int a = scanner.toUpperCase().charAt(0) - 'A' + 1;
			int b = Integer.parseInt(scanner.substring(1));
			boolean w = this.isNoRepeat(count+1, scanner);
			if (w) {
			
				Board.chess[b - 1][a - 1] = SetLevel.WHITE_CHESS;
				ChessRecord.b1[count] = b;
				ChessRecord.b2[count] = a;
				Board.printBoard();
				record.printStones2(count);
				break;
			} else {
				scanner = this.input();
			}
		}
		return scanner;
	}

	public boolean isLegal(String scanner) {
		int a = scanner.toUpperCase().charAt(0) - 'A' + 1;
		int b = Integer.parseInt(scanner.substring(1));
		return (a <= ChessRecord.Width && b <= ChessRecord.Length && a > 0 && b > 0);

	}

	public boolean isNoRepeat(int count, String scanner) {

		int b = scanner.toUpperCase().charAt(0) - 'A' + 1;
		int a = Integer.parseInt(scanner.substring(1));
		boolean w = true;
		for (int i = 0; i < ChessRecord.Length * ChessRecord.Width; i++) {
			if (i != count) {
				if ((a == ChessRecord.a1[i] && b == ChessRecord.a2[i])
						|| (a == ChessRecord.b1[i] && b == ChessRecord.b2[i])) {
					w = false;
					System.out.println("repeat, input again");
				}
			}
		}
		return w;
	}

	public String input() {
		String legalInput;
		while (true) {
			System.out.println("finish your input, format: a1(A1),b1(B1)");
			Scanner input = new Scanner(System.in);
			String scanner = input.nextLine();
			if (this.isLegal(scanner)) {
				legalInput = scanner;
				break;
			} else {
				System.out.println("input out of bounds, input again");
			}
		}
		return legalInput;
	}

}