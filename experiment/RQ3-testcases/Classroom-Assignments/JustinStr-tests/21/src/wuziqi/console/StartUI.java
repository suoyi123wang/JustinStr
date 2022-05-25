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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		visionable = false;
		frame.setVisible(visionable);
	}

	public void continuegame() throws FileNotFoundException {
		while (true) {
			System.out.println("���Ƿ�Ҫ������������Ϸ������'Y'��ѡ����Ϸ�浵,ֱ�ӻس��Ժ���");
			Scanner scanner = new Scanner(System.in);
			String continueinput = scanner.nextLine();
			if (continueinput.equals("Y")) {
				continuegame = true;
				break;

			} else if (continueinput.equals("")) {
				continuegame = false;
				break;

			} else {
				System.out.println("�������");
			}
		}

		if (continuegame == true) {
			System.out.println("���ڶԻ�����ѡ����Ϸ�浵");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}

			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("��ѡ����Ҫ��������Ϸ�浵");
			fileChooser.showOpenDialog(null);
			try {
				continueFile = fileChooser.getSelectedFile();
				// long modify = continueFile.lastModified();

				System.out.println("����������δ��ɵ���Ϸ");

				Scanner scanner2 = new Scanner(continueFile);
				Record record = new Record();

				String readplayer1 = scanner2.next();
				player1 = record.IOtitletranslator(readplayer1);

				String readplayer2 = scanner2.next();
				player2 = record.IOtitletranslator(readplayer2);

				String readrule = scanner2.next();
				rule = record.IOtitletranslator(readrule);
			} catch (Exception e) {
				System.out.println("��û��ѡ��浵������ʼ�µ���Ϸ");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e2) {
					// TODO �Զ����ɵ� catch ��
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
		System.out.println("���ڶԻ���������˴���Ϸ�Ĵ浵���Ƽ���ַ");
		
		fileChooser.setDialogTitle("������˴���Ϸ�Ĵ浵���ƣ���ʽ����ַ");
		fileChooser.showSaveDialog(null);
		record = fileChooser.getSelectedFile();
		String recordname = fileChooser.getName(record);
		String recordpath = record.getPath();
		System.out.println("������Ϸ�Ĵ浵������Ϊ" + recordname);
		System.out.println("������Ϸ�Ĵ浵��������" + recordpath);
		System.out.printf("%n");
		System.out.println("����������Ϸ�����������Ӻ�����'C'��ʱ���沢�˳�");
		break filecreate;
			}catch(Exception e){
				System.out.println("������ѡ��һ���浵�Ա��汾����Ϸ");
			}
		}

	}

	public void Playercreator() {
		Scanner scanner = new Scanner(System.in);
		Playercreator: while (true) {
			System.out.println("���˶�ս�����˻���ս��");
			System.out.println("���˶�ս������'PvP',�˻���ս������'PvE',������ս������'EvE'");
			String input = scanner.nextLine();

			if (input.equals("PvP")) {
				System.out.println("����ѡ�����˶�ս");
				player1 = "human";
				player2 = "human";
				break Playercreator;
			} else if (input.equals("PvE")) {
				while (true) {
					System.out.println("����'First����Second����ѡ���Ⱥ���");
					String input2 = scanner.nextLine();
					if (input2.equals("First")) {
						System.out.println("����ѡ���˻���ս����Ϊ����");
						player1 = "human";
						player2 = "AI";
						break Playercreator;
					} else if (input2.equals("Second")) {
						System.out.println("����ѡ���˻���ս����Ϊ����");
						player1 = "AI";
						player2 = "human";
						break Playercreator;

					} else {
						System.out.println("�Ⱥ���ѡ������");
					}
				}
			} else if (input.equals("EvE")) {
				System.out.println("����ѡ�񼦼���ս");
				player1 = "AI";
				player2 = "AI";
				break Playercreator;
			} else {
				System.out.println("ģʽѡ������");
			}
		}

	}

	public void chooseRule() {
		System.out.println("��ѡ�񱾴���Ϸ�Ĺ���");
		Rule: while (true) {
			System.out.println("����Gѡ���޽���ģʽ�� ���� Y��ѡ�����Ͻ���ģʽ����ʵ����Ϊ����̫��������д�һ�˵����");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if (input.equals("G")) {
				System.out.println("����ѡ��Gomokuģʽ");
				rule = "G";
				break Rule;
			} else if (input.equals("Y")) {
				System.out.println("����ѡ�����Ͻ���ģʽ �����ڷ���������o_o_o_o���м����и�");
				rule = "Y";
				break Rule;
			} else {
				System.out.println("����ѡ������");
			}
		}
		System.out.printf("%n");
		
		System.out.printf("%n");
	}

}
