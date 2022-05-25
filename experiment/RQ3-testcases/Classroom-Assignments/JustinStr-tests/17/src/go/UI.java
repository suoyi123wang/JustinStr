package go;


import java.util.Scanner;

import go.Stone;
import go.UI;

public class UI {
    private static Scanner scanner = new Scanner(System.in);

    public static void writeLine(String message) {
        System.out.println(message);
    }

    public static String readLine() {
        return scanner.nextLine();
    }

    public static void paintBoard(Stone[][] board) {
        int i, j;
        System.out.print("   ");
        for (i = 0; i < 15; i++) {
            System.out.print((char) ('A' + i) + "  ");
        }
        System.out.println();

        for (i = 0; i < 15; i++) {
            System.out.printf("%2d ", i + 1);
            for (j = 0; j < 15; j++) {
                if (board[i][j] == null) {
                    System.out.print("+  ");
                } else {
                    UI.printStone(board[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static void printStone(Stone currentStone) {
        if (currentStone.color == 1) {
            System.out.print("B  ");
        } else if (currentStone.color == -1) {
            System.out.print("W  ");
        }
    }
}


