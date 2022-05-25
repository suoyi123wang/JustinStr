package work;

public class Draw {
	public static final int max = 15;
	public static final int min = 1;

	public ChessPieces a;
	public ChessPieces b;
	public ChessPieces c;
	public ChessPieces d;
	public ChessPieces e;

	public static boolean isIn(ChessPieces x) {
		if (x.getX() <= max & x.getX() >= min & x.getY() <= max
				& x.getY() >= min) {
			return true;
		} else {
			System.out.println("输入错误！棋子不在棋盘范围内。");
			return false;
		}
	}
	public void drawQipan(ChessPieces a, ChessPieces b, ChessPieces c,
			ChessPieces d, ChessPieces e) {
	
	int x1 = a.getX();
	int y1 = a.getY();
	String t1 = a.getColor();

	int x2 = b.getX();
	int y2 = b.getY();
	String t2 = b.getColor();

	int x3 = c.getX();
	int y3 = c.getY();
	String t3 = c.getColor();

	int x4 = d.getX();
	int y4 = d.getY();
	String t4 = d.getColor();

	int x5 = e.getX();
	int y5 = e.getY();
	String t5 = e.getColor();

	
		System.out.print("   ");

		for (char B = 'A'; B <= 'O'; B++)
			System.out.print("   " + B);

		System.out
				.println("\n---------------------------------------------------------------------------------------------");

		for (int i = 1; i <= 15; i++) {
			System.out.printf("%3d", i);
			for (int j = 1; j <= 15; j++) {
				if (x1 == i & y1 == j) {
					if (t1.equals("B")) {
						if (j == 15)
							System.out.print("   B\n");
						else
							System.out.print("   " + "B");
					} 
					else if (t1.equals("W")) {
						if (j == 15)
							System.out.print("   W\n");
						else
							System.out.print("   " + "W");
					} 
					
				}if (x2 == i & y2 == j) {
					if (t2.equals("B")) {
						if (j == 15)
							System.out.print("   B\n");
						else
							System.out.print("   " + "B");
					} 
					else if (t2.equals("W")) {
						if (j == 15)
							System.out.print("   W\n");
						else
							System.out.print("   " + "W");
					} 
					
				}if (x3 == i & y3 == j) {
					if (t3.equals("B")) {
						if (j == 15)
							System.out.print("   B\n");
						else
							System.out.print("   " + "B");
					} 
					else if (t3.equals("W")) {
						if (j == 15)
							System.out.print("   W\n");
						else
							System.out.print("   " + "W");
					} 
					
				}if (x4 == i & y4 == j) {
					if (t4.equals("B")) {
						if (j == 15)
							System.out.print("   B\n");
						else
							System.out.print("   " + "B");
					} 
					else if (t4.equals("W")) {
						if (j == 15)
							System.out.print("   W\n");
						else
							System.out.print("   " + "W");
					} 
					
				}if (x5 == i & y5 == j) {
					if (t5.equals("B")) {
						if (j == 15)
							System.out.print("   B\n");
						else
							System.out.print("   " + "B");
					} 
					else if (t5.equals("W")) {
						if (j == 15)
							System.out.print("   W\n");
						else
							System.out.print("   " + "W");
					} 
					
				}
				
				else if (j < 15) {

					System.out.print("   "+ "+");

				} else
					System.out.print("   +\n");
			}
		}
	}

}
