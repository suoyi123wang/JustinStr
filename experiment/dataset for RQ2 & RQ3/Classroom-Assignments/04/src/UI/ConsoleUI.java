package UI;

import game.Game;
import game.Start;
import judge.Rule;
import unseen.Board;

public class ConsoleUI implements UI{

	private int numberOfChess = Board.getNumberOfChess();
	private String[][] axis ={{" A"," B"," C"," D"," E"," F"," G"," H"," I"," J"," K"," L"," M"," N"," O"},{ " 1", " 2", " 3", " 4", " 5", " 6", " 7",
		" 8", " 9", "10", "11", "12", "13", "14", "15" }};
	java.util.Scanner input = new java.util.Scanner(System.in);
	
	public void Go(){
		System.out.println("enter 11 to start a PvP game with GomokuRule,"
				+ "\n\t 12 to start a PvP game with RenjuRule"
				+ "\nor enter 21 to start a PvE game with GomokuRule,"
				+ "\n\t 22 to start a PvE game with RenjuRule.");
		System.out.println("Only GomokuRule is available..");
	}
	
	public String enterChess() {
		boolean ifCorrect = false;
		String inputLocation;
		java.util.Scanner input = new java.util.Scanner(System.in);
		do {
			if (((Board.getNumberOfChess() + 1) % 2 + 1) == 1) {
				System.out.println(Game.player1.getPlayerName()
						+": Enter your " + (Board.getNumberOfChess() + 1) / 2
						+ " points: " + "\nfor example: A,10 ");
			}
			if (((Board.getNumberOfChess() + 1) % 2 + 1) == 2) {
				System.out.println(Game.player1.getPlayerName()
						+ ": Enter your " + (Board.getNumberOfChess() + 1) / 2
						+ " points: " + "\nfor example: A,10 ");
			}
			inputLocation = input.next();
			ifCorrect = Rule.ifCorrect(inputLocation);
		} while (ifCorrect == false);
		return inputLocation;
		//input.close();
	}
	
	public void printChessBoard() {

		//Board.setLocation(Board.chess[numberOfChess].getX(), Board.chess[numberOfChess].getY(), Board.chess[numberOfChess].getC());
		System.out.print("  ");
		for (int a = 0; a < 15; a++) {
			System.out.print(axis[0][a]);
		}
		System.out.println();

		for (int q = 0; q < 15; q++) {
			System.out.print(axis[1][q]);
			for (int w = 0; w < 15; w++) {
				if (Board.getLocation(w, q) == 1) {
					System.out.print(" ¡ñ");
				}
				if (Board.getLocation(w, q) == 2) {
					System.out.print(" ¡ð");
				}
				if (Board.getLocation(w, q) == 0) {
					System.out.print(" `");
				}
			}
			System.out.println();
		}
		System.out.print("\n");
	}
	
	public boolean ifBack(){
		System.out.println("Take a back move?"+"\n\tIf yes, enter y or Y."+ "\n\tIf not, enter any letter to continue.");
		String ifBack = input.next();
		if(ifBack.toLowerCase().equals("y")){
			Board.setLocation(Board.chess[numberOfChess].getX(), Board.chess[numberOfChess].getY(),0);
			Board.chess[numberOfChess].setX(0);
			Board.chess[numberOfChess].setY(0);
			Board.chess[numberOfChess].setC(0);
			return true;
		}
		return false;
	}

	@Override
	public void printMessage(String message) {
		System.out.println(message);
	}
}
