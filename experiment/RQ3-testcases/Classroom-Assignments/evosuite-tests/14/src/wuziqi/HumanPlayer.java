package wuziqi;

import wuziqi.Stone;

public class HumanPlayer extends Player {

    public HumanPlayer(int id, int color) {
        super(id, color);

    }

    public Stone parseStone(String stone) {
        if (!stone.isEmpty()) {
            int x = Integer.parseInt(stone.substring(2));
            int y = stone.charAt(0) - 'A' + 1;
            return Stone.create(x, y, this.getColor());
        }
        return null;


    }
}
