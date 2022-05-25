package Play;

import UI.UI;

public class HumanPlayer extends Player {
	public HumanPlayer(int c, String id) {
		type = HUMAN;
		c = this.color;
		
	}

	public String setId(UI ui) {
		System.out.println("�����" + "" + (order + 1) + "(Human,"+ ((order == 0) ? "����" : "����") 
				+ ")�����Լ������֣��Իس�������:");
		this.id = promptInput.nextLine();
		order = order + 1;
		return id;
	}

	@SuppressWarnings("static-access")
	public Stone ConsoleInput() {
        Stone e = new Stone(0,0,Stone.EMPTY);
		boolean isNotCorrect = true;
		while (isNotCorrect) {
			System.out.println("�����" + this.getId(id) + "(" + this.getColor()
					+ ",Human)�����" + (this.getStep() + 1)
					+ "���������꣬��������ĸ�����������Իس�������:");
	String x = promptInput.nextLine();
	x = x.toUpperCase();
			try {
				
				int m = Integer.parseInt(x.substring(1, x.length()));
				int n = x.charAt(0) - 'A' + 1;
				e = new Stone(m,n,color);
				e.setStone(m, n, color);
				isNotCorrect = false;
			} catch (Exception g) {
				System.out.println("�����ʽ����");
			}
		}
		return e;
	}

	public Stone GraphicsInput(){
		return new Stone(0,0,Stone.EMPTY);
	}

	
}
