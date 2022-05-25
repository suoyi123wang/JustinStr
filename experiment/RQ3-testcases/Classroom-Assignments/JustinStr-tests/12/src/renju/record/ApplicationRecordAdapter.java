package renju.record;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import renju.QiZi;

import renju.rule.GomokuRule;

public class ApplicationRecordAdapter implements RecordAdapter{
	@Override
	public void save(Record record, String fileName,String mode) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("PLAYER 1"+" "+"HUMANPLAYER"+"\r\n");
		stringBuilder.append("PLAYER 2" +" " + (mode.equals("PP") ? "HUMANPLAYER" : "AIPLAYER")+"\r\n");
		stringBuilder.append("RULE" +" "+((record.getRule() instanceof GomokuRule) ? "Gomoku"
				: "Renju") + "\r\n" );
	
		int i = 0;
		for (i = 0; i < record.getCount(); i++) {
			QiZi qizi = record.getStones()[i];
			stringBuilder.append("PLACE "
					+ ((qizi.getColor() == Color.BLACK) ? "BLACK" : "WHITE")
					+ " " + (char) (qizi.getY() + 'A' - 1) + qizi.getX()
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
	@Override
	public Record load(String fileName) {
		File file = new File(fileName);
		if (!file.exists()) {
			
			return null;
		}
		try {
			Record record = new Record();

			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String command = scanner.next();
				if (command.equals("PLAYER")) {
					int id = scanner.nextInt();
					String type = scanner.nextLine();
					System.out.println(type);
					if (id == 2) {
						record.setMode(type.contains("HUMAN") ? "PP" :"AP");
					} 
				} else if (command.equals("RULE")) {
											
				System.out.print("RULE"+scanner.nextLine());
				} else if (command.equals("PLACE")) {
					
					System.out.println();
					System.out.print("PLACE"+scanner.nextLine());
				}
			}

			scanner.close();
			record.setRule(new GomokuRule());
			return record;
		}catch (FileNotFoundException e) {
	
			e.printStackTrace();
			return null;
		}
}
}
