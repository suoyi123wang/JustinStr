package wuziqi;

import java.util.Scanner;

public class Game {
	// private Input input;
	private Player playerOne;
	private Player playerTwo;
	private Rule rule;

	private Board board;

	// getInput , setInput
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

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	public Board getBoard() {
		return board;
	}

	private void setBoard(Board board) {
		this.board = board;
	}

	// private Game(Player input,Board board, Judge judge)
	private Game(Player playerOne, Player playerTwo, Board board, Rule rule) {
		this.setPlayerOne(playerOne);
		this.setPlayerTwo(playerTwo);
		this.setBoard(board);
		this.setRule(rule);
	}

	public static Game create() {
		return new Game(new Player(1, Stone.BLACK), new Player(2, Stone.WHITE),
				new Board(), new Rule());
	}

	public void start() {
		UI ui = new UI();
		ui.print1();
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		
		ui.print2();
		Scanner scanner1 = new Scanner(System.in);
		String b = scanner1.next();
		Scanner scanner2 = new Scanner(System.in);
		
		Record record = new Record();
		if (ui.chooseRule(a)) {
			while (true) {
				
				boolean win = false;
				Stone stone;
				Player one = new HumanPlayer(1,Stone.BLACK);
				stone = turn(scanner2, (HumanPlayer) one);
				record.placeStone(stone);
				if (ui.chooseRule(b)) {
					GomokuRule rule1 = new GomokuRule();
					win = rule1.judge(stone, this.getBoard());
				} else {
					RenjuRule rule1 = new RenjuRule();
					win = rule1.judge();
				}

				this.getBoard().paintBoard();
				if (win) {
					System.out.println("恭喜 玩家一获得胜利！五子连珠！");
					break;
				}
				Player two = new HumanPlayer(2, Stone.WHITE);
				stone = turn(scanner2, (HumanPlayer) two);
				record.placeStone(stone);
				if (ui.chooseRule(b)) {
					GomokuRule rule1 = new GomokuRule();
					win = rule1.judge(stone, this.getBoard());
				} else {
					RenjuRule rule4 = new RenjuRule();
					win = rule4.judge();
				}
				this.getBoard().paintBoard();
				if (win) {
					System.out.println("恭喜 玩家二获得胜利！五子连珠！");
					break;
				}
			}
		} else {
			while (true) {
				boolean win = false;
				Stone stone;
				Player one = new HumanPlayer(1,Stone.BLACK);
				stone = turn(scanner2, (HumanPlayer) one);
				record.placeStone(stone);
				if (ui.chooseRule(b)) {
					GomokuRule rule1 = new GomokuRule();
					win = rule1.judge(stone, this.getBoard());
				} else {
					RenjuRule rule1 = new RenjuRule();
					win = rule1.judge();
				}

				this.getBoard().paintBoard();
				if (win) {
					System.out.println("恭喜 玩家一获得胜利！五子连珠！");
					break;
				}
				Player two = new AIPlayer(2, Stone.WHITE);
				stone = turn((AIPlayer) two);
				record.placeStone(stone);
				if (ui.chooseRule(b)) {
					GomokuRule rule1 = new GomokuRule();
					win = rule1.judge(stone, this.getBoard());
				} else {
					RenjuRule rule1 = new RenjuRule();
					win = rule1.judge();
				}
				this.getBoard().paintBoard();
				if (win) {
					System.out.println("恭喜 玩家二获得胜利！五子连珠！");
					break;
				}
			}
			

		}record.print();
			scanner.close();
			scanner1.close();
			scanner2.close();
	}

	private Stone turn(Scanner scanner, HumanPlayer player) {
		System.out.println("玩家" + player.getId() + "请输入棋子坐标如：A1 B2");

		Stone stone = null;
		boolean valid = false;
		boolean reenter = false;

		while (stone == null || valid == false) {
			if (reenter) {
				if (stone == null) {
					System.out.println("您的输入为空");
				} else if (valid == false) {
					System.out.println("您的输入不合法");
				}
			}
			stone = player.parseStone(scanner.next());
			if (stone != null) {
				valid = this.getBoard().placeStone(stone);
			}
			reenter = true;
		}

		return stone;
	}

	public Stone turn(AIPlayer player) {
		Stone stone = null;
		boolean valid = false;
		boolean reenter = false;

		while (stone == null || valid == false) {
			if (reenter) {
				if (stone == null) {
					System.out.println("您的输入为空");
				} else if (valid == false) {
					System.out.println("您的输入不合法");
				}
			}
			stone = player.parseStone();
			if (stone != null) {
				valid = this.getBoard().placeStone(stone);
			}
			reenter = true;
		}

		return stone;
	}

}
