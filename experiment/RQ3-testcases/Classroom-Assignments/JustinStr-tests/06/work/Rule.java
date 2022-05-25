package go;

public class Rule {

    Stone stone = new Stone();
    String rule;
    Player currentPlayer;

    //һ�㹹�췽��
    public Rule() {
    }

    //����һ�����Ӷ���Ĺ��췽��
    public Rule(Stone stone) {
        this.stone = stone;
    }


    private Board board;

    //�������̶���Ĺ��췽��
    Rule(Board board) {
        this.board = board;
    }


    public Rule(Player currePlayer) {

    }


    public boolean judge(Stone currentStone, Stone[][] board) {
        int i = 0;
        for (int j = 0; j < 4; j++) {
            Direction direction = Direction.DIRECTIONS[j];
            i = 1;
            i = i + this.search(currentStone, board, direction, true);
            i = i + this.search(currentStone, board, direction, false);
            if (i >= 5) {
                return true;
            }
        }
        return false;
    }

    int search(Stone currentStone, Stone[][] board, Direction direction,
               boolean flag) {
        int count = 0;
        int currentX = currentStone.getX() - 1;
        int currentY = currentStone.getY() - 1;
        while (true) {
            if (flag) {
                currentX = currentX + direction.getDeltaX();
                currentY = currentY + direction.getDeltaY();
            } else {
                currentX = currentX - direction.getDeltaX();
                currentY = currentY - direction.getDeltaY();
            }
            if (currentX < 0 || currentX >= 15 || currentY < 0
                    || currentY >= 15) {
                break;
            }
            Stone stone = board[currentX][currentY];
            if (stone == null || stone.getColour() != currentStone.getColour()) {
                break;
            }
            count++;
        }
        return count;
    }


//	//����    �ж�������Ӻ�������ĺ��Ƿ����
//	boolean isPlusEqual(){
//		if (board.getStoneOne().getPlus() == board.getStoneTwo().getPlus() && board.getStoneTwo().getPlus() == board.getStoneThree().getPlus() && board.getStoneThree().getPlus() == board.getStoneFour().getPlus() && board.getStoneFour().getPlus() == board.getStoneFive().getPlus()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	//����    �ж�������Ӻ�������Ĳ��Ƿ����
//	boolean isMinusEqual(){
//		if (board.getStoneOne().getMinus() == board.getStoneTwo().getMinus() && board.getStoneTwo().getMinus() == board.getStoneThree().getMinus() && board.getStoneThree().getMinus() == board.getStoneFour().getMinus() && board.getStoneFour().getMinus() == board.getStoneFive().getMinus()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	////����    �ж�������ӵ���ɫ�Ƿ���ͬ
//	boolean isColourEqual() {
//		if (board.getStoneOne().getColour() == board.getStoneTwo().getColour() && board.getStoneTwo().getColour() == board.getStoneThree().getColour() && board.getStoneThree().getColour() == board.getStoneFour().getColour() && board.getStoneFour().getColour() == board.getStoneFive().getColour()) {
//			return true;
//		} else {
//			return false;
//		}
//	} 
//	
//	//�ж��Ƿ���������
//	boolean isVictory() {
//		MaxAndMin x = new MaxAndMin(board.getStoneOne().x, board.getStoneTwo().x, board.getStoneThree().x, board.getStoneFour().x, board.getStoneFive().x);
//		int max = x.Max();
//		int min = x.Min();
//		
//		MaxAndMin y = new MaxAndMin(board.getStoneOne().y, board.getStoneTwo().y, board.getStoneThree().y, board.getStoneFour().y, board.getStoneFive().y);
//		int first = y.Min();
//		int last = y.Max();
//		
//		if (isColourEqual() == true) {
//				//Condition One:(something like "A1 A2 A3 A4 A5")
//				if (first - last == 0 && max - min == 4){
//					return true;
//				//Condition Two:(something like "A1 B2 C3 D4 E5"
//				} else if (last - first == 4 && max - min == 4 && isMinusEqual() == true) {
//					return true;
//						//Condition Three:(something like "E1 D2 C3 B4 A5")
//					} else if (last - first == 4 && max - min == 4 && isPlusEqual() == true) {
//						return true;
//						//Condition Four:(something like "A1 B1 C1 D1 E1")
//					} else if (last - first == 4 && max - min == 0) {
//						return true;
//					} else {
//						return false;
//					}
//		} else {
//			return false;
//		}
//		
//	}
//

}
