package go;

public class Board {


    Stone stone;

    //��̬�������Ϳ�ʵ�������������
    private static int length = 15;
    private static int width = 15;

    Stone[][] board = new Stone[length][width];


    //һ�㹹�췽��
    public Board() {
    }

    //������������Ĺ��췽��
    public Board(Stone[][] board) {
    }


    //�ж������Ƿ������̷�Χ�ڵ�isLegal()����
    public static boolean islegal(Stone stone) {
        if (1 <= stone.x && stone.x <= length && 1 <= stone.y && stone.y <= width) {
            return true;
        } else {
            return false;
        }
    }

    //��ѭ�����ж�������printBoard()����
    public void printBoard(Stone[][] board) {
        System.out.println("       A   B   C   D   E   F   G   H   I   J   K   L   M   N   O");
        for (int i = 0; i < length; i++) {
            System.out.printf("%4d", i + 1);
            for (int j = 0; j < width; j++) {
                if (board[i][j] != null) {
                    if (board[i][j].color == 1) {
                        System.out.print("   B");
                    } else {
                        System.out.print("   W");
                    }
                } else {
                    System.out.print("   +");
                }
            }
            System.out.println("");
        }
    }


}


