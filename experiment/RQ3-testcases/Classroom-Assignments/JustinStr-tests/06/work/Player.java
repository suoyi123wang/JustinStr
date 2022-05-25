package go;

import go.Player;

public class Player {
	
	String coordinate;
	int x;
	int y;
	int color;
	
	//һ�㹹�췽��
	public Player() {	
	}
	
	//������ɫ�Ĺ��췽��
	public Player(String color) {
		if (color.equals("Black")) {
			this.color = 1;
		} else if (color.equals("White")) {
			this.color = -1;
		}
	}
	
	//������Ӷ���
	@SuppressWarnings("null")
	public Stone getStone(String coordinate, int color) {
		if (coordinate.isEmpty()) {
			return null;
		}
		//ȡ��������x�����ݴ��ж�
		x = Integer.parseInt(coordinate.substring(1));
		if (x <= 0 || x > 15) {
			System.out.println("������Ӧ����1��15֮�䣬����������");
			return null;
		}

	//ȡ��������y�����ݴ��ж�
		y = coordinate.charAt(0) - 'A' + 1;
		if (y < 0 || y > 'O' - 'A' + 1){
			System.out.println("������Ӧ����A��O֮�䣬����������");
			return null;
		}
			
		//ȡ����ɫcolor��
		if (color == 1) {
			this.color = 1;
		} else {
			this.color = -1;
		} 
		
		//��ȡ����ֵ����stone
		Stone stone = new Stone(x, y, color) ;
		return stone;
		
	}
}
