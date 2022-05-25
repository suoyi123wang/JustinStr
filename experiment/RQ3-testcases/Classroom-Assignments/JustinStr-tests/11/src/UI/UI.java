package UI;

import Play.Player;
import Play.Stone;

public interface UI {
	public static final int HumanAI = 1;
	public static final int AIHuman = 2;
	public static final int HumanHuman = 3;
	

	public abstract int setHumanOrAI();

	public abstract int setRule();
	
	public abstract void printOut();
	
	public abstract void ShowMessage(String message);
	
	public abstract Stone Input(Player player);
	
	public abstract void SystemError();

	public abstract int type();
	
	public abstract void ShowError();
	
	public abstract String strInput();

}
