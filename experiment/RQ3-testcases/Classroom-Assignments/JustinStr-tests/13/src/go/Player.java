package go;

public class Player {

    String coordinate;
    int x;
    int y;
    String color;

    //一般构造方法
    public Player() {
    }

    //带有颜色的构造方法
    public Player(String color) {
        if (color.equals("Black")) {
            this.color = "Black";
        } else if (color.equals("White")) {
            this.color = "White";
        }
    }

    //输出棋子对象
    @SuppressWarnings("null")
    public Stone getStone(String coordinate, int color) {
        //取出横坐标x，并容错判断
        try {
            String substring = coordinate.substring(1);
            if (substring.isEmpty()) {
                x = Integer.parseInt(substring);
                if (x <= 0 || x > 15) {
                    System.out.println("横坐标应该在1到15之间，请重新输入");
                    return null;
                }
            }
        } catch (NumberFormatException exception) {
            System.out.println("格式错误,请重新输入");
            return null;
        }

        //取出纵坐标y，并容错判断
        y = coordinate.charAt(0) - 'A' + 1;
        if (y < 0 || y > 'O' - 'A' + 1) {
            System.out.println("纵坐标应该在A到O之间，请重新输入");
            return null;
        }

        //取出颜色color，并容错判断
        if (color == 1) {
            this.color = Stone.BLACK;
        } else if (color == -1) {
            this.color = Stone.WHITE;
        } else {
            System.out.println("格式错误,请重新输入");
            return null;
        }

        //将取到的值赋给stone
        Stone stone = new Stone(x, y, color);
        return stone;

    }
}
