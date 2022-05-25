package renju;

public class GomokuRule extends Rule {


    public boolean judge(Stone currentStone, Board board) {
        int j = 0;
        int i = 0;
        for (j = 0; j < 4; j++) {
            Direction direction = Direction.DIRECTIONS[j];
            i = 1;
            i = i + this.search(currentStone, board, direction, true);
            i = i + this.search(currentStone, board, direction, false);
            if (i >= 5) {
                return true;
            }
        }
        return false;
    }
}
