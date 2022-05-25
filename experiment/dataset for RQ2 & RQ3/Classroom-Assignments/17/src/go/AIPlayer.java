package go;

import go.Board;
import go.Stone;
import go.UI;

public class AIPlayer extends Player {

    public Stone nextStone(Stone[][] board) {

        int count = 0;
        int i = 0, j = 0;
        Stone[] available = new Stone[15 * 15];
        for (i = 0; i < 15; i++) {
            for (j = 0; j < 15; j++) {
                if (board[i][j] == null) {
                    available[count++] = Stone.create(i + 1, j + 1,
                            this.color);
                }
            }
        }
        int next = (int) (Math.random() * count);
        Stone nextStone = available[next];
        UI.writeLine("AI玩家 落子，坐标为"
                + (char) (nextStone.getY() + 'A' - 1) + nextStone.getX());
        return nextStone;
    }

    //带有颜色的构造方法
    public AIPlayer(String color) {
        if (color.equals("Black")) {
            this.color = 1;
        } else if (color.equals("White")) {
            this.color = -1;
        }
    }

    public Stone getStone(AIPlayer aiPlayer) {
        color = aiPlayer.color;
        x = (int) Math.ceil(Math.random() * 15);
        y = (int) Math.ceil(Math.random() * 15);
        Stone stone = new Stone(x, y, color);
        return stone;


    }
}
