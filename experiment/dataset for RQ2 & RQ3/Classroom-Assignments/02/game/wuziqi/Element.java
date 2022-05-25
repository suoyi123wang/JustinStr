package wuziqi;

public class Element {
	String color="0";
	int step=226;
	byte[] location;
	void reset(){
		color="0";
		step=226;
	}
	void set(String a,int b,byte x,byte y){
		color=a;
		step=b;
		location=new byte[2];
		location[0]=x;
		location[1]=y;
	}
}
