package gobang;

public class Judge {
	public static boolean judge(ChessPieces stone1,ChessPieces stone2,ChessPieces stone3,ChessPieces stone4,ChessPieces stone5){
		boolean judge=false;
		int a1=stone1.getX();
		int b1=stone1.getY();
		String z1=stone1.getColor();
		int a2=stone2.getX();
		int b2=stone2.getY();
		String z2=stone2.getColor();
		int a3=stone3.getX();
		int b3=stone3.getY();
		String z3=stone3.getColor();
		int a4=stone4.getX();
		int b4=stone4.getY();
		String z4=stone4.getColor();
		int a5=stone5.getX();
		int b5=stone5.getY();
		String z5=stone1.getColor();
		if ((b2 - b1) * (a3 - a1) == (b3 - b1) * (a2 - a1)) {
			if ((b2 - b4) * (a3 - a4) == (b3 - b4) * (a2 - a4)) {
				if ((b2 - b5) * (a3 - a5) == (b3 - b5) * (a2 - a5)) {
					//放入数组
					int[] as = { a1, a2, a3, a4, a5 };
					int[] bs = { b1, b2, b3, b4, b5 };
					//数组重排，从小到大
					java.util.Arrays.sort(as);
					java.util.Arrays.sort(bs);
					//判断相邻
					if ((as[4] - as[0] == 4 || as[4] - as[0] == 0)
							&& (as[3] - as[1] == 2 || as[3] - as[1] == 0)) {
						if ((bs[4] - bs[0] == 4 || bs[4] - bs[0] == 0)
								&& (bs[3] - bs[1] == 2 || bs[3] - bs[1] == 0)) {
							if(z1.equals(z2)&&z2.equals(z3)&&z3.equals(z4)&&z4.equals(z5)){
							System.out.println("Congratulations! victory!");
							return judge = true;
							}else{
								System.out.println("sorry,try again?");
								return judge = false;
							}
						} else {
							System.out.println("sorry,try again?");
							return judge = false;
						}

					} else {
						System.out.println("sorry,try again?");
						return judge = false;
					}
				} else {
					System.out.println("sorry,try again?");
					return judge = false;
				}

			} else {
				System.out.println("sorry,try again?");
				return judge = false;
			}

		} else {
			System.out.println("sorry,try again?");
			return judge = false;
		}

	
	}
	public static void main(String[] argv) {
		Input input1=new Input();
		Input input2=new Input();
		Input input3=new Input();
		Input input4=new Input();
		Input input5=new Input();
		ChessPieces stone1=input1.input("A3B");
		ChessPieces stone2=input2.input("A2B");
		ChessPieces stone3=input3.input("A4B");
		ChessPieces stone4=input4.input("A1B");
		ChessPieces stone5=input5.input("A5B");
		Judge judge = new Judge();
		boolean judgeString=judge.judge(stone1, stone2, stone3, stone4, stone5);
		System.out.println(judgeString);
	}

}
