package homework;
import java.util.Scanner;
public class ConsoleUI implements UI{

	public String player1 = null, player2 = null;
	public String rule = null;
	public void boardprinter(String[][] board){
		
	}
	
	public void U_I() {
		System.out.println("UI��ɶ���ܳ���");
	}

	public void Playercreator() {
		Scanner scanner = new Scanner(System.in);

		Playercreator: while (true) {
			System.out.println("���˶�ս�����˻���ս��");
			System.out.println("���˶�ս������'PvP',�˻���ս������'PvE',������ս������'EvE'");
			String input = scanner.nextLine();

			if (input.equals("PvP")) {
				System.out.println("����ѡ�����˶�ս");
				player1 = "human";
				player2 = "human";
				break Playercreator;
			} else if (input.equals("PvE")) {
				while (true) {
					System.out.println("����'First����Second����ѡ���Ⱥ���");
					String input2 = scanner.nextLine();
					if (input2.equals("First")) {
						System.out.println("����ѡ���˻���ս����Ϊ����");
						player1 = "human";
						player2 = "AI";
						break Playercreator;
					} else if (input2.equals("Second")) {
						System.out.println("����ѡ���˻���ս����Ϊ����");
						player1 = "AI";
						player2 = "human";
						break Playercreator;

					} else {
						System.out.println("�Ⱥ���ѡ������");
					}
				}
			} else if (input.equals("EvE")) {
				System.out.println("����ѡ�񼦼���ս");
				player1 = "AI";
				player2 = "AI";
				break Playercreator;
			}else{
				System.out.println("ģʽѡ������");
			}
		}
		
	}

	public void chooseRule() {
		System.out.println("��ѡ�񱾴���Ϸ�Ĺ���");
		Rule:
		while(true){
		System.out.println("Gomoku or Renju ?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if (input.equals("Gomoku")){
			System.out.println("����ѡ��Gomokuģʽ");
			rule = "G";
			break Rule;
		}else if (input.equals("Renju")){
			System.out.println("����ѡ��Renjuģʽ  //Renjuģʽδ��ɣ�Ĭ��Gomokuģʽ");
			rule = "R";
			break Rule;
		}else{
			System.out.println("����ѡ������");
		}
		}
	}
}

