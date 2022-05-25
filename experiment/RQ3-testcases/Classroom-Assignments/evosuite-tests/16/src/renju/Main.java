package renju;

import renju.GraphicsUI;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String q1="��ѡ�����1��ִ�����У�YΪ��ң�NΪAI��:";
		String q2="��ѡ�����2��ִ�׺��У�YΪ��ң�NΪAI��:";
		String q3="��ѡ����Ϸ����YΪ�޽���,NΪ�н��֣�:";
		
		int ans1 = JOptionPane.showConfirmDialog(null, q1);
		boolean player1,player2,rules;
		if (ans1 != JOptionPane.YES_OPTION)
			player1= false;
		else
			player1= true;
		  
		int ans2= JOptionPane.showConfirmDialog(null, q2);
		if (ans2!= JOptionPane.YES_OPTION)
			player2= false;
		else
			player2 = true;
		
		int ans3 = JOptionPane.showConfirmDialog(null, q3);
		if (ans3!= JOptionPane.YES_OPTION)
			rules = false;
		else
			rules = true;
		
		Paint paint = new Paint();
		GraphicsUI game = new GraphicsUI(paint);
		
	    Game game1= Game.create(rules);
	   
		game1.start(player1,player2,game);
		
		String fileName = game1.getPlayer1().getName()+"��"+game1.getPlayer2().getName()+"����Ϸ��¼.txt";
		game1.save( fileName);
		
		//game1.LoadFromFile(fileName);
		

	}

}
