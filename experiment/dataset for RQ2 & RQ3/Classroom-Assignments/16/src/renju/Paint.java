package renju;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import renju.GraphicsUI;
import renju.Game;

public class Paint extends JPanel {

    int x;
    int y;
    int color;
    Board board;


    public void setBoard(Board board) {
        this.board = board;
    }


    public void paint(Graphics g) {

        super.paintComponent(g);

        int gap = 50;

        g.setColor(Color.BLACK);

        for (int i = 0; i * 50 <= 700; i++) {
            String getRow = String.valueOf(i + 1);

            if (i == 4 || i == 12) {
                g.fillRoundRect(195, i * 50 - 5, 10, 10, 10, 10);
                g.fillRoundRect(595, i * 50 - 5, 10, 10, 10, 10);
            }
            if (i == 8)
                g.fillRoundRect(395, 395, 10, 10, 10, 10);

            g.drawString(getRow, 30, i * gap + 55);
            g.drawLine(gap, (i + 1) * gap, 700 + gap, (i + 1) * gap);

            for (int j = 0; j * gap <= 700; j++) {
                String line = "ABCDEFGHIJKLMNO";
                String getLine = line.substring(j, j + 1);

                g.drawString(getLine, j * 50 + 45, 30);
                g.drawLine((j + 1) * gap, gap, (j + 1) * gap, 700 + gap);
            }
        }

        for (int k = 0; k < board.MAX_X; k++) {
            for (int l = 0; l < board.MAX_Y; l++) {
                if (board.getStones()[k][l] != null) {
                    if (board.getStones()[k][l].getColor() == 1) {
                        g.setColor(Color.BLACK);
                        g.fillOval((l + 1) * gap - 25, (k + 1) * gap - 25, gap, gap);
                    } else {
                        g.setColor(Color.WHITE);
                        g.fillOval((l + 1) * gap - 25, (k + 1) * gap - 25, gap, gap);
                    }
                }
            }
        }

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }


}
