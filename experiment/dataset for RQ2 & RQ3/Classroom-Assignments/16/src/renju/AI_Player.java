package renju;

public class AI_Player extends Player {

    public AI_Player(int id, int color, String name) {
        super(id, color, name);
    }

    public AI_Player(int id, int color) {
        super(id, color, name);
    }


    public int AI_X() {
        return (int) (Math.random() * 14);
    }

    public int AI_Y() {
        String str = "ABCDEFGHIJKLMNO";
        String Y = str.substring((int) (Math.random() * 14));
        int y = Y.charAt(0) - 'A';
        return y;
    }

    public Stone nextStone(int x, int y) {
        x = this.AI_X();
        y = this.AI_Y();
        return Stone.create(x, y, this.getColor());
    }

}