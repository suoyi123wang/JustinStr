package Gomoku;
public class Piece {

		public static int Hang(String a) {
			String a1 = String.valueOf(a.substring(0, 1).charAt(0) - 'A' + 1);
			int hang = Integer.parseInt(a1);
			return hang;
		}

		public static int List(String a) {
			int f = a.length();
			String o = a.substring(1,f-1);
			int list= Integer.parseInt(o);
			return list;
		}

		public static String Color(String a) {
			int d = a.length();
			String color;
			String c = "";
			if (d == 1) {
				c = a;
			} else {
				c = a.substring(d - 1);
			}
			if (c.equals("W")) {
				color = "W";
			} else if (c.equals("B")) {
				color = "B";
			} else
				color = "A";
			return color;
		}

	}

