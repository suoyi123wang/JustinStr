package homework;

public class Board {

		public static int[][] chess= new int[15][15];
	
	public  static void printBoard() {
			System.out.print(" " + " " + " ");
		char a[] = new char[15];
		for (int i = 0; i < 15; i++) {
			a[i] = (char) ('A' + i);
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		
		for (int i = 0; i < 15; i++) {
			System.out.printf("%3d", i + 1);
			for (int j = 0; j < 15; j++) {
				System.out.print((chess[i][j]==0)? "+"+ " ":(chess[i][j]==1)?"B"+" ":"W"+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}

}
