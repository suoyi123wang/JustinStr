package wuziqi;



public class UI {
	
	public UI(){
		
	}
	public void print1(){
		System.out.println("请选择对战方式：人人（1），人机（2）");}
		public void print2(){
		
		System.out.println("请选择游戏规则：无禁手（1），禁手（2）");

	}
	public boolean choosePlayer(String a){
		return a.equals("1");
	}
	public boolean chooseRule(String b){
		return b.equals("1");
	}
}
