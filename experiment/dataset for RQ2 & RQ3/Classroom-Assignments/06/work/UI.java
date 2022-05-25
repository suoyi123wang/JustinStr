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
        f = new JFrame("单选框示例");    // 创建一个JFrame的对象 
        Container contentPane = f.getContentPane();   // 创建一个容器  
        contentPane.setLayout(new GridLayout(2, 1));  // 设置这个窗口的布局 
        JPanel p1 = new JPanel();     // 创建一个面板对象p1 
        p1.setLayout(new GridLayout(1, 2));   // 设置布局管理器的格式 
        p1.setBorder(BorderFactory.createTitledBorder("选择规则"));    // 定义3个JRadioButton单选按钮 
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
        f.addWindowListener(new WindowAdapter() {   // 添加一个窗口监听器 26     
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        new UI();
    }
}


