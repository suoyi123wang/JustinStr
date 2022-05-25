package five;

public interface UI {

	int choosePlayer();

	int chooseChess();

	int chooseRule();

	String print(String player);

	void printFinal(String player);

	boolean transform(String input);
	
	int load(int model);
	
	int start();

}
