package gobang;
import java.util.Scanner;
public class Play {
	Input input;
	Board board;
	Judge judge;
	public Play(){
		
	}
	public Play(Input input,Board board,Judge judge){
		this.input=input;
		this.board=board;
		this.judge=judge;	
	}
	public void playsituation(){
		
	Play play=new Play(input, board, judge);
	Board board=play.board;
	ChessPieces stone1;
	ChessPieces stone2;
	ChessPieces stone3;
	ChessPieces stone4;
	ChessPieces stone5;
	//��ѭ��ʵ�ֳ�����Χ������
	do{
		System.out.println("�������һ�����꣬�磺A1B��A���������꣬1��������꣬B��W����ڡ���ɫ");
		Scanner scanner=new Scanner(System.in);
		String location1=scanner.nextLine();
		System.out.println("������ڶ�������");
		 scanner=new Scanner(System.in);
		String location2=scanner.nextLine();
		System.out.println("���������������");
		 scanner=new Scanner(System.in);
		String location3=scanner.nextLine();
		System.out.println("��������ĸ�����");
		 scanner=new Scanner(System.in);
		String location4=scanner.nextLine();
		System.out.println("��������������");
		 scanner=new Scanner(System.in);
		String location5=scanner.nextLine();
		System.out.println("---------------------------------�����ķָ���------------------------------------");
		Input input1=new Input();
		Input input2=new Input();
		Input input3=new Input();
		Input input4=new Input();
		Input input5=new Input();
		 stone1=input1.input(location1);
		 stone2=input2.input(location2);
		 stone3=input3.input(location3);
		 stone4=input4.input(location4);
		 stone5=input5.input(location5);
		 board = new Board();
		String boardString=board.board(stone1, stone2, stone3, stone4, stone5);
		System.out.println(boardString);
		System.out.println("---------------------------------�����ķָ���------------------------------------");
		Judge judge = new Judge();
		boolean judgeString=judge.judge(stone1, stone2, stone3, stone4, stone5);
		System.out.println(judgeString);
	}while(board.iswrong(stone1)||board.iswrong(stone2)||board.iswrong(stone3)||board.iswrong(stone4)||board.iswrong(stone5));
	}
	public static void main(String[] argv) {
		Play play=new Play();
		play.playsituation();
		
	}

}
