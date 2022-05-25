package renju;

import renju.Board;
import renju.Stone;

public class Database {
	
	private Player player1;
	public Player getPlayer1() {
		return player1;
	}
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
	public String getName1(){
		return player1.getName();
	}
	
	private Player player2;
	public Player getPlayer2() {
		return player2;
	}
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	public String getName2(){
		return player2.getName();
	}

	private Rule rules;
	public Rule getRules() {
		return rules;
	}
	public void setRules(Rule rules) {
		this.rules = rules;
	}

	private String result;
	public String getResult() {
		return result;
	}
	public void setResult(String  result) {
		this.result = result;
	}

	private int count=1;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	private Stone[] stones;
	public Stone[] getStones() {
		return stones;
	}
	public void setStones(Stone[] stones) {
		this.stones = stones;
	}
	
	public Database() {
		this.setCount(0);
		this.setStones(new Stone[Board.MAX_X * Board.MAX_Y]);
	}
	
	public void print() {
		System.out.println("");
		int i = 0;
		for (i = 0; i < this.getCount(); i++) {
			Stone stone = this.getStones()[i];
			String message = "";
			message = message + "颜色"
					+ (stone.getColor() == Stone.BLACK ? "黑" : "白") + " ";
			message = message + "棋子坐标" + (char) (stone.getY() + 'A' - 1)
					+ stone.getX();
			System.out.println(message);
		}
		if (this.getCount() < Board.MAX_X * Board.MAX_Y) {
			Stone stone = this.getStones()[this.getCount() ];
			switch (this.getResult()) {
			case "WIN":
				System.out.println("获胜者是"
						+ (stone.getColor() == Stone.BLACK ? "黑方" : "白方"));
				break;
			default:
				break;
			}
		}
	}
	
	public void placeStone(Stone stone) {
		this.getStones()[this.getCount()] = stone;
		this.setCount(this.getCount() + 1);
	}
	

}
