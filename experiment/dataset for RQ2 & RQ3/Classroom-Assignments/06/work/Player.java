package go;

import go.Player;

public class Player {
	
	String coordinate;
	int x;
	int y;
	int color;
	
	//一般构造方法
	public Player() {	
	}
	
	//带有颜色的构造方法
	public Player(String color) {
		if (color.equals("Black")) {
			this.color = 1;
		} else if (color.equals("White")) {
			this.color = -1;
		}
	}
	
	//输出棋子对象
	@SuppressWarnings("null")
	public Stone getStone(String coordinate, int color) {
		if (coordinate.isEmpty()) {
			return null;
		}
		//取出横坐标x，并容错判断
		x = Integer.parseInt(coordinate.substring(1));
		if (x <= 0 || x > 15) {
			System.out.println("横坐标应该在1到15之间，请重新输入");
			return null;
		}

	//取出纵坐标y，并容错判断
		y = coordinate.charAt(0) - 'A' + 1;
		if (y < 0 || y > 'O' - 'A' + 1){
			System.out.println("纵坐标应该在A到O之间，请重新输入");
			return null;
		}
			
		//取出颜色color，
		if (color == 1) {
			this.color = 1;
		} else {
			this.color = -1;
		} 
		
		//将取到的值赋给stone
		Stone stone = new Stone(x, y, color) ;
		return stone;
		
	}
}
