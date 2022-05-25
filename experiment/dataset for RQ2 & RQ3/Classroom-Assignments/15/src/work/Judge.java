package work;

public class Judge {
	public boolean isVictory(Draw draw) {
		boolean isVictory = false;

		int x1 = draw.a.getX();
		int y1 = draw.a.getY();
		String t1 = draw.a.getColor();

		int x2 = draw.b.getX();
		int y2 = draw.b.getY();
		String t2 = draw.b.getColor();

		int x3 = draw.c.getX();
		int y3 = draw.c.getY();
		String t3 = draw.c.getColor();

		int x4 = draw.d.getX();
		int y4 = draw.d.getY();
		String t4 = draw.d.getColor();

		int x5 = draw.e.getX();
		int y5 = draw.e.getY();
		String t5 = draw.e.getColor();

		int[] hengzuobiao = { x1, x2, x3, x4, x5 };
		int[] zongzuobiao = { y1, y2, y3, y4, y5 };

		if ((y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1)
				&& (y2 - y1) * (x4 - x1) == (y4 - y1) * (x2 - x1)
				&& (y2 - y1) * (x5 - x1) == (y5 - y1) * (x2 - x1)) {
			if ((hengzuobiao[4] - hengzuobiao[0] == 4)
					|| (hengzuobiao[3] - hengzuobiao[0] == 0
							&& hengzuobiao[4] - hengzuobiao[0] == 0
							&& hengzuobiao[2] - hengzuobiao[0] == 0 && hengzuobiao[1]
							- hengzuobiao[0] == 0)) {
				if (t1.equals(t2) && t1.equals(t3) && t1.equals(t4)
						&& t1.equals(t5)) {
					System.out.println(t1 + "∑ΩªÒ §");
					isVictory = true;
				} else {
					System.out.println(" ß∞‹");
					isVictory = false;
				}
			} else {
				System.out.println(" ß∞‹");
				isVictory = false;
			}

		} else {
			System.out.println(" ß∞‹");
			isVictory = false;
		}
		return isVictory;
	}

}
