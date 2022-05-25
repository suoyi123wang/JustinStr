package wuziqi;

import javax.swing.JOptionPane;

public class Game extends Main {
	Rule judge;
	Player p1, p2;
	String color;
	private String rule = "";
	private String Case = "";

	void setRule(String a) {
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

	String getRule() {
		return rule;
	}

	void setCase(String s) {
		Case = s;
	}

	String getCase() {
		return Case;
	}

	void play() {
	switch (Case) {
		case "PvP":
			p1 = new HumanPlayer();
			if (judge.judge(M)) {
				if (turn % 2 == 1) {
					color = "Black";
				} else {
					color = "White";
				}
				if (!p1.setPosition(M, input)) {
					draw.p();
					break;
				}
				state = "胜负未决";
				p1.setPosition(M, input);
				byte x = p1.getX();
				byte y = p1.getY();
				turn = turn + 1;
				M[x][y].set(color, turn, x, y);
				draw.p();
			}
			break;
		case "PvE":
			p1 = new HumanPlayer();
			p2 = new AIPlayer();
			if (judge.judge(M)) {
				if (turn % 2 == 1) {
					color = "Black";
					state = "胜负未决";
					p2.setPosition(M, "");
					byte x = p2.getX();
					byte y = p2.getY();
					turn = turn + 1;
					M[x][y].set(color, turn, x, y);
					draw.p();
				} else {
					color = "White";
					if (!p1.setPosition(M, input)) {
						break;
					}
					state = "胜负未决";
					byte x = p1.getX();
					byte y = p1.getY();
					turn = turn + 1;
					M[x][y].set(color, turn, x, y);
					draw.p();
				}
			}
			break;
		case "EvP":
			if (judge.judge(M)) {
				p1 = new AIPlayer();
				p2 = new HumanPlayer();
				if (turn % 2 == 1) {
					color = "Black";
					p1.setPosition(M, input);
					state = "胜负未决";
					byte x = p1.getX();
					byte y = p1.getY();
					turn = turn + 1;
					M[x][y].set(color, turn, x, y);
					draw.p();
				} else {
					color = "White";
					if (!p2.setPosition(M, input)) {
						break;
					}
					state = "胜负未决";
					byte x = p2.getX();
					byte y = p2.getY();
					turn = turn + 1;
					M[x][y].set(color, turn, x, y);
					draw.p();
				}
			}
			break;
		case "EvE":
			while (judge.judge(M)) {
				p1 = new AIPlayer();
				p2 = new AIPlayer();
				if (turn % 2 == 1) {
					color = "Black";
					p1.setPosition(M, input);
					turn = turn + 1;
					state = "胜负未决";
					byte x = p1.getX();
					byte y = p1.getY();
					M[x][y].set(color, turn, x, y);
					draw.p();
				} else {
					color = "White";
					p2.setPosition(M, input);
					turn = turn + 1;
					state = "胜负未决";
					byte x = p2.getX();
					byte y = p2.getY();
					M[x][y].set(color, turn, x, y);
					draw.p();
				}
			}
			break;
		default:
			break;
		}
		if (!judge.judge(M)) {
			state=judge.getResult();
			int save = JOptionPane.showConfirmDialog(null, state + "。游戏在第 "
					+ turn + " 步结束。是否保存？", null, JOptionPane.YES_NO_OPTION);
			if (save == 0) {
				String name = JOptionPane.showInputDialog(null, "请键入文件名。");
				try {
					Mg.save(name);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			draw.closeF();
		}
	}
}
