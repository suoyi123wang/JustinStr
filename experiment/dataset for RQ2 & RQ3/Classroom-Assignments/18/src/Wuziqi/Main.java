package Wuziqi;

import java.util.Scanner;

public class Main {
	public static void main (String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("选择模式：人机  或   人人");
		String order = input.nextLine();
		
		while(!order.equals("人机") && !order.equals("人人")){
			System.out.println("输入无效。请重新输入！！");
			order = input.nextLine();
		}
		if (order.equals("人机")){
			System.out.println("对战开始,你将面临的是小学生对手，请做好准备");
			Game2 game = Game2.create();
			game.start();
		}
		if(order.equals("人人")){
			System.out.println("对战开始");
			Game game = Game.create();
			game.start();
		}	
		input.close();
	}

}
