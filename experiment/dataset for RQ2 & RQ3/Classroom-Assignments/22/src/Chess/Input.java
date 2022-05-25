package Chess;

public class Input {
	// "A2B" => x=2,y=1,color=Black
		// "C10W" => x=10,y=3,color=White
		public ChessPieces input(String raw) {
			// A=>1; B=>2; ...
			int x, y;
			String color = null;
			y = raw.charAt(0) - 'A' + 1;
			if (y <= 0 || y > 'Z' - 'A' + 1) {
				System.out.println("��������������");
				return null;
			}

			char c = raw.charAt(raw.length() - 1);
			if (c == 'B') {
				color = ChessPieces.BLACK;
			} else if (c == 'W') {
				color = ChessPieces.WHITE;
			} else {
				System.out.println("���ӵ���ɫ����");
				return null;
			}

			try {
				x = Integer.parseInt(raw.substring(1, raw.length() - 1));
				if (x <= 0) {
					System.out.println("�����귶Χ����");
					return null;
				}
			} catch (NumberFormatException exception) {
				System.out.println("�������ʽ����");
				return null;
			}
			System.out.println("��ʽ��ȷ");
			return new ChessPieces(x, y, color);
		}
}
