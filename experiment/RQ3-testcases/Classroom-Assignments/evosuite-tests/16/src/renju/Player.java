package renju;

import renju.Stone;

public abstract class Player {
    public abstract Stone nextStone(int x, int y);

    public final static String NAME = "Ä¬ÈÏÍæ¼Ò";

    public static String name;

    public static String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int id;

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private int color;

    public int getColor() {
        return color;
    }

    private void setColor(int color) {
        this.color = color;
    }

    public Player(int id, int color, String name) {
        this.setId(id);
        this.setColor(color);
        this.setName(name);
    }

    public Player(int id, int color) {
        this.setId(id);
        this.setColor(color);
        this.setName(NAME);
    }



}


