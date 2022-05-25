package five;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GraphicsUI implements UI {

	private JTextField field = new JTextField();
	private int pause = 0;
	public String inputString = new String();
	public static int save;
	public static int row = 0, line = 0;

	@SuppressWarnings("serial")
	class PrintBoard extends JPanel {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			setBackground(Color.getHSBColor(120, 120, 120));
			for (int i = 1; i <= 15; i++) {
				g.setColor(Color.BLACK);
				g.drawString(String.valueOf(i), 0, 5 + 26 * i);
				g.drawString(String.valueOf((char) (i - 1 + (int) 'A')), -3
						+ 26 * i, 10);
				g.drawLine(26 * i, 26, 26 * i, 390);
				g.drawLine(26, 26 * i, 390, 26 * i);
			}
			g.drawLine(21, 21, 21, 395);
			g.drawLine(21, 21, 395, 21);
			g.drawLine(21, 395, 395, 395);
			g.drawLine(395, 21, 395, 395);
			g.setColor(Color.BLACK);
			g.fillOval(73, 73, 10, 10);
			g.fillOval(73, 333, 10, 10);
			g.fillOval(333, 73, 10, 10);
			g.fillOval(333, 333, 10, 10);
			g.fillOval(203, 203, 10, 10);

			for (int i = 1; i <= 15; i++)
				for (int j = 1; j <= 15; j++) {
					if (Board.board[1][i][j]) {
						g.setColor(Color.BLACK);
						g.fillOval(-10 + 26 * j, -10 + 26 * i, 20, 20);
						g.drawOval(-10 + 26 * j, -10 + 26 * i, 20, 20);
						if ((Board.rowOld1 == i) && (Board.lineOld1 == j)) {
							g.setColor(Color.BLUE);
							g.drawRect(-12 + 26 * j, -12 + 26 * i, 24, 24);
						}
					}
					if (Board.board[2][i][j]) {
						g.setColor(Color.WHITE);
						g.fillOval(-10 + 26 * j, -10 + 26 * i, 20, 20);
						if ((Board.rowOld2 == i) && (Board.lineOld2 == j)) {
							g.fillRect(-10 + 26 * j, -10 + 26 * i, 20, 20);
						}
						g.setColor(Color.BLACK);
						g.drawOval(-10 + 26 * j, -10 + 26 * i, 20, 20);
						if ((Board.rowOld2 == i) && (Board.lineOld2 == j)) {
							g.setColor(Color.BLUE);
							g.drawRect(-12 + 26 * j, -12 + 26 * i, 24, 24);
						}
					}
				}
		}
	}

	@Override
	public String print(String player) {
		pause = 0;
		JFrame frame = new JFrame();
		inputString = new String();
		JPanel panel = new JPanel(new GridLayout(1, 3, 5, 5));
		JButton cc = new JButton("UNDO");
		cc.setPreferredSize(new Dimension(100, 50));
		JButton resume = new JButton("RESUME");
		JButton save = new JButton("SAVE");
		JButton quit = new JButton("BACK");
		PrintBoard printBoard = new PrintBoard();
		field.setPreferredSize(new Dimension(100, 50));
		panel.add(cc);
		panel.add(resume);
		panel.add(save);
		panel.add(quit);
		frame.add(printBoard, BorderLayout.CENTER);
		frame.add(
				new JTextArea(
						player
								+ "'s\nturn\nInput position\nsuch as\nA1 a1 A01\non the top,\nthen press\nthe button\nor press\nEnter.\n\n¡ñ:P1\n\n¡ð:P2\n\n¡ö:P1 NEW\n\n¡õ:P2 NEW       "),
				BorderLayout.EAST);

		frame.setTitle("Input ONE position.");
		frame.add(panel, BorderLayout.SOUTH);
		frame.add(field, BorderLayout.NORTH);
		frame.setSize(510, 560);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		if (player.equals("Replay")) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			frame.dispose();
			return null;
		}
		printBoard.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				int y = (e.getX() - 17) / 26 + 1;
				int x = (e.getY() - 17) / 26 + 1;
				inputString = "" + (char) (y - 1 + 'A') + x;
				pause = 1;
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseReleased(MouseEvent e) {
			}
		});
		do {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			resume.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					inputString = field.getText();
					pause = 1;
				}
			});
			field.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e0) {
					if (e0.getSource() == field) {
						inputString = field.getText();
						pause = 1;
					}
				}
			});

			quit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					inputString = "back";
					pause = 1;
				}
			});
			cc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					inputString = "undo";
					pause = 1;
				}
			});
			save.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					inputString = "save";
					pause = 1;
				}
			});
		} while (pause == 0);

		field.setText(null);
		frame.dispose();
		return inputString;
	}

	@Override
	public void printFinal(String player) {
		pause = 0;
		JFrame frame = new JFrame();
		if (Rule.winner == 1) {
			JOptionPane.showMessageDialog(null, player + " WON!!!");
			field.setText(player + " WON!!!");
		} else if (Rule.winner == 2) {
			JOptionPane.showMessageDialog(null, player + " WON!!!");
			field.setText(player + " WON!!!");
		} else if (Rule.winner == 0) {
			JOptionPane.showMessageDialog(null, "NO ONE WON!!!");
			field.setText("NO ONE WON!!!");
		}
		JButton quit = new JButton("QUIT");
		quit.setPreferredSize(new Dimension(400, 50));
		field.setPreferredSize(new Dimension(400, 50));
		frame.add(new PrintBoard(), BorderLayout.CENTER);
		frame.add(new JTextArea(
				"\n\n\n¡ñ:P1\n\n\n¡ð:P2\n\n\n¡ö:P1 NEW\n\n\n¡õ:P2 NEW       "),
				BorderLayout.EAST);
		frame.add(quit, BorderLayout.SOUTH);
		frame.add(field, BorderLayout.NORTH);
		frame.setSize(510, 560);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		do {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			field.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == field) {
						pause = 1;
					}
				}
			});
			quit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 1;
				}
			});
		} while (pause == 0);
		frame.dispose();
	}

	@Override
	public int chooseChess() {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(2, 2, 10, 10));
		JButton button1 = new JButton("¡ñPlayer1");
		JButton button2 = new JButton("¡ðPlayer2");
		frame.add(new JLabel("   Choose the color:"));
		frame.add(new JLabel(""));
		frame.add(button1);
		frame.add(button2);
		frame.setTitle("Chess Choice");
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		pause = 0;
		do {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 1;

				}
			});
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 2;

				}
			});
		} while (pause == 0);
		frame.dispose();
		if (pause == 1)
			return 1;
		else if (pause == 2)
			return 2;
		return 0;
	}

	public int choosePlayer() {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(2, 3, 10, 10));
		JButton button1 = new JButton("1 Player");
		JButton button2 = new JButton("2 Players");
		JButton button3 = new JButton("BACK");
		frame.add(new JLabel(""));
		frame.add(new JLabel(" How many players?"));
		frame.add(new JLabel(""));
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(400, 150);
		frame.setTitle("Player Choose");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		pause = 0;
		do {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 1;

				}
			});
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 2;

				}
			});
			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 3;

				}
			});
		} while (pause == 0);
		frame.dispose();
		return pause;
	}

	@Override
	public int chooseRule() {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(2, 3, 10, 10));
		JButton button1 = new JButton("Gomoku Rule");
		JButton button2 = new JButton("Renju Rule");
		JButton button3 = new JButton("BACK");
		frame.add(new JLabel(""));
		frame.add(new JLabel("   Which rule?"));
		frame.add(new JLabel(""));
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(400, 150);
		frame.setTitle("Rule Choose");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		pause = 0;
		do {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 1;

				}
			});
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 2;

				}
			});
			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 3;

				}
			});
		} while (pause == 0);
		frame.dispose();
		return pause;
	}

	@Override
	public boolean transform(String input) {
		int l = input.length();
		StringBuilder pointBuilder = new StringBuilder(input);
		for (int i = 1; i <= l; i++)
			if (input.charAt(l - i) == (' '))
				pointBuilder.deleteCharAt(l - i);
		input = pointBuilder.toString();
		if ((input.length() > 3) || (input.length() < 2)) {
			return false;
		}
		line = input.charAt(0) - 64;
		row = 0;
		if (line > 15)
			line = input.charAt(0) - 96;
		if (input.length() == 2) {
			row = input.charAt(1) - 48;
		} else {
			row = (input.charAt(1) - 48) * 10 + (input.charAt(2) - 48);
		}
		return true;
	}

	@Override
	public int load(int model) {
		if (model != -1 && model != -2 && model != -3)
			return model;
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridLayout(1, 3, 5, 5));
		JScrollPane scrollPane = new JScrollPane();
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(100, 50));
		JTextArea textArea = new JTextArea();
		JButton time = new JButton("Sort by Time");
		JButton name = new JButton("Sort by Name");
		JButton choose = new JButton("Load This One");
		JButton back = new JButton("BACK");
		if (model == -1) {
			Record.qsort("time", 0, Record.total - 1);
		} else if (model == -2) {
			Record.qsort("name", 0, Record.total - 1);
		}
		for (int i = 0; i < Record.total; i++) {
			textArea.append((Record.order[i] + 1) + "\t"
					+ Record.saving[Record.order[i]][1] + "\t"
					+ Record.saving[Record.order[i]][2] + "\n");
		}
		scrollPane.add(textArea);
		name.setPreferredSize(new Dimension(100, 50));
		panel.add(time);
		panel.add(name);
		panel.add(choose);
		panel.add(back);
		frame.add(textField, BorderLayout.NORTH);
		frame.add(panel, BorderLayout.SOUTH);
		frame.add(textArea, BorderLayout.CENTER);
		frame.setSize(510, 560);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		pause = 0;
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == textField) {
					String input = textField.getText();
					try {
						pause = Integer.parseInt(input);
						if (pause < 1 || pause > 100
								|| !Record.number[pause - 1]) {
							JOptionPane.showMessageDialog(null,
									"Invalid saving position.");
							pause = -1;
						}
					} catch (Exception e0) {
						JOptionPane.showMessageDialog(null,
								"Invalid saving position.");
						pause = -1;
					}
				}
			}
		});
		choose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText();
				try {
					pause = Integer.parseInt(input);
					if (pause < 1 || pause > 100 || !Record.number[pause - 1]) {
						JOptionPane.showMessageDialog(null,
								"Invalid saving position.");
						pause = -1;
					}
				} catch (Exception e0) {
					JOptionPane.showMessageDialog(null,
							"Invalid saving position.");
					pause = -1;
				}
			}
		});
		do {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			time.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = -1;
				}
			});
			name.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = -2;
				}
			});
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = -4;
				}
			});
		} while (pause == 0);
		frame.dispose();
		return load(pause);
	}

	@Override
	public int start() {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(2, 3, 10, 10));
		JButton button1 = new JButton("New Game");
		JButton button2 = new JButton("Load Game");
		JButton button3 = new JButton("QUIT");
		frame.add(new JLabel(""));
		frame.add(new JLabel("How to start?"));
		frame.add(new JLabel(""));
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(400, 150);
		frame.setTitle("Welcome!!!");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		pause = 0;
		do {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 1;

				}
			});
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 2;

				}
			});
			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pause = 3;

				}
			});
		} while (pause == 0);
		frame.dispose();
		return pause;
	}

}
