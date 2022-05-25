package homework;

public class Main{
	public static void main(String[] args) {
		ConsoleUI ui = new ConsoleUI();
		ui.U_I();
		ui.chooseRule();
		ui.Playercreator();
		Game game = new Game(ui.player1,ui.player2, ui.rule);
	}
	
}
