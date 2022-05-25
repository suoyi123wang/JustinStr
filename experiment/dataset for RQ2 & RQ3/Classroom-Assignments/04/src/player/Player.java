package player;

public abstract class Player {

	private String playerName;
	private int currentColour;
	
	public Player(){
	}
	public Player(String name,int colour){
		this.setPlayerName(name);
		this.setCurrentColour(colour);
	}
	public abstract void enterChess();
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getCurrentColour() {
		return currentColour;
	}
	public void setCurrentColour(int currentColour) {
		this.currentColour = currentColour;
	}
}
