package go;

public class Player {

    String coordinate;
    int x;
    int y;
    String color;

    //һ�㹹�췽��
    public Player() {
    }

    //������ɫ�Ĺ��췽��
    public Player(String color) {
        if (color.equals("Black")) {
            this.color = "Black";
        } else if (color.equals("White")) {
            this.color = "White";
        }
    }

    //������Ӷ���
    @SuppressWarnings("null")
    public Stone getStone(String coordinate, int color) {
        //ȡ��������x�����ݴ��ж�
        try {
            String substring = coordinate.substring(1);
            if (substring.isEmpty()) {
                x = Integer.parseInt(substring);
                if (x <= 0 || x > 15) {
                    System.out.println("������Ӧ����1��15֮�䣬����������");
                    return null;
                }
            }
        } catch (NumberFormatException exception) {
            System.out.println("��ʽ����,����������");
            return null;
        }

        //ȡ��������y�����ݴ��ж�
        y = coordinate.charAt(0) - 'A' + 1;
        if (y < 0 || y > 'O' - 'A' + 1) {
            System.out.println("������Ӧ����A��O֮�䣬����������");
            return null;
        }

        //ȡ����ɫcolor�����ݴ��ж�
        if (color == 1) {
            this.color = Stone.BLACK;
        } else if (color == -1) {
            this.color = Stone.WHITE;
        } else {
            System.out.println("��ʽ����,����������");
            return null;
        }

        //��ȡ����ֵ����stone
        Stone stone = new Stone(x, y, color);
        return stone;

    }
}
