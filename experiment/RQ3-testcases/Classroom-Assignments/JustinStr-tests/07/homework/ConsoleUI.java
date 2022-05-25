package homework;
import java.util.Scanner;
public class ConsoleUI implements UI{

	public String player1 = null, player2 = null;
	public String rule = null;
	public void boardprinter(String[][] board){
		
	}
	
	public void U_I() {
		System.out.println("UI是啥？能吃吗？");
	}

	public void Playercreator() {
		Scanner scanner = new Scanner(System.in);

		Playercreator: while (true) {
			System.out.println("人人对战还是人机对战？");
			System.out.println("人人对战请输入'PvP',人机对战请输入'PvE',鸡鸡对战请输入'EvE'");
			String input = scanner.nextLine();

			if (input.equals("PvP")) {
				System.out.println("你已选择人人对战");
				player1 = "human";
				player2 = "human";
				break Playercreator;
			} else if (input.equals("PvE")) {
				while (true) {
					System.out.println("输入'First’或‘Second’以选择先后手");
					String input2 = scanner.nextLine();
					if (input2.equals("First")) {
						System.out.println("你已选择人机对战，你为先手");
						player1 = "human";
						player2 = "AI";
						break Playercreator;
					} else if (input2.equals("Second")) {
						System.out.println("你已选择人机对战，你为后手");
						player1 = "AI";
						player2 = "human";
						break Playercreator;

					} else {
						System.out.println("先后手选择有误");
					}
				}
			} else if (input.equals("EvE")) {
				System.out.println("你已选择鸡鸡对战");
				player1 = "AI";
				player2 = "AI";
				break Playercreator;
			}else{
				System.out.println("模式选择有误");
			}
		}
		
	}

	public void chooseRule() {
		System.out.println("请选择本次游戏的规则");
		Rule:
		while(true){
		System.out.println("Gomoku or Renju ?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if (input.equals("Gomoku")){
			System.out.println("你已选择Gomoku模式");
			rule = "G";
			break Rule;
		}else if (input.equals("Renju")){
			System.out.println("你已选择Renju模式  //Renju模式未完成，默认Gomoku模式");
			rule = "R";
			break Rule;
		}else{
			System.out.println("规则选择有误");
		}
		}
	}
}

