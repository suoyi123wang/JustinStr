package Play;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Main.Game;
import UI.ConsoleUI;
import UI.UI;

public class Record {
	public Scanner input = new Scanner(System.in);
	
	private File Load(String id0, String id1,Player[] players,Stone[] chess) throws FileNotFoundException{
		java.io.File file = new java.io.File(".txt");
		Boolean legalName = true;
		while(legalName){
			System.out.println("输入保存的文件名");
			String name = input.nextLine();
			file = new java.io.File(name +".txt");
		if(file.exists()){
			System.out.println("文件已存在，请重新命名文件");
			
		}else{
			file = new java.io.File(name + ".txt");
	java.io.PrintWriter output = new java.io.PrintWriter(file);
	output.println("Game setting is: ");
	output.println( String.valueOf(players[0].gettype()) +players[0].getColor()+" "+players[0].getId(id0));
	output.println(String.valueOf(players[1].gettype()) +players[1].getColor() +" "+players[1].getId(id1));
	for(int i = 0; i<chess.length-1;i++){
		output.println(chess[i].getCircle() + String.valueOf((char)(chess[i].getY()+64)) +" "+chess[i].getX());
	}
	output.close();
	 System.out.println("Load Saved.");
	 System.out.println("The file has  " + file.length()+ "bytes");
		System.out.println("Absolute path is " + file.getAbsolutePath());
		legalName = false;
		}
		}
		return file;
		
	}
	
	
	public File saveLoad(String id0, String id1,Player[] players,Stone[] chessboard) throws FileNotFoundException{
		return Load(id0,id1,players,chessboard);
	}
	
	
	
	
}
