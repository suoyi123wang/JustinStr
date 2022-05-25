package renju;

import java.util.Scanner;

public class UI {
	private static Scanner scanner = new Scanner(System.in);

	public static void writeLine(String message) {
		System.out.println(message);
	}

	public static String readLine() {
		return scanner.nextLine();
	}

	public static void paintBoard(Board board) {
		int i, j;
		System.out.print("   ");
		for (i = 0; i < 15; i++) {
			System.out.print((char) ('A' + i) + "  ");
		}
		System.out.println();

		for (i = 0; i < Board.MAX_X; i++) {
			System.out.printf("%2d ", i + 1);
			for (j = 0; j < Board.MAX_Y; j++) {
				if (board.getStones()[i][j] == null) {
					System.out.print("+  ");
				} else {
					UI.printStone(board.getStones()[i][j]);
				}
			}
			System.out.println();
		}
	}

	private static void printStone(Stone currentStone) {
		if (currentStone.getColor() == Stone.BLACK) {
			System.out.print("B  ");
		} else if (currentStone.getColor() == Stone.WHITE) {
			System.out.print("W  ");
		}
	}
	public static void undo(Stone stone){
		
			Board.undoStone(stone);
			Record.undoStone();
			
		}
		
		
	} 
