package homework;
import java.util.Date;
public class GameRecord {

	static public int idNumeber = 1;

	int id;
	String name;
	String path;
	Date saveTime;

	static int genId(){
		return idNumeber++;
	}
	public GameRecord(String name,String path) {
		this.id = genId();
		this.name = name;
		this.path = path;
		this.saveTime = new Date();
	
	}	
}
