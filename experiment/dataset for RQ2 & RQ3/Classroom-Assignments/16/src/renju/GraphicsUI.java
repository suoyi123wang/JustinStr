package renju;

import javax.swing.JFrame;


public class GraphicsUI extends JFrame {
	
	
	
	public GraphicsUI (Paint paint){
	     add(paint);
	}
	
	public void paintBoard(Board board,GraphicsUI renju){
		
		renju.setTitle("Îå×ÓÆå");
		renju.setSize(800,800);
		renju.setLocationRelativeTo(null);
		renju.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		renju.setVisible(true);
		
	}


	
}



