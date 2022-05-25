package wuziqi.gui;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GUIchess extends JLabel implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5278504345365770L;
	public int x;
	public int y;
	public Player player;
	public String inputcolor;
	public boolean isclicked = false;
	
	public ImageIcon whiteIcon1 = new ImageIcon("白色棋子1.png");
	public ImageIcon whiteIcon2 = new ImageIcon("白色棋子2.png");
	public ImageIcon blackIcon1 = new ImageIcon("黑色棋子1.png");
	public ImageIcon blackIcon2 = new ImageIcon("黑色棋子2.png");

	public GUIchess(Player player,int x, int y, ImageIcon icon) {
		super(icon);
		this.x = x;
		this.y = y;
		this.player = player;
	this.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(x+","+y);
			if(inputcolor.equals("B")){
				setblack();
			}else if(inputcolor.equals("W")){
				setwhite();
			}
			setEnabled(false);
		}
	});
	}
	
	public void setinputcolor(String inputcolor){
		this.inputcolor = inputcolor;
	}
	
	public void setwhite(){
		Random random = new Random();
		int i = random.nextInt(2);
		if(i == 0){
		setIcon(whiteIcon1);
		}else if(i == 1){
			setIcon(whiteIcon2);
		}
		repaint();

	}
	public void setblack(){
		Random random = new Random();
		int i = random.nextInt(2);
		if(i == 0){
		setIcon(blackIcon1);
		}else if(i == 1){
			setIcon(blackIcon2);
		}
		repaint();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}
}
