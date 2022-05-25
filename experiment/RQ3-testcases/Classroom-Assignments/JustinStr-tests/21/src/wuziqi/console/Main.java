package wuziqi.console;



public class Main{
	public static void main(String[] args) throws Exception{
		StartUI ui = new StartUI();
		ui.U_I();
		ui.continuegame();
		ui.filenamecreator();
		if(ui.continuegame == false){
		ui.chooseRule();
		ui.Playercreator();
		}
		Game game = new Game();
		game.startgame(ui.player1,ui.player2, ui.rule,ui.record,ui.continuegame,ui.continueFile);
	}
	
}
