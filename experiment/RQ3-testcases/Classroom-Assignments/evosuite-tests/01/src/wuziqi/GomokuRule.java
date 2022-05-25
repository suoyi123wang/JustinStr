package wuziqi;

public class GomokuRule extends Rule {
	boolean judge(Element[][] a) {
		String line1="", line2="", line3="", line4="", line5="", line6="";
		for (byte i = 0; i < 15; i++) {
			line1 = "";line2 = "";line3 = "";line4 = "";line5 = "";line6 = "";
			for (byte j = 0; j < 15; j++) {//获取每一行，每一列，每一斜
				line1 = line1 + a[i][j].color;
				line2 = line2 + a[j][i].color;
				if (i + j <= 14) {
					line3 = line3 + a[i + j][j].color;
					line4 = line4 + a[j][i + j].color;
					line5 = line5 + a[14 - i - j][j].color;
					line6 = line6 + a[14 - j][i + j].color;
				}
			}
			if (line1.matches("(.*)WWWWW(.*)")//使用系统内置的匹配函数判断
					|| line2.matches("(.*)WWWWW(.*)")
					|| line3.matches("(.*)WWWWW(.*)")
					|| line4.matches("(.*)WWWWW(.*)")
					|| line5.matches("(.*)WWWWW(.*)")
					|| line6.matches("(.*)WWWWW(.*)")) {
				result = "白子胜利";
				return false;
			}
			if (line1.matches("(.*)BBBBB(.*)")
					|| line2.matches("(.*)BBBBB(.*)")
					|| line3.matches("(.*)BBBBB(.*)")
					|| line4.matches("(.*)BBBBB(.*)")
					|| line5.matches("(.*)BBBBB(.*)")
					|| line6.matches("(.*)BBBBB(.*)")) {
				result = "黑子胜利";
				return false;
			}
		}
		return true;
	}
}
