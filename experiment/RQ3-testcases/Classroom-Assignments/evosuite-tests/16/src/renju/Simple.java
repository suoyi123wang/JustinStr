package renju;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import renju.AI_Player;
import renju.HumanPlayer;
import renju.GomokuRule;
import renju.Stone;

public class Simple implements DatebaseAdapter {

	public void save(Database record, String fileName) {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("PLAYER 1 "
				+ ((record.getPlayer1() instanceof HumanPlayer) ? "Human"
						: "AI") +(record.getName1())+ "\r\n");
		stringBuilder.append("PLAYER 2 "
				+ ((record.getPlayer2() instanceof HumanPlayer) ? "Human"
						: "AI")+(record.getName2()) + "\r\n");
		stringBuilder.append("RULE "
				+ ((record.getRules() instanceof GomokuRule) ? "Gomoku"
						: "Renju") + "\r\n");

		int i = 0;
		for (i = 0; i < record.getCount(); i++) {
			Stone stone = record.getStones()[i];
			stringBuilder.append((i+1)+"PLACE "
					+ ((stone.getColor() == Stone.BLACK) ? "BLACK" : "WHITE")
					+ " " + (char) (stone.getY() + 'A' - 1) + stone.getX()
					+ "\r\n");
		}
		

		File file = new File(fileName);

		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter(file);
			printWriter.print(stringBuilder.toString());
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
    
	public Database load (String fileName) {
		File file = new File(fileName);
		if (!file.exists()) {
			return null;
		}
		try {
			Database record = new Database();

			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String command = scanner.next();
				int i=1;
				
				if (command.equals("PLAYER")) {
					int id = scanner.nextInt();
					String type = scanner.nextLine();
					System.out.println(type);
					if (id == 1) {
						record.setPlayer1(type.contains("Human") ? new HumanPlayer(
								id, id == 1 ? Stone.BLACK : Stone.WHITE)
								: new AI_Player(id, id == 1 ? Stone.BLACK
										: Stone.WHITE));
					} else {
						record.setPlayer2(type.contains("Human") ? new HumanPlayer(
								id, id == 1 ? Stone.BLACK : Stone.WHITE)
								: new AI_Player(id, id == 1 ? Stone.BLACK
										: Stone.WHITE));
					}
				} else if (command.contains("RULE")) {
					System.out.println(command);
					scanner.nextLine();
				} else if (command.contains("PLACE")) {
					System.out.println(command);
					//record.print();
					scanner.nextLine();
				}
				
				i++;
			}

			scanner.close();

	
			return record;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	
}
