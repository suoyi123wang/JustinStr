package Gomoku;

import java.util.Scanner;

public class Gomoku {

	public static void main(String[] args) {
		boolean d = false;
		Judge a = new Judge();
		int b1;
		int b2;
		String a1;
		int i = 0;
		int j = 0;
		String[][] h = new String[15][15];
		while (i < 15) {
			while (j < 15) {
				h[i][j] = "X";
				j++;
			}
			i++;
			j = 0;
		}
		while (d == false) {
			System.out.println("请输入坐标");
			Scanner input = new Scanner(System.in);
			a1 = input.next();
			b1 = Piece.Hang(a1);
		    b2 = Piece.List(a1);
			a.piece[b1 - 1][b2 - 1] = a1;
			h[b1-1][b2-1]=Piece.Color(a1);
			d = a.IsHang(a.piece[b1 - 1][b2 - 1]);
			if (d == true) {
				System.out.println("胜利");
			} else {
				d = a.IsList(a.piece[b1 - 1][b2 - 1]);
			}
			if (d == true) {
				System.out.println("胜利");
			} else {
				d = a.IsList(a.piece[b1 - 1][b2 - 1]);
			}
			if (d == true) {
				System.out.println("胜利");
			} else {
				d = a.IsLean1(a.piece[b1 - 1][b2 - 1]);
			}
			if (d == true) {
				System.out.println("胜利");
			} else {
				d = a.IsLean2(a.piece[b1 - 1][b2 - 1]);
			}
			if (d == true) {
				System.out.println("胜利");
			}
		int n = 0;
		while (n < 15) {
			System.out.println(h[n][0] + " " + h[n][1] + " "
					+ h[n][2] + " " + h[n][3] + " " + h[n][4] + " "
				+ h[n][5] + " " + h[n][6] + " " + h[n][7] + " "
					+ h[n][8] + " " + h[n][9] + " " + h[n][10]
					+ " " + h[n][11] + " " + h[n][12] + " "
					+ h[n][13] + " " + h[n][14]);
         n++;
		}
		}
	}
}
