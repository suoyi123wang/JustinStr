package wuziqi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class FileManager extends Main {
	 void save(String name) throws Exception {
			File file = new File("files/" + name + ".txt");
			PrintWriter writer = new PrintWriter(file);
			writer.println(game.getCase()+" "+game.getRule());
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			writer.println(df.format(new Date()));
			writer.println(state + "|" + turn);
			Element[] order = new Element[225];
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					order[15 * i + j] = new Element();
					order[15 * i + j] = M[i][j];
				}
			}
			for (int k = 0; k < 224; k++) {
				for (int s = k + 1; s < 224; s++) {
					if (order[k].step > order[s].step) {
						Element a = order[k];
						order[k] = order[s];
						order[s] = a;
					}
				}
			}

			for (int r = 0; r < Main.turn; r++) {
				if(order[r].color!="0"){
				writer.println("第 " + order[r].step + " 步|" + order[r].color + "|("
						+ order[r].location[0] + "," + order[r].location[1] + ")");
			}}
			writer.close();
		}
	 @SuppressWarnings("resource")
	String load(String command) throws FileNotFoundException {
		File files = new File("files/");
		File[] list = files.listFiles();
			switch (command.split("[ ]")[0]) {
			case "sort-t":
				SortbyTime(list);
				String info0="";
				for (int r = 0; r < list.length; r++) {
					Scanner reader = new Scanner(list[r]);
					info0=info0+ (reader.nextLine() + "\t"+ reader.nextLine()+"\t"
							+ list[r].getName() + "\t" + list[r].getPath()+"\t"
							+ reader.nextLine()+"回合\n" );
				}
				return info0;
			case "sort-n":
				SortbyName(list);
				String info1="";
				for (int r = 0; r < list.length; r++) {
					Scanner reader = new Scanner(list[r]);
					info1= info1+(reader.nextLine() + "\t"
							+ list[r].getName() + "\t" + list[r].getPath()+"\t"
							+ reader.nextLine() +"\t"+ reader.nextLine()+"回合\n");
				}
				return info1;
			case "load":
				getMatrix(command.split("[ ]")[1]);
				draw.closeW();
				draw.buildFrame();
				return null;
			default: return "有问题。。。";
			}
	}
	 private void getMatrix(String name) throws FileNotFoundException {
			// 读取棋局矩阵
			Scanner in = new Scanner(new File("files/" + name));
			String[] chara=in.nextLine().split("[ ]");
			game.setCase(chara[0]);
			System.out.println(chara[0]);
			game.setRule(chara[1]);
			System.out.println(chara[1]);
			in.nextLine();
			turn =Integer.parseInt(in.nextLine().split("[|]")[1]);
			newMatrix();
			for (int i = 0; i < turn; i++) {
				String[] line = in.nextLine().split("[|(,) ]");
				byte x = Byte.parseByte(line[5]);
				byte y = Byte.parseByte(line[6]);
				M[x][y].set(line[3], Integer.parseInt(line[1]), x, y);
				System.out.println(line[1]+" "+line[3]+" "+line[5]+" "+line[6]);
			}
			in.close();
		}
	 void newMatrix() {
			M = new Element[15][15];
			for (byte i = 0; i < 15; i++) {
				for (byte j = 0; j < 15; j++) {
					M[i][j] = new Element();
					M[i][j].set("0", 226, i, j);
				}
			}
		}
	 private static void SortbyName(File[] x) {
		Arrays.sort(x, new Comparator() {
			@Override
			public int compare(Object a, Object b) {
				File m = (File) a;
				File n = (File) b;
				return m.getName().compareTo(n.getName());
			}
		});
	}
    //时间排序
	 private static void SortbyTime(File[] x) {
		Arrays.sort(x, new Comparator() {
			@Override
			public int compare(Object a, Object b) {
				File m = (File) a;
				File n = (File) b;
				return (int) (m.lastModified()-n.lastModified());
			}
		});
	}
}
