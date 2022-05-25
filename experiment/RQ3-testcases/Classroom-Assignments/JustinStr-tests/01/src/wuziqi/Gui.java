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
	private JButton bk = new JButton("��ѽ���´��ˡ�����");
	private JTextArea D = new JTextArea("��ӭ����������");
	private JRadioButton PvP, PvE, EvP, EvE, Gomoku, Renju, New, Resume;
	private JTextField i = new JTextField(25);
	private String Case = "PvP";
	private String rule = "Gomoku";
	private JTextField inputbox = new JTextField();
	public qipan a = new qipan();

	void welcome() {// ������ӭ����
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
		R.add(Gomoku = new JRadioButton("�������"));
		Gomoku.addActionListener(new LrG());
		R.add(Renju = new JRadioButton("�н��ֹ�����δ���ţ�"));
		Renju.addActionListener(new LrR());
		Renju.setEnabled(false);
		GR = new ButtonGroup();
		GR.add(Gomoku);
		GR.add(Renju);
		W.add(L, BorderLayout.WEST);
		W.add(R, BorderLayout.EAST);
		JPanel U = new JPanel();
		New = new JRadioButton("����Ϸ");
		New.addActionListener(new L0());
		U.add(New);
		Resume = new JRadioButton("�����о�");
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
		JButton S = new JButton("��ʼ");
		S.setMnemonic(KeyEvent.VK_ENTER);
		S.addActionListener(new L2());
		B.add(i);
		i.setEnabled(false);
		B.add(S);
		W.add(B, BorderLayout.SOUTH);
		W.setSize(750, 500);
		W.setTitle("���˵�");
		W.setLocationRelativeTo(null);
		W.setVisible(true);
		W.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void buildFrame() {// ������Ϸ����
		f = new JFrame();
		JPanel console = new JPanel();
		JPanel putin = new JPanel();
		JButton Restart = new JButton("������");
		JButton OK = new JButton("OK");
		JButton save = new JButton("�浵");
		JButton help = new JButton("�Ҳ��ᣡ");
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
		f.setTitle("������");
		f.setSize(720, 720);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	void saveW() throws InterruptedException {// ��ȡ�浵�����´���
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
				if (!na.getText().matches("(.*)[?<>|*:\"\\/](.*)")// �ļ����Ϸ���
						&& !na.getText().equals("")) {
					o.setEnabled(true);
					inf.setText("OK");
				} else {
					inf.setText("���������������֡�����");
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
				if (state.equals("����ʤ��") || state.equals("����ʤ��")) {
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
	// ������仰����������ɫ��ע����š���
	class qipan extends JPanel {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 0; i < 15; i++) {// ��������
				g.setColor(Color.black);
				g.drawLine(40 + 40 * i, 40, 40 + 40 * i, 600);
				g.drawString(String.valueOf(i), 35 + 40 * i, 30);
				g.drawLine(40, 40 + 40 * i, 600, 40 + 40 * i);
				g.drawString(String.valueOf(i), 15, 50 + 40 * i);
			}
			for (int j = 0; j < 15; j++) {// ������־���������
				for (int k = 0; k < 15; k++) {
					if (M[j][k].color.equals("W")) {
						g.setColor(Color.white);
						g.fillOval(24 + 40 * k, 24 + 40 * j, 32, 32);
					}
					if (M[j][k].color.equals("B")) {
						g.setColor(Color.black);
						g.fillOval(24 + 40 * k, 24 + 40 * j, 32, 32);
					}
					if (M[j][k].color.equals("B") && M[j][k].step == Game.turn) {// ����һ����������ʾΪ����
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

	class Lok implements ActionListener {// ����ȷ�ϼ�
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

	class Lrestart implements ActionListener {// �ؿ�
		public void actionPerformed(ActionEvent e) {
			restart();
		}
	}

	class Lsave implements ActionListener {// �浵
		public void actionPerformed(ActionEvent e) {
			try {
				saveW();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

	class Lhelp implements ActionListener {// ��ʾ
		public void actionPerformed(ActionEvent e) {
			AIPlayer help = new AIPlayer();
			if (turn % 2 == 1) {
				help.setPosition(M, 0);
			} else {
				help.setPosition(M, 1);
			}
			inputbox.setText("��~~  ���ұߡ�����");
			state = help.getX() + "," + help.getY();
			p();
		}
	}

	class Lbk implements ActionListener {// ����
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

	class L0 implements ActionListener {// New ѡ��
		public void actionPerformed(ActionEvent e) {
			D.setText("��ӭ���������塣");
			PvP.setEnabled(true);
			PvE.setEnabled(true);
			EvP.setEnabled(true);
			EvE.setEnabled(true);
			Gomoku.setEnabled(true);
			Renju.setEnabled(false);
			i.setEnabled(false);
		}
	}

	class L1 implements ActionListener {// Load ѡ��
		public void actionPerformed(ActionEvent e) {
			D.setText("ָ���\n sort-t   �������ױ���ʱ�����򲢴�ӡ�����б�\n sort-n   ���������������򲢴�ӡ�����б� \n load+filename   ��ȡ�������Ƶ����\n delete+filename ɾ��ָ�����ƵĴ浵");
			PvP.setEnabled(false);
			PvE.setEnabled(false);
			EvP.setEnabled(false);
			EvE.setEnabled(false);
			Gomoku.setEnabled(false);
			Renju.setEnabled(false);
			i.setEnabled(true);
		}
	}

	class L2 implements ActionListener {// ��ʼ  ��ť
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
					D.setText("����ļ�������");
				}
			}
		}
	}

	class Lpp implements ActionListener {// PvP ѡ��
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

	class LrG implements ActionListener {// GomokuRule ѡ��
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
