package wuziqi.console;

public class Record {
	
	public void IOtitle(String p1, double p1weight,String p2,double p2weight,String rule,String nextinput, java.io.File record,
			java.io.PrintWriter output) throws Exception {
		if (p1.equals("human")) {
			p1 = "��";
		} else {
			p1 = "��";
		}
		if (p2.equals("human")) {
			p2 = "��";
		} else {
			p2 = "��";
		}
		if (rule.equals("G")) {
			rule = "����";
		} else if (rule.equals("Y")) {
			rule = "����";
		}
		if(nextinput.equals("B")){
			nextinput = "��ү";
		}else if(nextinput.equals("W")){
			nextinput = "�ܸ�";
		}
		String p1w = null,p2w = null;
		if(p1weight == 100){
			p1w = "D";
		}else if(p1weight == 1){
			p1w = "B";
		}else if(p1weight == 0.01){
			p1w = "A";
		}
		if(p2weight == 100){
			p2w = "D";
		}else if(p2weight == 1){
			p2w = "B";
		}else if(p2weight == 0.01){
			p2w = "A";
		}
		output.println(p1 + " "+ p2 + " "+ rule +" " +p1w+" " +p2w+" " +nextinput); 
	}
	
	public void IOrecorder(String[][] board,
			java.io.File record, java.io.PrintWriter output) throws Exception {
		
		for(int i = 0;i <15;i++){
			for(int j = 0;j <15;j++){
				String Bi = Integer.toBinaryString(i);
				Bi = Bi.replaceAll("1", "��");
				Bi = Bi.replaceAll("0", "��");
				String Bj = Integer.toBinaryString(j);
				Bj = Bj.replaceAll("1", "��");
				Bj = Bj.replaceAll("0", "��");
				if(board[i][j].equals("�� ")){
					output.println(Bi + " " + Bj + " " +"X");
				}else if(board[i][j].equals("o ")){
					output.println(Bi + " " + Bj + " " +"Y");
				}else if(board[i][j].equals("+ ")){
					output.println(Bi + " " + Bj + " " +"Z");
				}
			}
		}
	}

	public void recordcloser(String close, java.io.PrintWriter output) {
		if (close.equals("close")) {
			System.out.println("���ѱ��沢�˳�");
			output.close();
			System.exit(0);
		}
	}

	public String IOtitletranslator(String ciphertext) {
		String cleartext = null;
		if (ciphertext.equals("��")) {
			cleartext = "human";
		} else if (ciphertext.equals("��")) {
			cleartext = "AI";
		} else if (ciphertext.equals("����")) {
			cleartext = "G";
		} else if (ciphertext.equals("����")) {
			cleartext = "Y";
		} else if(ciphertext.equals("��ү")){
			cleartext = "B";
		} else if(ciphertext.equals("�ܸ�")){
			cleartext = "W";
		}  else if(ciphertext.equals("A")){
			cleartext = "attack";
		} else if(ciphertext.equals("B")){
			cleartext = "balance";
		} else if(ciphertext.equals("D")){
			cleartext = "defend";
		}
		return cleartext;
	}

	public String IObodytranslator(String ciphertext) {
		String cleartext = null;
		if (ciphertext.equals("X")) {
			cleartext = "�� ";
		} else if (ciphertext.equals("Y")) {
			cleartext = "o ";
		} else if(ciphertext.equals("Z")){
			cleartext = "+ ";
		}else{
			cleartext = ciphertext.replaceAll("��", "1");
			cleartext = cleartext.replaceAll("��", "0");
		}
		return cleartext;
	}

	public int binarytodecimal(String binary) {
		int decimal = Integer.parseInt(binary, 2);
		return decimal;
	}

}
