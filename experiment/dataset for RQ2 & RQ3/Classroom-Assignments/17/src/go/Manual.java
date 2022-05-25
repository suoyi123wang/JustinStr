package go;

public class Manual {
	
	Stone[] manual;
	
	public  Manual() {
		
	}
	
	public Manual(Stone[] manual) {
		
	}
	
	
	public void PrintManual(Stone[] manual , int length) {
		for (int i = 0 ; i < length ; i++) {
			if (manual[i].color == 1 ) {
				System.out.println("第" + (i + 1) + "手为黑棋下在" + manual[i].coordinate);
			} else {
				System.out.println("第" + (i + 1) + "手为白棋下在" + manual[i].coordinate);
			}
		}
		
		
	}

}
