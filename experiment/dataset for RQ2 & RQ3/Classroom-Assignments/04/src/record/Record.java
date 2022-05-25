package record;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import unseen.Board;



public class Record {
	public void getManual() {
		for (int i = 1; i < Board.getNumberOfChess(); i++) {
			System.out.println(i + ": " + "player" + ((i + 1) % 2 + 1) + "'s "
					+ ((i + 1) / 2) + " chess, at "
					+ (char) (Board.chess[i].getX() + 'A') + ","
					+ (Board.chess[i].getY()+1));
		}
	}

	public void getManual(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.println(i + ": " + "player" + ((i + 1) % 2 + 1) + "'s "
					+ ((i + 1) / 2) + " chess, at "
					+ (char) (Board.chess[i].getX() + 'A') + ","
					+ Board.chess[i].getY()+1);
		}
	}

	// 留到图形界面........
	public void printManual() {
		for (int i = 1; i < Board.getNumberOfChess(); i++) {

		}
		for (int q = 0; q < 16; q++) {
			for (int w = 0; w < 16; w++) {
				System.out.print(Board.getLocation(w, q));
			}
			System.out.println();
		}
		System.out.print("\n");
	}

	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		String t = input.nextLine();
		try{
			if(t.matches("add .*")){
				String name = t.substring(4);
				String path="F:\\manual";
				String fileStr=path+name;
				File file=new File(fileStr);
				
				try 
				{
					file.createNewFile();
					String dateTime=new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss.SSS").format(new Date());
					PrintWriter output = new PrintWriter(file);
					output.println(dateTime);
					output.println();
					for (int i = 1; i <= Board.getNumberOfChess(); i++) {
						output.println(i + ": " + "player" + ((i + 1) % 2 + 1) + "'s "
								+ ((i + 1) / 2) + " chess, at "
								+ (char) (Board.chess[i].getX() + 'A') + ","
								+ Board.chess[i].getY());
					}
					output.close();
				} 
				catch (IOException e) 
				{}
			}
			else if(t.equals("sort -n")){
				
			}
			else if(t.equals("sort -t")){
				
			}
		}catch(Exception e){
			
		}
		//input.close();
	}
}
