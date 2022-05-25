package renju.rule;

import renju.Board;
import renju.QiZi;

public class RenjuRule extends Rule{

	@Override
	public Result judge(QiZi currentStone,QiZi[][] stone) {
		
		return super.judge(currentStone, stone);
	}



	@Override
	protected boolean isForbidden(QiZi currentStone, QiZi[][] stone) {

		return false;
	}

	@Override
	protected boolean isWin(QiZi currentStone, QiZi[][] stone) {
		
		return false;
	}

}
