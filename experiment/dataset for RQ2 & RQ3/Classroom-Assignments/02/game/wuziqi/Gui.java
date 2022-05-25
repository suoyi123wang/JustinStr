package wuziqi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

public class Gui extends Main {
	private JTextField now = new JTextField(state);
	private JPanel console = new JPanel();
	private JPanel putin = new JPanel();
	private JFrame f;
	private JFrame W;
	private JButton OK = new JButton("OK");
	private JButton Restart = new JButton("Restart");
	private JButton save = new JButton("Save");
	private JButton load = new JButton("Load");
	private JButton bk = new JButton("I shouldn't have done that...");
	private JTextArea D = new JTextArea("Welcome!");
	private JRadioButton PvP, PvE, EvP, EvE, Gomoku, Renju, New, Resume;
	private ButtonGroup GR, GL, GU;
	private JTextField i = new JTextField(25);
	private String Case="PvP";
	private String rule="Gomoku";
	private JTextField inputbox = new JTextField();

	void welcome() {
		W = new JFrame();
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
		R.add(Gomoku = new JRadioButton("Gomoku Style"));
		Gomoku.addActionListener(new LrG());
		R.add(Renju = new JRadioButton("Renju Style"));
		Renju.addActionListener(new LrR());
		GR = new ButtonGroup();
		GR.add(Gomoku);
		GR.add(Renju);
		W.add(L, BorderLayout.WEST);
		W.add(R, BorderLayout.EAST);
		JPanel U = new JPanel();
		New = new JRadioButton("NewGame");
		New.addActionListener(new L0());
		U.add(New);
		Resume = new JRadioButton("LoadGame");
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
		JButton S = new JButton("Go");
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

	void buildFrame() {// 创建窗口
		f = new JFrame();
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
		console.add(load);
		load.addActionListener(new Lload());
		console.add(now);
		now.setEditable(false);
		bk.addActionListener(new Lbk());
		if(turn<3){
			bk.setEnabled(false);
		}
		f.add(bk, BorderLayout.NORTH);
		f.add(new qipan(), BorderLayout.CENTER);
		f.add(console, BorderLayout.EAST);
		f.add(putin, BorderLayout.SOUTH);
		f.setTitle("五子棋");
		f.setSize(405, 405);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	void closeW(){
		W.dispose();
	}
	void closeF(){
		f.dispose();
	}
	
	void p() {
		now.setText(state);
	}

	class qipan extends JPanel {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 0; i < 15; i++) {// 绘制棋盘
				g.setColor(Color.black);
				g.drawLine(20 + 20 * i, 20, 20 + 20 * i, 300);
				g.drawString(String.valueOf(i), 15 + 20 * i, 15);
				g.drawLine(20, 20 + 20 * i, 300, 20 + 20 * i);
				g.drawString(String.valueOf(i), 5, 25 + 20 * i);
			}
			for (int j = 0; j < 15; j++) {// 根据棋局矩阵绘制棋局
				for (int k = 0; k < 15; k++) {
					if (M[j][k].color.equals("White")
							&& M[j][k].step != Game.turn) {
						g.setColor(Color.white);
						g.fillOval(12 + 20 * k, 12 + 20 * j, 16, 16);
					}
					if (M[j][k].color.equals("Black")
							&& M[j][k].step != Game.turn) {
						g.setColor(Color.black);
						g.fillOval(12 + 20 * k, 12 + 20 * j, 16, 16);
					}
					if (M[j][k].color.equals("Black")
							&& M[j][k].step == Game.turn) {// 最新一步的棋子显示为方形
						g.setColor(Color.black);
						g.fillRect(12 + 20 * k, 12 + 20 * j, 16, 16);

					}
					if (M[j][k].color.equals("White")
							&& M[j][k].step == Game.turn) {
						g.setColor(Color.white);
						g.fillRect(12 + 20 * k, 12 + 20 * j, 16, 16);
					}
				}
			}
			repaint();// 刷新窗口
		}

	}

	class Lok implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(turn>=3){
				bk.setEnabled(true);
			}
			input = inputbox.getText();
			inputbox.setText(null);
			game.play();
		}
	}

	class Lrestart implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			f.dispose();
			draw.welcome();
		}
	}

	class Lsave implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String name = JOptionPane.showInputDialog(null, "请键入文件名。");
			try {
				Mg.save(name);
			} catch (Exception a) {
				JOptionPane.showMessageDialog(null, "错误！");
				;
			}
		}
	}

	class Lload implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				String file = JOptionPane.showInputDialog(Mg.load("sort-n"));
				Mg.load("load " + file);
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "No file found.");
			}
		}
	}

	class Lbk implements ActionListener{
		public void actionPerformed(ActionEvent e){
			byte location0[]=null;
			byte location1[]=null;
			for(int i=0;i<15;i++){
				for(int j=0;j<15;j++){
					if(M[i][j].step==turn-1){
						location0=new byte[2];
						location0=M[i][j].location.clone();
					}
					if(M[i][j].step==turn-2){
						location1=new byte[2];
						location1=M[i][j].location.clone();
					}
				}
			}
			M[location0[0]][location0[1]].reset();
			M[location1[0]][location1[1]].reset();
			turn=turn-2;
			if(turn<3){
				bk.setEnabled(false);
			}
		}
	}
	
	class L0 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			D.setText("Welcome!");
			PvP.setEnabled(true);
			PvE.setEnabled(true);
			EvP.setEnabled(true);
			EvE.setEnabled(true);
			Gomoku.setEnabled(true);
			Renju.setEnabled(true);
			i.setEnabled(false);
		}
	}

	class L1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			D.setText("指令集：\n sort-t   按照棋谱保存时间排序并打印棋谱列表\n sort-n   按照棋谱名称排序并打印棋谱列表 \n load+filenumber   读取给定名称的棋局");
			PvP.setEnabled(false);
			PvE.setEnabled(false);
			EvP.setEnabled(false);
			EvE.setEnabled(false);
			Gomoku.setEnabled(false);
			Renju.setEnabled(false);
			i.setEnabled(true);
		}
	}

	class L2 implements ActionListener {
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
					D.setText("有错误。。。");
				}
			}
		}
	}

	class Lpp implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Case = "PvP";
		}
	}

	class Lpe implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Case = "PvE";
		}
	}

	class Lep implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Case = "EvP";
		}
	}

	class Lee implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Case = "EvE";
		}
	}

	class LrG implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			rule = "Gomoku";
		}
	}

	class LrR implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			rule = "Renju";
		}
	}
}
