package go;

public class AIPlayer extends Player {

	//带有颜色的构造方法
	public AIPlayer(String color) {
		if (color.equals("Black")) {
			this.color = 1;
		} else if (color.equals("White")) {
			this.color = -1;
		}
	}
	
	public Stone getStone(AIPlayer aiPlayer) {
		color = aiPlayer.color;
		x = (int) Math.ceil(Math.random()*15);
		y = (int) Math.ceil(Math.random()*15);
		Stone stone	= new Stone(x, y, color);
		return stone;
		
		
	}
}
