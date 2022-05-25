package homework;

public class AIPlayer2 extends Player {
	public AIPlayer2() {

	}

	public Chesswithoutcolor Playerinput(String[][] board) {
		AIreal ai = new AIreal();
		String WB = color;
		int[][] judgeboard = ai.judgeboardcreator(board, WB);
		ai.AIjudge1(judgeboard);
		ai.AIjudge2(judgeboard);
		ai.AIjudge3(judgeboard);
		ai.AIjudge4(judgeboard);
		
		int[][] weight = ai.weightboard;
		System.out.println(" 1 A B C D E F G H I J K L M N O"); // print the board
		int[][] boardtoprint = new int[15][15];
		boardtoprint = weight;
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
	
		Chesswithoutcolor finalchess = ai.Playerinput();
		return finalchess;
	}

}
