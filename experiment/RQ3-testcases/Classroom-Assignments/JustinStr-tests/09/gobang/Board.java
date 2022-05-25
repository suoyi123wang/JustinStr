package gobang;

public class Board {
	public static final int maxlocation=15;
	public static final int minlocation=1;
	ChessPieces stone1;
	ChessPieces stone2;
	ChessPieces stone3;
	ChessPieces stone4;
	ChessPieces stone5;
	public static boolean iswrong(ChessPieces stone){
		boolean iswrong=false;
		ChessPieces stoneChessPieces=stone;
		int x=stoneChessPieces.getX();
		int y=stoneChessPieces.getY();
		if(x<minlocation||x>maxlocation||y<minlocation||y>maxlocation){
			return iswrong=true;
		}else{
			return iswrong;
		}
	}
	
	public String board(ChessPieces stone1,ChessPieces stone2,
			ChessPieces stone3,ChessPieces stone4,ChessPieces stone5){
		String board2="";
		if(this.iswrong(stone1)||this.iswrong(stone2)||this.iswrong(stone3)||this.iswrong(stone4)||this.iswrong(stone5)){
			System.out.println("输入坐标超出棋盘范围，请重新输入");
		}else{
		int x1=stone1.getX();
		int y1=stone1.getY();
		String z1=stone1.getColor();
		int x2=stone2.getX();
		int y2=stone2.getY();
		String z2=stone2.getColor();
		int x3=stone3.getX();
		int y3=stone3.getY();
		String z3=stone3.getColor();
		int x4=stone4.getX();
		int y4=stone4.getY();
		String z4=stone4.getColor();
		int x5=stone5.getX();
		int y5=stone5.getY();
		String z5=stone1.getColor();
		String board1 = "";
		//把棋盘最上面画好
	     board2 = "   A B C D E F G H I J K L M N O";
		int i = 1;
		int j = 1;
		String x;

		while (i <= 15) {
			j = 1;

			while (j <= 15) {

				if (i == x1 && j == y1) {
					if (z1==ChessPieces.BLACK){
					x = "B";
					}else{
						x="W";
					}
				} else if (i == x2
						&& j == y2) {
					if (z2==ChessPieces.BLACK){
						x = "B";
						}else{
							x="W";
						}

				} else if (i == x3
						&& j == y3) {
					if (z3==ChessPieces.BLACK){
						x = "B";
						}else{
							x="W";
						}

				} else if (i == x4
						&& j == y4) {
					if (z4==ChessPieces.BLACK){
						x = "B";
						}else{
							x="W";
						}

				} else if (i == x5
						&& j == y5) {
					if (z5==ChessPieces.BLACK){
						x = "B";
						}else{
							x="W";
						}

				} else {
					x = "+";
				}

				board1 += x + " ";

				j++;

			}
			if (i < 10) {
				board2 += "\n" + i + "  " + board1;
			} else {
				board2 += "\n" + i + " " + board1;
			}
			board1 = "";
			i++;
		}
//返回棋盘
		return board2;
	}
		return board2;
		}
	public static void main(String[] argv) {
		Input input1=new Input();
		Input input2=new Input();
		Input input3=new Input();
		Input input4=new Input();
		Input input5=new Input();
		ChessPieces stone1=input1.input("A3B");
		ChessPieces stone2=input2.input("A2B");
		ChessPieces stone3=input3.input("B6W");
		ChessPieces stone4=input4.input("E8W");
		ChessPieces stone5=input5.input("A4B");
		Board board = new Board();
		String boardString=board.board(stone1, stone2, stone3, stone4, stone5);
		System.out.println(boardString);
	}
	}

