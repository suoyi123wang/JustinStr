package renju;

import renju.Board;
import renju.Stone;

public class Board {
	public static final int MAX_X = 15;
	public static final int MAX_Y = 15;
	
	public Board(){
		this.setStones(new Stone[Board.MAX_X][Board.MAX_Y]);
	}
	
	public Stone[][] stones;
	private void setStones(Stone[][] stones) {
		setCount(stones.length);
		this.stones = stones;
	}

	public Stone[][] getStones(){
		return stones;
	}
	
	private int count;

	private int getCount() {
		return count;
	}

	private void setCount(int count) {
		this.count = count;
	}

	public static boolean onBoard(Stone stone) {
		return stone.getX() >= 1 && stone.getX() <= Board.MAX_X
				&& stone.getY() >= 1 && stone.getY() <= Board.MAX_Y;
	}

	public boolean ifStone(Stone stone) {
		if (!Board.onBoard(stone) ) {
			return false;
		}
		if (this.getStones()[stone.getX()-1][stone.getY()-1]!=null){
			return false;
		
		}
		
		//this.getStones()[stone.getX()-1][stone.getY()-1]=stone;

		return true;
	}
	
	public void placeStone(Stone stone) {
		this.getStones()[stone.getX() - 1][stone.getY() - 1] = stone;
	
	}
	
}
