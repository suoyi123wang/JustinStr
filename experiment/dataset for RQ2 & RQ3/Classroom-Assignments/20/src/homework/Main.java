package homework;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int count1;
		int count2;
		ChessRecordManager s = new ChessRecordManager();
		GameRecordManager mng = new GameRecordManager();
		String  a = JOptionPane.showInputDialog("����������GUI��������1����������������������");
		int a1 = Integer.parseInt(a);
		if(a1==1){
			GraphicsUI gh= new GraphicsUI();
			gh.processGraphicsUI();
		}
		
		if (s.isLoad()) {
			mng.getHelp();
			while (true) {
				Scanner input = new Scanner(System.in);
				String scanner=input.nextLine();
				if (scanner.equalsIgnoreCase("end"))
					break;
				mng.parseScanner(scanner);
			}
			mng.getHelp1();
			Scanner input1 = new Scanner(System.in);
			mng.parseScanner1(input1.nextLine());
			String inf = s.load();
			Game game = new Game(inf);
			int count = Integer.parseInt(inf.substring(3));
			if (count % 2 == 0) {
				count1 = count / 2;
				count2 = count1;
			} else {
				count1 = (count + 1) / 2;
				count2 = count1 - 1;
			}
			game.startGame(count1, count2, count);

		}

		else {
			Game game = new Game();
			game.startGame(0, 0, 0);
		}

	}
}
