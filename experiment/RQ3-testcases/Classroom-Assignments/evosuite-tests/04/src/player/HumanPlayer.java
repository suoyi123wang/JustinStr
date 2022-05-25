package player;

import player.Player;
import unseen.Board;
import game.Start;

public class HumanPlayer extends Player {
	public HumanPlayer() {
	}

	public HumanPlayer(String id, int color) {
		super(id, color);
	}

	public void enterChess() {
		String inputLocation = Start.ui.enterChess();
		Board.setChess(Board.getNumberOfChess(),
				(int) (inputLocation.charAt(0) - 'A'),
				Integer.parseInt(inputLocation.substring(2)) - 1,
				(Board.getNumberOfChess() + 1) % 2 + 1);
		
		 Board.setLocation((int) (inputLocation.charAt(0) - 'A'),
		  Integer.parseInt(inputLocation.substring(2)) - 1,
		  (Board.getNumberOfChess() + 1) % 2 + 1);
		 
	}
}
