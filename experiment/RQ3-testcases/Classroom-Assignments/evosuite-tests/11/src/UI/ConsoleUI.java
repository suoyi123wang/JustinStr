package UI;

import java.util.Scanner;

import Play.Board;
import Play.Player;
import Play.Rule;
import Play.Stone;

public class ConsoleUI implements UI {

    Scanner input = new Scanner(System.in);

    public Scanner setScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public int setHumanOrAI() {
        int i = 0;
        System.out.println("��ѡ����Ϸ��ҵ����:");
        System.out.println("1���˻���ս(�������)");
        System.out.println("2���˻���ս(��������)");
        System.out.println("3�����˶�ս");
        while (true) {
            String x = input.nextLine();
            i = (x.equals("1")) ? HumanAI : (x.equals("2") ? AIHuman : (x
                    .equals("3") ? HumanHuman : 0));
            if (i != 0) {
                System.out.println();
                break;
            } else {
                ShowError();
            }
        }
        return i;
    }

    public int setRule() {
        int i = 0;
        System.out.println("��ѡ����Ϸ����:");
        System.out.println("1��Gomoku(�޽���)");
        System.out.println("2��Renju(�н���)");
        while (true) {
            String x = input.nextLine();
            i = (x.equals("1")) ? Rule.Gomoku : (x.equals("2") ? Rule.Renju : 0);
            if (i != 0) {
                System.out.println();
                break;
            } else {
                ShowError();
            }
        }
        return i;
    }

    public void printOut() {
        System.out.println("--------------------------------");
        System.out.print("   ");
        for (int i = 0; i < Board.Length; i++) {
            System.out.print((char) (i + 65) + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < Board.Width; i++) {
            System.out.printf("%2d", i + 1);
            for (int j = 0; j < Board.Length; j++) {
                System.out.print(" " + Board.getBoard()[i][j].getCircle());
            }
            System.out.print("\n");
        }
        System.out.println("--------------------------------");
    }

    public Stone Input(Player player) {
        return player.ConsoleInput();
    }


    public void ShowMessage(String message) {
        System.out.println(message);

    }

    @Override
    public void SystemError() {
        System.out.println("ϵͳ�����˳���Ϸ");
        System.exit(0);

    }

    @Override
    public int type() {

        return 1;
    }

    @Override
    public void ShowError() {
        System.out.println("������� ������������");

    }

    @Override
    public String strInput() {
        return input.nextLine();
    }


}
