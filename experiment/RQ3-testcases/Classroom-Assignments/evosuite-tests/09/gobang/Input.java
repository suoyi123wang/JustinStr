package gobang;

public class Input {
	// 输入字符串坐标
	public ChessPieces input(String raw) {
		// A=>1; B=>2; ...
		int x, y;
		String color = null;
		y = raw.charAt(0) - 'A' + 1;
		if (y <= 0 || y > 'Z' - 'A' + 1) {
			System.out.println("纵坐标输入有误");
			return null;
		}
//提取字符化为数字
		char c = raw.charAt(raw.length() - 1);
		if (c == 'B') {
			color = ChessPieces.BLACK;
		} else if (c == 'W') {
			color = ChessPieces.WHITE;
		} else {
			System.out.println("棋子的颜色错误");
			return null;
		}
//找错误
		try {
			x = Integer.parseInt(raw.substring(1, raw.length() - 1));
			if (x <= 0) {
				System.out.println("横坐标范围错误");
				return null;
			}
		} catch (NumberFormatException exception) {
			System.out.println("横坐标格式错误");
			return null;
		}
		System.out.println("格式正确");
		System.out.println("---------------------------------华丽的分割线------------------------------------");
		return new ChessPieces(x, y, color);
	}
}
