package wuziqi;

import java.io.FileNotFoundException;

public class Main {
	static Element[][] M;// ��¼���
	static Gui draw;// ��ͼ��
	static Game game;
	static String state = "ʤ��δ��";
	static int turn = 0;
	static FileManager Mg = new FileManager();
	static String input = "";

	public static void main(String[] args) throws FileNotFoundException {
		draw = new Gui();// ��������
		game = new Game();
		draw.welcome();// �����趨
	}
 	public void restart(){//�ؿ�
 		draw.closeF();
 		turn=0;
 		state="ʤ��δ��";
 		draw=new Gui();
 		game=new Game();
 		draw.welcome();
 	}
}