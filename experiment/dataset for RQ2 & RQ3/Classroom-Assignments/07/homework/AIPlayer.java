package homework;

import java.util.Random;

public class AIPlayer extends Player {

	public AIPlayer(){
		
	}
	public Chesswithoutcolor Playerinput(String[][] board) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.printf("%n");
		Random random = new Random();
		int x, y;
		while (true) {
			int px = random.nextInt(14);
			int py = random.nextInt(14);
			Rule rule = new GomokuRule();
			boolean cando = rule.islegaltoadd(px, py, board);
			
			if (cando == true) {
				x = px;
				y = py;
				break;
			} else {
				
				continue;
			}
		}

		Chesswithoutcolor aichess = new Chesswithoutcolor(x, y);
		return aichess;
	}

}
