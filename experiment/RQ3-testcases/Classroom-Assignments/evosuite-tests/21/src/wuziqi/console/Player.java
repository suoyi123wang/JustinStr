package wuziqi.console;

public abstract class Player {
	public String color;
	public String selfcolor;
	public String rivalcolor;
	public double rivalweightmultiple;// ��������Ȩ�ر���
	public abstract Chesswithoutcolor Playerinput(String[][] board);
	public abstract boolean quitandsave();//�涨ֻ���˲ſ��Դ浵��
	public abstract boolean regret();
	public abstract void setcolor(String selfcolor);
	public abstract void setmode(String mode);
}
