package renju.record;

import java.awt.Color;

import renju.Board;
import renju.QiZi;
import renju.rule.Result;
import renju.rule.Rule;



public class Record {
	private Result result;
	private Rule rule;
	private int count;
	private QiZi[] stones;
	private String mode;
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public Rule getRule() {
		return rule;
	}
	public void setRule(Rule rule) {
		this.rule = rule;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public QiZi[] getStones() {
		return stones;
	}
	public void setStones(QiZi[] stones) {
		this.stones = stones;
	}
	public Record() {
		this.setCount(0);
		this.setStones(new QiZi[Board.MAX_X * Board.MAX_Y]);
	}

	public void placeStone(QiZi qizi) {
		this.getStones()[this.getCount()] = qizi;
		this.setCount(this.getCount() + 1);
	}
	public void print() {
		System.out.println("本局棋谱：");
		int i = 0;
		for (i = 0; i < this.getCount(); i++) {
			QiZi qizi = this.getStones()[i];
			String message = "";
			message = message + "颜色："
					+ (qizi.getColor() ==Color.BLACK ? "黑色" : "白色") + " ";
			message = message + "坐标：" + (char) (qizi.getY() + 'A' - 1)
					+ qizi.getX();
			System.out.println(message);
		}
		if (this.getCount() < Board.MAX_X * Board.MAX_Y) {
			QiZi qizi = this.getStones()[this.getCount() - 1];
			switch (this.getResult()) {
			case WIN:
				System.out.println("胜利方是："
						+ (qizi.getColor() == Color.BLACK ? "黑方" : "白方"));
				break;
			case DRAW:
				System.out.println("和棋");
				break;
			case FORBIDDEN:
				System.out.println("黑方禁手，白方胜利");
				break;
			default:
				break;
			}
		}
	}
	
}
