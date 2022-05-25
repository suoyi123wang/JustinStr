package renju;

import java.io.FileNotFoundException;

public class Main {
        
	public static void main(String[] args) throws FileNotFoundException {
		UI.writeLine("请选择双方玩家，形如Human Human或AI AI");
		String[] players = UI.readLine().split(" ");
		Player one = new HumanPlayer(1, Stone.BLACK);
		Player two = new HumanPlayer(2, Stone.WHITE);
		if (players[0].equals("Human")) {
			one = new HumanPlayer(1, Stone.BLACK);
		} else if (players[0].equals("AI")) {
			one = new AIPlayer(1, Stone.BLACK);
		}
		if (players[1].equals("Human")) {
			two = new HumanPlayer(2, Stone.WHITE);
		} else if (players[1].equals("AI")) {
			two = new AIPlayer(2, Stone.WHITE);
		}
	    
		Game game = Game.create(one, two);
		game.start();

	}

}