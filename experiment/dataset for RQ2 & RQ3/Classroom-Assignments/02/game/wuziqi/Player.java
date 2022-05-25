package wuziqi;

abstract class Player extends Game {
	
	abstract boolean setPosition(Element[][] a,String input);
//	abstract boolean setPosition1(Element[][] a);

	abstract byte getX();

	abstract byte getY();
}