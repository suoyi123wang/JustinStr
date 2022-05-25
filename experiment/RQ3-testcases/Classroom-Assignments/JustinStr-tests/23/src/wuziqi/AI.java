package wuziqi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AI extends JFrame implements MouseListener {
	// 定义的一些变量
	String message = "玩家为黑子";// 用于提示玩家该谁走了
	Boolean start = true;// 判断游戏是否开始了或结束了
	int x;// 获得鼠标下子的坐标x
	int y;// 获得鼠标下子的坐标y
	int[][] allChess = new int[15][15];// 保存整个的棋谱，0：无棋子; 1：有黑子 ;2：有白子
	Boolean isblack = true;
	int[] chessX = new int[255];// 每一次落完棋子之后，都保存一下棋谱
	int[] chessY = new int[255];
	int countX, countY;
	

	// int s,t;

	public AI() {

		JPanel panel = new JPanel();
		this.addMouseListener(this);
		this.repaint();

	}

	@Override
	public void mousePressed(MouseEvent e) {

		if (start) {
			x = e.getX();
			y = e.getY(); // 获得鼠标坐标

			if (x >= 3 && x <= 365 && y >= 60 && y <= 422) {
				// 使x,y在0-15的范围
				// 通过点击的位置得到所在的具体的网格
				// 每一个网格的位置是由中心点的位置决定的
				if ((x - 15) % 25 > 12) {
					x = (x - 15) / 25 + 1;
				} else {
					x = (x - 15) / 25;
				}
				if ((y - 72) % 25 > 0) {
					y = (y - 72) / 25 + 1;
				} else {
					y = (y - 72) / 25;
				}

				// 落子

				if (allChess[x][y] == 0) {
					chessX[countX++] = x;
					chessY[countY++] = y;

					if (isblack) {
						allChess[x][y] = 1;
						if (isWin()) {
							JOptionPane.showMessageDialog(null, "玩家获胜");
						}

					}
					AIplayer();

				}
			}
		}
		// 游戏说明
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 140
				&& e.getY() <= 160) {
			JOptionPane.showMessageDialog(this,
					"规则:无禁手，黑子先行，轮流交换下子，横竖斜先连成五子者获胜!");
		}

		// 退出游戏
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 100
				&& e.getY() <= 120) {
			int result = JOptionPane.showConfirmDialog(this,
					"半途而废是不好的习惯，您确定要退出游戏吗？");
			if (result == 0) {
				System.exit(0);
			}
		}

		// 悔棋
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 300
				&& e.getY() <= 320) {
			int result = JOptionPane.showConfirmDialog(this,
					(isblack == true ? "白方悔棋，黑方是否同意？" : "黑方悔棋，白方是否同意？"));
			// result=0为悔棋
			if (result == 0) {
				allChess[chessX[--countX]][chessY[--countY]] = 0;// 返回上一步的棋谱

				if (isblack == true) {
					isblack = false;
				} else {
					isblack = true;
				}// 重新交换下子的棋手

				this.repaint(); // 重绘棋盘
			}
		}

		// 认输
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 180
				&& e.getY() <= 200) {
			int result = JOptionPane.showConfirmDialog(this, "是否认输?");
			if (result == 0) {
				JOptionPane.showMessageDialog(this, "游戏结束,"
						+ (isblack == true ? "黑方认输，白方获胜!" : "白方认输，黑方获胜!"));
			}
		}

		// 重新开始
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 60
				&& e.getY() <= 80) {
			int result = JOptionPane.showConfirmDialog(null, "你确定重新开始吗？");
			if (result == 0) {
				for (int i = 0; i < 15; i++) {
					for (int j = 0; j < 15; j++) {
						allChess[i][j] = 0; // 清空棋盘的棋子,每一个点上的棋子都清空
					}
				}
				// 清空下棋棋子坐标(x,y)的记录
				for (int i = 0; i < 15; i++) {
					chessX[i] = 0;
					chessY[i] = 0;
				}

				countX = 0;
				countY = 0;
				message = "玩家为黑子";

				isblack = true;
				start = true;
				this.repaint();
			}
		}

		// 设置 打开上次保存的棋谱
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 340
				&& e.getY() <= 360) {
			JOptionPane.showMessageDialog(null, "已打开");
			try {
				FileInputStream input = new FileInputStream("qipu.dat");
				int value;
				int count = 1;
				while ((value = input.read()) != -1) {
					if (count % 15 == 0) {
						int h = 14;
						int z = (count / 15) - 1;
						System.out.println(value + "  " + h + "  " + z);
						allChess[z][h] = value;
					} else {
						int h = (count % 15) - 1;
						int z = (count - count % 15) / 15;
						System.out.println(value + "  " + h + "  " + z);
						allChess[z][h] = value;
					}

					count++;
				}
				this.repaint();

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			System.out.println("已打开");
		}

		// 设置存档
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 260
				&& e.getY() <= 280) {
			JOptionPane.showMessageDialog(null, "已存入");
			try {
				FileOutputStream output = new FileOutputStream("qipu.dat");
				for (int i = 0; i < 15; i++) {
					for (int j = 0; j < 15; j++) {
						output.write(allChess[i][j]);
					}
				}
				output.close();
				System.out.println("已存入");

			} catch (FileNotFoundException e1) {

				e1.printStackTrace();
			} catch (Exception e1) {

				e1.printStackTrace();
			}

		}

	}

	public void paint(Graphics g) {

		// 缓冲技术,防止界面出现闪烁的现象
		BufferedImage buf = new BufferedImage(500, 500,
				BufferedImage.TYPE_INT_RGB);
		Graphics g1 = buf.createGraphics(); // 创建画笔
		Color color = new Color(0, 255, 0);
		g1.setColor(color);
		// 使用画笔描绘棋盘
		g1.fill3DRect(3, 60, 375, 375, true);
		for (int i = 0; i <= 15; i++) {
			g1.setColor(Color.RED);
			// 画棋盘横线
			g1.drawLine(3, 60 + i * 25, 378, 60 + i * 25);
			// 画棋盘竖线
			g1.drawLine(3 + i * 25, 60, 3 + i * 25, 435);
		}

		g1.drawString("游戏信息: " + message, 180, 470);

		g1.drawRect(400, 60, 90, 20);
		g1.drawString("重新开始", 404, 78);

		g1.drawRect(400, 100, 90, 20);
		g1.drawString("退出游戏", 404, 118);

		g1.drawRect(400, 140, 90, 20);
		g1.drawString("游戏说明", 404, 158);

		g1.drawRect(400, 180, 90, 20);
		g1.drawString("认输", 404, 198);

		g1.drawRect(400, 220, 90, 20);
		g1.drawString("暂停", 404, 238);

		g1.drawRect(400, 260, 90, 20);
		g1.drawString("存档", 404, 278);

		g1.drawRect(400, 300, 90, 20);
		g1.drawString("悔棋", 404, 318);

		g1.drawRect(400, 340, 90, 20);
		g1.drawString("打开", 404, 358);

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <= 14; j++) {

				// 画实心黑子
				if (allChess[i][j] == 1) {
					int tempX = i * 25 + 7;
					int tempY = j * 25 + 65;

					g1.setColor(Color.BLACK);

					g1.fillOval(tempX, tempY, 16, 16);

				}

				// 画实心白子
				if (allChess[i][j] == 2) {
					int tempX = i * 25 + 7;
					int tempY = j * 25 + 65;

					g1.setColor(Color.WHITE);

					g1.fillOval(tempX, tempY, 16, 16);
				}
			}
		}

		g.drawImage(buf, 0, 0, this);
	}

	public boolean isWin() {
		boolean result = false;

		// 横向

		int count1 = 1; // 用它来计数有多少个棋子连起来
		for (int i1 = 1; i1 < 5; i1++) {
			if (x + i1 > 14) {
				break;
			}
			if (allChess[x][y] == allChess[x + i1][y]) {
				count1++;
			} else {
				break;
			}
		}

		for (int i1 = 1; i1 < 5; i1++) {
			if (x - i1 < 0) {
				break;
			}
			if (allChess[x][y] == allChess[x - i1][y]) {
				count1++;
			} else {
				break;
			}
		}

		if (count1 >= 5) {
			result = true;
		} // 棋子>=5就赢了 f// lag为true

		// 第二部分：判断竖着是否有屋子连线

		int count2 = 1;
		for (int i2 = 1; i2 < 5; i2++) {
			if (y + i2 > 14) {
				break;
			}
			if (allChess[x][y] == allChess[x][y + i2]) {
				count1++;
			} else {
				break;
			}
		}
		for (int i2 = 1; i2 < 5; i2++) {
			if (y - i2 < 0) {
				break;
			}
			if (allChess[x][y] == allChess[x][y - i2]) {
				count2++;
			} else {
				break;
			}
		}

		if (count2 >= 5) {
			result = true;
		}

		// 第三部分： 判断135度角的线上是否有五子连线

		int count3 = 1;
		for (int i3 = 1; i3 < 5; i3++) {
			if (x + i3 > 14 || y - i3 < 0) {
				break;
			}
			if (allChess[x][y] == allChess[x + i3][y - i3]) {
				count3++;
			} else {
				break;
			}
		}
		for (int i3 = 1; i3 < 5; i3++) {
			if (x - i3 < 0 || y + i3 > 14) {
				break;
			}
			if (allChess[x][y] == allChess[x - i3][y + i3]) {
				count3++;
			} else {
				break;
			}
		}
		if (count3 >= 5) {
			result = true;

		}

		// 第四部分:判断45度角的方向上是否五子连线

		int count4 = 1;
		for (int i4 = 1; i4 < 5; i4++) {
			if (x + i4 > 14 || y + i4 > 14) {
				break;
			}
			if (allChess[x][y] == allChess[x + i4][y + i4]) {
				count4++;
			} else
				break;
		}
		for (int i4 = 1; i4 < 5; i4++) {
			if (x - i4 < 0 || y - i4 < 0) {
				break;
			}
			if (allChess[x][y] == allChess[x - i4][y - i4]) {
				count4++;
			} else {
				break;
			}
		}
		if (count4 >= 5) {
			result = true;
		}

		return result;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void AIplayer() {
		int maxBlack;
		int maxWhite;
		int maxTemp;
		int max = 0;

		//电脑落子的时候需要现决定是进攻还是防守，在对每个点分析，那个是最需要仅供或防守的位置正在落子
		for (int i = 0; i <= 14; i++) {
			for (int j = 0; j <= 14; j++) {
				if (allChess[i][j] == 0) {
					maxWhite = checkMax(i, j, 2);
					maxBlack = checkMax(i, j, 1);
					maxTemp = Math.max(maxWhite, maxBlack);
					if (maxTemp > max) {
						max = maxTemp;
						this.x = i;
						this.y = j;
					}
				}
			}
		}

		allChess[x][y] = 2;
		this.repaint();
		if (isWin()) {
			JOptionPane.showMessageDialog(null, "电脑胜利");
		}
	}

	public int checkMax(int x, int y, int BorW) {
		int num = 0;
		int maxNum;
		int maxTemp = 0;
		int x_temp = x;
		int y_temp = y;
		int x_temp1 = x_temp;
		int y_temp1 = y_temp;

		// judge right
		for (int i = 0; i < 4; i++) {
			x_temp1 += 1;
			if (x_temp1 > 14)
				break;
			if (allChess[x_temp1][y_temp1] == BorW)
				num++;
			else {
				break;
			}
		}
		// judge left
		x_temp1 = x_temp;
		for (int i = 0; i < 4; i++) {
			x_temp1 =x_temp1- 1;
			if (x_temp1 < 0)
				break;//超出棋盘了
			if (allChess[x_temp1][y_temp1] == BorW)
				num++;
			else {
				break;
			}

		}
		if (num < 5)
			maxTemp = num;

		// judge up
		//与上方是完全一样的思路，只需变变x和y既可以了
		x_temp1 = x_temp;
		y_temp1 = y_temp;
		num = 0;
		for (int i = 0; i < 4; i++) {
			y_temp1 -= 1;
			if (y_temp1 < 0)
				break;
			if (allChess[x_temp1][y_temp1] == BorW)
				num++;
			else {
				break;
			}
		}

		// judge down
		y_temp1 = y_temp;
		for (int i = 0; i < 4; i++) {
			y_temp1 += 1;
			if (y_temp1 > 14)
				break;
			if (allChess[x_temp1][y_temp1] == BorW)
				num++;
			else {
				break;
			}
		}
		if (num > maxTemp && num < 5)
			maxTemp = num;

		// judge left_up
		x_temp1 = x_temp;
		y_temp1 = y_temp;
		num = 0;
		for (int i = 0; i < 4; i++) {
			y_temp1 -= 1;
			x_temp1 -= 1;
			if (y_temp1 < 0 || x_temp1 < 0) {
				break;
			}
			if (allChess[x_temp1][y_temp1] == BorW) {
				num++;
			} else {
				break;
			}
		}

		// judge right_down
		x_temp1 = x_temp;
		y_temp1 = y_temp;
		for (int i = 0; i < 4; i++) {
			y_temp1 += 1;
			x_temp1 += 1;
			if (y_temp1 > 14 || x_temp1 > 14) {
				break;
			}
			if (allChess[x_temp1][y_temp1] == BorW) {
				num++;
			} else {
				break;
			}
		}
		if (num > maxTemp && num < 5) {
			maxTemp = num;
		}

		// judge right_up
		x_temp1 = x_temp;
		y_temp1 = y_temp;
		for (int i = 1; i < 5; i++) {
			y_temp1 -= 1;
			x_temp1 += 1;
			if (y_temp1 < 0 || x_temp1 > 14) {
				break;
			}
			if (allChess[x_temp1][y_temp1] == BorW) {
				num++;
			} else {
				break;
			}
		}

		// judge left_down
		x_temp1 = x_temp;
		y_temp1 = y_temp;
		for (int i = 1; i < 5; i++) {
			y_temp1 += 1;
			x_temp1 -= 1;
			if (y_temp1 > 14 || x_temp1 < 0) {
				break;
			}
			if (this.allChess[x_temp1][y_temp1] == BorW) {
				num++;
			} else {
				break;
			}
		}
		if (num > maxTemp && num < 5)
			maxTemp = num;
		maxNum = maxTemp;
		return maxNum;

	}

}
