package wuziqi;

import javax.swing.JOptionPane;

public class Game extends Main {
	Rule judge;
	Player p1, p2;
	String color;
	private String rule = "";
	private String Case = "";

	void setRule(String a) {// �趨��������
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

	String getRule() {// ��ȡ��ǰ��������
		return rule;
	}

	void setCase(String s) {// �趨��սģʽ
		Case = s;
	}

	String getCase() {// ��ȡ��սģʽ
		return Case;
	}

	void play() {// ִ����Ϸ
		switch (Case) {
		case "PvP":// PvP
			p1 = new HumanPlayer();
			if (judge.judge(M)) {
				if (turn % 2 == 1) {
					color = "B";// �趨��ɫ
				} else {
					color = "W";
				}
				if (!p1.setPosition(M, 0)) {// ������ȷ��
					break;
				}
				state = "ʤ��δ��";
				draw.p();
				p1.setPosition(M, 0);
				byte x = p1.getX();
				byte y = p1.getY();// ��ȡ����
				turn = turn + 1;
				M[x][y].set(color, turn, x, y);// �����Ӽ������̾���
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
					state = "ʤ��δ��";
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
					state = "ʤ��δ��";
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
					state = "ʤ��δ��";
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
					state = "ʤ��δ��";
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
		if (!judge.judge(M)) {// ����
			state = judge.getResult();
			draw.p();
			draw.a.repaint();
			int save = JOptionPane.showConfirmDialog(null, state + "����Ϸ�ڵ� "
					+ turn + " ���������Ƿ񱣴棿", null, JOptionPane.YES_NO_OPTION);
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
