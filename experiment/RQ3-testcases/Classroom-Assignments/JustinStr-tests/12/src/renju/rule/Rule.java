package renju.rule;

import renju.Board;
import renju.QiZi;

public abstract class Rule {
	protected abstract boolean isForbidden(QiZi currentStone,QiZi[][] stone);
	protected abstract boolean isWin(QiZi currentStone,QiZi[][] stone);
	
	public Result judge(QiZi currentStone,QiZi[][] stone) {	
		if(this.isForbidden(currentStone,stone)){
			return Result.FORBIDDEN;
		}
		if(this.isWin(currentStone,stone)){			
			return Result.WIN;
		}
		if(this.isFull(stone)){
			System.out.println("ºÍÆå");
		}
		return Result.NEXT;
		
	}

	public boolean isFull(QiZi[][] stone) {
		int count = 0;
		int i = 0, j = 0;
		for (i = 0; i < Board.MAX_X; i++) {
			for (j = 0; j <Board.MAX_Y; j++) {
				if (stone[i][j] == null) {
					count++;
				
			}
		}
			}
		return count == 0;
	}
}
	
