package gobang;

public class Input {
	// �����ַ�������
	public ChessPieces input(String raw) {
		// A=>1; B=>2; ...
		int x, y;
		String color = null;
		y = raw.charAt(0) - 'A' + 1;
		if (y <= 0 || y > 'Z' - 'A' + 1) {
			System.out.println("��������������");
			return null;
		}
//��ȡ�ַ���Ϊ����
		char c = raw.charAt(raw.length() - 1);
		if (c == 'B') {
			color = ChessPieces.BLACK;
		} else if (c == 'W') {
			color = ChessPieces.WHITE;
		} else {
			System.out.println("���ӵ���ɫ����");
			return null;
		}
//�Ҵ���
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
		System.out.println("---------------------------------�����ķָ���------------------------------------");
		return new ChessPieces(x, y, color);
	}
}
