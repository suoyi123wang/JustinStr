package Wuziqi;

public class QiPu {
	
	static int[][][] qiPu = new int [1000][17][17]; 
	static int count = 0;

	public QiPu(){
	}
	
	public static void setQiPu(QiPan qiPan){
		int [][] qiPan2 = qiPan.getQiPan();
		for (int i = 0 ;i < 17 ; i ++){
			for (int j = 0 ; j < 17 ; j++){
				QiPu.qiPu[count][i][j] = qiPan2[i][j];
			}
		}
		count ++;

		}	
	public static int[][] getQiPu(int k){
		int [][] qiPan2 = new int [17][17];
		for (int i = 0 ;i < 17 ; i ++){
			for (int j = 0 ; j < 17 ; j++){
				qiPan2[i][j] = QiPu.qiPu[k][i][j];
			}
		}
		return qiPan2;
	}
	
	public int getCount(){
		return count;
	}
	
	public boolean validCount(int i){
		if(i > 0 && i < count + 1 ){ return true;}
		else {return false;}
	}

	public static int[][] huiQiRenRen(){
		return QiPu.getQiPu(count-2);
	}
	public static int[][] huiQiRenJi(){
		return QiPu.getQiPu(count-1);
	}
}
