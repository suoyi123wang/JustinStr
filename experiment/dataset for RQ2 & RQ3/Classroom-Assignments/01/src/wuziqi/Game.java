package wuziqi;

import javax.swing.JOptionPane;

public class Game extends Main {
	Rule judge;
	Player p1, p2;
	String color;
	private String rule = "";
	private String Case = "";

	void setRule(String a) {// 设定规则类型
		switch (a) {
		case "Gomoku":
			judge = new GomokuRule();
			rule = a;
			break;
		case "RenjuRule":
			judge = new RenjuRule();
			rule = a;
			break;
		default:
			judge = new GomokuRule();
			rule = a;
			break;
		}
	}

	String getRule() {// 获取当前规则类型
		return rule;
	}

	void setCase(String s) {// 设定对战模式
		Case = s;
	}

	String getCase() {// 获取对战模式
		return Case;
	}

	void play() {// 执行游戏
		switch (Case) {
		case "PvP":// PvP
			p1 = new HumanPlayer();
			if (judge.judge(M)) {
				if (turn % 2 == 1) {
					color = "B";// 设定颜色
				} else {
					color = "W";
				}
				if (!p1.setPosition(M, 0)) {// 输入正确性
					break;
				}
				state = "胜负未决";
				draw.p();
				p1.setPosition(M, 0);
				byte x = p1.getX();
				byte y = p1.getY();// 获取坐标
				turn = turn + 1;
				M[x][y].set(color, turn, x, y);// 把棋子计入棋盘矩阵
			}
			break;
		case "PvE":// PvE
			p1 = new HumanPlayer();
			p2 = new AIPlayer();
			if (judge.judge(M)) {
				if (turn % 2 == 0) {
					color = "W";
					if (!p1.setPosition(M, 1)) {
						break;
					}
					state = "胜负未决";
					draw.p();
					byte x = p1.getX();
					byte y = p1.getY();
					turn = turn + 1;
					M[x][y].set(color, turn, x, y);
				}
			}
			if (judge.judge(M)) {
				if (turn % 2 == 1) {
					color = "B";
					state = "胜负未决";
					draw.p();
					p2.setPosition(M, 0);
					byte x = p2.getX();
					byte y = p2.getY();
					turn = turn + 1;
					M[x][y].set(color, turn, x, y);
				}
			}
			break;
		case "EvP":// EvP
			p1 = new AIPlayer();
			p2 = new HumanPlayer();
			if (judge.judge(M)) {
				if (turn % 2 == 1) {
					color = "B";
					if (!p2.setPosition(M, 0)) {
						break;
					}
					state = "胜负未决";
					draw.p();
					byte x = p2.getX();
					byte y = p2.getY();
					turn = turn + 1;
					M[x][y].set(color, turn, x, y);
				}
			}
			if (judge.judge(M)) {
				if (turn % 2 == 0) {
					color = "W";
					p1.setPosition(M, 1);
					state = "胜负未决";
					draw.p();
					byte x = p1.getX();
					byte y = p1.getY();
					turn = turn + 1;
					M[x][y].set(color, turn, x, y);
				}
			}
			break;
		case "EvE":// EvE
			while (judge.judge(M) && turn < 225) {
				p1 = new AIPlayer();
				p2 = new AIPlayer();
				if (turn % 2 == 1) {
					color = "B";
					p1.setPosition(M, 0);
					byte x = p1.getX();
					byte y = p1.getY();
					turn = turn + 1;
					M[x][y].set(color, turn, x, y);
				} else {
					color = "W";
					p2.setPosition(M, 1);
					byte x = p2.getX();
					byte y = p2.getY();
					turn = turn + 1;
					M[x][y].set(color, turn, x, y);
				}
			}
			break;
		default:
			break;
		}
		if (!judge.judge(M)) {// 结束
			state = judge.getResult();
			draw.p();
			draw.a.repaint();
			int save = JOptionPane.showConfirmDialog(null, state + "。游戏在第 "
					+ turn + " 步结束。是否保存？", null, JOptionPane.YES_NO_OPTION);
			if (save == 0) {
				try {
					draw.saveW();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				draw.closeF();
				restart();
			}
		}
	}
}
