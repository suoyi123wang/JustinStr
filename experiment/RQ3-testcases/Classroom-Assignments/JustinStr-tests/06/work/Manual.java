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
				System.out.println("��" + (i + 1) + "��Ϊ��������" + manual[i].coordinate);
			} else {
				System.out.println("��" + (i + 1) + "��Ϊ��������" + manual[i].coordinate);
			}
		}
		
		
	}

}
