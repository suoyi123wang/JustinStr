package wuziqi;

import java.io.FileNotFoundException;

public class Main {
	static Element[][] M;// 记录棋局
	static Gui draw;// 绘图类
	static Game game;
	static String state = "胜负未决";
	static int turn = 0;
	static FileManager Mg = new FileManager();
	static String input = "";

	public static void main(String[] args) throws FileNotFoundException {
		draw = new Gui();// 创建窗口
		game = new Game();
		draw.welcome();// 开局设定
	}
 	public void restart(){//重开
 		draw.closeF();
 		turn=0;
 		state="胜负未决";
 		draw=new Gui();
 		game=new Game();
 		draw.welcome();
 	}
}