package go;

public class Board {


    Stone stone;

    //静态变量长和宽。实例变量五个棋子
    private static int length = 15;
    private static int width = 15;

    Stone[][] board = new Stone[length][width];


    //一般构造方法
    public Board() {
    }

    //带有棋子数组的构造方法
    public Board(Stone[][] board) {
    }


    //判断棋子是否在棋盘范围内的isLegal()方法
    public static boolean islegal(Stone stone) {
        if (1 <= stone.x && stone.x <= length && 1 <= stone.y && stone.y <= width) {
            return true;
        } else {
            return false;
        }
    }

    //用循环与判断条件的printBoard()方法
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


