package five;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Record {

	public static boolean[] number = new boolean[100];
	public static int[] order = new int[100];
	public static long[] timeLong = new long[100];
	public static String[][] saving = new String[100][4];
	public static int[][][] step = new int[100][256][3];
	public static int total = 0;
	public static UI ui = new GraphicsUI();

	public static void var() {
		for (int i = 0; i < 100; i++) {
			number[i] = false;
			timeLong[i] = 0;
			for (int j = 0; j < 3; j++) {
				saving[i][j] = null;
				for (int k = 0; k < 256; k++) {
					step[i][k][j] = 0;
				}
			}
		}
		total = 0;
	}

	public static void save(int savePosition, String player1, String player2) {
		String path;
		// path= JOptionPane.showInputDialog("Input path:");
		path = "";
		String name;
		do {
			name = JOptionPane.showInputDialog("Input name:");
		} while (name.matches(".*[\\/:*\"<>?|].*") || name.equals(""));
		Date date = new Date();
		number[savePosition] = true;
		saving[savePosition][0] = path;
		saving[savePosition][1] = name;
		saving[savePosition][2] = date.toString();
		timeLong[savePosition] = date.getTime();
		getStep(savePosition);
		File file = new File(path + name + ".txt");
		if (file.exists()) {
			JOptionPane.showMessageDialog(null, "Will overwrite");
		}
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter(file);
			printWriter.println(player1 + " " + player2);
			printWriter.println(Board.steps);
			for (int i = 0; i < Board.steps; i++)
				printWriter.println(step[savePosition][i][0] + " "
						+ step[savePosition][i][1] + " "
						+ step[savePosition][i][2]);
			printWriter.println(Board.rule);
			printWriter.close();
			saving[savePosition][3] = getMD5(savePosition);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Invalid path or name.");
			e.printStackTrace();
		}
		total++;
	}

	public static void getStep(int savePosition) {
		for (int i = 0; i < Board.steps; i++) {
			step[savePosition][i][0] = Board.step[i][0];
			step[savePosition][i][1] = Board.step[i][1];
			step[savePosition][i][2] = Board.step[i][2];
		}
	}

	public static void saveAll() {
		File file = new File("dataAll.fir");
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter(file);
			int j = 0;
			for (int i = 0; i < 100; i++) {
				if (number[i])
					j++;
			}
			printWriter.println(j);
			for (int i = 0; i < 100; i++) {
				if (number[i]) {
					if (saving[i][0].equals(""))
						saving[i][0] = "default";
					printWriter.print(i + " " + saving[i][0] + " "
							+ saving[i][1] + " " + saving[i][2] + " "
							+ saving[i][3] + " " + timeLong[i]);
					printWriter.println();
				}
			}
			printWriter.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Invalid path or name.");
			e.printStackTrace();
		}
	}

	public static int load() {
		int position;
		do {
			position = ui.load(-3);
		} while (position != -4 && !((position >= 1 && position <= 100)
				&& Record.number[position - 1]));
		return position;
	}

	public static void loadAll() {
		File file = new File("dataAll.fir");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			total = scanner.nextInt();
			for (int i = 1; i <= total; i++) {
				int j = scanner.nextInt();
				order[i - 1] = j;
				number[j] = true;
				saving[j][0] = scanner.next();
				if (saving[j][0].equals("default"))
					saving[j][0] = "";
				saving[j][1] = scanner.next();
				saving[j][2] = scanner.next() + " " + scanner.next() + " "
						+ scanner.next() + " " + scanner.next() + " "
						+ scanner.next() + " " + scanner.next();
				saving[j][3] = scanner.next();
				timeLong[j] = scanner.nextLong();
				if (!new File(saving[j][0] + saving[j][1] + ".txt").exists()) {
					total--;
					number[j] = false;
					i--;
				} else if (!check(j)) {
					total--;
					number[j] = false;
					i--;
				}
				/*
				 * for (int k = 0; k < i - 1; k++) { if
				 * (saving[order[k]][1].equals(saving[j][1])) if
				 * (timeLong[order[k]] < timeLong[j]) { order[k] = j; total--;
				 * number[j] = false; i--; } else { total--; number[j] = false;
				 * } }
				 */
			}
			scanner.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Saving file not found or damaged.");
			e.printStackTrace();
		}
	}

	public static String getMD5(int position) {
		File file = new File(Record.saving[position][0]
				+ Record.saving[position][1] + ".txt");
		MessageDigest digest = null;
		FileInputStream in = null;
		byte[] buffer = new byte[1024];
		int len;
		try {
			digest = MessageDigest.getInstance("MD5");
			in = new FileInputStream(file);
			while ((len = in.read(buffer, 0, 1024)) != -1) {
				digest.update(buffer, 0, len);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		BigInteger bigInt = new BigInteger(1, digest.digest());
		return bigInt.toString(16);
	}

	public static boolean check(int position) {
		return getMD5(position).equals(saving[position][3]);
	}

	public static boolean noLess(String s, int a, int b) {
		if (s.equals("name")) {
			int length;
			if (saving[a][1].length() >= saving[b][1].length()) {
				length = saving[b][1].length();
			} else
				length = saving[a][1].length();
			for (int i = 0; i < length; i++) {
				if (saving[a][1].charAt(i) > saving[b][1].charAt(i))
					return true;
				if (saving[a][1].charAt(i) < saving[b][1].charAt(i))
					return false;
			}
			if (length < saving[b][1].length())
				return false;
			return true;
		} else if (s.equals("time")) {
			if (timeLong[a] >= timeLong[b])
				return true;
			else
				return false;
		}
		return false;
	}

	public static void qsort(String s, int start, int end) {
		int tem, left, right;
		if (start < end) {
			left = start;
			right = end;
			tem = order[start];
			while (left < right) {
				while (left < right && noLess(s, order[right], tem))
					right--;
				order[left] = order[right];
				while (left < right && noLess(s, tem, order[left]))
					left++;
				order[right] = order[left];
			}
			order[left] = tem;
			qsort(s, start, left - 1);
			qsort(s, right + 1, end);
		}
	}

}
