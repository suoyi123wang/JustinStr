package game;
import UI.ConsoleUI;
import UI.UI;
/*
 * »ÚÆåÏµÍ³±¬Õ¨
 * AIµÄÐÞÊÎ
 */
public class Start {
	public static UI ui = new ConsoleUI();
	public static void main(String[] args) {
		
		Game game = new Game();
		java.util.Scanner input = new java.util.Scanner(System.in);
		ui.Go();
		for (int i = 1; i < 2; i = 1) {
			String Pv = input.nextLine();
			if (Pv.matches("11")){
				i++;
				game.PvP1();
				ui.printMessage("Game begins!");
				game.game();
			}else if(Pv.matches("12")){
				i++;
				game.PvP2();
				ui.printMessage("Game begins!");
				game.game();
			}else if(Pv.matches("21")){
				i++;
				game.PvE1();
				ui.printMessage("Game begins!");
				game.game();
			}else if(Pv.matches("22")){
				i++;
				game.PvE2();
				ui.printMessage("Game begins!");
				game.game();
			}else {
				System.out.println("not valid input, plz try again!");
			}
		}
		System.out.println("thx for playing!");
		input.close();
	}
}
