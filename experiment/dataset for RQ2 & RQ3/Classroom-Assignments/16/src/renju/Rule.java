package renju;

import renju.Board;

public abstract class Rule {
    protected int search(Stone currentStone, Board board, Direction direction, boolean flag) {
        int count = 0;
        int currentX = currentStone.getX() - 1;
        int currentY = currentStone.getY() - 1;

        while (true) {
            if (flag) {
                currentX = currentX + direction.getDeltaX();
                currentY = currentY + direction.getDeltaY();

            } else {
                currentX = currentX - direction.getDeltaX();
                currentY = currentY - direction.getDeltaY();
            }
            if (currentX < 0 || currentX >= Board.MAX_X || currentY < 0 ||
                    currentY >= Board.MAX_Y) {
                break;
            }

            Stone stone = board.getStones()[currentX][currentY];
            if (stone == null || stone.getColor() != currentStone.getColor()) {
                break;
            }

            count++;
        }

        return count;
    }

    public abstract boolean judge(Stone stone, Board board);


}
