package renju;

public class Direction {
	public static final Direction[] DIRECTIONS= new Direction[]{
		new Direction (1,0),new Direction (1,1),
		new Direction (1,-1),new Direction (0,1)
		//new Direction (-1,0),new Direction (-1,-1),
		//new Direction (-1,1),new Direction (0,-1)
		};
	
	private int deltaX;
	public int getDeltaX() {
		return deltaX;
	}
	private void setDeltaX(int deltaX) {
		this.deltaX = deltaX;
	}
	public int getDeltaY() {
		return deltaY;
	}
	private void setDeltaY(int deltaY) {
		this.deltaY = deltaY;
	}
	private int deltaY;
	
	public Direction(int deltaX,int deltaY){
		this.setDeltaX (deltaX);
		this.setDeltaY(deltaY);
	}
	

}
