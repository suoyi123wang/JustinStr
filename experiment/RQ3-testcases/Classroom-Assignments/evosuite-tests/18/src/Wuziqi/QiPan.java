package Wuziqi;

public class QiPan {

	private int[][] qiPan = new int[17][17];
	
	public QiPan(){
	}

	
	public int[][] getQiPan(){
		return qiPan;
	}
	
	public void setQiPan(int[][]qiPan){
		this.qiPan = qiPan;
	}
	
	public static boolean validQiZi(QiZi qiZi){
		if (qiZi.getX() > 0 && qiZi.getX() < 16 && qiZi.getY() > 0 && qiZi.getY() < 16 &&
			(qiZi.getColor() == 1 || qiZi.getColor() == 2)	) return true;
		else return false;
	}
	
	public static boolean validInput(String order){
		boolean valid = true;;
		String x = order.substring(0, order.length()-1);
		char[] letter = x.toCharArray();
		if(order.length()!= 2 && order.length()!= 3) valid = false;
		if(Character.isLetter(letter[0])) valid = false;
		if(order.length() == 3){{
		if(Character.isLetter(letter[1])) valid = false;
			}
		}
		return valid;
	}
		
	public  boolean unOccupied(QiZi qizi){
		if (qiPan[qizi.getX()][qizi.getY()] == 0) return true;
		else return false;
	}
	
	public void xiaQi(QiZi qizi){
		qiPan[qizi.getX()][qizi.getY()] = qizi.getColor();
	}
	
	public void  print(){	
		 String [][] qiPan = new String[16][16];
			for (int i = 1 ; i < 16 ; i ++ ){
				qiPan[0][i] = String.valueOf((char)('A' + i -1 ) );
			}
			 for(int i = 2 ; i < 15 ; i++){
					for(int j = 2 ; j < 16 ; j++){
						qiPan[i][j]	= "©à";			
					}
			 }
			 for (int i = 2 ; i < 15 ; i ++ ){
					qiPan[1][i] = "©Ð";
				}
			 for (int i = 2 ; i < 15 ; i ++ ){
					qiPan[15][i] = "©Ø";
				} 
			 for (int i = 2 ; i < 15 ; i ++ ){
					qiPan[i][1] = "©À";
				} 
			 for (int i = 2 ; i < 15 ; i ++ ){
					qiPan[i][15] = "©È";
				} 
			 for (int i = 1 ; i < 16 ; i ++ ){
					qiPan[i][0] = String.format("%2s", i);

				} 
			 qiPan[0][0] =  "  ";
			 qiPan[1][1] = "©°";
			 qiPan[1][15] = "©´";
			 qiPan[15][1] = "©¸";
			 qiPan[15][15] = "©¼";
			 
			 for(int i = 0 ; i < 16 ; i++){
					for(int j = 0 ; j <16 ; j++){
						if(this.qiPan[i][j] == 1) qiPan[i][j] = "¡ñ";
						if(this.qiPan[i][j] == 2) qiPan[i][j] = "¡ð";
					}
			 }
			 
			 for(int i = 0 ; i < qiPan.length ; i++){
					for(int j = 0 ; j <qiPan[i].length ; j++){
						if(j == qiPan[i].length-1) System.out.println(qiPan[i][j] + " " );
						else{System.out.print(qiPan[i][j] + " ");}
					}
				}
			  System.out.println(" ");
	}

	public void setQiZi(QiZi qiZi){
		qiPan[qiZi.getX()][qiZi.getY()] = qiZi.getColor();
	}
}
