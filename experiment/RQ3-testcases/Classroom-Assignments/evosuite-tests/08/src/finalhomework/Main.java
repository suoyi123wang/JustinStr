package finalhomework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

	public static void main(String[] args) {
		JButton gBottun = new JButton(" 图形界面 ");
		JButton cBottun = new JButton("  控制台界面");
		JLabel label = new JLabel("               请选择游戏界面");
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout(15, 15));
		frame.add(label, BorderLayout.NORTH);
		frame.add(gBottun, BorderLayout.WEST);
		frame.add(cBottun, BorderLayout.EAST);
		frame.setTitle("五子棋");
		frame.setLocationRelativeTo(null);
		;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 150);
		frame.setVisible(true);

		gBottun.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new GUI().start();
				frame.dispose();
			}
		});

		cBottun.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ConsoleUI().start();
				frame.dispose();

			}
		});

	}

}
