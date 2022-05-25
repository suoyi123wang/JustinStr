package wuziqi.console;

import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer() {

	}

	public void setcolor(String selfcolor) {

	}

	public void setmode(String mode) {

	}

	public boolean quitandsave() {
		boolean quitandsave = false;
		System.out.print("�������ڴ˴�ѡ���Ƿ�浵���˳�");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if (input.equals("")) {
			quitandsave = false;
		} else if (input.equals("C")) {
			quitandsave = true;
		} else {
			quitandsave = false;
		}
		return quitandsave;
	}

	public Chesswithoutcolor Playerinput(String[][] board) {
		int x, y;
		while (true) {
			System.out.println("��������ĸ����");

			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			input = input.toUpperCase();
			int px, py;
			try {
				px = Integer.parseInt(input.substring(1));

			} catch (Exception exception) {
				px = -1;

			}

			try {
				py = input.charAt(0) - 'A' + 1;

			} catch (Exception exception) {
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
					System.out.println("���벻�Ϸ�������������");
					continue;
				}
			} else {
				System.out.println("���벻�Ϸ�������������");
				continue;
			}

		}
		Chesswithoutcolor chess = new Chesswithoutcolor(x, y);// ���귶Χ0-14
		return chess;
	}

	public boolean regret() {
		boolean regret = false;
		System.out.println("���Ƿ�Ҫ���壿����Y�Ի���,ֱ�ӻس������������ַ��Ժ���");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(input.equals("Y")){
			regret = true;
		}else{
			regret = false;
		}
		
		return regret;
		

	}

}
