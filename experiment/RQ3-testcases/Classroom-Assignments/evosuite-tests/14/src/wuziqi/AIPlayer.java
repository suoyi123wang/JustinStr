package wuziqi;



import wuziqi.Stone;

public class AIPlayer extends Player{

	public AIPlayer(int id, int color) {
		super(id, color);
		
	}

	public Stone parseStone() {
		try {
			int x = (int) (15*Math.random())+1;
			int y = (int) (15*Math.random())+1;
			return Stone.create(x, y, this.getColor());
		} catch (Exception exception) {
			return null;
		}
	}
	

}
