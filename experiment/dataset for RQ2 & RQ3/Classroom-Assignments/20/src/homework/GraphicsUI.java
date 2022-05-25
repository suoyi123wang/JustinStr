package homework;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GraphicsUI extends JFrame implements UI {
	static final int ROW_SIZE = 15;

	static final int COLUMN_SIZE = 15;

	static final int WIDTH_SIZE = 500;

	static final int HEIGHT_SIZE = 800;

	static final int CHESS_TYPE = 30;
	int count1 = 0;
	int count2 = 0;
	public int[][] chess = new int[ROW_SIZE][COLUMN_SIZE];

	private class ChessPanel extends JPanel implements ActionListener {

		MyAdpater myAdpater = null;

		public ChessPanel() {
			setSize(new Dimension(WIDTH_SIZE, HEIGHT_SIZE));
			setLayout(null);
			myAdpater = new MyAdpater(this, chess);
			addMouseListener(myAdpater);

		}

		protected void paintComponent(Graphics g) {
			for (int i = 0; i < ROW_SIZE; i++) {
				for (int j = 0; j < COLUMN_SIZE; j++) {
					if (i < ROW_SIZE - 1 && j < COLUMN_SIZE - 1) {
						g.setColor(Color.BLACK);
						g.drawRect(i * CHESS_TYPE + 50, j * CHESS_TYPE + 50,
								CHESS_TYPE, CHESS_TYPE);
					}
					if (chess[j][i] == 1) {
						g.setColor(Color.BLACK);
						g.fillOval(i * CHESS_TYPE + 35, j * CHESS_TYPE + 35,
								CHESS_TYPE, CHESS_TYPE);

					} else if (chess[j][i] == 2) {
						g.setColor(Color.WHITE);
						g.fillOval(i * CHESS_TYPE + 35, j * CHESS_TYPE + 35,
								CHESS_TYPE, CHESS_TYPE);

					}
				}
			}
		}

		public void actionPerformed(ActionEvent e) {

		}}

		

		public class MyAdpater extends MouseAdapter {

			JPanel jpl = null;
			int[][] chess;
			int count = 0;

			public MyAdpater(JPanel jpl, int[][] chess) {
				this.jpl = jpl;
				this.chess = chess;
			}

			public void mouseClicked(MouseEvent e) {
				Rule rule = new GomokuRule();
				int x = (int) e.getPoint().getX();
				int y = (int) e.getPoint().getY();
				int x1 = (x - 50) % 30;
				int y1 = (y - 50) % 30;
				int x2 = (x - 50) / 30;
				int y2 = (y - 50) / 30;
				int row = (x1 >= 15) ? x2 + 1 : x2;
				int column = (y1 >= 15) ? y2 + 1 : y2;
				if (count % 2 == 0) {
					chess[column][row] = 1;
					ChessRecord.a1[count1] = column + 1;
					ChessRecord.a2[count1] = row + 1;
					count1++;
					jpl.repaint();
					boolean w = rule.choosePlayer1(count1 - 1);

					if (w) {
						JOptionPane.showMessageDialog(null,
								"player1(Black) is winner");
						System.exit(0);
					}

				} else {
					chess[column][row] = 2;
					ChessRecord.b1[count2] = column + 1;
					ChessRecord.b2[count2] = row + 1;
					count2++;
					jpl.repaint();
					if (rule.choosePlayer2(count2 - 1)) {
						JOptionPane.showMessageDialog(null,
								"player2(White) is winner");
						System.exit(0);
					}
				}
				count++;

			}
		}

		public void processGraphicsUI() {

			setBackground(Color.LIGHT_GRAY);
			setSize(800, 700);
			add(new ChessPanel(), java.awt.BorderLayout.CENTER);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	public Player player1mode() {
		String input = JOptionPane
				.showInputDialog("enter the player1's mode(enter 1 or 2)");
		int player1 = Integer.parseInt(input);
		return (player1 == 1) ? new HumanPlayer() : new AIPlayer();
	}

	public Player player2mode() {
		String input = JOptionPane
				.showInputDialog("enter the player2's mode(enter 1 or 2)");
		int player2 = Integer.parseInt(input);
		return (player2 == 1) ? new HumanPlayer() : new AIPlayer();
	}

	public Rule chooseRule() {
		String input = JOptionPane
				.showInputDialog("enter the rule's mode(enter 1 or 2)");
		int rule = Integer.parseInt(input);
		return (rule == 1) ? new GomokuRule() : new RenjuRule();
	}

}
