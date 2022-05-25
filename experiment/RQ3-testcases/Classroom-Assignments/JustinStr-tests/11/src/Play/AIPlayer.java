package Play;

import UI.UI;

public class AIPlayer extends Player {
	public AIPlayer(int t, String id) {
		type = AI;
		t = this.type;
	}

	public String setId(UI ui) {
		id = "Computer" + "" + (order + 1);
		order = order + 1;
		return this.id;
	}

	

	public Stone ConsoleInput() {
		//这里不对！！！跟ui还是不兼容！！
		System.out.println("正在等待玩家" + this.getId(id) + "(" + this.getColor()
				+ ",AI)输入第" + (this.getStep() + 1) + "个棋子坐标");
		int m = ((int) (Math.random() * (Board.Width))) + 1;
		int n = ((int) (Math.random() * (Board.Length))) + 1;
		Stone e = new Stone(m,n,this.color);
		return e;
	}

	public Stone GraphicsInput() {
		return new Stone(0,0,Stone.EMPTY);
	}

	

	
}
