package renju;

import javax.swing.JOptionPane;

public class HumanPlayer extends Player {

    //int undo =JOptionPane.showConfirmDialog(null, "是否悔棋？");

    public HumanPlayer(int id, int color, String name) {
        super(id, color, name);

    }

    public HumanPlayer(int id, int color) {
        super(id, color, NAME);
    }


    private String location = JOptionPane.showInputDialog("请" + HumanPlayer.getName() + "输入坐标(如A2)：");


    public int location_x() {
        int x = Integer.parseInt(location.substring(1, location.length()));
        return x;
    }

    public int location_y() {
        int y = location.charAt(0) - 'A' + 1;
        return y;
    }

    public Stone nextStone(int x, int y) {

        x = this.location_x();
        y = this.location_y();
        return Stone.create(x, y, this.getColor());
    }

    public Stone parseStone(String stone) {
        int x;
        int y;
        if (stone.isEmpty()) {
            return null;
        }
        x = Integer.parseInt(stone.substring(2, stone.length()));
        y = stone.charAt(0) - 'A' + 1;
        return Stone.create(x, y, this.getColor());
    }

}
