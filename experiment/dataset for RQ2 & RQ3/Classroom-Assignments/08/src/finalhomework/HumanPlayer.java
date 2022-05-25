package finalhomework;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class HumanPlayer extends Player {

	int h, v;
	String finalline = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public Stone input(int count, int[][] stones, int[] info,
			int difficultyInt, Rule rule) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		if (count % 2 == 0)
			System.out.println("黑方落子,请输入坐标");
		else
			System.out.println("白方落子，请输入坐标");

		String stoneString = input.next();
		if (stoneString.equals("_rec")) {

			try {
				new Record().newRecord(stones, info);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("保存成功！！！");
			return input(count, stones, info, difficultyInt, rule);
		} else if (stoneString.equals("_reg")) {
			if (count < 2) {
				System.out.println("现在不能悔棋，请重新输入");
				return input(count, stones, info, difficultyInt, rule);
			} else
				return new Stone(-1, -1);
		} else if (stoneString.equals("0")) {
			return new Stone(0, 0);
		} else {
			// get horizontal coordinate.
			String firstLetter = stoneString.substring(0, 1);
			String upperFirstLetter = firstLetter.toUpperCase();
			h = finalline.indexOf(upperFirstLetter) + 1;

			// get vertical coordinate.
			String a1 = stoneString.replaceFirst(firstLetter, "0");
			v = (int) Double.parseDouble(a1);
			Stone stone = new Stone(h, v);

			return stone;
		}
	}
}
