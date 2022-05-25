package UI;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Play.Board;
import Play.Player;
import Play.Rule;
import Play.Stone;

public class GraphicsUI implements UI {

    private JButton[][] b = new JButton[Board.Length][Board.Width];

    public JButton[][] getGBoard() {
        return b;
    }

    public int setHumanOrAI() {
        int i = 0;
        String input = JOptionPane.showInputDialog("请选择游戏玩家的类别:"
                + "1、人机对战(玩家先手)" + "\n" +
                "2、人机对战(电脑先手)" + "\n" +
                "3、人人对战");
        while (true) {

            i = (input.equals("1")) ? HumanAI : (input.equals("2") ? AIHuman : (input
                    .equals("3") ? HumanHuman : 0));
            if (i != 0) {
                System.out.println();
                break;
            } else {
                ShowError();
            }
        }
        return i;
    }

    public int setRule() {
        int i = 0;
        String x = JOptionPane.showInputDialog("请选择游戏规则:" + "/n" +
                "1、Gomoku(无禁手)" + "/n" +
                "2、Renju(有禁手)");
        while (true) {

            i = (x.equals("1")) ? Rule.Gomoku : (x.equals("2") ? Rule.Renju : 0);
            if (i != 0) {
                System.out.println();
                break;
            } else {
                ShowError();
            }
        }
        return i;
    }

    public void printOut() {

    }

//	public Stone Input(Player player) {
//		return player.Graphicsinput();
//	}

    @Override
    public void ShowMessage(String message) {
        JOptionPane.showMessageDialog(null, message);

    }

    @Override
    public void SystemError() {
        JOptionPane.showMessageDialog(null, "系统错误，退出游戏");
        System.exit(0);

    }

    @Override
    public int type() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public void ShowError() {
        JOptionPane.showMessageDialog(null, "输入错误，请重新输入");

    }

    private void InitializeGBoard() {

        for (int i = 0; i < Board.Length; i++) {
            for (int j = 0; j < Board.Width; j++) {
                b[i][j].setBorder(null);
                b[i][j].setContentAreaFilled(false);
            }
        }

    }


    @Override
    public Stone Input(Player player) {
        // GUI输入棋子
        return null;
    }

    @Override
    public String strInput() {
        String str = JOptionPane.showInputDialog("请输入");
        return str;
    }

}
