package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import Play.AIPlayer;
import Play.Board;
import Play.GomokuRule;
import Play.HumanPlayer;
import Play.Player;
import Play.Record;
import Play.RenjuRule;
import Play.Rule;
import Play.Stone;
import UI.ConsoleUI;
import UI.GraphicsUI;
import UI.UI;

public class Game {
	public static final int HumanAI = 1;
	public static final int AIHuman = 2;
	public static final int HumanHuman = 3;
	
	public static final int ConsoleUI = 1;
	public static final int GraphicsUI = 2;
	public int HumanOrAI;
	public int GomokuOrRenju;
	private Player[] player = new Player[2];
	public Rule rule;
	public boolean notWin;
	public boolean Next;
	Scanner input = new Scanner(System.in);
	private Stone[] chessboard;
	public int count;
	public UI ui;
	public Record record = new Record();
	private static Game game;
	private String id0;
	private String id1;
	
	
	
	public Player[] setPlayer(){
		player = new Player[2];
		
		switch (this.HumanOrAI) {
		case HumanAI:
			player[0] = new HumanPlayer(Player.HUMAN, id0);
			player[1] = new AIPlayer(Player.AI, id1);
			id0 = player[0].setId(ui);
			id1 = player[1].setId(ui);
			ui.ShowMessage("请玩家" + player[0].getId(this.id0)
					+ "(Human)输入自己想要的颜色(B或W),玩家" + player[1].getId(this.id1)
					+ "(AI)将被分配剩下的那种颜色:");
			break;
		case AIHuman:
			player[0] = new AIPlayer(Player.AI, id0);
			player[1] = new HumanPlayer(Player.HUMAN, id1);
			id0 = player[0].setId(ui);
			id1 = player[1].setId(ui);
		ui.ShowMessage("请玩家" + player[1].getId(this.id1) + "(Human)给玩家"
					+ player[0].getId(this.id0) + "(AI)设置颜色(B或W),玩家"
					+ player[1].getId(this.id1) + "(Human)将被分配剩下的那种颜色:");
			break;
		case HumanHuman:
			player[0] = new HumanPlayer(Player.HUMAN, id0);
			player[1] = new HumanPlayer(Player.HUMAN, id1);
			id0 = player[0].setId(ui);
			id1 = player[1].setId(ui);
			ui.ShowMessage("请玩家" + player[0].getId(this.id0)
					+ "(Human)输入自己想要的颜色(B或W),玩家" + player[1].getId(this.id1)
					+ "(Human)将被分配剩下的那种颜色:");
			break;
		}

		boolean notCompleted = true;
		while (notCompleted) {
			String color = ui.strInput();
			color = color.toUpperCase();
			if (color.equals("B")) {
				player[0].setcolor(Stone.BLACK);
				player[1].setcolor(Stone.WHITE);
				
				notCompleted = false;
			} else {
				if (color.equals("W")) {
					player[0].setcolor(Stone.WHITE);
					player[1].setcolor(Stone.BLACK);
					notCompleted = false;
				} else {
					ui.ShowError();
				}
			}
		}
		return player;
	}
	
	
	public Game(int uitype) {
		
		ui = (uitype == ConsoleUI) ? (new ConsoleUI()):(new GraphicsUI());
		
		
	}
	
	
	
	public void gameStart() throws FileNotFoundException {
		getGame();
		this.HumanOrAI = ui.setHumanOrAI();
		this.GomokuOrRenju = ui.setRule();
		rule = (this.GomokuOrRenju == Rule.Gomoku) ? (new GomokuRule())
				: (new RenjuRule());
		notWin = true;
		Next = true;
		chessboard = new Stone[1];
		count = 0;
		setPlayer();
		Player.turnInicialize();

		ui.ShowMessage("设置成功!");
		ui.ShowMessage("玩家" + player[0].getId(id0) + "(" + player[0].getType()
				+ ")" + "选择的颜色为" + player[0].getColor());
		ui.ShowMessage("玩家" + player[1].getId(id1) + "(" + player[1].getType()
				+ ")" + "选择的颜色为" + player[1].getColor());
		System.out.println();
		Board.boardInitialize();
		ui.printOut();

		while (this.notWin) {
			while (true) {
				Stone m = new Stone(0,0,Stone.EMPTY);
				m = ui.Input(player[count % 2]);
				if (rule.isInBoard(m) && rule.notOccupied(m)
						&& rule.isLeagal(m, this.chessboard)) {
					player[count % 2].chessorder[player[count % 2].getStep()] = m;
					chessboard[count] = m;
					player[count % 2].chessorder = Arrays.copyOf(
							player[count % 2].chessorder,
							player[count % 2].getStep() + 2);
					chessboard = Arrays.copyOf(chessboard, count + 2);
					
					break;
				} else {
					ui.ShowMessage("输入坐标不在棋盘范围内，或与已有棋子重复");
					ui.ShowError();
				}
				
			}
			int t = count%2;
			Stone c = player[t].chessorder[player[t].getStep()];
			switch(t){			
			case 0:
			ui.ShowMessage("纵坐标值为"
					+ c.getX()
					+ ",横坐标值为"
					+ c.getY() + ",颜色为"
					+ player[t].getColor());
			break;
			case 1:
				ui.ShowMessage("纵坐标值为"
						+ c.getX()
						+ ",横坐标值为"
						+ c.getY() + ",颜色为"
						+ player[t].getColor());
				break;
			}
			System.out.println();
			Board.putOnBoard(player[t].chessorder[player[t].getStep()]);
			player[t].addStep();
			ui.printOut();
			System.out.println();
			ui.ShowMessage("玩家" + player[0].getId(id0) + "("
					+ player[0].getColor() + "," + player[0].getType() + ")已游戏"
					+ player[0].getStep() + "步," + "玩家" + player[1].getId(id1)
					+ "(" + player[1].getColor() + "," + player[1].getType()
					+ ")已游戏" + player[1].getStep() + "步");
			ui.ShowMessage("总游戏步数为" + (count + 1) + "步。" );

if (this.getIsRegret(player[count % 2])) {
			 this.regret();
			 player[count % 2].minusStep();
			 continue;
			 }
			 if(this.getWillSave(rule,player,chessboard)){
				 
					this.record.saveLoad(this.id0,this.id1,getPlayer(),chessboard);
					ui.ShowMessage("游戏已退出。");
					this.notWin = false;
			}
			if (rule.judge(count,chessboard ,player[count % 2])) {
                    int n = count%2;
                    switch(n){
                    case 0:
                    
					ui.ShowMessage("游戏结束,玩家" + player[n].getId(id0) + "(" + player[n].getColor()
							+ "," + player[count%2].getType() + ")获胜！");
                    case 1:
                    	ui.ShowMessage("游戏结束,玩家" + player[n].getId(id1) + "(" + player[n].getColor()
    							+ "," + player[count%2].getType() + ")获胜！");
                    }
				this.notWin = false;
			} else {
				if (Board.isFull()) {
					ui.ShowMessage("双方和棋，游戏结束");
					System.out.println();
					this.notWin = false;
				}
			}
			count = count + 1;
				}
	}
		
	

	public boolean getWillSave(Rule rule,Player[] player,Stone[] chess){
		boolean isSave = false;
		boolean isNotcorrect = true;
		ui.ShowMessage("是否退出游戏并存档？ Y or N");
		while(isNotcorrect){
			String s = ui.strInput();
			if(s.equals("Y")){
				
				isNotcorrect = false;
				isSave = true;
			}else if(s.equals("N")){
				isNotcorrect = false;
				isSave = false;
			}else{
				ui.ShowError();
			}
		}
		return isSave;
	}

	 public boolean getIsRegret(Player c) {
	 boolean isNotcorrect = true;
	 boolean isRegret = false;
	 if(count%2 == 0){
	ui.ShowMessage("请问玩家" + c.getId(id0) + "(" + c.getColor()+ ")是否悔棋？(Y或N)");
	 }else if(count%2 ==1){
    	 ui.ShowMessage("请问玩家" + c.getId(id1) + "(" + c.getColor()+ ")是否悔棋？(Y或N)");
     }
	 while (isNotcorrect) {
	 String p = input.nextLine();
	 p = p.toUpperCase();
	 if (p.equals("Y")) {
	 isNotcorrect = false;
	 isRegret = true;
	 } else if (p.equals("N")) {
	 isNotcorrect = false;
	 isRegret = false;
	 } else {
	 ui.ShowError();
	 }
	 }
	 
	 return isRegret;
	 }

	 public void regret() {
	 Board.regret(chessboard[count]);
	 ui.printOut();
	 System.out.println();
	 }


	
	
	public void resumeGame(String name) throws FileNotFoundException{
		java.io.File load = new java.io.File(name+".txt");
		Scanner input = new Scanner(load);
//这里还没写！！！读取档案！！！
		//还是不对！！！发生了什么！！！
				String setting = input.nextLine();
				String player0 = input.nextLine();
				String player1 = input.nextLine();
				
				rule = new GomokuRule();
//System.out.println(setting + " " + "Player 1 is " +player0 + "Player 2 is "+ player1);
				 
				int playerType = 0;
				if(Integer.parseInt(String.valueOf(player0.charAt(0))) == Player.HUMAN && Integer.parseInt(String.valueOf((player1.charAt(0)))) == Player.AI){
					playerType = HumanAI;
				}else if(Integer.parseInt(String.valueOf((player0.charAt(0)))) == Player.AI && Integer.parseInt(String.valueOf((player1.charAt(0)))) == Player.HUMAN){
					playerType = AIHuman;
				}else{
					playerType = HumanHuman;
				}
				System.out.println(playerType);
	
				switch(playerType){
			case HumanAI:
				player[0] = new HumanPlayer(Stone.BLACK, player0.substring(4));
				player[1] = new AIPlayer(Stone.WHITE, player1.substring(4));
				break;
			case AIHuman:
				player[0] = new AIPlayer(Player.AI, player0.substring(4));
				player[1] = new HumanPlayer(Player.HUMAN, player1.substring(4));
				break;
			case HumanHuman:
				player[0] = new HumanPlayer(Player.HUMAN, player0.substring(4));
				player[1] = new HumanPlayer(Player.HUMAN, player1.substring(4));
				}
	            
				notWin = true;
				Next = true;
				chessboard = new Stone[1];
				count = 0;
				Player.turnInicialize();
                ui.ShowMessage("设置成功!");
				ui.ShowMessage("玩家" + player0.substring(4) + "(" + player[0].getType()
						+ ")" + "选择的颜色为" + player0.substring(1, 3));
				ui.ShowMessage("玩家" + player1.substring(4) + "(" + player[1].getType()
						+ ")" + "选择的颜色为" + player1.substring(1, 3));
				System.out.println();
	
				Board.boardInitialize();
//				ui.printOut();
				while (input.hasNext()) {
					
				String n = input.nextLine();
				System.out.println(n);
//				Stone m = new Stone(Integer.parseInt(String.valueOf(n.charAt(4))),Integer.parseInt(String.valueOf(n.charAt(2)-'A'+1)), Integer.parseInt(String.valueOf(n.charAt(0))));
//				chessboard[count] = m;
//			    Board.putOnBoard(m);
//			    player[count%2].addStep();
//			    count = count + 1;
				}
				input.close();
//				ui.printOut();
	}
//				while(this.notWin){
//				ui.ShowMessage("玩家" + player[0].getId(id0) + "("
//						+ player[0].getColor() + "," + player[0].getType() + ")已游戏"
//						+ player[0].getStep() + "步," + "玩家" + player[1].getId(id1)
//						+ "(" + player[1].getColor() + "," + player[1].getType()
//						+ ")已游戏" + player[1].getStep() + "步");
//				ui.ShowMessage("总游戏步数为" + (count + 1) + "步。" );
//				Stone m = new Stone(0,0,Stone.EMPTY);
//				m = ui.Input(player[count % 2]);
//				if (rule.isInBoard(m) && rule.notOccupied(m)
//						&& rule.isLeagal(m, this.chessboard)) {
//					player[count % 2].chessorder[player[count % 2].getStep()] = m;
//					chessboard[count] = m;
//					player[count % 2].chessorder = Arrays.copyOf(
//							player[count % 2].chessorder,
//							player[count % 2].getStep() + 2);
//					chessboard = Arrays.copyOf(chessboard, count + 2);
//					
//					break;
//				} else {
//					ui.ShowMessage("输入坐标不在棋盘范围内，或与已有棋子重复");
//					ui.ShowError();
//				}
//				
//			
//			Stone c = player[count % 2].chessorder[player[count % 2].getStep()];
//			
//			ui.ShowMessage("纵坐标值为"
//					+ c.getX()
//					+ ",横坐标值为"
//					+ c.getY() + ",颜色为"
//					+ player[count % 2].getColor());
//			System.out.println();
//			Board.putOnBoard(player[count % 2].chessorder[player[count % 2].getStep()]);
//			player[count % 2].addStep();
//			ui.printOut();
//			System.out.println();
//			ui.ShowMessage("玩家" + player[0].getId(id0) + "("
//					+ player[0].getColor() + "," + player[0].getType() + ")已游戏"
//					+ player[0].getStep() + "步," + "玩家" + player[1].getId(id1)
//					+ "(" + player[1].getColor() + "," + player[1].getType()
//					+ ")已游戏" + player[1].getStep() + "步");
//			ui.ShowMessage("总游戏步数为" + (count + 1) + "步。" );
//
//			 if (this.getIsRegret(player[count % 2])) {
//			 this.regret();
//			 player[count % 2].minusStep();
//			 continue;
//			 }
//			 if(this.getWillSave(rule,player,chessboard)){
//				 
//					this.record.saveLoad(this.id0,this.id1,getPlayer(),chessboard);
//					ui.ShowMessage("游戏已退出。");
//					this.notWin = false;
//			}
//			if (rule.judge(count,chessboard ,player[count % 2])) {
//                    int n = count%2;
//                    switch(n){
//                    case 0:
//                    
//					ui.ShowMessage("游戏结束,玩家" + player[n].getId(id0) + "(" + player[n].getColor()
//							+ "," + player[count%2].getType() + ")获胜！");
//                    case 1:
//                    	ui.ShowMessage("游戏结束,玩家" + player[n].getId(id1) + "(" + player[n].getColor()
//    							+ "," + player[count%2].getType() + ")获胜！");
//                    }
//				this.notWin = false;
//			} else {
//				if (Board.isFull()) {
//					ui.ShowMessage("双方和棋，游戏结束");
//					System.out.println();
//					this.notWin = false;
//				}
//			}
//			count = count + 1;
//				}
//				}
//				
					
	

	public void setIsNext() {
		boolean isNotcorrect = true;
		ui.ShowMessage("是否再来一局？(Y或N)");
		while (isNotcorrect) {
			String p = ui.strInput();
			p = p.toUpperCase();
			if (p.equals("Y")) {
				isNotcorrect = false;
				this.Next = true;
			} else {
				if (p.equals("N")) {
					isNotcorrect = false;
					this.Next = false;
				} else {
					ui.ShowError();;
				}
			}
		}
	}

	
	public Player[] getPlayer(){
		return this.player;
	}
	
	
	public Stone[] getChess(){
		return this.chessboard;
	}
	public static Game getGame(){
		return game;
	}
	
	public boolean getNext() {
		return Next;
	}

	public boolean haveWinner() {
		return notWin;
	}

	public int getRule(){
		
		return this.GomokuOrRenju;
	}
}
