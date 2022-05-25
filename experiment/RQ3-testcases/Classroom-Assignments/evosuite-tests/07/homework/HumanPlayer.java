package homework;

import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer() {

	}

	public Chesswithoutcolor Playerinput(String[][] board) {
		int x, y;
		while (true) {
			System.out.println("请输入字母坐标");

			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			input = input.toUpperCase();
			int px, py;
			try {
				px = Integer.parseInt(input.substring(1));

			} catch (NumberFormatException exception) {
				px = -1;

			}

			try {
				py = input.charAt(0) - 'A' + 1;

			} catch (NumberFormatException exception) {
				py = -1;

			}
			Rule rule = new GomokuRule();
			boolean cando = rule.legalinput(px - 1, py - 1);
			
			if (cando == true) {
				boolean cando2 = rule.islegaltoadd(px - 1, py - 1, board);
				if (cando2 == true) {
					x = px - 1;
					y = py - 1;
					break;
				} else {
					System.out.println("输入不合法，请重新输入");
					continue;
				}
			} else {
				System.out.println("输入不合法，请重新输入");
				continue;
			}

		}
		Chesswithoutcolor chess = new Chesswithoutcolor(x, y);// 坐标范围0-14
		return chess;
	}

}
