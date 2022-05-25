package renju;

public class HumanPlayer extends Player {
	public HumanPlayer(int id, int color) {
		super(id, color);
	}

	@Override
	public Stone nextStone(Board board) {
		UI.writeLine("���" + this.getId() + "������������꣬����A1 B2");

		Stone stone = null;
		boolean valid = false;
		boolean reenter = false;

		while (stone == null || valid == false) {
			if (reenter) {
				if (stone == null) {
					UI.writeLine("�������Ӹ�ʽ�������������룡");
				} else if (valid == false) {
					UI.writeLine("���Ӳ��������ϻ��غϣ����������룡");
				}
			}
			stone = this.parseStone(UI.readLine());
			if (stone != null) {
				valid = board.valid(stone);
			}
			reenter = true;
		}

		return stone;
	}

	// A1 B2 C3
	public Stone parseStone(String stone) {
		try {
			int x = Integer.parseInt(stone.substring(1, stone.length()));
			int y = stone.charAt(0) - 'A' + 1;
			return Stone.create(x, y, this.getColor());
		} catch (Exception exception) {
			return null;
		}
	}
}
