package wuziqi;

public class GomokuRule extends Rule {

	private int blackr, blackc;
	private int whiter, whitec;
	private int black1, black2;
	private int white1, white2;
	private int blacka, blackb;
	private int whitea, whiteb;

	boolean judge(Element[][] a) {
		for (int r = 0; r < 15; r++) {
			blackr = 0;
			blackc = 0;
			whiter = 0;
			whitec = 0;
			for (int c = 0; c < 15; c++) {
				if (a[r][c].color.equals("White")) {
					blackr = 0;
					whiter = whiter + 1;
					if (whiter == 5) {
						result = "白子胜利";
						return false;
					}
				}
				if (a[c][r].color.equals("White")) {
					blackc = 0;
					whitec = whitec + 1;
					if (whitec == 5) {
						result = "白子胜利";
						return false;
					}
				}
				if (a[r][c].color.equals("0")) {
					blackr = 0;
					whiter = 0;
				}
				if (a[c][r].color.equals("0")) {
					blackc = 0;
					whitec = 0;
				}
				if (a[r][c].color.equals("Black")) {
					blackr = blackr + 1;
					whiter = 0;
					if (blackr == 5) {
						result = "黑子胜利";
						return false;
					}
				}
				if (a[c][r].color.equals("Black")) {
					blackc = blackc + 1;
					whitec = 0;
					if (blackc == 5) {
						result = "黑子胜利";
						return false;
					}
				}

			}
		}
		for (int s = 0; s < 11; s++) {
			black1 = 0;
			black2 = 0;
			white1 = 0;
			white2 = 0;
			for (int i = s; i < a.length; i++) {
				if (a[i][i - s].color.equals("White")) {
					white1 = white1 + 1;
					black1 = 0;
					if (white1 == 5) {
						result = "白子胜利";
						return false;
					}
				}
				if (a[i - s][i].color.equals("White")) {
					white2 = white2 + 1;
					black2 = 0;
					if (white2 == 5) {
						result = "白子胜利";
						return false;
					}
				}
				if (a[i][i - s].color.equals("Black")) {
					black1 = black1 + 1;
					white1 = 0;
					if (black1 == 5) {
						result = "黑子胜利";
						return false;
					}
				}
				if (a[i - s][i].color.equals("Black")) {
					black2 = black2 + 1;
					white2 = 0;
					if (black2 == 5) {
						result = "黑子胜利";
						return false;
					}
				}
				if (a[i][i - s].color.equals("0")) {
					black1 = 0;
					white1 = 0;
				}
				if (a[i - s][i].color.equals("0")) {
					black2 = 0;
					white2 = 0;
				}
			}
		}
		for (int s = 0; s < 11; s++) {
			blacka = 0;
			blackb = 0;
			whitea = 0;
			whiteb = 0;
			for (int i = s; i < a.length; i++) {
				if (a[i][14 + s - i].color.equals("White")) {
					whitea = whitea + 1;
					blackb = 0;
					if (whitea == 5) {
						result = "白子胜利";
						return false;
					}
				}
				if (a[i - s][14 - i].color.equals("White")) {
					whiteb = whiteb + 1;
					blackb = 0;
					if (whiteb == 5) {
						result = "黑子胜利";
						return false;
					}
				}
				if (a[i][14 + s - i].color.equals("Black")) {
					blacka = blacka + 1;
					whitea = 0;
					if (blacka == 5) {
						result = "黑子胜利";
						return false;
					}
				}
				if (a[i - s][14 - i].color.equals("Black")) {
					blackb = blackb + 1;
					whiteb = 0;
					if (blackb == 5) {
						result = "黑子胜利";
						return false;
					}
				}
				if (a[i][14 + s - i].color.equals("0")) {
					blacka = 0;
					whitea = 0;
				}
				if (a[i - s][14 - i].color.equals("0")) {
					blackb = 0;
					whiteb = 0;
				}
			}
		}
		return true;
	}

}
