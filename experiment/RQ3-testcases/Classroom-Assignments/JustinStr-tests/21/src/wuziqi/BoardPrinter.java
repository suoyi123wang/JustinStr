package wuziqi;

public class BoardPrinter{

	public void boardprinter(String[][] board){
		System.out.println("   A B C D E F G H I J K L M N O"); // print the board
		String[][] boardtoprint = new String[15][15];
		boardtoprint = board;
		int i,j;
		for (i = 0; i <= 14; i++) {
			int i2 = i + 1;
			if(i2 <10){
			System.out.print("0"+i2+" ");
			}else{
				System.out.print(i2+" ");
			}
			for (j = 0; j <= 14; j++) {
				System.out.print(boardtoprint[i][j]);
			}
			System.out.println(" ");
		}
	}
}
