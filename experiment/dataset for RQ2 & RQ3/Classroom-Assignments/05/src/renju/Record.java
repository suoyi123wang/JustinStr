package renju;

import java.io.FileNotFoundException;

public class Record {
	private static int count;
	private static Stone[] stones;

	public static int getCount() {
		return count;
	}

	private static void setCount(int count) {
		Record.count = count;
	}

	public static Stone[] getStones() {
		return stones;
	}

	private void setStones(Stone[] stones) {
		this.stones = stones;
	}

	public Record() {
		this.setCount(0);
		this.setStones(new Stone[Board.MAX_X * Board.MAX_Y]);
	}

	public void placeStone(Stone stone) {
		this.getStones()[this.getCount()] = stone;
		this.setCount(this.getCount() + 1);
	}
    public static void undoStone(){
    	Record.getStones()[Record.getCount()-1] = null;
    	Record.setCount(Record.getCount()-1);
    }
	public void print() {
		System.out.println("�������ף�");
		int i = 0;
		for (i = 0; i < this.getCount(); i++) {
			Stone stone = this.getStones()[i];
			String message = "";
			message = message + "��ɫ��"
					+ (stone.getColor() == Stone.BLACK ? "��ɫ" : "��ɫ") + " ";
			message = message + "���꣺" + (char) (stone.getY() + 'A' - 1)
					+ stone.getX();
			System.out.println(message);
		}
		if (this.getCount() < Board.MAX_X * Board.MAX_Y) {
			Stone stone = this.getStones()[this.getCount() - 1];
			System.out.println("ʤ�����ǣ�"
					+ (stone.getColor() == Stone.BLACK ? "�ڷ�" : "�׷�"));
		}
	}
	public void save() throws FileNotFoundException{
		 System.out.println("ʵ���Զ��浵");
			java.io.File qipu = new java.io.File("����.txt");
			if (qipu.exists()) {
				System.out.println("FILE�����Ѵ���,����û��ϵ����ǰ���ݻᱻ�ҷϵ�");
			}
			java.io.PrintWriter output = new java.io.PrintWriter(qipu);
			output.println("�������ף�");
			int i = 0;
			for (i = 0; i < this.getCount(); i++) {
				Stone stone = this.getStones()[i];
				String message = "";
				message = message + "��ɫ��"
						+ (stone.getColor() == Stone.BLACK ? "��ɫ" : "��ɫ") + " ";
				message = message + "���꣺" + (char) (stone.getY() + 'A' - 1)
						+ stone.getX();
				output.println(message);
			}
			if (this.getCount() < Board.MAX_X * Board.MAX_Y) {
				Stone stone = this.getStones()[this.getCount() - 1];
				output.println("ʤ�����ǣ�"
						+ (stone.getColor() == Stone.BLACK ? "�ڷ�" : "�׷�"));
			}
			output.close();
	}
}