package finalhomework;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GUI extends JFrame implements UI {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox gameBox = new JComboBox(new String[] {
			"      新游戏       ", "继续历史游戏" });
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox playerBox = new JComboBox(new String[] {
			"     人人对战     ", "     人机对战    " });
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox ruleBox = new JComboBox(new String[] { "      无禁手      ",
			"      有禁手      " });
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private JComboBox colorBox = new JComboBox(new String[] {
			"    橙色            ", "    粉红            ", "    灰色            ",
			"    蓝绿            ", "    黄色            ", "    绿色            ",
			"    品红            " });
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private JComboBox soundBox = new JComboBox(new String[] {
			"          开        ", "          关         " });
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private JComboBox difficultyBox = new JComboBox(new String[] {
			"        困难       ", "         简单       " });
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox orderBox = new JComboBox(new String[] { "  玩家持黑子 ",
			"  玩家持白子 " });
	private JLabel gameLabel = new JLabel("游戏    ");
	private JLabel playerLabel = new JLabel("玩家    ");
	private JLabel ruleLabel = new JLabel("规则    ");
	private JLabel colorJLabel = new JLabel("背景    ");
	private JLabel soundLabel = new JLabel("声音    ");
	private JLabel difficultyLabel = new JLabel("难度    ");
	private JLabel orderLabel = new JLabel("持子    ");
	private JLabel orderLabel2 = new JLabel("请在人机对战模式下选择：");
	private JButton beginbButton = new JButton("开始");
	private JButton exitButton = new JButton("退出");
	private int gameInt, playerInt, ruleInt, colorInt, soundInt, orderInt,
			difficultyInt;

	public GUI() {
		setLayout(new GridLayout(9, 0));
		JPanel panel1 = new JPanel();
		panel1.add(gameLabel);
		panel1.add(gameBox);
		JPanel panel2 = new JPanel();
		panel2.add(playerLabel);
		panel2.add(playerBox);
		JPanel panel3 = new JPanel();
		panel3.add(ruleLabel);
		panel3.add(ruleBox);
		JPanel panel4 = new JPanel();
		panel4.add(colorJLabel);
		panel4.add(colorBox);
		colorBox.setBackground(Color.orange);
		JPanel panel5 = new JPanel();
		panel5.add(soundLabel);
		panel5.add(soundBox);
		JPanel panel6 = new JPanel();
		panel6.add(orderLabel2);
		JPanel panel7 = new JPanel();
		panel7.add(orderLabel);
		panel7.add(orderBox);
		JPanel panel8 = new JPanel();
		panel8.add(difficultyLabel);
		panel8.add(difficultyBox);
		JPanel panel9 = new JPanel();
		panel9.add(beginbButton);
		panel9.add(exitButton);

		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(panel5);
		this.add(panel6);
		this.add(panel7);
		this.add(panel8);
		this.add(panel9);

		gameBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				gameInt = gameBox.getSelectedIndex();
			}
		});

		playerBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				playerInt = playerBox.getSelectedIndex();
			}
		});

		ruleBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				ruleInt = ruleBox.getSelectedIndex();
			}
		});

		orderBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				orderInt = orderBox.getSelectedIndex();

			}
		});

		difficultyBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				difficultyInt = difficultyBox.getSelectedIndex();

			}
		});

		colorBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				colorInt = colorBox.getSelectedIndex();
				setColor(colorInt);
			}
		});

		soundBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				soundInt = soundBox.getSelectedIndex();
			}
		});

		beginbButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new Game(gameInt, playerInt, ruleInt, orderInt,
							difficultyInt, colorInt, soundInt);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}

				close();
			}
		});
		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	private void setColor(int colorInt) {
		if (colorInt == 0) {
			colorBox.setBackground(Color.orange);
		} else if (colorInt == 1) {
			colorBox.setBackground(Color.pink);
		} else if (colorInt == 2) {
			colorBox.setBackground(Color.gray);
		} else if (colorInt == 3) {
			colorBox.setBackground(Color.cyan);
		} else if (colorInt == 4) {
			colorBox.setBackground(Color.yellow);
		} else if (colorInt == 5) {
			colorBox.setBackground(Color.green);
		} else {
			colorBox.setBackground(Color.magenta);
		}
	}

	public void start() {
		JFrame frame = new GUI();
		frame.setTitle("五子棋");
		// frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLocation(450, 150);
	}

	private void close() {
		this.dispose();
	}
}
