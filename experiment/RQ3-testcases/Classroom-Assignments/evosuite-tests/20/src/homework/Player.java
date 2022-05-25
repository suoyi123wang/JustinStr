package homework;



public abstract class Player {
   
	public abstract String parsePlayer1(int count,String scanner);
	public abstract String parsePlayer2(int count, String scanner);
	public abstract boolean isNoRepeat(int count, String scanner);
	public abstract String input();
}
