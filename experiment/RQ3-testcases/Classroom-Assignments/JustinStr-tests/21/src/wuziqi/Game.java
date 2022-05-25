package wuziqi;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.awt.EventQueue;

public class Game {

	public void startgame(String p1, String p2, String rule,
			java.io.File record, boolean continuegame, java.io.File continueFile)
			throws Exception {
		String[][] board = new String[15][15];
		int victory = 0;
		int pace = 1;
		int result = 0;
		java.io.PrintWriter output = new java.io.PrintWriter(record);
		Record recorder = new Record();
		BoardPrinter boardprinter = new BoardPrinter();

		Player player1 = null;// player1�����֣�2�Ǻ���
		Player player2 = null;
		Rule referee = null;

		if(continuegame == false){
		for (int i = 0; i <= 14; i++) {// ��ʼ�����̲���
			for (int j = 0; j <= 14; j++) {
				board[i][j] = "+ ";
			}
		}
		
		if (p1.equals("human")) {
			player1 = new HumanPlayer();

		} else if (p1.equals("AI")) {
			player1 = new AIPlayer();
			player1.setcolor("B");
			String setmode;
			while(true){
			System.out
					.println("���������AI�Ĳ��ԣ�ƫ�������:attack.ƫ�������:defend.������:balance.��������ò���");
			Scanner modescanner = new Scanner(System.in);
			setmode = modescanner.next();
			if(setmode.equals("attack") || setmode.equals("balance") || setmode.equals("defend")){
				break;
			}else{
				System.out.println("�������");
			}
			}
			player1.setmode(setmode);

		}

		if (p2.equals("human")) {
			player2 = new HumanPlayer();

		} else if (p2.equals("AI")) {
			player2 = new AIPlayer();
			player2.setcolor("W");
			String setmode;
			while(true){
			System.out
					.println("���������AI�Ĳ��ԣ�ƫ�������:attack.ƫ�������:defend.������:balance.��������ò���");
			Scanner modescanner = new Scanner(System.in);
			setmode = modescanner.next();
			if(setmode.equals("attack") || setmode.equals("balance") || setmode.equals("defend")){
				break;
			}else{
				System.out.println("�������");
			}
			}
			player2.setmode(setmode);

		}

		player1.color = "B";
		player2.color = "W";

		if (rule.equals("G")) {
			referee = new GomokuRule();

		} else if (rule.equals("Y")) {
			referee = new YangRule();
		}

		boardprinter.boardprinter(board);

		System.out.printf("%n");
		System.out.printf("%n");
		System.out.println("��Ϸ��ʼ��");
}
		if (continuegame == true) {
			Scanner scanner = new Scanner(continueFile);
			String title1 = scanner.next();
			title1 = recorder.IOtitletranslator(title1);
			String title2 = scanner.next();
			title2 = recorder.IOtitletranslator(title2);
			String title3 = scanner.next();
			title3 = recorder.IOtitletranslator(title3);
			String title4 = scanner.next();
			title4 = recorder.IOtitletranslator(title4);
			
			String title5 = scanner.next();
			title5 = recorder.IOtitletranslator(title5);
			
			String title6 = scanner.next();
			title6 = recorder.IOtitletranslator(title6);
			
			if(title1.equals("human")){
				player1 = new HumanPlayer();
			}else if(title1.equals("AI")){
				player1 = new AIPlayer();
				player1.setmode(title4);
				
			}
			
			if(title2.equals("human")){
				player2 = new HumanPlayer();
			}else if(title2.equals("AI")){
				player2 = new AIPlayer();
				player2.setmode(title5);
				
			}
			
			if(title3.equals("G")){
				referee = new GomokuRule();
			}else if(title3.equals("Y")){
		referee = new YangRule();
			}
			
			for(int i = 0;i <225;i++){
				
				String sx = scanner.next();
				sx = recorder.IObodytranslator(sx);
				String sy = scanner.next();
				sy = recorder.IObodytranslator(sy);
				String scolor = scanner.next();
				scolor = recorder.IObodytranslator(scolor);

				int x = recorder.binarytodecimal(sx);
				int y = recorder.binarytodecimal(sy);

				board[x][y] = scolor;
			}			
			
			
			boardprinter.boardprinter(board);

			System.out.printf("%n");
			System.out.printf("%n");
			System.out.println("��Ϸ��ʼ��");
			
			
			if(title6.equals("W")){
				System.out.println("�׷��غ�");
				Chesswithoutcolor chesswithoutcolor2 = player2.Playerinput(board);
				Chess chess2 = new Chess(chesswithoutcolor2, "o ");
				int x2 = chess2.getX();
				int y2 = chess2.getY();
				board[x2][y2] = chess2.getColor();
				
				boardprinter.boardprinter(board);
				result = referee.isvictory(board);
				
				int sum = 0;
				for (int i = 0; i < 15; i++) {
					for (int j = 0; j < 15; j++) {
						if (!board[i][j].equals("+ ")) {
							sum = sum - 1;
						}
					}
				}
				if (sum == -225) {
					result = -2;
					
				} else {
					sum = 0;
				}
				
				if (result == 1) {
					System.out.println("��Ϸ������");
					System.out.println("����ʤ��");
				} else if (result == -1) {
					System.out.println("��Ϸ������");
					System.out.println("����ʤ��");
				} else if (result == -2) {
					System.out.println("��Ϸ������");
					System.out.println("ƽ�֣�");
				}
			}
		}

		
		String[][] beforeW = new String[15][15];
		String[][] beforeB = new String[15][15];
		for (int i = 0; i <= 14; i++) {// ��ʼ�����̲���
			for (int j = 0; j <= 14; j++) {
				beforeW[i][j] = "+ ";
				beforeB[i][j] = "+ ";
			}
		}
		String nextinput = null;

		Game:

		while (true) {

			System.out.println("�ڷ��غ�");
			int sum = 0;
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					if (!board[i][j].equals("+ ")) {
						sum = sum - 1;
					}
				}
			}
			if (sum == -225) {
				result = -2;
				nextinput = "B";
				break Game;
			} else {
				sum = 0;
			}
			beforeB = copyboard(board);//�ڷ�δ����ʱ��״̬
			Chesswithoutcolor chesswithoutcolor1 = player1.Playerinput(board);
			Chess chess1 = new Chess(chesswithoutcolor1, "�� ");
			int x1 = chess1.getX();
			int y1 = chess1.getY();
			boolean forbiddenresult = referee.forbiddeninput(chess1, board);
			board[x1][y1] = chess1.getColor();
			
			boardprinter.boardprinter(board);
			if (forbiddenresult == true) {
				System.out.println("�ڷ����ڽ��ֶ����и�");
				result = 1;// white win
				 nextinput = "W";
				break Game;
			}
			result = referee.isvictory(board);

			if (result != 0) {
				victory = result;
				 nextinput = "W";
				break Game;
			}
			
	           boolean quitandsaveforB = player1.quitandsave();
	           if(quitandsaveforB == true){
	        	   nextinput = "W";
	        	   break Game;
	           }
	           
			System.out.println("�׷��Ƿ�Ҫ���壿");
			boolean regretW = player2.regret();
			if(regretW == true){
				System.out.println("��ѡ�����");
				board  = copyboard(beforeW);
			}

			System.out.println("�׷��غ�");
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					if (!board[i][j].equals("+ ")) {
						sum = sum - 1;
					}
				}
			}
			if (sum == -225) {
				result = -2;
				nextinput = "W";
				break Game;
			} else {
				sum = 0;
			}
			beforeW = copyboard(board);
			Chesswithoutcolor chesswithoutcolor2 = player2.Playerinput(board);
			Chess chess2 = new Chess(chesswithoutcolor2, "o ");
			int x2 = chess2.getX();
			int y2 = chess2.getY();
			board[x2][y2] = chess2.getColor();
			
			boardprinter.boardprinter(board);
			result = referee.isvictory(board);

			if (result != 0) {
				victory = result;
				nextinput = "B";
				break Game;
			}
			
	           boolean quitandsaveforW = player2.quitandsave();
	           if(quitandsaveforW == true){
	        	   nextinput = "B";
	        	   break Game;
	           }
	           
			System.out.println("�ڷ��Ƿ�Ҫ���壿");
			boolean regretB = player1.regret();
			if(regretB == true){
				System.out.println("��ѡ�����");
				board  = copyboard(beforeB);
			}
			pace++;

		}
		
		double p1weight = player1.rivalweightmultiple;
		double p2weight = player2.rivalweightmultiple;
		System.out.println("�������̽��ᱻ�浵��");
		boardprinter.boardprinter(board);
		if (victory == 1) {
			System.out.println("��Ϸ������");
			System.out.println("����ʤ��");
		} else if (victory == -1) {
			System.out.println("��Ϸ������");
			System.out.println("����ʤ��");
		} else if (victory == -2) {
			System.out.println("��Ϸ������");
			System.out.println("ƽ�֣�");
		}
		recorder.IOtitle(p1, p1weight, p2, p2weight, rule, nextinput, record, output);
		recorder.IOrecorder(board, record, output);
		recorder.recordcloser("close", output);
		System.out.println("����ɹ���");
	}
	
	private String[][] copyboard (String[][] board){
		String[][] regretboard = new String[15][15];
		for(int i = 0;i <15;i++){
			for(int j = 0;j <15; j++){
				regretboard[i][j] = board[i][j];
			}
		}
		return regretboard;
	}

}
