package wuziqi.console;

public abstract class Player {
	public String color;
	public String selfcolor;
	public String rivalcolor;
	public double rivalweightmultiple;// 对手棋子权重倍率
	public abstract Chesswithoutcolor Playerinput(String[][] board);
	public abstract boolean quitandsave();//规定只有人才可以存档。
	public abstract boolean regret();
	public abstract void setcolor(String selfcolor);
	public abstract void setmode(String mode);
}
