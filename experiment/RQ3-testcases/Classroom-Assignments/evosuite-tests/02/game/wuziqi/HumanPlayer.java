package wuziqi;

public class HumanPlayer extends Player {
	private String[] point;
	private byte[] p=new byte[2];

	boolean setPosition(Element[][] a, String input) {
			try {// �ݴ�
				point = input.split("[,��.]");// ��ȡ���������
				p[0] = Byte.parseByte(point[0]);
				p[1] = Byte.parseByte(point[1]); // ˢ��ͼ�ν���
				if (p[0] < 15 && p[0] >= 0 && p[1] < 15 && p[1] >= 0) {
					if (Main.M[p[0]][p[1]].color.equals("0")) {
						return true;
					} else {
						state="���Ѿ���������";return false;
					}
				}else{
					state="û�������";return false;
				}
			} catch (Exception e) {// �ݴ�
				state="�������";return false;
			}
		}

	byte getX() {
		return p[0];
	}

	byte getY() {
		return p[1];
	}
}
