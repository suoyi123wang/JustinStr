package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ChessRecordManager implements RecordAdapter {


	ChessRecord record = new ChessRecord();

	public boolean isSave(int count) {
		if (count > 0) {
			System.out.println("�Ƿ�浵�����롮Y or y���ǣ���N or n����");
			Scanner input = new Scanner(System.in);
			String input1 = input.nextLine().toUpperCase();
			return input1.equals("Y");
		} else {
			return false;
		}
	}

	public boolean isLoad() {
		System.out.println("�Ƿ���������롮Y or y���ǣ���N or n����");
		Scanner input = new Scanner(System.in);
		String input1 = input.nextLine().toUpperCase();
		return input1.equals("Y");
	}

	public void save(int count1, int count2, Player player1, Player player2) {
		if (count1 > 0) {
			System.out.println("enter file you want to creat");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			File f = new File(input);
			try {
				f.createNewFile();
				PrintWriter writer = new PrintWriter(f);

				for (int i = 0; i < count1; i++) {
					writer.print((player1 instanceof HumanPlayer) ? "human1(BLACK)"
							+ "��" + i + "������"
							: "AI1(BLACK)" + "��" + i + "������");
					writer.print(" ");
					writer.print((char) (ChessRecord.a2[i] + 64));
					writer.print(" ");
					writer.println(ChessRecord.a1[i]);
				}

				for (int i = 0; i < count2; i++) {
					writer.print((player2 instanceof HumanPlayer) ? "human2(WHITE)"
							+ "��" + i + "������"
							: "AI2(WHITE)" + "��" + i + "������");
					writer.print(" ");
					writer.print((char) (ChessRecord.b2[i] + 64));
					writer.print(" ");
					writer.println(ChessRecord.b1[i]);
				}
				writer.print("The_Orders_From ui");
				
				writer.print(" ");
				for (int i = 0; i < 3; i++) {
					writer.print((record.order()[i]));
				}

				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public String load() {
		int count = -1;// use it to record the length of file to be loaded
		int a[] = new int[225];// use it to record the vertical line
		int b[] = new int[225]; // use it to record the horizontal line
		String player[] = new String[225];
		
			System.out.println("enter the file you want to load");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			File f = new File(input);
			try {
				Scanner reader = new Scanner(f);
				while (reader.hasNext()) {
					count++;
					player[count] = reader.next();
					a[count] = reader.next().charAt(0) - 64;//�ȶ�������������Ϣ
					b[count] = reader.nextInt();//���������������Ϣ
				}
				reader.close();
				
				
				if (count % 2 == 1) {
					for (int i = 0; i < (count+1) / 2; i++) {
						ChessRecord.a2[i] = a[i];
						ChessRecord.a1[i] = b[i];
					
						Board.chess[b[i]-1][a[i]-1]=SetLevel.BLACK_CHESS;
					}
					for (int i = (count+1)/2; i < count ; i++) {
						
						ChessRecord.b2[i-(count+1)/2] = a[i];
						ChessRecord.b1[i-(count+1)/2] = b[i];
				
						Board.chess[b[i]-1][a[i]-1]=SetLevel.WHITE_CHESS;
					}
					Board.printBoard();
					record.printStones1((count+1) / 2-1);
					record.printStones2((count-1) / 2-1 );
				} else {
					for (int i = 0; i < count  / 2; i++) {
						ChessRecord.a2[i] = a[i];
						ChessRecord.a1[i] = b[i];
				
						Board.chess[b[i]-1][a[i]-1]=SetLevel.BLACK_CHESS;
					}
					for (int i = count/2; i < count; i++) {
						ChessRecord.b2[i-count/2] = a[i];
						ChessRecord.b1[i-count/2] = a[i];
				
						Board.chess[b[i]-1][a[i]-1]=SetLevel.WHITE_CHESS;
					}
					Board.printBoard();
					record.printStones1(count  / 2-1);
					record.printStones2(count  / 2-1);
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
		return "" + b[count] + count;
	}

	

	public Player playerMode(String inf) {
		return (inf.startsWith("human") ? new HumanPlayer() : new AIPlayer());
	}

}
