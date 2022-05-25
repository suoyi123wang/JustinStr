package homework;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GameRecordManager {

	public static int MAX_SIZE = 200;
	
	GameRecord[] gameRecords;
	int count = 0;
	
	public GameRecordManager() {
		this.gameRecords = new GameRecord[MAX_SIZE];
	}
	
	public void parseScanner(String scanner) {
		if(scanner!=null && scanner.startsWith("add")){
			String[] parts = scanner.split("\\s");
			if(parts.length>=3){
				this.addRecord(parts[1],parts[2]);
			}
			else{
				this.solveError();
			}
		}}
	public void parseScanner1(String scanner){
	 if("sort -n".equals(scanner)){
			this.sortByName();
			printGameRecords();
		}else if("sort -t".equals(scanner)){
			this.sortByTime();
			printGameRecords();
		}else{
			this.solveError1();
		}
	}

	public void getHelp(){
		System.out.println("\n使用说明：\n"
				+ "add 棋谱名称 保存路径 	--添加棋谱\n"+"end --结束添加\n"
				+ "help	--帮助信息\n");
	}
	public void getHelp1(){
		System.out.println( "\n继续：\n"+
                "sort -n	--按照棋谱名称排序\n"
				+ "sort -t	--按照保存时间排序\n"
				);
	}
	public void printGameRecords(){
		System.out.printf("%s,%s,%s,%s\n","id","name","path","saveTime");
		for(int i=0;i<count;i++){
			System.out.printf("%d,%s,%s,%s\n",this.gameRecords[i].id, this.gameRecords[i].name, this.gameRecords[i].path,this.gameRecords[i].saveTime);
		}
	}
	
	private void solveError() {
		System.out.println("!! 指令格式错误");
		this.getHelp();
	}
	private void solveError1() {
		System.out.println("!! 指令格式错误");
		this.getHelp1();
	}

	private void addRecord(String name, String path) {
		this.gameRecords[count++] = new GameRecord(name, path);
	}

	private void sortByName() {
		Arrays.sort(gameRecords,0, count, new Comparator<GameRecord>() {
		
			public int compare(GameRecord o1, GameRecord o2) {
				return o1.name.compareTo(o2.name);
			}
		});		
	}
	
	private void sortByTime() {
		Arrays.sort(gameRecords,0, count, new Comparator<GameRecord>() {	
			public int compare(GameRecord o1, GameRecord o2) {
				return o1.saveTime.before(o2.saveTime)?-1:1;
			}
			
		});	
	}
	public boolean saveToManager(){
		System.out.println("是否放进管理器，是（Y or y），否（N or n）");
		Scanner input = new Scanner(System.in);
		return (input.nextLine().toUpperCase().equals("Y"));
		
	}
	
}
