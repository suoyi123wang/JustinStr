package Main;

import java.io.FileNotFoundException;
import java.util.Scanner;

import Main.Game;
import UI.ConsoleUI;
import UI.GraphicsUI;
import UI.UI;

public class Main {
    public static final int ConsoleUI = 1;
    public static final int GraphicsUI = 2;
    public static UI ui;
    public static int uitype;
    static Scanner input = new Scanner(System.in);

    public static int setUIType() {
        uitype = ConsoleUI;
        System.out.println("��ѡ��UI����:");
        System.out.println("1��ConsoleUI");
        System.out.println("2��GraphicsUI");
        while (true) {
            String x = input.nextLine();


            if (x.compareTo("1") == 0) {
                uitype = ConsoleUI;
                break;
            } else if (x.compareTo("2") == 0) {
                uitype = GraphicsUI;
                break;
            } else {
                System.out.println("��������,����������:");

            }
        }
        return uitype;
    }

    public static void Run() throws FileNotFoundException {
        boolean next = true;
        System.out.println("һ�������������");
        System.out.println();
        int uiType = setUIType();
        Game game = new Game(uiType);
        ui = (uiType == ConsoleUI) ? (new ConsoleUI()) : (new GraphicsUI());
        while (next) {

            boolean isNotcorrect = true;
            ui.ShowMessage("�Ƿ��ȡ�浵��Y or N");
            while (isNotcorrect) {
                String p = ui.strInput();
                p = p.toUpperCase();
                if (p.equals("Y")) {
                    ui.ShowMessage("����浵�ļ�������ȡ�浵");
                    String q = ui.strInput();
                    java.io.File file = new java.io.File(q + ".txt");
                    if (file.exists()) {

                        game.resumeGame(q);

                        isNotcorrect = false;
                    } else {
                        ui.ShowError();
                    }
                } else if (p.equals("N")) {
                    game.gameStart();

                    isNotcorrect = false;

                } else {
                    ui.ShowError();
                }
            }


            game.setIsNext();
            next = game.getNext();
        }
        ui.ShowMessage("��Ϸ���˳�");
        ui.ShowMessage("�´�������ѽ�r(�s���t)�q");
    }

    public static void main(String[] args) throws FileNotFoundException {
        Main.Run();
    }


}
