package renju;
import java.awt.Color;
/*�������������ơ�
 */
public class QiZi {
	private int x=0; // �����е�x����
	private int y=0; // �����е�y����	
	private Color color = null;//��ɫ	
	
	public QiZi(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	public int getX() {// �õ������е�x����
		return x;
	}
	public int getY() {// �õ������е�Y����
		return y;
	}	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Color getColor() {//�õ���ɫ
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}