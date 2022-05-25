package go;

public class HumanPlayer extends Player {

    public HumanPlayer() {

    }

    //������ɫ�Ĺ��췽��
    public HumanPlayer(String color) {
        if (color.equals("Black")) {
            this.color = 1;
        } else if (color.equals("White")) {
            this.color = -1;
        }
    }

    //������Ӷ���
    @SuppressWarnings("null")
    public Stone getStone(String coordinate, int color) {
        //ȡ��������x�����ݴ��ж�
        if (coordinate.isEmpty()) {
            return null;
        }
        x = Integer.parseInt(coordinate.substring(1));
        if (x <= 0 || x > 15) {
            System.out.println("������Ӧ����1��15֮�䣬����������");
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
            this.color = 1;
        } else {
            this.color = -1;

        }

        //��ȡ����ֵ����stone
        Stone stone = new Stone(x, y, color);
        return stone;

    }

}
