package renju;


import java.util.Scanner;
import javax.swing.JOptionPane;

import renju.Database;
import renju.Board;
import renju.Game;
import renju.Rule;
import renju.Player;
import renju.Stone;
import renju.GraphicsUI;
import renju.Database;

public class Game {
	private static Player player1;
	private static Player player2;
	private Rule judge;
	private Board board;
	private Stone currentStone;
	private  Paint paint = new Paint();
	
	private void setCurrentStone(Stone currentStone) {
		this.currentStone = currentStone;
	}

	private GraphicsUI ui;

	Database record = new Database();
	String result;
	
	public Player getPlayer1() {
		return player1;
	}

	private void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	private void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Rule getJudge() {
		return judge;
	}

	private void setJudge(Rule judge) {
		this.judge = judge;
	}

	public Board getBoard() {
		return board;
	}

	private void setBoard(Board board) {
		this.board = board;
	}
	
	static Rule rule1= new GomokuRule();
	static Rule rule2= new RenjuRule();

	private Game(Player player1,Player player2, Board board, Rule judge) {
		this.setPlayer1(player1);
		this.setPlayer2(player2);
		this.setBoard(board);
		this.setJudge(judge);
	}
		
	public static  Game create(boolean rules) {
		if (rules == true)
			return new Game(player1,player2 , new Board(), rule1);
		else
			return new Game(player1,player2, new Board(), rule1);
	}
	
	public static Game LoadFromFile( String path){
		String fileName = "";
		if (path.contains(":")) {
			fileName = path.substring(2);
		}
		DatebaseAdapter recordAdapter =new Simple();
		Database record  = recordAdapter.load(fileName);
		Game game = new Game( record.getPlayer1(), record.getPlayer2(),
				new Board(), record.getRules());
		game.record = record;
		return game;
	}
	
	public void save(String fileName) {
		DatebaseAdapter recordAdapter = new Simple();
		recordAdapter.save(this.record, fileName);
	}

	
	public void start(boolean player1,boolean player2,GraphicsUI ui) {
		
			Scanner scanner = new Scanner(System.in);
			String name1 = JOptionPane.showInputDialog("请输入玩家1的名字：");
			String name2 = JOptionPane.showInputDialog("请输入玩家2的名字：");
			
		    
			
			
			while (true) {
			Stone stone1=Stone.create(8,8,1);
			
			
			Player one ;
			if (player1 == true) {
				
				if(name1 != null)
				    one =new HumanPlayer(1,1,name1);
				else
				    one = new HumanPlayer(1,1);
				
				record.setPlayer1(one);
				stone1 = turn( (HumanPlayer) one);
				setCurrentStone(stone1);
				
				board.placeStone(stone1);
				
				paint.setX(stone1.getX());
				paint.setY(stone1.getY());
				paint.setBoard(this.getBoard());
				record.placeStone(stone1);
			} else {
				
				if(name1 != null)
				    one =new AI_Player(1,1,name1);
				else
				    one = new AI_Player(1,1);
				
				record.setPlayer1(one);
				stone1 = turn((AI_Player) one);
				setCurrentStone(stone1);
				
				board.placeStone(stone1);
				
				paint.setX(stone1.getX());
				paint.setY(stone1.getY());
				paint.setBoard(this.getBoard());
				record.placeStone(stone1);
			}
			boolean win = new GomokuRule().judge(stone1, this.getBoard());
			ui=new GraphicsUI(paint);
			ui.paintBoard(this.getBoard(),ui);
			
			if (win == true) {
				record.setResult(name1+"WIN");
				JOptionPane.showMessageDialog(null, name1+"获胜");
				break;
			}
			
			
		    
			Player two;Stone stone2;
			if (player2 == true) {
				
				if(name2!= null)
				    two = new HumanPlayer(2, 2,name2);
				else
					two = new HumanPlayer(2, 2);
				
				record.setPlayer2(two);
				stone2 = turn((HumanPlayer) two);
				setCurrentStone(stone2);
				board.placeStone(stone2);
				paint.setX(stone2.getX());
				paint.setY(stone2.getY());
				paint.setBoard(this.getBoard());
				record.placeStone(stone2);
			} else {
				
				if(name2!= null)
				    two = new AI_Player(2, 2,name2);
				else
					two = new AI_Player(2, 2);
				
				record.setPlayer2(two);
				stone2 = turn((AI_Player) two);
				setCurrentStone(stone2);
				
				board.placeStone(stone2);
				
				paint.setX(stone2.getX());
				paint.setY(stone2.getY());
				paint.setBoard(this.getBoard());
				record.placeStone(stone2);
			}
			 win = new GomokuRule().judge(stone2, this.getBoard());
			ui=new GraphicsUI(paint);
			ui.paintBoard(this.getBoard(),ui);
			
			if (win == true) {
				record.setResult("WIN");
				JOptionPane.showMessageDialog(null, name2+"获胜！");
				break;
			}
				
			}
		    scanner.close();
		    
            
	}

			
	

	private Stone turn(HumanPlayer player) {
	    System.out.println("玩家"+player.getName()+"落子");
		Stone stone = null;
		boolean valid = false;
		boolean reenter = false;

		
		while(stone == null | valid == false){
			
			stone =  player.nextStone(player.location_x(),player.location_y());
			if (stone != null){
				valid = this.getBoard().ifStone(stone);
				}

			if (reenter) {
				if (stone == null) {
					System.out.println("棋子类型错误！");
				} else if (valid == false) {
					System.out.println("棋子坐标错误!");
				}
			}
			
						reenter= true;
		}
		
		
		
			return stone;
		
		
		
		}
	private Stone turn(AI_Player one){
		System.out.println("玩家"+one.getName()+"落子");
		Stone stone = null ;
		boolean valid = false;
		boolean reenter = false;
		
		while(stone == null | valid == false){
			
			stone =one.nextStone(one.AI_X(),one.AI_Y());
			if (stone != null){
				valid = this.getBoard().ifStone(stone);
			}

			if (reenter) {
				if (stone == null) {
					System.out.println("棋子类型错误！");
				} else if (valid == false) {
					System.out.println("棋子坐标错误!");
				}
			}
			
						reenter= true;
		}
		
		return stone;
	}
}
	


