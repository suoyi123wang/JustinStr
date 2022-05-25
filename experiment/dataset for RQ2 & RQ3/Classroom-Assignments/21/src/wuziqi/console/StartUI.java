package wuziqi.console;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;

public class StartUI{

	public String player1 = null, player2 = null;
	public String rule = null;
	public boolean continuegame = false;

	public java.io.File record = null;
	public java.io.File continueFile = null;

	public void boardprinter(String[][] board) {

	}

	public void U_I() {
		JFrame frame = new JFrame();
		frame.setTitle("\u5199\u6B7B\u6211\u7684\u4E94\u5B50\u68CB");
		frame.setSize(475, 150);
		frame.getContentPane().setLayout(null);

		JLabel lblyzc = new JLabel(
				"\u5199\u6B7B\u6211\u7684\u4E94\u5B50\u68CB\u5C0F\u6E38\u620F\u2014\u2014\u7531YZC\u5168\u7A0B\u5F00\u53D1");
		lblyzc.setHorizontalAlignment(SwingConstants.CENTER);
		lblyzc.setForeground(Color.RED);
		lblyzc.setBounds(100, 40, 250, 30);
		frame.getContentPane().add(lblyzc);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		boolean visionable = true;
		frame.setVisible(visionable);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		visionable = false;
		frame.setVisible(visionable);
	}

	public void continuegame() throws FileNotFoundException {
		while (true) {
			System.out.println("您是否要继续曾经的游戏？输入'Y'以选择游戏存档,直接回车以忽略");
			Scanner scanner = new Scanner(System.in);
			String continueinput = scanner.nextLine();
			if (continueinput.equals("Y")) {
				continuegame = true;
				break;

			} else if (continueinput.equals("")) {
				continuegame = false;
				break;

			} else {
				System.out.println("输入错误");
			}
		}

		if (continuegame == true) {
			System.out.println("请在对话框中选择游戏存档");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("请选择想要继续的游戏存档");
			fileChooser.showOpenDialog(null);
			try {
				continueFile = fileChooser.getSelectedFile();
				// long modify = continueFile.lastModified();

				System.out.println("您即将继续未完成的游戏");

				Scanner scanner2 = new Scanner(continueFile);
				Record record = new Record();

				String readplayer1 = scanner2.next();
				player1 = record.IOtitletranslator(readplayer1);

				String readplayer2 = scanner2.next();
				player2 = record.IOtitletranslator(readplayer2);

				String readrule = scanner2.next();
				rule = record.IOtitletranslator(readrule);
			} catch (Exception e) {
				System.out.println("您没有选择存档，将开始新的游戏");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e2) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}

				filenamecreator();
			}
		}

	}

	public void filenamecreator() {
		JFileChooser fileChooser = new JFileChooser();
		filecreate:
		while(true){
			try{
		System.out.println("请在对话框中输入此次游戏的存档名称及地址");
		
		fileChooser.setDialogTitle("请输入此次游戏的存档名称，格式及地址");
		fileChooser.showSaveDialog(null);
		record = fileChooser.getSelectedFile();
		String recordname = fileChooser.getName(record);
		String recordpath = record.getPath();
		System.out.println("本次游戏的存档将保存为" + recordname);
		System.out.println("本次游戏的存档将保存至" + recordpath);
		System.out.printf("%n");
		System.out.println("您可以在游戏中在下完棋子后输入'C'随时保存并退出");
		break filecreate;
			}catch(Exception e){
				System.out.println("您必须选择一个存档以保存本次游戏");
			}
		}

	}

	public void Playercreator() {
		Scanner scanner = new Scanner(System.in);
		Playercreator: while (true) {
			System.out.println("人人对战还是人机对战？");
			System.out.println("人人对战请输入'PvP',人机对战请输入'PvE',鸡鸡对战请输入'EvE'");
			String input = scanner.nextLine();

			if (input.equals("PvP")) {
				System.out.println("你已选择人人对战");
				player1 = "human";
				player2 = "human";
				break Playercreator;
			} else if (input.equals("PvE")) {
				while (true) {
					System.out.println("输入'First’或‘Second’以选择先后手");
					String input2 = scanner.nextLine();
					if (input2.equals("First")) {
						System.out.println("你已选择人机对战，你为先手");
						player1 = "human";
						player2 = "AI";
						break Playercreator;
					} else if (input2.equals("Second")) {
						System.out.println("你已选择人机对战，你为后手");
						player1 = "AI";
						player2 = "human";
						break Playercreator;

					} else {
						System.out.println("先后手选择有误");
					}
				}
			} else if (input.equals("EvE")) {
				System.out.println("你已选择鸡鸡对战");
				player1 = "AI";
				player2 = "AI";
				break Playercreator;
			} else {
				System.out.println("模式选择有误");
			}
		}

	}

	public void chooseRule() {
		System.out.println("请选择本次游戏的规则");
		Rule: while (true) {
			System.out.println("输入G选择无禁手模式或 输入 Y以选择杨氏禁手模式（其实是因为禁手太多了懒的写我会说？）");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if (input.equals("G")) {
				System.out.println("你已选择Gomoku模式");
				rule = "G";
				break Rule;
			} else if (input.equals("Y")) {
				System.out.println("你已选择杨氏禁手模式 ，若黑方连六或下o_o_o_o的中间则判负");
				rule = "Y";
				break Rule;
			} else {
				System.out.println("规则选择有误");
			}
		}
		System.out.printf("%n");
		
		System.out.printf("%n");
	}

}
