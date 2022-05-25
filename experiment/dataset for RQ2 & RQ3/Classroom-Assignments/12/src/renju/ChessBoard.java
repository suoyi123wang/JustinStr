package renju;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import renju.player.AIplayer;
import renju.record.ApplicationRecordAdapter;
import renju.record.Record;
import renju.record.RecordAdapter;
import renju.rule.GomokuRule;
import renju.rule.RenjuRule;
import renju.rule.Rule;

public class ChessBoard extends JPanel implements MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int MARGIN = 15; // �߾�
	public static final int GRID_SPAN = 35; // ������
	public static final int LENGTH = 14;//��������
	public static final int WIDTH = 14;//��������	
	private String mode = null;	
	private String ruleMode = null;
	private ImageIcon backGround;
	
	AIplayer AI = new AIplayer(Color.WHITE);
	  Board board;
	  static Record record = new Record();
	GomokuRule rule1 = new GomokuRule();  
	RenjuRule rule2= new RenjuRule();
    QiZi[] stones = new QiZi[( LENGTH+1)*(WIDTH+1)];
    QiZi[][] stone = new QiZi[ LENGTH+1][WIDTH+1];
    boolean isBlack = true;//ĬȻ��ʼ�Ǻ�������
    int chessCount; // ��ǰ���̵����Ӹ���
	int xIndex, yIndex; // ��ǰ���µ����ӵ�����
	boolean gameOver = false;// ��Ϸ�Ƿ����
	
	public ChessBoard() {	
		JOptionPane.showMessageDialog(null, "��ѡ����Ϸģʽ��PP�����������ң����ߡ�AP���������������");
		 mode =JOptionPane.showInputDialog(null).toUpperCase();
		JOptionPane.showMessageDialog(null, "��ѡ����򣺡�J�������֣���N�����޽��֣�");
		 ruleMode =JOptionPane.showInputDialog(null).toUpperCase();
		addMouseListener(this);// ��Ӽ�����
		
		addMouseMotionListener(new MouseMotionListener() { // �����ڲ���:���ù���ƶ�ʱ��ͼ��
			
			public void mouseDragged(MouseEvent e) {
				
			}

			public void mouseMoved(MouseEvent e) {
				int x1 = (e.getX() - MARGIN + GRID_SPAN / 2) / GRID_SPAN+1; 
				// �������������λ��ת��������������
				int y1 = (e.getY() - MARGIN + GRID_SPAN / 2) / GRID_SPAN+1;
				// ��Ϸ�Ѿ�������������
				// ���������⣬������
				// x,yλ���Ѿ������Ӵ��ڣ�������
				if (x1 < 1 || x1 > WIDTH+1|| y1 < 1|| y1 > LENGTH+1 || gameOver )
					setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // ���ó�Ĭ����״
				else
					setCursor(new Cursor(Cursor.HAND_CURSOR)); // ���ó�����
			}
	}
		);
	}

	// ����
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// ������
			//ľ�屳��
			backGround = new ImageIcon(getClass().getResource( "����.jpg"));
			backGround.paintIcon(this, g, 0, 0);
			 //��������
			 drawInLine(g);		
			// ������
			for (int i = 0; i < chessCount; i++) {
				int xPos = (int)(stones[i].getX() * GRID_SPAN + MARGIN); // ���񽻲���x����
				int yPos = (int)(stones[i].getY() * GRID_SPAN + MARGIN);// ���񽻲���y����
				g.setColor(stones[i].getColor()); // ������ɫ
//				g.fillOval(xPos - Point.DIAMETER / 2, yPos - Point.DIAMETER / 2,
//						Point.DIAMETER, Point.DIAMETER);
				if(g.getColor().equals(Color.BLACK)){
					ImageIcon blackStone = new ImageIcon(getClass().getResource( "blackchess.GIF"));
				    blackStone.paintIcon(this, g, xPos-15, yPos-15);
				}
				if(g.getColor().equals(Color.WHITE)){
					ImageIcon whiteStone = new ImageIcon(getClass().getResource( "whitechess.GIF"));
				    whiteStone.paintIcon(this, g, xPos-15, yPos-15);
				}	
				// ������һ�����ӵĺ���ο�
				if (i == chessCount - 1) { 
					// ���һ������
					g.setColor(Color.red);
					g.drawRect(xPos - 15,
							yPos - 15, 29,
							29);
				}
			}

		}

	private void drawInLine(Graphics g) {
		 g.setColor(Color.BLACK);
		 g.drawRect(MARGIN+5, MARGIN+5, (int)( WIDTH
					* GRID_SPAN-10),(int)(LENGTH
							* GRID_SPAN-10));
		 //��С�ڵ�
		 g.fillOval(15+3*35-2,15+3*35-2,6,6);
		 g.fillOval(15+11*35-2,15+3*35-2,6,6);
		 g.fillOval(15+7*35-2,15+7*35-2,6,6);
		 g.fillOval(15+11*35-2,15+11*35-2,6,6);
		 g.fillOval(15+3*35-2,15+11*35-2,6,6);
		 for (int i = 0; i <= LENGTH; i++) { // ������
				g.drawLine(MARGIN,(int)( MARGIN + i * GRID_SPAN),(int)( MARGIN + WIDTH
						* GRID_SPAN),(int) (MARGIN + i * GRID_SPAN));

				
			}
			for (int i = 0; i <= WIDTH; i++) {// ��ֱ��
				g.drawLine((int)(MARGIN + i * GRID_SPAN), MARGIN, (int)(MARGIN + i * GRID_SPAN),
						(int)(MARGIN + LENGTH * GRID_SPAN));
			}
	}
			
	// Dimension: ����
		public Dimension getPreferredSize() {
			return new Dimension((int)(MARGIN * 2 + GRID_SPAN * WIDTH),(int)( MARGIN * 2
					+ GRID_SPAN * LENGTH));
		}	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
    //��Ҫ����
	@Override
	public void mousePressed(MouseEvent e) {		
		if(mode.equals("PP")&&ruleMode.equals("N")){		  
			// ��Ϸ�Ѿ�������������
			if (gameOver)
				return;
			String colorName = isBlack ? "����" : "����";
			xIndex =(e.getX() -15 + GRID_SPAN / 2) / GRID_SPAN; // �������������λ��ת��������������
			yIndex =(e.getY() -15 + GRID_SPAN / 2) / GRID_SPAN;
			// ���������⣬������
			if (xIndex < 0 || xIndex > WIDTH || yIndex < 0 || yIndex > LENGTH)
				return;
			// x,yλ���Ѿ������Ӵ��ڣ�������
			if (findChess(xIndex, yIndex))
				return;
			
			QiZi ch = new QiZi(xIndex, yIndex, isBlack ?  Color.BLACK: Color.WHITE);			
			stones[chessCount++] = ch;				
			repaint(); // ֪ͨϵͳ���»���	
			stone[xIndex][yIndex] = ch;	
			renju.rule.Result result = rule1.judge(ch,stone);
         	record.setCount(chessCount);
		    record.setStones(stones);
		    record.setRule(rule1);
			record.setResult(result);
			record.setMode("PP");
			switch (result) {
				// ����ʤ����Ϣ,�����ټ�������
			case WIN:
				String msg = String.format("��ϲ��%sӮ�ˣ�", colorName);
				JOptionPane.showMessageDialog(this, msg);
				gameOver = true;
				record.print();
				break;
			case DRAW:
				JOptionPane.showMessageDialog(this, "����");
			    gameOver = true;
			    record.print();
			    break;
			case FORBIDDEN:
				String msg1 = String.format("%s���֣�", colorName);
				JOptionPane.showMessageDialog(this, msg1);
			    gameOver = true;
			    record.print();
				break;
			default:				
				break;
			
		} 
		isBlack = !isBlack;		
	}
		//waiting......
		if(mode.equals("PP")&&ruleMode.equals("J")){
			JOptionPane.showMessageDialog(null, "��δ�����������´���");
			isBlack = !isBlack;
		}
		if(mode.equals("AP")&&ruleMode.equals("N")){
			if (gameOver)
				return;
			
			xIndex =(e.getX() -15 + GRID_SPAN / 2) / GRID_SPAN; // �������������λ��ת��������������
			yIndex =(e.getY() -15 + GRID_SPAN / 2) / GRID_SPAN;
			// ���������⣬������
			if (xIndex < 0 || xIndex > WIDTH || yIndex < 0 || yIndex > LENGTH)
				return;
			// x,yλ���Ѿ������Ӵ��ڣ�������
			if (findChess(xIndex, yIndex))
				return;			
			QiZi ch = new QiZi(xIndex, yIndex,  Color.BLACK);			
			stones[chessCount++] = ch;
			stone[xIndex][yIndex] = ch;	
//			ch = AI.nextQiZi(stone);	
////			System.out.println(	AI.nextQiZi(stone));
//			stones[chessCount++] = ch;	
//			stone[ch.getX()][ch.getY()] = ch;
			repaint(); // ֪ͨϵͳ���»���				
			String colorName = ch.getColor().equals(Color.BLACK) ? "����" : "����";
			renju.rule.Result result = rule1.judge(ch,stone);
         	record.setCount(chessCount);
		    record.setStones(stones);
		    record.setRule(rule1);
			record.setResult(result);
			record.setMode("AP");
			switch (result) {
				// ����ʤ����Ϣ,�����ټ�������
			case WIN:
				String msg = String.format("��ϲ��%sӮ�ˣ�", colorName);
				JOptionPane.showMessageDialog(this, msg);
				gameOver = true;
				record.print();
				break;
			case DRAW:
				JOptionPane.showMessageDialog(this, "����");
			    gameOver = true;
			    record.print();
			    break;
			case FORBIDDEN:
				String msg1 = String.format("%s���֣�", colorName);
				JOptionPane.showMessageDialog(this, msg1);
			    gameOver = true;
			    record.print();
				break;
			default:
				ch = AI.nextQiZi(stone);	
//				System.out.println(	AI.nextQiZi(stone));
				stones[chessCount++] = ch;	
				stone[ch.getX()][ch.getY()] = ch;
				 result = rule1.judge(ch,stone);
				 colorName = ch.getColor().equals(Color.BLACK) ? "����" : "����";
				switch (result) {
				// ����ʤ����Ϣ,�����ټ�������
			case WIN:
				 msg = String.format("��ϲ��%sӮ�ˣ�", colorName);
				JOptionPane.showMessageDialog(this, msg);
				gameOver = true;
				record.print();
				break;
			case DRAW:
				JOptionPane.showMessageDialog(this, "����");
			    gameOver = true;
			    record.print();
			    break;
			case FORBIDDEN:
				 msg1 = String.format("%s���֣�", colorName);
				JOptionPane.showMessageDialog(this, msg1);
			    gameOver = true;
			    record.print();
				break;
			default:
				break;
				}
			    result = rule1.judge(ch,stone);
	         	record.setCount(chessCount);
			    record.setStones(stones);
			    record.setRule(rule1);
				record.setResult(result);
				record.setMode("AP");
				repaint(); // ֪ͨϵͳ���»���		
				break;
			
		} 
		}
		if(mode.equals("AP")&&ruleMode.equals("J")){
			JOptionPane.showMessageDialog(null, "��δ�����������´���");
			isBlack = !isBlack;
		}
				
		
	}

	private boolean findChess(int x, int y) {
		for (int i = 0;i<stones.length;i++) {
			if (stones[i] != null && stones[i].getX() == x && stones[i].getY() == y)
				return true;
		}
		return false;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	// ����
	//���ܴ������⣬��Ϊ��ά���鲢δ�ı�
		public void goback() {
			if(mode.equals("PP")){
			if (chessCount == 0)
				return;
            int x = stones[chessCount-1].getX();
            int y = stones[chessCount-1].getY();
			stones[chessCount - 1] = null;
			stone[x][y]=null;
			chessCount--;
//			if (chessCount > 0) {
//				xIndex = stones[chessCount - 1].getX();
//				yIndex = stones[chessCount - 1].getY();
//			}
			isBlack = !isBlack;
			repaint();
			}
			else{
				if (chessCount == 0)
					return;
				chessCount--;
	            int x1 = stones[chessCount].getX();
	            int y1 = stones[chessCount].getY();
				stones[chessCount] = null;
				chessCount--;
				 int x2 = stones[chessCount].getX();
		         int y2 = stones[chessCount].getY();
			     stones[chessCount] = null;
				stone[x1][y1]=null;
				stone[x2][y2]=null;
				//chessCount--;
//				if (chessCount > 0) {
//					xIndex = stones[chessCount - 1].getX();
//					yIndex = stones[chessCount - 1].getY();
//				}
				isBlack = !isBlack;
				repaint();
			}
		}
		public void restartGame() {
			JOptionPane.showMessageDialog(null, "��ѡ����Ϸģʽ��PP�����������ң����ߡ�PA���������������");
			 mode =JOptionPane.showInputDialog(null).toUpperCase();
			JOptionPane.showMessageDialog(null, "��ѡ����򣺡�J�������֣���N�����޽��֣�");
			 ruleMode =JOptionPane.showInputDialog(null).toUpperCase();
			
			// �������
			for (int i = 0; i < stones.length; i++)
				stones[i] = null;
			for(int i = 0; i <= LENGTH;i++){
				for(int j = 0; j <= LENGTH;j++){
					stone[i][j]=null;
				}
			}
			// �ָ���Ϸ��صı���ֵ
			isBlack = true;
			gameOver = false;// ��Ϸ�Ƿ����
			chessCount = 0; // ��ǰ���̵����Ӹ���
			repaint();

		}
		//���ݹ������е��������Ķ�ȡ
		public  void loadFromFile(String fileName){
			RecordAdapter recordAdapter = new ApplicationRecordAdapter();
			 record = recordAdapter.load(fileName);	
		}
		public void save(String fileName){
			RecordAdapter recordAdapter = new ApplicationRecordAdapter();
			recordAdapter.save(record, fileName,record.getMode());			
		}
		
}
