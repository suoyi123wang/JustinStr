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
	public static final int MARGIN = 15; // 边距
	public static final int GRID_SPAN = 35; // 网格间距
	public static final int LENGTH = 14;//棋盘行数
	public static final int WIDTH = 14;//棋盘列数	
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
    boolean isBlack = true;//默然开始是黑棋先下
    int chessCount; // 当前棋盘的棋子个数
	int xIndex, yIndex; // 当前刚下的棋子的索引
	boolean gameOver = false;// 游戏是否结束
	
	public ChessBoard() {	
		JOptionPane.showMessageDialog(null, "请选择游戏模式“PP”（玩家与玩家）或者“AP”（玩家与计算机）");
		 mode =JOptionPane.showInputDialog(null).toUpperCase();
		JOptionPane.showMessageDialog(null, "请选择规则：“J”（禁手）“N”（无禁手）");
		 ruleMode =JOptionPane.showInputDialog(null).toUpperCase();
		addMouseListener(this);// 添加监听器
		
		addMouseMotionListener(new MouseMotionListener() { // 匿名内部类:设置光标移动时的图像
			
			public void mouseDragged(MouseEvent e) {
				
			}

			public void mouseMoved(MouseEvent e) {
				int x1 = (e.getX() - MARGIN + GRID_SPAN / 2) / GRID_SPAN+1; 
				// 将鼠标点击的坐标位置转换成网格索引。
				int y1 = (e.getY() - MARGIN + GRID_SPAN / 2) / GRID_SPAN+1;
				// 游戏已经结束，不能下
				// 落在棋盘外，不能下
				// x,y位置已经有棋子存在，不能下
				if (x1 < 1 || x1 > WIDTH+1|| y1 < 1|| y1 > LENGTH+1 || gameOver )
					setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // 设置成默认形状
				else
					setCursor(new Cursor(Cursor.HAND_CURSOR)); // 设置成手型
			}
	}
		);
	}

	// 绘制
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// 画棋盘
			//木板背景
			backGround = new ImageIcon(getClass().getResource( "背景.jpg"));
			backGround.paintIcon(this, g, 0, 0);
			 //绘制网格
			 drawInLine(g);		
			// 画棋子
			for (int i = 0; i < chessCount; i++) {
				int xPos = (int)(stones[i].getX() * GRID_SPAN + MARGIN); // 网格交叉点的x坐标
				int yPos = (int)(stones[i].getY() * GRID_SPAN + MARGIN);// 网格交叉点的y坐标
				g.setColor(stones[i].getColor()); // 设置颜色
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
				// 标记最后一个棋子的红矩形框
				if (i == chessCount - 1) { 
					// 最后一个棋子
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
		 //划小黑点
		 g.fillOval(15+3*35-2,15+3*35-2,6,6);
		 g.fillOval(15+11*35-2,15+3*35-2,6,6);
		 g.fillOval(15+7*35-2,15+7*35-2,6,6);
		 g.fillOval(15+11*35-2,15+11*35-2,6,6);
		 g.fillOval(15+3*35-2,15+11*35-2,6,6);
		 for (int i = 0; i <= LENGTH; i++) { // 画横线
				g.drawLine(MARGIN,(int)( MARGIN + i * GRID_SPAN),(int)( MARGIN + WIDTH
						* GRID_SPAN),(int) (MARGIN + i * GRID_SPAN));

				
			}
			for (int i = 0; i <= WIDTH; i++) {// 画直线
				g.drawLine((int)(MARGIN + i * GRID_SPAN), MARGIN, (int)(MARGIN + i * GRID_SPAN),
						(int)(MARGIN + LENGTH * GRID_SPAN));
			}
	}
			
	// Dimension: 矩形
		public Dimension getPreferredSize() {
			return new Dimension((int)(MARGIN * 2 + GRID_SPAN * WIDTH),(int)( MARGIN * 2
					+ GRID_SPAN * LENGTH));
		}	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
    //主要内容
	@Override
	public void mousePressed(MouseEvent e) {		
		if(mode.equals("PP")&&ruleMode.equals("N")){		  
			// 游戏已经结束，不能下
			if (gameOver)
				return;
			String colorName = isBlack ? "黑棋" : "白棋";
			xIndex =(e.getX() -15 + GRID_SPAN / 2) / GRID_SPAN; // 将鼠标点击的坐标位置转换成网格索引。
			yIndex =(e.getY() -15 + GRID_SPAN / 2) / GRID_SPAN;
			// 落在棋盘外，不能下
			if (xIndex < 0 || xIndex > WIDTH || yIndex < 0 || yIndex > LENGTH)
				return;
			// x,y位置已经有棋子存在，不能下
			if (findChess(xIndex, yIndex))
				return;
			
			QiZi ch = new QiZi(xIndex, yIndex, isBlack ?  Color.BLACK: Color.WHITE);			
			stones[chessCount++] = ch;				
			repaint(); // 通知系统重新绘制	
			stone[xIndex][yIndex] = ch;	
			renju.rule.Result result = rule1.judge(ch,stone);
         	record.setCount(chessCount);
		    record.setStones(stones);
		    record.setRule(rule1);
			record.setResult(result);
			record.setMode("PP");
			switch (result) {
				// 给出胜利信息,不能再继续下棋
			case WIN:
				String msg = String.format("恭喜，%s赢了！", colorName);
				JOptionPane.showMessageDialog(this, msg);
				gameOver = true;
				record.print();
				break;
			case DRAW:
				JOptionPane.showMessageDialog(this, "和棋");
			    gameOver = true;
			    record.print();
			    break;
			case FORBIDDEN:
				String msg1 = String.format("%s禁手！", colorName);
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
			JOptionPane.showMessageDialog(null, "尚未开发，请重新创建");
			isBlack = !isBlack;
		}
		if(mode.equals("AP")&&ruleMode.equals("N")){
			if (gameOver)
				return;
			
			xIndex =(e.getX() -15 + GRID_SPAN / 2) / GRID_SPAN; // 将鼠标点击的坐标位置转换成网格索引。
			yIndex =(e.getY() -15 + GRID_SPAN / 2) / GRID_SPAN;
			// 落在棋盘外，不能下
			if (xIndex < 0 || xIndex > WIDTH || yIndex < 0 || yIndex > LENGTH)
				return;
			// x,y位置已经有棋子存在，不能下
			if (findChess(xIndex, yIndex))
				return;			
			QiZi ch = new QiZi(xIndex, yIndex,  Color.BLACK);			
			stones[chessCount++] = ch;
			stone[xIndex][yIndex] = ch;	
//			ch = AI.nextQiZi(stone);	
////			System.out.println(	AI.nextQiZi(stone));
//			stones[chessCount++] = ch;	
//			stone[ch.getX()][ch.getY()] = ch;
			repaint(); // 通知系统重新绘制				
			String colorName = ch.getColor().equals(Color.BLACK) ? "黑棋" : "白棋";
			renju.rule.Result result = rule1.judge(ch,stone);
         	record.setCount(chessCount);
		    record.setStones(stones);
		    record.setRule(rule1);
			record.setResult(result);
			record.setMode("AP");
			switch (result) {
				// 给出胜利信息,不能再继续下棋
			case WIN:
				String msg = String.format("恭喜，%s赢了！", colorName);
				JOptionPane.showMessageDialog(this, msg);
				gameOver = true;
				record.print();
				break;
			case DRAW:
				JOptionPane.showMessageDialog(this, "和棋");
			    gameOver = true;
			    record.print();
			    break;
			case FORBIDDEN:
				String msg1 = String.format("%s禁手！", colorName);
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
				 colorName = ch.getColor().equals(Color.BLACK) ? "黑棋" : "白棋";
				switch (result) {
				// 给出胜利信息,不能再继续下棋
			case WIN:
				 msg = String.format("恭喜，%s赢了！", colorName);
				JOptionPane.showMessageDialog(this, msg);
				gameOver = true;
				record.print();
				break;
			case DRAW:
				JOptionPane.showMessageDialog(this, "和棋");
			    gameOver = true;
			    record.print();
			    break;
			case FORBIDDEN:
				 msg1 = String.format("%s禁手！", colorName);
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
				repaint(); // 通知系统重新绘制		
				break;
			
		} 
		}
		if(mode.equals("AP")&&ruleMode.equals("J")){
			JOptionPane.showMessageDialog(null, "尚未开发，请重新创建");
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
	// 悔棋
	//可能存在问题，因为二维数组并未改变
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
			JOptionPane.showMessageDialog(null, "请选择游戏模式“PP”（玩家与玩家）或者“PA”（玩家与计算机）");
			 mode =JOptionPane.showInputDialog(null).toUpperCase();
			JOptionPane.showMessageDialog(null, "请选择规则：“J”（禁手）“N”（无禁手）");
			 ruleMode =JOptionPane.showInputDialog(null).toUpperCase();
			
			// 清除棋子
			for (int i = 0; i < stones.length; i++)
				stones[i] = null;
			for(int i = 0; i <= LENGTH;i++){
				for(int j = 0; j <= LENGTH;j++){
					stone[i][j]=null;
				}
			}
			// 恢复游戏相关的变量值
			isBlack = true;
			gameOver = false;// 游戏是否结束
			chessCount = 0; // 当前棋盘的棋子个数
			repaint();

		}
		//根据管理器中的数据明文读取
		public  void loadFromFile(String fileName){
			RecordAdapter recordAdapter = new ApplicationRecordAdapter();
			 record = recordAdapter.load(fileName);	
		}
		public void save(String fileName){
			RecordAdapter recordAdapter = new ApplicationRecordAdapter();
			recordAdapter.save(record, fileName,record.getMode());			
		}
		
}
