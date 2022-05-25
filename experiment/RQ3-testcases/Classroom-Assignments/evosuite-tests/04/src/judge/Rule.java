package judge;

import game.Game;
import game.Start;
import unseen.Board;

public class Rule {

    public static boolean ifCorrect(String inputLocation) {
        int z = inputLocation.length();
        boolean ifCorrect = false;
        if (z < 2) {
            Start.ui.printMessage("\nnot correct!");
            ifCorrect = false;
            return ifCorrect;
        }

        int x = (int) (inputLocation.charAt(0) - 'A');
        int y = Integer.parseInt(inputLocation.substring(3)) - 1;
        if (y >= 1 && y <= 15) {
            if (Board.getLocation(x, y) != 0) {
                ifCorrect = false;
                Start.ui.printMessage("\nThis location has been occupied! ");
            } else {
                ifCorrect = true;
            }
        }

        return ifCorrect;
    }

    public void result() {
        if (((Board.getNumberOfChess() + 1) % 2 + 1) == 1) {
            Start.ui.printMessage(Game.player1.getPlayerName() + " wins!");
        }
        if (((Board.getNumberOfChess() + 1) % 2 + 1) == 2) {
            Start.ui.printMessage(Game.player2.getPlayerName() + " wins!");
        }

    }

	public boolean judge() {
		return false;
	}
}
