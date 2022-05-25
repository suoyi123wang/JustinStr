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
        System.out.println("请选择游戏玩家的类别:");
        System.out.println("1、人机对战(玩家先手)");
        System.out.println("2、人机对战(电脑先手)");
        System.out.println("3、人人对战");
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
        System.out.println("请选择游戏规则:");
        System.out.println("1、Gomoku(无禁手)");
        System.out.println("2、Renju(有禁手)");
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
        System.out.println("系统错误，退出游戏");
        System.exit(0);

    }

    @Override
    public int type() {

        return 1;
    }

    @Override
    public void ShowError() {
        System.out.println("输入错误 ，请重新输入");

    }

    @Override
    public String strInput() {
        return input.nextLine();
    }


}
