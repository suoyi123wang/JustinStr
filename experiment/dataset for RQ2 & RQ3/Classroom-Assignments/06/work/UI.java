package go;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class UI {
    JFrame f = null;
    JRadioButton r4 = null;
    JRadioButton r5 = null;

    @SuppressWarnings("deprecation")
    UI() {
        f = new JFrame("��ѡ��ʾ��");    // ����һ��JFrame�Ķ��� 
        Container contentPane = f.getContentPane();   // ����һ������  
        contentPane.setLayout(new GridLayout(2, 1));  // ����������ڵĲ��� 
        JPanel p1 = new JPanel();     // ����һ��������p1 
        p1.setLayout(new GridLayout(1, 2));   // ���ò��ֹ������ĸ�ʽ 
        p1.setBorder(BorderFactory.createTitledBorder("ѡ�����"));    // ����3��JRadioButton��ѡ��ť 
        JRadioButton r1 = new JRadioButton("Gomoku");
        JRadioButton r2 = new JRadioButton("Renju");
        p1.add(r1);
        p1.add(r2);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1));
        contentPane.add(p1);
        contentPane.add(p2);
        f.pack();
        f.show();
        f.addWindowListener(new WindowAdapter() {   // ���һ�����ڼ����� 26     
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        new UI();
    }
}


