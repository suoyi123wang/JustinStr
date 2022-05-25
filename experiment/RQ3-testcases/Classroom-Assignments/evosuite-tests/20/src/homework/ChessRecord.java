package homework;

public class ChessRecord {
	
	
	
	public static final int Length = 15;
	public static final int Width = 15;

	
	public static int a1[] = new int[225];//record player1's horizontal line
	public static int a2[] = new int[225];//record player1's vertical line
	public static int b1[] = new int[225];//record player2's horizontal line
	public static int b2[] = new int[225];//record player2's vertical line
	
	
	
	public void printStones1(int count){
		for(int i=0;i<=count;i++){
			char a3=(char) (a2[i]+64);
			System.out.println("player1"+"第"+i+"个"+"棋子的坐标:"+a3+a1[i]);}
			
	}
	public void printStones2(int count){
		for(int i=0;i<=count;i++){
			char b3=(char)(b2[i]+64);
			System.out.println("player2"+"第"+i+"个"+"棋子的坐标:"+b3+b1[i]);}
	}
	 public int[] order(){//order means orders from ui
		 int a[]= new int[3];
		 for(int i=0;i<3;i++){
		 a[i]=ConsoleUI.order[i];}
		 return a;
	 }
	
}
