package Wuziqi;

import java.util.Scanner;

public class Main {
	public static void main (String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("ѡ��ģʽ���˻�  ��   ����");
		String order = input.nextLine();
		
		while(!order.equals("�˻�") && !order.equals("����")){
			System.out.println("������Ч�����������룡��");
			order = input.nextLine();
		}
		if (order.equals("�˻�")){
			System.out.println("��ս��ʼ,�㽫���ٵ���Сѧ�����֣�������׼��");
			Game2 game = Game2.create();
			game.start();
		}
		if(order.equals("����")){
			System.out.println("��ս��ʼ");
			Game game = Game.create();
			game.start();
		}	
		input.close();
	}

}
