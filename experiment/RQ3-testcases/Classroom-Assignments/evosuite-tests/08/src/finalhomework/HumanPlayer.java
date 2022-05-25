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
			System.out.println("�ڷ�����,����������");
		else
			System.out.println("�׷����ӣ�����������");

		String stoneString = input.next();
		if (stoneString.equals("_rec")) {

			try {
				new Record().newRecord(stones, info);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("����ɹ�������");
			return input(count, stones, info, difficultyInt, rule);
		} else if (stoneString.equals("_reg")) {
			if (count < 2) {
				System.out.println("���ڲ��ܻ��壬����������");
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
