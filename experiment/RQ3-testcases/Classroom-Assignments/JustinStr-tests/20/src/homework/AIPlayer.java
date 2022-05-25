package homework;

import java.util.HashMap;
import java.util.Scanner;


public class AIPlayer extends Player implements SetLevel {

    Board board = new Board();
    ChessRecord record = new ChessRecord();

    private int computeType = 0;
    int chess[][] = new int[15][15];
    int column;
    int row;

    public Integer[] getAction(int[][] chess) {
        Actions as = new Actions();
        HashMap<String, Integer[]> hs = as.getActionPoints(chess);
        Integer[] action = null;
        String[] level = SetLevel.level;
        for (String l : level) {
            if (null != (action = hs.get(l)))
                return action;

        }
        return action;
    }

    public Integer[] randomChesss(int row, int column, int[][] chess) {
        Points ps = new Actions().randomChess(row, column, chess);
        if (ps != null)
            return new Integer[]{ps.getRow(), ps.getColumn()};
        return null;
    }

    public int getComputeType() {
        return computeType;
    }

    public void setComputeType(int computeType) {
        this.computeType = computeType;
    }

    public class Actions {

        private void putToMap(int count1, int count2, int count3, int count4,
                              int chessType, Integer[] ps, HashMap<String, Integer[]> hs,
                              int row, int column, int[][] chess) {

            boolean b2 = (chessType == 1 && count1 <= 3 && (row + 1 <= 14
                    && chess[row + 1][column] == 2 || row == 14));
            boolean b1 = (chessType == 1 && count2 <= 3 && (column + 1 <= 14
                    && chess[row][column + 1] == 2 || row == 14));
            boolean b3 = (chessType == 1 && count3 <= 3 && (row + 1 <= 14
                    && column - 1 >= 0 && row + 1 <= 14
                    && chess[row + 1][column - 1] == 2 || row == 14
                    || column == 14 || column == 0));
            boolean b4 = (chessType == 1 && count4 <= 3 && (row + 1 <= 14
                    && column + 1 <= 14 && row + 1 <= 14
                    && chess[row + 1][column + 1] == 2 || row == 14
                    || column == 14 || column == 0));
            if (count1 > 0 && !b2)
                hs.put((count1 + "-" + chessType).trim(), ps);
            if (count2 > 0 && !b1)
                hs.put((count2 + "-" + chessType).trim(), ps);
            if (count3 > 0 && !b3)
                hs.put((count3 + "-" + chessType).trim(), ps);
            if (count4 > 0 && !b4)
                hs.put((count4 + "-" + chessType).trim(), ps);

        }

        private void putBigLevel(int upAndDownLine, int acrossLine,
                                 int leftUpAndDown, int rightUpAndDown, int chessType, int row,
                                 int colunmn, HashMap<String, Integer[]> hs) {

            if (acrossLine == upAndDownLine
                    && (acrossLine >= 2 && acrossLine <= 4)
                    && (row != 0 && row != 14))
                hs.put(upAndDownLine + ".1" + "-" + chessType, new Integer[]{
                        row, colunmn});

            if (acrossLine == leftUpAndDown
                    && (acrossLine >= 2 && acrossLine <= 4)
                    && (row != 0 && row != 14))
                hs.put(acrossLine + ".1" + "-" + chessType, new Integer[]{
                        row, colunmn});

            if (acrossLine == rightUpAndDown
                    && (acrossLine >= 2 && acrossLine <= 4)
                    && (row != 0 && row != 14))
                hs.put(acrossLine + ".1" + "-" + chessType, new Integer[]{
                        row, colunmn});

            if (upAndDownLine == rightUpAndDown
                    && (upAndDownLine >= 2 && upAndDownLine <= 4)
                    && (row != 0 && row != 14))
                hs.put(upAndDownLine + ".1" + "-" + chessType, new Integer[]{
                        row, colunmn});

            if (upAndDownLine == leftUpAndDown
                    && (upAndDownLine >= 2 && upAndDownLine <= 4)
                    && (row != 0 && row != 14))
                hs.put(upAndDownLine + ".1" + "-" + chessType, new Integer[]{
                        row, colunmn});
        }

        /**
         * @param chess
         * @param chessType 根据当面局势 获得反应的点 <白旗或黑棋>
         * @return
         */
        public HashMap<String, Integer[]> getActionPoints(int[][] chess) {
            HashMap<String, Integer[]> hs = new HashMap<String, Integer[]>();
            int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
            for (int row = 0; row <= 14; row++) {
                for (int column = 0; column <= 14; column++) {
                    if (chess[row][column] == 0) {
                        count1 = stopUpDown(row, column, chess, 1);
                        count2 = stopAcrossLine(row, column, chess, 1);
                        count3 = stopLeftBias(row, column, chess, 1);
                        count4 = stopRightBias(row, column, chess, 1);

                        putToMap(count1, count2, count3, count4, 1,
                                new Integer[]{row, column}, hs, row, column,
                                chess);
                        putBigLevel(count1, count2, count3, count4, 1, row,
                                column, hs);
                        count1 = stopUpDown(row, column, chess, 2);
                        count2 = stopAcrossLine(row, column, chess, 2);
                        count3 = stopLeftBias(row, column, chess, 2);
                        count4 = stopRightBias(row, column, chess, 2);
                        putToMap(count1, count2, count3, count4, 2,
                                new Integer[]{row, column}, hs, row, column,
                                chess);
                        putBigLevel(count1, count2, count3, count4, 2, row,
                                column, hs);
                    }
                }
            }
            return hs;

        }

        /**
         * 判断是否有竖线需要拦截的棋子
         *
         * @param row
         * @param column
         * @param chess
         * @param chessType
         * @return
         */
        private int stopUpDown(int row, int column, int[][] chess, int chessType) {
            int ox = row, oy = column;
            int computeCount = 1;
            int actionType = chessType == getComputeType() ? 1 : 2;
            while (row < 14 && chess[++row][column] != actionType
                    && computeCount <= 5)
                ++computeCount;
            row = ox;
            column = oy;
            while (row > 0 && chess[--row][column] != actionType
                    && computeCount <= 5)
                ++computeCount;
            if (computeCount < 5) {
                row = ox;
                column = oy;
                return 0;

            }
            row = ox;
            column = oy;
            int count = 0;

            while (row > 0 && chess[--row][column] == chessType) {
                ++count;
            }
            row = ox;
            column = oy;
            while (row < 14 && chess[++row][column] == chessType) {
                ++count;

            }
            row = ox;
            column = oy;
            if (filterUpDownLine(row, column, chess, count, chessType))
                return count - 1;

            return count;
        }

        /**
         * 判断是否横线有需要拦截的棋子
         *
         * @param row
         * @param column
         * @param chess
         * @param chessType
         * @return
         */
        private int stopAcrossLine(int row, int column, int[][] chess,
                                   int chessType) {
            int count = 0;
            int ox = row, oy = column;
            int computeCount = 1;
            int actionType = chessType == getComputeType() ? 1 : 2;
            while (column > 0 && chess[row][--column] != actionType
                    && computeCount <= 5)
                ++computeCount;
            row = ox;
            column = oy;
            while (column < 14 && chess[row][++column] != actionType
                    && computeCount <= 5)
                ++computeCount;
            if (computeCount < 5) {
                row = ox;
                column = oy;
                return 0;

            }
            row = ox;
            column = oy;
            while (column > 0 && chess[row][--column] == chessType) {
                ++count;

            }
            row = ox;
            column = oy;
            while (column < 14 && chess[row][++column] == chessType) {
                ++count;

            }
            row = ox;
            column = oy;
            if (filterAcrossLine(row, column, chess, count, chessType))
                return count - 1;

            return count;
        }

        /**
         * 判断左对角线上是否需要拦截
         *
         * @param row
         * @param column
         * @param chess
         * @param chessType
         * @return
         */

        private int stopLeftBias(int row, int column, int[][] chess,
                                 int chessType) {
            int count = 0;
            int ox = row, oy = column;
            int computeCount = 1;
            int actionType = chessType == getComputeType() ? 1 : 2;
            while (row > 0 && column < 14
                    && chess[--row][++column] != actionType
                    && computeCount <= 5)
                ++computeCount;
            row = ox;
            column = oy;
            while (row < 14 && column > 0
                    && chess[++row][--column] != actionType
                    && computeCount <= 5)
                ++computeCount;
            if (computeCount < 5) {
                row = ox;
                column = oy;
                return 0;

            }
            row = ox;
            column = oy;
            while (row > 0 && column < 14
                    && chess[--row][++column] == chessType) {
                ++count;
            }
            row = ox;
            column = oy;
            while (column > 0 && row < 14
                    && chess[++row][--column] == chessType) {
                ++count;
            }
            row = ox;
            column = oy;
            if (filterRight(row, column, chess, count, chessType))
                return count - 1;

            return count;
        }

        /**
         * 判断对角线上是否需要拦截
         *
         * @param row
         * @param column
         * @param chess
         * @param chessType
         * @return
         */

        private int stopRightBias(int row, int column, int[][] chess,
                                  int chessType) {
            int count = 0;
            int ox = row, oy = column;
            int computeCount = 1;
            int actionType = chessType == getComputeType() ? 1 : 2;
            while (row < 14 && column < 14
                    && chess[++row][++column] != actionType
                    && computeCount <= 5)
                ++computeCount;
            row = ox;
            column = oy;
            while (row > 0 && column > 0
                    && chess[--row][--column] != actionType
                    && computeCount <= 5)
                ++computeCount;
            if (computeCount < 5) {
                row = ox;
                column = oy;
                return 0;

            }

            row = ox;
            column = oy;
            while (row < 14 && column < 14
                    && chess[++row][++column] == chessType) {

                ++count;
            }
            row = ox;
            column = oy;
            while (column > 0 && row > 0 && chess[--row][--column] == chessType) {
                ++count;
            }
            row = ox;
            column = oy;
            if (filterLeft(row, column, chess, count, chessType))
                return count - 1;

            return count;
        }

        /**
         * 如果双方既无防守的必要又没有进攻的好棋则要视情况自动选择一步棋
         *
         * @param row
         * @param column
         * @param chess
         * @return
         */
        private Points randomChess(int row, int column, int chess[][]) {

            while (true) {
                if (row < 14 && column < 14 && chess[++row][++column] == 0)
                    return new Points(row, column);
                --row;
                --column;
                if (row > 0 && column < 14 && chess[--row][++column] == 0)
                    return new Points(row, column);
                ++row;
                --column;
                if (row > 0 && chess[--row][column] == 0)
                    return new Points(row, column);
                break;
            }
            return null;

        }

        /**
         * 过滤横线不需要防御的步子
         *
         * @param row
         * @param column
         * @param chess
         * @param computeType 电脑的棋子
         * @return
         */
        private boolean filterAcrossLine(int row, int column, int[][] chess,
                                         int count, int chessType) {
            if (count < 4) {
                if (column + 4 <= 14 && chess[row][column + 4] != chessType
                        && chess[row][column + 4] != 0) {
                    return false;
                }
                if (column - 4 >= 0 && chess[row][column - 4] != chessType
                        && chess[row][column - 4] != 0) {
                    return true;
                }
            }

            return false;
        }

        /**
         * 过滤总线不需要防御的步子
         *
         * @param row
         * @param column
         * @param chess
         * @param computeType
         * @return
         */
        private boolean filterUpDownLine(int row, int column, int[][] chess,
                                         int count, int chessType) {
            if (count < 4) {
                if (row + 4 <= 14 && chess[row + 4][column] != chessType
                        && chess[row + 4][column] != 0) {
                    return true;
                }
                if (row - 4 >= 0 && chess[row - 4][column] != chessType
                        && chess[row - 4][column] != 0) {
                    return true;
                }
            }

            return false;
        }

        /**
         * 过滤左对角线不需要防御的步子 前提条件是
         *
         * @param row
         * @param column
         * @param chess
         * @param computeType
         * @param count
         * @return
         */
        private boolean filterLeft(int row, int column, int[][] chess,
                                   int count, int chessType) {
            if (count < 4) {
                if (row - 4 >= 0 && column - 4 >= 0
                        && chess[row - 4][column - 4] != chessType
                        && chess[row - 4][column - 4] != 0) {
                    return true;
                }
                if (row + 4 <= 14 && column + 4 <= 14
                        && chess[row + 4][column + 4] != chessType
                        && chess[row + 4][column + 4] != 0) {
                    return true;
                }
            }

            return false;
        }

        private boolean filterRight(int row, int column, int[][] chess,
                                    int count, int chessType) {
            if (count < 4) {
                if (row + 4 <= 14 && column - 4 >= 0
                        && chess[row + 4][column - 4] != chessType
                        && chess[row + 4][column - 4] != 0) {
                    return true;
                }
                if (row - 4 >= 0 && column + 4 <= 14
                        && chess[row - 4][column + 4] != chessType
                        && chess[row - 4][column + 4] != 0) {
                    return true;
                }
            }

            return false;
        }

    }

    private static class Points {

        int row;
        int column;

        public Points(int headRow, int headCol) {
            this.row = headRow;
            this.column = headCol;
        }


        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }

    }

    public String input(int[][] chess) {
        boolean w = true;
        int a[] = new int[2];
        for (int i = 0; i < ChessRecord.Length; i++) {
            for (int j = 0; j < ChessRecord.Width; j++) {
                if (chess[i][j] != 0)
                    w = false;
            }
        }
        if (w) {

            return "5 5";
        }
        this.setComputeType(SetLevel.WHITE_CHESS);
        Integer[] point = this.getAction(chess);
        if (null != point && point.length > 0) {
            chess[point[0]][point[1]] = this.getComputeType();

        } else if (null == point || point.length == 0) {
            point = this.randomChesss(column, row, chess);
            chess[point[0]][point[1]] = this.getComputeType();
        }


        return "" + (point[0] + 1) + " " + (point[1] + 1);
    }

    public String parsePlayer1(int count, String scanner) {
        Scanner x = new Scanner(scanner);
        int a1 = Integer.parseInt(x.next());
        int a2 = Integer.parseInt(x.next());
        ChessRecord.a1[count] = a1;
        ChessRecord.a2[count] = a2;// record the column

        Board.chess[a1 - 1][a2 - 1] = SetLevel.BLACK_CHESS;
        Board.printBoard();
        record.printStones1(count);

        return scanner;
    }

    public String parsePlayer2(int count, String scanner) {
        Scanner x = new Scanner(scanner);
        int b1 = Integer.parseInt(x.next());
        int b2 = Integer.parseInt(x.next());
        ChessRecord.b1[count] = b1;
        ChessRecord.b2[count] = b2;
        Board.chess[b1 - 1][b2 - 1] = SetLevel.WHITE_CHESS;
        Board.printBoard();
        record.printStones2(count);

        return scanner;
    }

    public boolean isNoRepeat(int count, String scanner) {
        boolean w = true;
        int b = Integer.parseInt(scanner.substring(0, 1));
        int a = Integer.parseInt(scanner.substring(1));
        for (int i = 0; i < ChessRecord.Length * ChessRecord.Width; i++) {
            if (i != count) {
                if (((a == ChessRecord.a1[i] && b == ChessRecord.a2[i]) || (a == ChessRecord.b1[i] && b == ChessRecord.b2[i]))) {
                    w = false;
                    System.out.println("repeat, input again");
                }
            }
        }
        return w;
    }


    public String input() {

        return this.input(Board.chess);
    }
}
