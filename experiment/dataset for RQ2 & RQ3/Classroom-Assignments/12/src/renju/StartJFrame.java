package renju;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;





public class StartJFrame extends JFrame {
	private ChessBoard chessBoard;//对战面板
	private JButton button1, button2,  button3, button4, button5;
	public StartJFrame() {
		setTitle("\u4E94\u5B50\u68CB");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置界面关闭事件
	
		
		chessBoard = new ChessBoard();//初始化面板对象		
		getContentPane().add(chessBoard, BorderLayout.CENTER);
		
		JPanel tools = new JPanel();
		getContentPane().add(tools, BorderLayout.EAST);
		tools.setLayout(new GridLayout(5, 1, 10, 10));
		
		  button1= new JButton("\u5F00\u59CB");
		tools.add(button1);
		
		 button2= new JButton("\u9000\u51FA");
		tools.add(button2);
		
		  button3= new JButton("\u6094\u68CB");
		tools.add(button3);
		
		  button4= new JButton("\u4FDD\u5B58");
		tools.add(button4);
		
		 button5 = new JButton("\u8BFB\u53D6");
		tools.add(button5);
		
		
		
		MyItemListener lis = new MyItemListener();//初始化按钮事件监听器内部类
		button1.addActionListener(lis);//将三个按钮注册监听事件
		button2.addActionListener(lis);
		button3.addActionListener(lis);
		button4.addActionListener(lis);
		button5.addActionListener(lis);	
		
		pack(); // 自适应大小
	}
	private class MyItemListener implements ActionListener {//事件监听器内部类

		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource(); // 取得事件源
			if ( obj == button1) { 
				// 重新开始
			  // JFiveFrame.this内部类引用外部类
				System.out.println("重新开始...");
				chessBoard.restartGame();

			} else if (obj == button2) {
				System.exit(0); // 结束应用程序
			} else if (obj == button3) { // 悔棋
				System.out.println("悔棋");
				chessBoard.goback();
			}else if (obj == button4){
				System.out.println("保存");	
				chessBoard.save("test.sav");
			}else if (obj == button5){
				System.out.println("读取");
				chessBoard.loadFromFile("test.sav");
			}
		}
	}
}
