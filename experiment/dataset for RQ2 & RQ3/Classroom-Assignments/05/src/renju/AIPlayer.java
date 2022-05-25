package renju;

public class AIPlayer extends Player {
	public AIPlayer(int id, int color) {
		super(id, color);
	}

	@Override
	public Stone nextStone(Board board) {
		// TODO Auto-generated method stub
		int count = 0;
		int i = 0, j = 0;
		Stone[] available = new Stone[Board.MAX_X * Board.MAX_Y];
		for (i = 0; i < Board.MAX_X; i++) {
			for (j = 0; j < Board.MAX_Y; j++) {
				if (board.getStones()[i][j] == null) {
					available[count++] = Stone.create(i + 1, j + 1,
							this.getColor());
				}
			}
		}
		int next = (int) (Math.random() * count);
		Stone nextStone = available[next];
		UI.writeLine("AI��� ����" + this.getId() + "����ң����ӣ�����Ϊ"
				+ (char) (nextStone.getY() + 'A' - 1) + nextStone.getX());
		
		return nextStone;
	}

}