package Wuziqi;

import java.util.Scanner;
public class Game {
	private Player playerOne;
	private Player playerTwo;
	private QiPan qiPan;
	private QiPu qiPu;

	public Player getPlayerOne() {
		return playerOne;
	}

	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}

	public Player getPlayerTwo() {
		return playerTwo;
	}

	public void setPlayerTwo(Player playerTwo) {
		this.playerTwo = playerTwo;
	}

	public QiPan getQiPan() {
		return qiPan;
	}

	private void setQiPan(QiPan qiPan) {
		this.qiPan = qiPan;
	}

	private Game(Player playerOne, Player playerTwo, QiPan qiPan) {
		this.setPlayerOne(playerOne);
		this.setPlayerTwo(playerTwo);
		this.setQiPan(qiPan);
	}

	public static Game create() {
		return new Game(new Player(1, QiZi.BLACK), new Player(2, QiZi.WHITE),
				new QiPan());
	}

	public void start() {
		qiPan.print();
		
		Scanner input = new Scanner(System.in);
	
		while(!Rule.win(qiPan)){
			System.out.println("黑棋输入，如1A,悔棋请输入H");
			String order = input.nextLine();
			if(order.equals("H")){
				qiPan.setQiPan(QiPu.huiQiRenRen());
				qiPan.print();
				System.out.println("黑棋重新输入");
				order = input.nextLine();
			}
			while(!QiPan.validInput(order)){
				System.out.println("输入格式不对");
				order = input.nextLine();
			}
			
			while(!QiPan.validQiZi(playerOne.order(order))){
				System.out.println("棋子越界");
				order = input.nextLine();
			}
			while(!qiPan.unOccupied(playerOne.order(order))){
				System.out.println("棋子已放置");
				order = input.nextLine();
			}
			qiPan.setQiZi(playerOne.order(order));
			QiPu.setQiPu(qiPan);
				
			qiPan.print();
			if(Rule.win(qiPan)){
				System.out.println("黑棋获胜");
				break;
			}			
			
			System.out.println("白棋输入，如1A,悔棋请输入H");
			order = input.nextLine();
			if(order.equals("H")){
				qiPan.setQiPan(QiPu.huiQiRenRen());
				qiPan.print();
				System.out.println("白棋重新输入");
				order = input.nextLine();
			}
			while(!QiPan.validInput(order)){
				System.out.println("输入格式不对");
				order = input.nextLine();
			}
			
			while(!QiPan.validQiZi(playerOne.order(order))){
				System.out.println("棋子越界");
				order = input.nextLine();
			}
			
			while(!qiPan.unOccupied(playerOne.order(order))){
				System.out.println("棋子已放置");
				order = input.nextLine();
			}
				qiPan.setQiZi(playerTwo.order(order));
				QiPu.setQiPu(qiPan);
				qiPan.print();
				if(Rule.win(qiPan)){
					System.out.println("白棋获胜");
					break;
				}
		}
		
		System.out.println("您的棋谱已生成，请输入需要的棋盘，输入值不超过" + QiPu.count);
		int order = input.nextInt();
		qiPan.setQiPan(QiPu.getQiPu(order));
		qiPan.print();
		input.close();	
	}
}
