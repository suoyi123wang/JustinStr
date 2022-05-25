package Wuziqi;

public class Player {
	
	private int id;
	private int color;
	public Player(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public Player(int id, int color) {
		this.setId(id);
		this.setColor(color);
	}
	
	public QiZi order(String order){
		int x = Integer.parseInt(order.substring(0, order.length()-1));
		int y = order.charAt(order.length()-1) - 'A' + 1;
		return new QiZi(x,y,this.getColor());
	}
}
