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
	private ChessBoard chessBoard;//��ս���
	private JButton button1, button2,  button3, button4, button5;
	public StartJFrame() {
		setTitle("\u4E94\u5B50\u68CB");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ý���ر��¼�
	
		
		chessBoard = new ChessBoard();//��ʼ��������		
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
		
		
		
		MyItemListener lis = new MyItemListener();//��ʼ����ť�¼��������ڲ���
		button1.addActionListener(lis);//��������ťע������¼�
		button2.addActionListener(lis);
		button3.addActionListener(lis);
		button4.addActionListener(lis);
		button5.addActionListener(lis);	
		
		pack(); // ����Ӧ��С
	}
	private class MyItemListener implements ActionListener {//�¼��������ڲ���

		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource(); // ȡ���¼�Դ
			if ( obj == button1) { 
				// ���¿�ʼ
			  // JFiveFrame.this�ڲ��������ⲿ��
				System.out.println("���¿�ʼ...");
				chessBoard.restartGame();

			} else if (obj == button2) {
				System.exit(0); // ����Ӧ�ó���
			} else if (obj == button3) { // ����
				System.out.println("����");
				chessBoard.goback();
			}else if (obj == button4){
				System.out.println("����");	
				chessBoard.save("test.sav");
			}else if (obj == button5){
				System.out.println("��ȡ");
				chessBoard.loadFromFile("test.sav");
			}
		}
	}
}
