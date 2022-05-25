package five;

import javax.swing.JOptionPane;

public class HumanPlayer extends Player {

	public int row, line;

	public HumanPlayer(int n) {
		this.player = FIR.CHESS[n - 1]
				+ JOptionPane.showInputDialog("Input Player" + n + "'s name:");
	}

	public HumanPlayer(String player) {
		this.player = player;
	}

	public int getRow() {
		return GraphicsUI.row;
	}

	public int getLine() {
		return GraphicsUI.line;
	}

	@Override
	public void getPosition() {
	}

}
