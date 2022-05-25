package Play;

import java.util.Scanner;


import UI.UI;

public abstract class Player {
	public static final int HUMAN = 1;
	public static final int AI = 2;
	protected static int order = 0;
	protected String id;
	public int color;
	protected int step;
	protected int type;
	protected String Color = "";
	protected String Type = "";
	public Stone[] chessorder = new Stone[1];
	Scanner promptInput = new Scanner(System.in);

	public static void turnInicialize() {
		order = 0;
	}

	public String getId(String id) {
		id = this.id;
		return id;
	}

	public int getStep() {
		return step;
	}
	
	public int setcolor(int color) {
		this.color = color;
		return color;
	}

	
	public abstract String setId(UI ui);

	public String getColor() {
		switch (this.color) {
		case Stone.BLACK:
			this.Color = "黑色";
			break;
		case Stone.WHITE:
			this.Color = "白色";
			break;
		}
		return Color;
	}

	public int gettype(){
		return this.type;
	}
	public String getType() {
		switch (this.type) {
		case HUMAN:
			this.Type = "Human";
			break;
		case AI:
			this.Type = "AI";
			break;
		}
		return Type;
	}

	public void addStep() {
		step = step + 1;
	}

	public void minusStep() {
		step = step - 1;
	}

	public abstract Stone ConsoleInput();
	
	public abstract Stone GraphicsInput();

	public static void orderinicialize() {
		order = 0;
	}

	public String getId() {
		return id;
	}
	
	public Player parsePlayer(String s){
		Player player = new HumanPlayer(Stone.EMPTY,null);
		type = Integer.parseInt(String.valueOf(s.charAt(0)));
		String o = s.substring(1, 3);
		color = Stone.EMPTY;
		if(o.equals("黑色")){
			color = Stone.BLACK;
		}else if(o.equals("白色")){
			color = Stone.WHITE;
		}
		id = s.substring(4);
		if(type == Player.HUMAN){
			player =  new HumanPlayer(color, id);
		}else if(type == Player.AI){
		    player = new AIPlayer(color, id);
		}
		return player;
	}

}
