package wuziqi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;

import javax.swing.*;

public class Gui extends Main {
	private JTextField now = new JTextField(state);
	private JFrame f;
	private JFrame W;
	private JButton bk = new JButton("哎呀，下错了。。。");
	private JTextArea D = new JTextArea("欢迎来到五子棋");
	private JRadioButton PvP, PvE, EvP, EvE, Gomoku, Renju, New, Resume;
	private JTextField i = new JTextField(25);
	private String Case = "PvP";
	private String rule = "Gomoku";
	private JTextField inputbox = new JTextField();
	public qipan a = new qipan();

	void welcome() {// 创建欢迎界面
		W = new JFrame();
		ButtonGroup GR, GL, GU;
		D.setEditable(false);
		JPanel L = new JPanel();
		L.setLayout(new GridLayout(4, 1));
		L.add(PvP = new JRadioButton("PvP"));
		PvP.addActionListener(new Lpp());
		L.add(PvE = new JRadioButton("PvE"));
		PvE.addActionListener(new Lpe());
		L.add(EvP = new JRadioButton("EvP"));
		EvP.addActionListener(new Lep());
		L.add(EvE = new JRadioButton("EvE"));
		EvE.addActionListener(new Lee());
		GL = new ButtonGroup();
		GL.add(PvP);
		GL.add(PvE);
		GL.add(EvP);
		GL.add(EvE);
		W.add(D, BorderLayout.CENTER);
		JPanel R = new JPanel();
		R.setLayout(new GridLayout(2, 1));
		R.add(Gomoku = new JRadioButton("经典规则"));
		Gomoku.addActionListener(new LrG());
		R.add(Renju = new JRadioButton("有禁手规则（暂未开放）"));
		Renju.addActionListener(new LrR());
		Renju.setEnabled(false);
		GR = new ButtonGroup();
		GR.add(Gomoku);
		GR.add(Renju);
		W.add(L, BorderLayout.WEST);
		W.add(R, BorderLayout.EAST);
		JPanel U = new JPanel();
		New = new JRadioButton("新游戏");
		New.addActionListener(new L0());
		U.add(New);
		Resume = new JRadioButton("继续残局");
		Resume.addActionListener(new L1());
		U.add(Resume);
		GU = new ButtonGroup();
		GU.add(New);
		GU.add(Resume);
		W.add(U, BorderLayout.NORTH);
		New.setSelected(true);
		Gomoku.setSelected(true);
		PvP.setSelected(true);
		JPanel B = new JPanel();
		JButton S = new JButton("开始");
		S.setMnemonic(KeyEvent.VK_ENTER);
		S.addActionListener(new L2());
		B.add(i);
		i.setEnabled(false);
		B.add(S);
		W.add(B, BorderLayout.SOUTH);
		W.setSize(750, 500);
		W.setTitle("主菜单");
		W.setLocationRelativeTo(null);
		W.setVisible(true);
		W.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void buildFrame() {// 创建游戏窗口
		f = new JFrame();
		JPanel console = new JPanel();
		JPanel putin = new JPanel();
		JButton Restart = new JButton("重来！");
		JButton OK = new JButton("OK");
		JButton save = new JButton("存档");
		JButton help = new JButton("我不会！");
		putin.setLayout(new BorderLayout());
		putin.add(inputbox, BorderLayout.CENTER);
		putin.add(OK, BorderLayout.EAST);
		OK.setMnemonic(KeyEvent.VK_ENTER);
		OK.addActionListener(new Lok());
		console.setLayout(new GridLayout(4, 1, 5, 5));
		console.add(Restart);
		Restart.addActionListener(new Lrestart());
		console.add(save);
		save.addActionListener(new Lsave());
		console.add(help);
		help.addActionListener(new Lhelp());
		console.add(now);
		now.setEditable(false);
		bk.addActionListener(new Lbk());
		if (turn < 3) {
			bk.setEnabled(false);
		}
		f.add(bk, BorderLayout.NORTH);
		f.add(a, BorderLayout.CENTER);
		a.addMouseListener(new catchPos());
		f.add(console, BorderLayout.EAST);
		f.add(putin, BorderLayout.SOUTH);
		f.setTitle("五子棋");
		f.setSize(720, 720);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	void saveW() throws InterruptedException {// 获取存档名的新窗口
		JFrame w = new JFrame();
		w.setSize(300, 200);
		w.setVisible(true);
		w.setLocationRelativeTo(f);
		JTextField na = new JTextField(20);
		JTextArea inf = new JTextArea();
		inf.setEditable(false);
		w.add(na, BorderLayout.NORTH);
		w.add(inf, BorderLayout.CENTER);
		JButton o = new JButton("OK");
		o.setEnabled(false);
		na.addKeyListener(new KeyListener() {
			public void keyReleased(KeyEvent arg0) {
				if (!na.getText().matches("(.*)[?<>|*:\"\\/](.*)")// 文件名合法性
						&& !na.getText().equals("")) {
					o.setEnabled(true);
					inf.setText("OK");
				} else {
					inf.setText("不能用这样的名字。。。");
					o.setEnabled(false);
				}
			}
			public void keyTyped(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {}
		});
		w.add(o, BorderLayout.SOUTH);
		o.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Mg.save(na.getText());
				} catch (Exception e) {
					e.printStackTrace();
				}
				w.dispose();
				if (state.equals("黑子胜利") || state.equals("白子胜利")) {
					closeF();
					restart();
				}
			}
		});
	}

	void closeF() {
		f.dispose();
	}

	void closeW() {
		W.dispose();
	}

	void p() {
		now.setText(state);
	}

	@SuppressWarnings("serial")
	// 加了这句话可以消除黄色的注意符号。。
	class qipan extends JPanel {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 0; i < 15; i++) {// 绘制棋盘
				g.setColor(Color.black);
				g.drawLine(40 + 40 * i, 40, 40 + 40 * i, 600);
				g.drawString(String.valueOf(i), 35 + 40 * i, 30);
				g.drawLine(40, 40 + 40 * i, 600, 40 + 40 * i);
				g.drawString(String.valueOf(i), 15, 50 + 40 * i);
			}
			for (int j = 0; j < 15; j++) {// 根据棋局矩阵绘制棋局
				for (int k = 0; k < 15; k++) {
					if (M[j][k].color.equals("W")) {
						g.setColor(Color.white);
						g.fillOval(24 + 40 * k, 24 + 40 * j, 32, 32);
					}
					if (M[j][k].color.equals("B")) {
						g.setColor(Color.black);
						g.fillOval(24 + 40 * k, 24 + 40 * j, 32, 32);
					}
					if (M[j][k].color.equals("B") && M[j][k].step == Game.turn) {// 最新一步的棋子显示为方形
						g.setColor(Color.BLUE);
						g.drawRect(24 + 40 * k, 24 + 40 * j, 32, 32);

					}
					if (M[j][k].color.equals("W") && M[j][k].step == Game.turn) {
						g.setColor(Color.BLUE);
						g.drawRect(24 + 40 * k, 24 + 40 * j, 32, 32);
					}
				}
			}
		}
	}

	class Lok implements ActionListener {// 落子确认键
		public void actionPerformed(ActionEvent e) {
			input = inputbox.getText();
			inputbox.setText(null);
			game.play();
			if (turn >= 3) {
				bk.setEnabled(true);
			}
			a.repaint();
		}
	}

	class Lrestart implements ActionListener {// 重开
		public void actionPerformed(ActionEvent e) {
			restart();
		}
	}

	class Lsave implements ActionListener {// 存档
		public void actionPerformed(ActionEvent e) {
			try {
				saveW();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

	class Lhelp implements ActionListener {// 提示
		public void actionPerformed(ActionEvent e) {
			AIPlayer help = new AIPlayer();
			if (turn % 2 == 1) {
				help.setPosition(M, 0);
			} else {
				help.setPosition(M, 1);
			}
			inputbox.setText("唉~~  看右边。。。");
			state = help.getX() + "," + help.getY();
			p();
		}
	}

	class Lbk implements ActionListener {// 悔棋
		public void actionPerformed(ActionEvent e) {
			byte location0[] = null;
			byte location1[] = null;
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					if (M[i][j].step == turn) {
						location0 = new byte[2];
						location0 = M[i][j].location.clone();
					}
					if (M[i][j].step == turn - 1) {
						location1 = new byte[2];
						location1 = M[i][j].location.clone();
					}
				}
			}
			M[location0[0]][location0[1]].reset();
			M[location1[0]][location1[1]].reset();
			turn = turn - 2;
			a.repaint();
			if (turn < 3) {
				bk.setEnabled(false);
			}
		}
	}

	class L0 implements ActionListener {// New 选项
		public void actionPerformed(ActionEvent e) {
			D.setText("欢迎来到五子棋。");
			PvP.setEnabled(true);
			PvE.setEnabled(true);
			EvP.setEnabled(true);
			EvE.setEnabled(true);
			Gomoku.setEnabled(true);
			Renju.setEnabled(false);
			i.setEnabled(false);
		}
	}

	class L1 implements ActionListener {// Load 选项
		public void actionPerformed(ActionEvent e) {
			D.setText("指令集：\n sort-t   按照棋谱保存时间排序并打印棋谱列表\n sort-n   按照棋谱名称排序并打印棋谱列表 \n load+filename   读取给定名称的棋局\n delete+filename 删除指定名称的存档");
			PvP.setEnabled(false);
			PvE.setEnabled(false);
			EvP.setEnabled(false);
			EvE.setEnabled(false);
			Gomoku.setEnabled(false);
			Renju.setEnabled(false);
			i.setEnabled(true);
		}
	}

	class L2 implements ActionListener {// 开始  按钮
		public void actionPerformed(ActionEvent e) {
			if (New.isSelected()) {
				Mg.newMatrix();
				W.dispose();
				game.setCase(Case);
				game.setRule(rule);
				draw.buildFrame();
			} else {
				try {
					D.setText(Mg.load(i.getText()));
					i.setText("");
				} catch (FileNotFoundException e1) {
					D.setText("这个文件存在吗？");
				}
			}
		}
	}

	class Lpp implements ActionListener {// PvP 选项
		public void actionPerformed(ActionEvent e) {
			Case = "PvP";
		}
	}

	class Lpe implements ActionListener {// PvE
		public void actionPerformed(ActionEvent e) {
			Case = "PvE";
		}
	}

	class Lep implements ActionListener {// EvP
		public void actionPerformed(ActionEvent e) {
			Case = "EvP";
		}
	}

	class Lee implements ActionListener {// EvE
		public void actionPerformed(ActionEvent e) {
			Case = "EvE";
		}
	}

	class LrG implements ActionListener {// GomokuRule 选项
		public void actionPerformed(ActionEvent e) {
			rule = "Gomoku";
		}
	}

	class LrR implements ActionListener {// RenjuRule
		public void actionPerformed(ActionEvent e) {
			rule = "Renju";
		}
	}
	
	class catchPos implements MouseListener{
		public void mouseClicked(MouseEvent e) {
			int y=((e.getX()-20)/40);
			int x=((e.getY()-20)/40);
			input=x+","+y;
			game.play();
			if (turn >= 3) {
				bk.setEnabled(true);
			}
			a.repaint();
		}
		public void mouseEntered(MouseEvent arg0) {
		}
		public void mouseExited(MouseEvent arg0) {
		}
		public void mousePressed(MouseEvent arg0) {
		}
		public void mouseReleased(MouseEvent arg0) {	
		}
	}
}
