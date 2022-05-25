package go;



import java.util.Scanner;

import go.Result;
import go.Board;

public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//新建一个15*15的棋子数组
		Stone[][] board = new Stone[15][15];
		Board boardtool = new Board(board);
		
		Player playerOne = new Player("Black");
		Player playerTwo = new Player("White");
		
//		System.out.println("欢迎使用五子棋，请选择游戏规则：（1：Standard Gomoku规则、2：Gomoku-Pro规则、3：Renju 日式规则、4：Renju RIF规则、5：Renju Yamaguchi规则）");
//		
//		boolean ruleLegal = false;
//		String rule = null;
//		while (ruleLegal == false) {
//			rule = scanner.nextLine();
//			if (rule.equals("1") || rule.equals("2") || rule.equals("3") || rule.equals("4")|| rule.equals("5")) {
//				ruleLegal = true;
//				break;
//			} else {
//				System.out.println("输入不合法，请输入1-5的数字选择规则。");
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
//    		System.out.println("你选择了Standard Gomoku规则。");
//    		System.out.println("游戏开始，黑棋先手，清选手一输入第1手,格式为A1 B2。");
		
		boolean isEnd = false;
		while (isEnd == false){
		
		if (color == 1) {
			System.out.println("黑棋输入。");
		} else {
			System.out.println("白棋输入。");
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
		            		System.out.println("该坐标已有棋子,请重新输入。");
		            		coordinateOne1Legal = false;
		            		continue;
		            	}
		            }
		   
		        }
		        }
			
			//打印棋盘
			boardtool.printBoard(board);
			
			
			
			Rule judge = new GomokuRule();
			
			Result result = judge.judge(currentStone, board);
			
			System.out.println(result);
			
			if (result != Result.NEXT){
				switch(result) {
				case WIN:
					if (player.color == 1) {
					    System.out.println("黑棋获胜！");
					} else {
						System.out.println("白棋获胜！");
					}
					break;
				case DRAW:
					System.out.println("和棋");
					break;
				case FORBIDDEN:
					System.out.println("黑棋禁手，白棋获胜！");
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