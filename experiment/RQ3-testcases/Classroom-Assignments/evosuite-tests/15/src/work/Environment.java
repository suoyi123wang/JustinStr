package work;

import java.util.Scanner;

public class Environment {
	public ChessPieces a;
	public ChessPieces b;
	public ChessPieces c;
	public ChessPieces d;
	public ChessPieces e;
	Draw draw;
	Judge judge;

	public void start() {
		

			Scanner c1 = new Scanner(System.in);
			String raw1 = c1.next();
			Input input1 = new Input();
			a = input1.input(raw1);
	

			Scanner c2 = new Scanner(System.in);
			String raw2 = c2.next();
			Input input2 = new Input();
			b = input2.input(raw2);
	

			Scanner c3 = new Scanner(System.in);
			String raw3 = c3.next();
			Input input3 = new Input();
			c = input3.input(raw3);
	

			Scanner c4 = new Scanner(System.in);
			String raw4 = c4.next();
			Input input4 = new Input();
			d = input4.input(raw4);
		

			Scanner c5 = new Scanner(System.in);
			String raw5 = c5.next();
			Input input5 = new Input();
			e = input5.input(raw5);
		
		Draw draw = new Draw();

		draw.drawQipan(a, b, c, d, e);

		Judge judge = new Judge();

		draw.a = a;
		draw.b = b;
		draw.c = c;
		draw.d = d;
		draw.e = e;

		judge.isVictory(draw);

	}
	public static void main(String [] args){
		Environment environment= new Environment();
		environment.start();
		
	}
}
