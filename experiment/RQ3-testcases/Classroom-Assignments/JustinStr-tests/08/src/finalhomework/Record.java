package finalhomework;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Record {

	int[][] stoneArray = new int[240][2];
	int[] infoArray = new int[7];

	public void newRecord(int[][] stones, int[] info)
			throws FileNotFoundException {

		JFileChooser fc = new JFileChooser();
		fc.setDialogType(JFileChooser.FILES_ONLY);
		fc.setDialogTitle("保存文件");
		fc.setMultiSelectionEnabled(false);
		fc.showSaveDialog(fc);
		PrintWriter output = new PrintWriter(fc.getSelectedFile().getPath());
		for (int j = 0; j < 7; j++) {
			output.print(j);
			output.print(" ");
			output.println(info[j]);
		}
		for (int i = 7; i < stones.length; i++) {
			output.print(stones[i - 7][0]);
			output.print(" ");
			output.println(stones[i - 7][1]);
		}
		output.close();
	}

	public int[][] selectRecord() throws FileNotFoundException {
		JFileChooser fc = new JFileChooser();
		fc.setDialogType(JFileChooser.FILES_ONLY);
		fc.setDialogTitle("选择文件");
		fc.setMultiSelectionEnabled(false);
		fc.showOpenDialog(fc);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(fc.getSelectedFile());
		int i = 0;
		while (input.hasNext()) {
			stoneArray[i][0] = input.nextInt();
			stoneArray[i][1] = input.nextInt();
			i++;
		}
		return stoneArray;

	}

}
