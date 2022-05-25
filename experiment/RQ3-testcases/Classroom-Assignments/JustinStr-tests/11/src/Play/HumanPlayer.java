package Play;

import UI.UI;

public class HumanPlayer extends Player {
	public HumanPlayer(int c, String id) {
		type = HUMAN;
		c = this.color;
		
	}

	public String setId(UI ui) {
		System.out.println("请玩家" + "" + (order + 1) + "(Human,"+ ((order == 0) ? "先手" : "后手") 
				+ ")输入自己的名字，以回车键结束:");
		this.id = promptInput.nextLine();
		order = order + 1;
		return id;
	}

	@SuppressWarnings("static-access")
	public Stone ConsoleInput() {
        Stone e = new Stone(0,0,Stone.EMPTY);
		boolean isNotCorrect = true;
		while (isNotCorrect) {
			System.out.println("请玩家" + this.getId(id) + "(" + this.getColor()
					+ ",Human)输入第" + (this.getStep() + 1)
					+ "个棋子坐标，先输入字母后输入数字以回车键结束:");
	String x = promptInput.nextLine();
	x = x.toUpperCase();
			try {
				
				int m = Integer.parseInt(x.substring(1, x.length()));
				int n = x.charAt(0) - 'A' + 1;
				e = new Stone(m,n,color);
				e.setStone(m, n, color);
				isNotCorrect = false;
			} catch (Exception g) {
				System.out.println("输入格式错误");
			}
		}
		return e;
	}

	public Stone GraphicsInput(){
		return new Stone(0,0,Stone.EMPTY);
	}

	
}
