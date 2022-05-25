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
			"      ����Ϸ       ", "������ʷ��Ϸ" });
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox playerBox = new JComboBox(new String[] {
			"     ���˶�ս     ", "     �˻���ս    " });
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox ruleBox = new JComboBox(new String[] { "      �޽���      ",
			"      �н���      " });
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private JComboBox colorBox = new JComboBox(new String[] {
			"    ��ɫ            ", "    �ۺ�            ", "    ��ɫ            ",
			"    ����            ", "    ��ɫ            ", "    ��ɫ            ",
			"    Ʒ��            " });
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private JComboBox soundBox = new JComboBox(new String[] {
			"          ��        ", "          ��         " });
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private JComboBox difficultyBox = new JComboBox(new String[] {
			"        ����       ", "         ��       " });
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox orderBox = new JComboBox(new String[] { "  ��ҳֺ��� ",
			"  ��ҳְ��� " });
	private JLabel gameLabel = new JLabel("��Ϸ    ");
	private JLabel playerLabel = new JLabel("���    ");
	private JLabel ruleLabel = new JLabel("����    ");
	private JLabel colorJLabel = new JLabel("����    ");
	private JLabel soundLabel = new JLabel("����    ");
	private JLabel difficultyLabel = new JLabel("�Ѷ�    ");
	private JLabel orderLabel = new JLabel("����    ");
	private JLabel orderLabel2 = new JLabel("�����˻���սģʽ��ѡ��");
	private JButton beginbButton = new JButton("��ʼ");
	private JButton exitButton = new JButton("�˳�");
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
		frame.setTitle("������");
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
