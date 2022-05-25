package work;

public class Input {
	public static boolean isWrong = true;

	public ChessPieces input(String raw) {
		int x = 0, y = 0;

		String color = null;
		if (raw.length() > 0) {
			y = raw.charAt(0) - 'A' + 1;
			if (y <= 0 || y > 'z' - 'A' + 1) {
				System.out.println("纵坐标输入错误");
				return null;
			}else
				isWrong = false;
		}
		
		char c = raw.charAt(raw.length() - 1);
		if (c == 'B') {
			color = ChessPieces.BLACK;
			isWrong = false;
		} else if (c == 'W') {
			color = ChessPieces.WHITE;

		} else {
			System.out.println("棋子的颜色错误");
			
			isWrong = true;
			return null;
		}
		try {
			x = Integer.parseInt(raw.substring(1, raw.length() - 1));
			if (x <= 0) {
				System.out.println("横坐标输入错误");
				isWrong = true;
				return null;
			}
		} catch (NumberFormatException exception) {
			System.out.println("横坐标格式错误");
			isWrong = true;
			return null;
		}
	
		return new ChessPieces(x, y, color);

	}
}
