package go;

import java.util.Scanner;

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
		            		System.out.println("该坐标已有棋子。");
		            		coordinateOne1Legal = false;
		            		continue;
		            	}
		            }
		            
    		       
//    		        System.out.println("x:   " + manual[count].x);
//    		        System.out.println("x:   " + manual[count].y);
//    		        System.out.println("x:   " + manual[count].color);
		        	
		        }
		        }
			
			//打印棋盘
			boardtool.printBoard(board);
			
			
			
			Judge judge = new Judge();
			
			
			boolean isVictory = judge.judge(currentStone, board);
			if (isVictory == true) {
				if (color == 1) {
				    System.out.println("恭喜！黑棋获胜");
				} else {
					System.out.println("恭喜！白棋获胜");
				}
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
			
			
			
			
			
				
			
			
			
			
			
//			}
    		
		
		}
//    		
//    		System.out.println("白棋后手，清选手二输入第2手。");
//    		boolean coordinateTwo1Legal = false;
//			while (coordinateTwo1Legal == false) {
//				String coordinateTwo1;
//		        coordinateTwo1 = scanner.next();
//		        if (Player.getStone(coordinateTwo1, color) == null) {
//		        	coordinateOne1Legal = false;
//		        } else {
//    		        manual[count] = player.getStone(coordinateTwo1, color);
//		        	break;
//		        }
//			}
//    		count ++;
//    		color = color * -1;
//    			
//    	    break;
//    	    
			
//    	    
//    	case 2: 
//    		System.out.println("你选择了Gomoku-Pro规则。");
//    		System.out.println("游戏开始，黑棋先行，选手一第一手为天元。");
//    		manual[count] = Player.getStone("H8", color);
//    		count ++;
//    		color = color * -1;
//    		
//    		System.out.println("白棋后行，清选手二输入第一手。");
//    		String coordinateTwo2 = scanner.next();
//    		manual[count] = Player.getStone(coordinateTwo2, color);
//    		count ++;
//    		color = color * -1;
//    		
//    		System.out.println("清选手一输入第二手（不能在中央5*5区域内）。");
//    		String coordinateTwo3 = scanner.next();
//    		manual[count] = Player.getStone(coordinateTwo2, color);
//    		count ++;
//    		color = color * -1;
//    		
//    		
//    		
//            break;
//    	case 3: 
//    		System.out.println("你选择了Renju 日式规则。");
//            break;
//    	case 4: 
//    		System.out.println("你选择了Renju RIF规则。");
//            break;
//    	case 5: 
//    		System.out.println("你选择了Renju Yamaguchi规则。");
//            break;
//    	}
//		
		
		
		
		
		
		
		
//		
//
//		int number = 0;
//		Input input = null;
//		
//		//通过循环分别给五个棋子赋值
//		int i = 1;
//		while ( i <= 5) {
//			number = i;  
//			

//
//			//新建输入，并把坐标交给他，进行处理。
//		    //如输入格式不合法将会提示重新输入
//			boolean inputLegal = false;
//			while (inputLegal == false) {
//				String coordinate;
//		        coordinate = scanner.next();
//		        input = new Input(coordinate);	
//		        if (input.getStone() == null) {
//		        	inputLegal = false;
//		        } else {
//		        	break;
//		        }
//			}
//		             
//		    //判断是否在棋盘范围内
//		    boolean legal = board.islegal(input.getStone());
//		    if (legal == false) {
//		    	System.out.println("棋子坐标在棋盘外，请重新输入。");
//		    	continue;
//			} 
//		   
//		    //判断棋子是否与之前的重复
//		    Judge judge1 = new Judge();
//		    boolean equalOne = judge1.isEqual(input.getStone(), stoneOne);
//		    boolean equalTwo = judge1.isEqual(input.getStone(), stoneTwo);
//		    boolean equalThree = judge1.isEqual(input.getStone(), stoneThree);
//		    boolean equalFour = judge1.isEqual(input.getStone(), stoneFour);
//		    boolean equalFive = judge1.isEqual(input.getStone(), stoneFive);
//		    if (equalOne == true || equalTwo == true || equalThree == true || equalFour == true || equalFive == true) {
//		    	System.out.println("坐标与前面重复，请重新输入");
//		    	continue;
//		    }
//		    
//			
//		    //分别赋值
//	  
//			switch (number) {
//	    	case 1: 
//	    		stoneOne = input.getStone();
//	    	    break;
//	    	case 2: 
//	    		stoneTwo = input.getStone();
//	            break;
//	    	case 3: 
//	    		stoneThree = input.getStone();
//	            break;
//	    	case 4: 
//	    		stoneFour = input.getStone();
//	            break;
//	    	case 5: 
//	    		stoneFive = input.getStone();
//	            break;
//	    	}
//			i = i+ 1;
//		}
//		
//		//如果有格式错误的情况，则不进行后续操作
//		if (stoneFive.x == 0 ) {
//			System.out.print("棋子坐标不全呢，抱歉没法判断啦。");
//			//无格式错误，则继续
//		} else {
//		//把五个棋子交给棋盘
//		board.setStoneOne(stoneOne);
//		board.setStoneTwo(stoneTwo);
//		board.setStoneThree(stoneThree);
//		board.setStoneFour(stoneFour);
//		board.setStoneFive(stoneFive);
//		
//		//打印棋盘
//		board.printBoard();	
//
//		//将棋盘交给裁判判断胜利
//		Judge judge2 = new Judge(board);
//		boolean victory = judge2.isVictory();
//		
//		if (victory == true) {
//			System.out.println("恭喜！你赢啦！");
//		} else {
//			System.out.println("你没有赢呢，别灰心。");
//		}
//	}
	
	
}

}