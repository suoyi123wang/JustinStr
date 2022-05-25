package wuziqi;

abstract class Player extends Game {
	
	abstract boolean setPosition(Element[][] a,int color);
	abstract byte getX();
	abstract byte getY();
}