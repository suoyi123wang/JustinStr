package go;

import java.util.Scanner;

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
		            		System.out.println("�������������ӡ�");
		            		coordinateOne1Legal = false;
		            		continue;
		            	}
		            }
		            
    		       
//    		        System.out.println("x:   " + manual[count].x);
//    		        System.out.println("x:   " + manual[count].y);
//    		        System.out.println("x:   " + manual[count].color);
		        	
		        }
		        }
			
			//��ӡ����
			boardtool.printBoard(board);
			
			
			
			Judge judge = new Judge();
			
			
			boolean isVictory = judge.judge(currentStone, board);
			if (isVictory == true) {
				if (color == 1) {
				    System.out.println("��ϲ�������ʤ");
				} else {
					System.out.println("��ϲ�������ʤ");
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
//    		System.out.println("������֣���ѡ�ֶ������2�֡�");
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
//    		System.out.println("��ѡ����Gomoku-Pro����");
//    		System.out.println("��Ϸ��ʼ���������У�ѡ��һ��һ��Ϊ��Ԫ��");
//    		manual[count] = Player.getStone("H8", color);
//    		count ++;
//    		color = color * -1;
//    		
//    		System.out.println("������У���ѡ�ֶ������һ�֡�");
//    		String coordinateTwo2 = scanner.next();
//    		manual[count] = Player.getStone(coordinateTwo2, color);
//    		count ++;
//    		color = color * -1;
//    		
//    		System.out.println("��ѡ��һ����ڶ��֣�����������5*5�����ڣ���");
//    		String coordinateTwo3 = scanner.next();
//    		manual[count] = Player.getStone(coordinateTwo2, color);
//    		count ++;
//    		color = color * -1;
//    		
//    		
//    		
//            break;
//    	case 3: 
//    		System.out.println("��ѡ����Renju ��ʽ����");
//            break;
//    	case 4: 
//    		System.out.println("��ѡ����Renju RIF����");
//            break;
//    	case 5: 
//    		System.out.println("��ѡ����Renju Yamaguchi����");
//            break;
//    	}
//		
		
		
		
		
		
		
		
//		
//
//		int number = 0;
//		Input input = null;
//		
//		//ͨ��ѭ���ֱ��������Ӹ�ֵ
//		int i = 1;
//		while ( i <= 5) {
//			number = i;  
//			

//
//			//�½����룬�������꽻���������д���
//		    //�������ʽ���Ϸ�������ʾ��������
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
//		    //�ж��Ƿ������̷�Χ��
//		    boolean legal = board.islegal(input.getStone());
//		    if (legal == false) {
//		    	System.out.println("���������������⣬���������롣");
//		    	continue;
//			} 
//		   
//		    //�ж������Ƿ���֮ǰ���ظ�
//		    Judge judge1 = new Judge();
//		    boolean equalOne = judge1.isEqual(input.getStone(), stoneOne);
//		    boolean equalTwo = judge1.isEqual(input.getStone(), stoneTwo);
//		    boolean equalThree = judge1.isEqual(input.getStone(), stoneThree);
//		    boolean equalFour = judge1.isEqual(input.getStone(), stoneFour);
//		    boolean equalFive = judge1.isEqual(input.getStone(), stoneFive);
//		    if (equalOne == true || equalTwo == true || equalThree == true || equalFour == true || equalFive == true) {
//		    	System.out.println("������ǰ���ظ�������������");
//		    	continue;
//		    }
//		    
//			
//		    //�ֱ�ֵ
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
//		//����и�ʽ�����������򲻽��к�������
//		if (stoneFive.x == 0 ) {
//			System.out.print("�������겻ȫ�أ���Ǹû���ж�����");
//			//�޸�ʽ���������
//		} else {
//		//��������ӽ�������
//		board.setStoneOne(stoneOne);
//		board.setStoneTwo(stoneTwo);
//		board.setStoneThree(stoneThree);
//		board.setStoneFour(stoneFour);
//		board.setStoneFive(stoneFive);
//		
//		//��ӡ����
//		board.printBoard();	
//
//		//�����̽��������ж�ʤ��
//		Judge judge2 = new Judge(board);
//		boolean victory = judge2.isVictory();
//		
//		if (victory == true) {
//			System.out.println("��ϲ����Ӯ����");
//		} else {
//			System.out.println("��û��Ӯ�أ�����ġ�");
//		}
//	}
	
	
}

}