package wuziqi;

abstract class Rule extends Game {
	String result;
	
	abstract boolean judge(Element[][] a);
	
	String getResult(){
		return result;
	}
}
