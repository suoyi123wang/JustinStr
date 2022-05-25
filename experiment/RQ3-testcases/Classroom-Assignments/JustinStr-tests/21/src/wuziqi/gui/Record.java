package wuziqi.gui;

import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Record {
	
	public void save(String player1,String player2,String player1mode,String player2mode,String rule,String nextinput,String[][] board) throws FileNotFoundException{
		try{
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("请输入此次游戏的存档名称，格式及地址");
		fileChooser.showSaveDialog(null);
		FileFilter filter = new FileNameExtensionFilter("文本格式", "txt");
		fileChooser.setFileFilter(filter);
		java.io.File record = fileChooser.getSelectedFile();
		java.io.PrintWriter printWriter = new java.io.PrintWriter(record);
		printWriter.println(player1+" "+player1mode+" "+player2+" "+player2mode+" "+rule+" "+nextinput);
		for(int i = 0;i<15;i++){
			for(int j = 0;j<15;j++){
				if(board[i][j].equals("● ")){
					printWriter.println(i+" "+j+" "+"B");
				}else if(board[i][j].equals("o ")){
					printWriter.println(i+" "+j+" "+"W");
				}
			}
		}
		printWriter.close();
		}catch(Exception e){
			
		}
		
	}
	
   
}
