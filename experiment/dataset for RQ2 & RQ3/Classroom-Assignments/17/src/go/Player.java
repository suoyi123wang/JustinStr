package go;

import go.Board;
import go.Stone;
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
		//ȡ��������x�����ݴ��ж�
		try {
			x = Integer.parseInt(coordinate.substring(1,coordinate.length()));
			if (x <= 0 || x > 15) { 
				System.out.println("������Ӧ����1��15֮�䣬����������");
				return null;
				}
			} catch (NumberFormatException exception) {
				System.out.println("��ʽ����,����������");
				return null;
	    }
		
		//ȡ��������y�����ݴ��ж�
		y = coordinate.charAt(0) ;
		if (y < 64 || y > 'O'){
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
