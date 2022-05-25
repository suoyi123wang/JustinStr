package wuziqi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FiveChessFrame extends JFrame implements MouseListener {
	// �����һЩ����
	String message = "�ڷ�����";// ������ʾ��Ҹ�˭����
	Boolean start = true;// �ж���Ϸ�Ƿ�ʼ�˻������
	int x;// ���������ӵ�����x
	int y;// ���������ӵ�����y
	int[][] allChess = new int[15][15];// �������������ף�0��������; 1���к��� ;2���а���
	Boolean isblack = true;
	int[] chessX = new int[255];// ÿһ����������֮�󣬶�����һ������
	int[] chessY = new int[255];
	int countX, countY;
	

	public FiveChessFrame() {

		JPanel panel = new JPanel();
		this.addMouseListener(this);
		this.repaint();

	}

	@Override
	public void mousePressed(MouseEvent e) {

		if (start) {
			x = e.getX();
			y = e.getY(); // ����������

			if (x >= 3 && x <= 365 && y >= 60 && y <= 422) {
				// ʹx,y��0-15�ķ�Χ
				// ͨ�������λ�õõ����ڵľ��������
				// ÿһ�������λ���������ĵ��λ�þ�����
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

				// ����

				if (allChess[x][y] == 0) {
					chessX[countX++] = x;
					chessY[countY++] = y;

					if (isblack) {
						allChess[x][y] = 1;
						isblack = false;
						message = "�׷�����";

					} else {
						allChess[x][y] = 2;
						isblack = true;
						message = "�ڷ�����";
					}
					this.repaint();
					if (this.isWin()) {
						if (allChess[x][y] == 1) {
							JOptionPane.showMessageDialog(this, "��Ϸ�������ڷ�ʤ��");
						} else {
							JOptionPane.showMessageDialog(this, "��Ϸ�������׷�ʤ��");
						}
						this.start = false; // ��ʶ��Ϸ����
					}

				}
			}
		}
		// ��Ϸ˵��
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 140
				&& e.getY() <= 160) {
			JOptionPane.showMessageDialog(this, "����:�������У������������ӣ�����б�����������߻�ʤ!");
		}

		// �˳���Ϸ
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 100
				&& e.getY() <= 120) {
			int result = JOptionPane.showConfirmDialog(this,
					"��;�����ǲ��õ�ϰ�ߣ���ȷ��Ҫ�˳���Ϸ��");
			if (result == 0) {
				System.exit(0);
			}
		}

		// ����
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 300
				&& e.getY() <= 320) {
			int result = JOptionPane.showConfirmDialog(this,
					(isblack == true ? "�׷����壬�ڷ��Ƿ�ͬ�⣿" : "�ڷ����壬�׷��Ƿ�ͬ�⣿"));
			// result=0Ϊ����
			if (result == 0) {
				allChess[chessX[--countX]][chessY[--countY]] = 0;// ������һ��������

				if (isblack == true) {
					isblack = false;
				} else {
					isblack = true;
				}// ���½������ӵ�����

				this.repaint(); // �ػ�����
			}
		}

		// ����
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 180
				&& e.getY() <= 200) {
			int result = JOptionPane.showConfirmDialog(this, "�Ƿ�����?");
			if (result == 0) {
				JOptionPane.showMessageDialog(this, "��Ϸ����,"
						+ (isblack == true ? "�ڷ����䣬�׷���ʤ!" : "�׷����䣬�ڷ���ʤ!"));
			}
		}

		// ���¿�ʼ
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 60
				&& e.getY() <= 80) {
			int result = JOptionPane.showConfirmDialog(null, "��ȷ�����¿�ʼ��");
			if (result == 0) {
				for (int i = 0; i < 15; i++) {
					for (int j = 0; j < 15; j++) {
						allChess[i][j] = 0; // ������̵�����,ÿһ�����ϵ����Ӷ����
					}
				}
				// ���������������(x,y)�ļ�¼
				for (int i = 0; i < 15; i++) {
					chessX[i] = 0;
					chessY[i] = 0;
				}

				countX = 0;
				countY = 0;
				message = "�ڷ�����";

				isblack = true;
				start = true;
				this.repaint();
			}
		}

		// ���� ���ϴα��������
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 340
				&& e.getY() <= 360) {
			JOptionPane.showMessageDialog(null, "�Ѵ�");
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

			System.out.println("�Ѵ�");
		}

		// ���ô浵
		if (e.getX() >= 400 && e.getX() <= 490 && e.getY() >= 260
				&& e.getY() <= 280) {

			try {
				FileOutputStream output = new FileOutputStream("qipu.dat");
				for (int i = 0; i < 15; i++) {
					for (int j = 0; j < 15; j++) {
						output.write(allChess[i][j]);
					}
				}
				output.close();
				JOptionPane.showMessageDialog(null, "�Ѵ���");

			} catch (FileNotFoundException e1) {

				e1.printStackTrace();
			} catch (Exception e1) {

				e1.printStackTrace();
			}

		}

	}

	public void paint(Graphics g) {

		// ���弼��,��ֹ���������˸������
		BufferedImage buf = new BufferedImage(500, 500,
				BufferedImage.TYPE_INT_RGB);
		Graphics g1 = buf.createGraphics(); // ��������
		Color color = new Color(0, 255, 0);
		g1.setColor(color);
		// ʹ�û����������
		g1.fill3DRect(3, 60, 375, 375, true);
		for (int i = 0; i <= 15; i++) {
			g1.setColor(Color.RED);
			// �����̺���
			g1.drawLine(3, 60 + i * 25, 378, 60 + i * 25);
			// ����������
			g1.drawLine(3 + i * 25, 60, 3 + i * 25, 435);
		}

		g1.drawString("��Ϸ��Ϣ: " + message, 180, 470);

		g1.drawRect(400, 60, 90, 20);
		g1.drawString("���¿�ʼ", 404, 78);

		g1.drawRect(400, 100, 90, 20);
		g1.drawString("�˳���Ϸ", 404, 118);

		g1.drawRect(400, 140, 90, 20);
		g1.drawString("��Ϸ˵��", 404, 158);

		g1.drawRect(400, 180, 90, 20);
		g1.drawString("����", 404, 198);

		g1.drawRect(400, 220, 90, 20);
		g1.drawString("��ͣ", 404, 238);

		g1.drawRect(400, 260, 90, 20);
		g1.drawString("�浵", 404, 278);

		g1.drawRect(400, 300, 90, 20);
		g1.drawString("����", 404, 318);

		g1.drawRect(400, 340, 90, 20);
		g1.drawString("��", 404, 358);

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j <= 14; j++) {

				// ��ʵ�ĺ���
				if (allChess[i][j] == 1) {
					int tempX = i * 25 + 7;
					int tempY = j * 25 + 65;

					g1.setColor(Color.BLACK);

					g1.fillOval(tempX, tempY, 16, 16);

				}

				// ��ʵ�İ���
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

		// ����

		int count1 = 1; // �����������ж��ٸ�����������
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
		} // ����>=5��Ӯ�� f// lagΪtrue

		// �ڶ����֣��ж������Ƿ�����������

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
		
		 // �������֣� �ж�135�Ƚǵ������Ƿ�����������
	
		 int count3 = 1;
		for(int i3=1;i3<5;i3++){
			if(x+i3>14||y-i3<0){
				break;
			}if(allChess[x][y] == allChess[x + i3][y - i3]){
				count3++;
			}else {
				break;
			}
		}
		for(int i3=1;i3<5;i3++){
			if(x-i3<0||y+i3>14){
				break;
			}if(allChess[x][y] == allChess[x - i3][y + i3]){
				count3++;
			}else {
				break;
			}
		}
		 if (count3 >= 5) {
		 result = true;
		
		 }
		
		 // ���Ĳ���:�ж�45�Ƚǵķ������Ƿ���������
		
		int count4 = 1;
		for(int i4=1;i4<5;i4++){
			if(x+i4>14||y+i4>14){
				break;
			}if(allChess[x][y] == allChess[x + i4][y + i4]){
				count4++;
			}else
				break;
		}
		for(int i4=1;i4<5;i4++){
			if(x-i4<0||y-i4<0){
				break;
			}
			if(allChess[x][y] == allChess[x - i4][y - i4]){
				count4++;
			}else {
				break;
			}
		}
		 if (count4 >= 5) {
		 result = true;
		 }
		
		 return result;
	}

	public static void main(String[] args) {

		String string = JOptionPane.showInputDialog("�������սģʽ��AI(�˻�) PP(����)");
		if (string.equalsIgnoreCase("PP")) {
			FiveChessFrame frame = new FiveChessFrame();
			frame.setTitle("��������Ϸ");
			frame.setSize(500, 500);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �رմ���
			frame.setVisible(true);

		}
		if (string.equalsIgnoreCase("AI")) {
			AI frame1 = new AI();
			frame1.setTitle("��������Ϸ");
			frame1.setSize(500, 500);
			frame1.setLocationRelativeTo(null);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �رմ���
			frame1.setVisible(true);
		}

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

}
