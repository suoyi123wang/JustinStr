package wuziqi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileManager extends Main {
	void save(String name) throws Exception {
		File file = new File("files/" + name + ".txt");
		if (file.exists()) {// ����ļ��Ѵ���
			if (JOptionPane.showConfirmDialog(null,
					"File already exests. Overwrite?") != 0) {
				return;
			}
		}
		PrintWriter writer = new PrintWriter(file);
		writer.println(game.getCase() + " " + game.getRule());// ����
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// ʱ��
		writer.println(df.format(new Date()));
		writer.println(state + "|" + turn);// ����Ͳ���
		Element[] order = new Element[225];
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				order[15 * i + j] = new Element();
				order[15 * i + j] = M[i][j];
			}
		}
		// ���Ⱥ�˳������
		for (int k = 0; k < 224; k++) {
			for (int s = k + 1; s < 225; s++) {
				if (order[k].step > order[s].step) {
					Element a = order[k];
					order[k] = order[s];
					order[s] = a;
				}
			}
		}
		// ��¼ÿһ��
		for (int r = 0; r < Main.turn; r++) {
			if (order[r].color != "0") {
				writer.println("�� " + order[r].step + " ��|" + order[r].color
						+ "|(" + order[r].location[0] + ","
						+ order[r].location[1] + ")");
			}
		}
		writer.close();
	}

	String load(String command) throws FileNotFoundException {
		File files = new File("files/");
		File[] list = files.listFiles();// ��ȡ�б�
		switch (command.split("[ ]")[0]) {// ����ָ��
		case "sort-t":
			SortbyTime(list);
			String info0 = "";
			for (int r = 0; r < list.length; r++) {
				Scanner reader = new Scanner(list[r]);
				info0 = info0
						+ (reader.nextLine() + "\t" + reader.nextLine() + "\t"
								+ list[r].getName() + "\t" + list[r].getPath()
								+ "\t" + reader.nextLine() + "�غ�\n");
				reader.close();
			}
			return info0;
		case "sort-n":// ��ӡ������
			SortbyName(list);
			String info1 = "";
			for (int r = 0; r < list.length; r++) {
				Scanner reader = new Scanner(list[r]);
				info1 = info1
						+ (reader.nextLine() + "\t" + list[r].getName() + "\t"
								+ list[r].getPath() + "\t" + reader.nextLine()
								+ "\t" + reader.nextLine() + "�غ�\n");
				reader.close();
			}
			return info1;
		case "load":// ��ȡ���д浵
			getMatrix(command.split("[ ]")[1] + ".txt");
			draw.closeW();
			draw.buildFrame();
			return null;
		case "delete":
			File object = new File("files/" + command.split("[ ]")[1] + ".txt");
			object.delete();
			File[] a = files.listFiles();
			SortbyName(a);
			String info = "";
			for (int r = 0; r < a.length; r++) {
				Scanner reader = new Scanner(a[r]);
				info = info
						+ (reader.nextLine() + "\t" + a[r].getName() + "\t"
								+ a[r].getPath() + "\t" + reader.nextLine()
								+ "\t" + reader.nextLine() + "�غ�\n");
				reader.close();
			}
			return info;
		default:
			return "�����⡣����";
		}
	}

	private void getMatrix(String name) throws FileNotFoundException {// ��ȡ��־���
		Scanner in = new Scanner(new File("files/" + name));
		String[] chara = in.nextLine().split("[ ]");
		game.setCase(chara[0]);
		game.setRule(chara[1]);
		in.nextLine();
		turn = Integer.parseInt(in.nextLine().split("[|]")[1]);
		newMatrix();
		for (int i = 0; i < turn; i++) {
			String[] line = in.nextLine().split("[|(,) ]");
			byte x = Byte.parseByte(line[5]);
			byte y = Byte.parseByte(line[6]);
			M[x][y].set(line[3], Integer.parseInt(line[1]), x, y);
		}
		in.close();
	}

	void newMatrix() {// ��ʼ���µ����
		M = new Element[15][15];
		for (byte i = 0; i < 15; i++) {
			for (byte j = 0; j < 15; j++) {
				M[i][j] = new Element();
				M[i][j].set("0", 226, i, j);
			}
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void SortbyName(File[] x) {// ��������
		Arrays.sort(x, new Comparator() {
			public int compare(Object a, Object b) {
				File m = (File) a;
				File n = (File) b;
				return m.getName().compareTo(n.getName());
			}
		});
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void SortbyTime(File[] x) {// ʱ������
		Arrays.sort(x, new Comparator() {
			public int compare(Object a, Object b) {
				File m = (File) a;
				File n = (File) b;
				return (int) (m.lastModified() - n.lastModified());
			}
		});
	}
}
