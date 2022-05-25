package renju;

import renju.GraphicsUI;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String q1="请选择玩家1，执黑先行（Y为玩家，N为AI）:";
		String q2="请选择玩家2，执白后行（Y为玩家，N为AI）:";
		String q3="请选择游戏规则（Y为无禁手,N为有禁手）:";
		
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
		
		String fileName = game1.getPlayer1().getName()+"和"+game1.getPlayer2().getName()+"的游戏记录.txt";
		game1.save( fileName);
		
		//game1.LoadFromFile(fileName);
		

	}

}
