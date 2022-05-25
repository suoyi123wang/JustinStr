package Wuziqi;


public class Rule {
	public static boolean winHelper(QiPan qiPan, int x ,int y){
		boolean win1 = true;
		boolean win2 = true;
		boolean win3 = true;
		int [][] qiPan1 = qiPan.getQiPan();
		for (int i = x + 1 ; i < x +5 ; i ++){
			if ( qiPan1[i][y] != qiPan1[x][y] ) win1 = false;
		}
		for (int j = y + 1 ; j < y +5 ; j ++){
			if ( qiPan1[x][j] != qiPan1[x][y] ) win2 = false;
		}
		for (int j = y + 1 ,i = x + 1 ; j < y +5 ; j ++ , i++){
			if ( qiPan1[i][j] != qiPan1[x][y] ) win3 = false;
		}
		
		return win1||win2||win3;
	}
	
	public static boolean win(QiPan qiPan){
		boolean win = false;
		int [][] qiPan1 = qiPan.getQiPan();
		 for(int i = 1 ; i < 12 ; i++){
			for(int j = 1 ; j < 12 ; j++){
				if ((qiPan1[i][j] == 1|| qiPan1[i][j] == 2)&&winHelper(qiPan,i,j)){
					win = true;
				}				
			}
		 }
		return win;	
	}

}
