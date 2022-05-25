package Wuziqi;

import java.util.Scanner;

public class Game2 {
	private Player playerOne;
	private AI AI;
	private QiPan qiPan;
	private QiPu qiPu;

	public Player getPlayerOne() {
		return playerOne;
	}

	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}

	public AI getAI() {
		return AI;
	}

	public void setAI(AI AI) {
		this.AI = AI;
	}

	public QiPan getQiPan() {
		return qiPan;
	}

	private void setQiPan(QiPan qiPan) {
		this.qiPan = qiPan;
	}

	private Game2(Player playerOne, AI AI , QiPan qiPan) {
		this.setPlayerOne(playerOne);
		this.setAI(AI);
		this.setQiPan(qiPan);
	}

	public static Game2 create() {
		return new Game2(new Player(1, QiZi.BLACK), new AI(2, QiZi.WHITE),
				new QiPan());
	}

	public void start() {
		
		qiPan.print();
		
		Scanner input = new Scanner(System.in);
	
		while(!Rule.win(qiPan)){
			System.out.println("�������룬��1A����������H");
			String order = input.nextLine();
			if(order.equals("H")){
				qiPan.setQiPan(QiPu.huiQiRenJi());
				qiPan.print();
				System.out.println("������������");
				order = input.nextLine();
			}
			while(!QiPan.validInput(order)){
				System.out.println("�����ʽ����");
				order = input.nextLine();
			}
			while(!QiPan.validQiZi(playerOne.order(order))){
				System.out.println("����Խ��");
				order = input.nextLine();
			}
			while(!qiPan.unOccupied(playerOne.order(order))){
				System.out.println("�����ѷ���");
				order = input.nextLine();
			}
			qiPan.setQiZi(playerOne.order(order));
			qiPan.print();
			
			if(Rule.win(qiPan)){
				System.out.println("�����ʤ");
				break;}
			else{
				qiPan.setQiZi(AI.order(AI.creatOrder(qiPan, AI, playerOne)));
				qiPan.print();
				System.out.println("AI����λ����" + AI.creatOrder(qiPan, AI, playerOne));
				if(Rule.win(qiPan)){
					System.out.println("�����ʤ");
				}
			 }
			QiPu.setQiPu(qiPan);
		}
		
		System.out.println("�������������ɣ���������Ҫ�����̣�����ֵ������" + QiPu.count);
		int order = input.nextInt();
		qiPan.setQiPan(QiPu.getQiPu(order));
		qiPan.print();
		input.close();	
	}
	public static void print(int[][]matrix){
		  for(int i = 0 ; i < matrix.length ; i++){
				for(int j = 0 ; j < matrix[i].length ; j++){
					if(j == matrix[i].length-1) System.out.println(matrix[i][j] + " " );
					else{System.out.print(matrix[i][j] + " ");}
				}
			}
		  System.out.println(" ");
	}
}
