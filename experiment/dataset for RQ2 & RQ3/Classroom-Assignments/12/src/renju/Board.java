package renju;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;


public class Board extends JPanel {
	public static final int MAX_X = 15;
	public static final int MAX_Y = 15;	
//	public static final int GRID_SPAN = 35; 
//	public static final int MARGIN = 15; 
	private  QiZi[] stones ;
	private  QiZi[][] stone ;
	public  QiZi[][] getStone() {
		return stone;
	}

	public void setStone(QiZi[][] stone) {
		this.stone = stone;
	}

	private int count;

	public  QiZi[] getStones() {
		return stones;
	}

	private void setStones(QiZi[] stones) {
		this.stones = stones;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Board() {		
		this.setStones(new QiZi[Board.MAX_X*Board.MAX_Y]);
		this.setStone(new QiZi[Board.MAX_X][Board.MAX_Y]);
	}
	public static boolean onBoard(QiZi stone) {
		return stone.getX() >= 1 && stone.getX() <= Board.MAX_X
				&& stone.getY() >= 1 && stone.getY() <= Board.MAX_Y;
	}
}
