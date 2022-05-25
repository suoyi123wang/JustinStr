package wuziqi;

public class HumanPlayer extends Player {
	private String[] point;
	private byte[] p = new byte[2];

	boolean setPosition(Element[][] a, int color) {
		try {// 容错
			point = input.split("[,，.]");// 获取并拆分坐标
			p[0] = Byte.parseByte(point[0]);
			p[1] = Byte.parseByte(point[1]); // 刷新图形界面
			if (p[0] < 15 && p[0] >= 0 && p[1] < 15 && p[1] >= 0) {
				if (Main.M[p[0]][p[1]].color.equals("0")) {
					return true;
				} else {
					state = "这已经有棋子了";
					draw.p();
					return false;
				}
			} else {
				state = "没有这个点";
				draw.p();
				return false;
			}
		} catch (Exception e) {// 容错
			state = "输入错误";
			draw.p();
			return false;
		}
	}

	byte getX() {
		return p[0];
	}

	byte getY() {
		return p[1];
	}
}
