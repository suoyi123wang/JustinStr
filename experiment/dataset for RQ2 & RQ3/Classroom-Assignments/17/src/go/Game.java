package go;



import java.util.Scanner;

import go.Result;
import go.Board;

public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//�½�һ��15*15����������
		Stone[][] board = new Stone[15][15];
		Board boardtool = new Board(board);
		
		Player playerOne = new Player("Black");
		Player playerTwo = new Player("White");
		
//		System.out.println("��ӭʹ�������壬��ѡ����Ϸ���򣺣�1��Standard Gomoku����2��Gomoku-Pro����3��Renju ��ʽ����4��Renju RIF����5��Renju Yamaguchi����");
//		
//		boolean ruleLegal = false;
//		String rule = null;
//		while (ruleLegal == false) {
//			rule = scanner.nextLine();
//			if (rule.equals("1") || rule.equals("2") || rule.equals("3") || rule.equals("4")|| rule.equals("5")) {
//				ruleLegal = true;
//				break;
//			} else {
//				System.out.println("���벻�Ϸ���������1-5������ѡ�����");
//				continue;
//			}
//		} 
//		
//		int ruleInt = Integer.parseInt(rule);
		int count = 1;
		int color = 1;
		Stone[] manual = new Stone[225];
		Player player = new Player();
//		
//		switch (ruleInt) {
//    	case 1: 
//    		System.out.println("��ѡ����Standard Gomoku����");
//    		System.out.println("��Ϸ��ʼ���������֣���ѡ��һ�����1��,��ʽΪA1 B2��");
		
		boolean isEnd = false;
		while (isEnd == false){
		
		if (color == 1) {
			System.out.println("�������롣");
		} else {
			System.out.println("�������롣");
		}
			
		Stone currentStone = null;
		    
    		boolean coordinateOne1Legal = false;
			while (coordinateOne1Legal == false) {
				String coordinateOne1;
		        coordinateOne1 = scanner.nextLine();
		        if (player.getStone(coordinateOne1, color) == null ) {
		        	coordinateOne1Legal = false;
		        	continue;
		        } else {
		            currentStone = player.getStone(coordinateOne1, color);
		            if (boardtool.islegal(currentStone) == false) {
		            	coordinateOne1Legal = false;
		            	continue;
		            } else { 	
		            	if (board[currentStone.x - 1][currentStone.y - 1] == null) {
		            		manual[count - 1] = currentStone;
    		                board[currentStone.x - 1][currentStone.y - 1] =currentStone;
    		                coordinateOne1Legal = true;
    		                break;
		            	} else {
		            		System.out.println("��������������,���������롣");
		            		coordinateOne1Legal = false;
		            		continue;
		            	}
		            }
		   
		        }
		        }
			
			//��ӡ����
			boardtool.printBoard(board);
			
			
			
			Rule judge = new GomokuRule();
			
			Result result = judge.judge(currentStone, board);
			
			System.out.println(result);
			
			if (result != Result.NEXT){
				switch(result) {
				case WIN:
					if (player.color == 1) {
					    System.out.println("�����ʤ��");
					} else {
						System.out.println("�����ʤ��");
					}
					break;
				case DRAW:
					System.out.println("����");
					break;
				case FORBIDDEN:
					System.out.println("������֣������ʤ��");
					break;
				}
				isEnd = true;
			    break;
			} else {
				count ++;
    		    color = color * -1;
    		    if (player == playerOne) {
    			    player = playerTwo;
    		    } else {
    			    player = playerOne;
    		    }
			}
		}
	
	
}

}