package renju;
import java.awt.Color;
/*五子棋的棋子设计。
 */
public class QiZi {
	private int x=0; // 棋盘中的x索引
	private int y=0; // 棋盘中的y索引	
	private Color color = null;//颜色	
	
	public QiZi(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	public int getX() {// 拿到棋盘中的x索引
		return x;
	}
	public int getY() {// 拿到棋盘中的Y索引
		return y;
	}	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Color getColor() {//得到颜色
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}