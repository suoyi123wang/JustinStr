package wuziqi;

public class AIPlayer extends Player {
	private String[][] A;
	byte x, y;
	String[] pattern;

	boolean setPosition(Element[][] a, int color) {
		getMatrix(a, color);
		double max = 0;
		for (byte i = 0; i < 15; i++) {
			for (byte j = 0; j < 15; j++) {
				if (A[i][j].equals("0")) {
					A[i][j] = "x";
					getPattern(i, j);
					double attack = evaluate(i, j, false);
					A[i][j] = "y";
					getPattern(i, j);
					double defend = evaluate(i, j, true);
					A[i][j] = "0";
					double credit = attack+ defend/2;
					if (max < credit) {
						max = credit;
						x = i;
						y = j;
					}
				}
			}
		}
		if(turn==0){
			x=7;y=7;
		}
		return false;
	}

	private double evaluate(int x, int y, boolean defence) {
		String p = "";
		double cred=1;
		for (int j = 0; j < 4; j++) {
			pattern[j].replace('o','y');
			if(defence){
				pattern[j]=pattern[j].replace('x','z').replace('y', 'x').replace('z', 'y');
			}
		}
		//if (d) {
			cred = 0;
			for (int i = 0; i < 4; i++) {
				if (pattern[i].matches(".*xxxxx.*")) {
					p += "!";
					continue;
				}
				if (pattern[i].matches("(.*)0xxxx0(.*)")) {
					p += "A";
					continue;
				}
				if (pattern[i].matches("(.*)yxxxx0(.*)")
						|| pattern[i].matches("(.*)0xxxxy(.*)")
						|| p.matches("(.*)x0xxx(.*)")
						|| p.matches("(.*)xxx0x(.*)")
						|| p.matches("(.*)xx0xx(.*)")) {
					p += "a";
					continue;
				}
				if (pattern[i].matches("(.*)0xxx0(.*)")) {
					p += "B";
					continue;
				}
				if (pattern[i].matches("(.*)yxxx0(.*)")
						|| pattern[i].matches("(.*)0xxxy(.*)")
						|| p.matches("(.*)x0xx0(.*)")
						|| p.matches("(.*)0xx0x(.*)")
						|| p.matches("(.*)xx0x0(.*)")
						|| p.matches("(.*)0x0xx(.*)")) {
					p += "b";
					continue;
				}
				if (pattern[i].matches("(.*)000xx000(.*)")) {
					p += "C";
					continue;
				}
				if (pattern[i].matches("(.*)xx000(.*)")
						|| pattern[i].matches("(.*)000xx(.*)")
						|| p.matches("(.*)x0x00(.*)")
						|| p.matches("(.*)00x0x(.*)")) {
					p += "c";
					continue;
				}
				if(pattern[i].matches("(.*)0x0(.*)")){
					p+=".";
				}
			}
		if (p.matches(".*!.*")) {
			cred +=50000000;
			return cred;}
		if (p.matches("(.*)A(.*)")
				|| p.matches("(.*)a(.*)B(.*)") || p.matches("(.*)B(.*)a(.*)")) {
			cred +=100000;
			return cred;
		}
		if( p.matches("(.*)a(.*)a(.*)")){
			cred+=10000;
			return cred;
		}
		if (p.matches("(.*)B(.*)B(.*)")) {
			cred +=5000;
			return cred;
		}
		if (p.matches("(.*)B(.*)b(.*)") || p.matches("(.*)b(.*)B(.*)")) {
			cred +=1000;
			return cred;
		}
		if (p.matches(".*a.*")) {
			cred +=500;
			return cred;
		}
		if (p.indexOf("B") != -1)
			cred +=200;
		if (p.matches("(.*)C(.*)C(.*)"))
			cred +=90;
		if (p.matches("(.*)b(.*)"))
			cred +=50;
		if (p.matches(".*C.*"))
			cred +=10;
		if (p.matches("c"))
			cred +=5;
		/*if(p.matches(".*..*")) cred=+0.1;*/
		return cred;
	}

	byte getX() {
		return x;
	}

	byte getY() {
		return y;
	}

	private void getMatrix(Element[][] a, int color) {
		A = new String[15][15];
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				if (color == 0)
					A[i][j] = a[i][j].color.replace("B", "x").replace("W", "y");
				else
					A[i][j] = a[i][j].color.replace("W", "x").replace("B", "y");
			}
		}
	}

	private void getPattern(int x, int y) {
		StringBuilder row = new StringBuilder("o");
		StringBuilder line = new StringBuilder("o");
		StringBuilder dia = new StringBuilder("o");
		StringBuilder antidia = new StringBuilder("o");
		for (int i = 0; i < 15; i++) {
			row = row.append(A[i][y]);
			line = line.append(A[x][i]);
			if (x - y + i <= 14 && x - y + i >= 0) {
				dia = dia.append(A[x - y + i][i]);
			}
			if (x + y - i >= 0 && x + y - i <= 14) {
				antidia = antidia.append(A[i][x + y - i]);
			}
			pattern = new String[4];
			pattern[0] = row.toString() + "o";
			pattern[1] = line.toString() + "o";
			pattern[2] = dia.toString() + "o";
			pattern[3] = antidia.toString() + "o";
		}
	}
}