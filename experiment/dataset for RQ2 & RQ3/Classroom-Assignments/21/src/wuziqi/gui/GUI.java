package wuziqi.gui;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;

public class GUI extends JFrame {
	CInstead c1 = new CInstead();
	Container c;
	JLabel wuziqiJLabel, beginJLabel, contiLabel, exitLabel;
	public String player1 = null, player2 = null;
	public String player1mode = null, player2mode = null;
	public String rule = null;
	public String[][] board = new String[15][15];
	public String[][] whitenextboard = new String[15][15];
	public String[][] blacknextboard = new String[15][15];
	public boolean continuegame = false;
	public String inputcolor = "B";
	public java.io.File record = null;
	public java.io.File continueFile = null;

//	public GUI() {
//
//	}
//	
//
//	public void whitecloneboard() {
//		for (int i = 0; i < 15; i++) {
//			for (int j = 0; j < 15; j++) {
//				whitenextboard[i][j] = board[i][j];
//			}
//		}
//	}
//
//	public void blackcloneboard() {
//		for (int i = 0; i < 15; i++) {
//			for (int j = 0; j < 15; j++) {
//				blacknextboard[i][j] = board[i][j];
//			}
//		}
//	}
//	public void boardcloneblack() {
//		for (int i = 0; i < 15; i++) {
//			for (int j = 0; j < 15; j++) {
//				 board[i][j] = blacknextboard[i][j];
//			}
//		}
//	}
//	public void boardclonewhite() {
//		for (int i = 0; i < 15; i++) {
//			for (int j = 0; j < 15; j++) {
//				 board[i][j] = whitenextboard[i][j];
//			}
//		}
//	}
//	public void guicloneboard(){
//		for (int i = 0; i < 15; i++) {
//			for (int j = 0; j < 15; j++) {
//				if(board[i][j].equals("● ")){
//					guiboard[i][j].setblack();
//					guiboard[i][j].isclicked = true;
//				}else if(board[i][j].equals("o ")){
//					guiboard[i][j].setwhite();
//					guiboard[i][j].isclicked = true;
//				}else if(board[i][j].equals("+ ")){
//					ImageIcon board00 = new ImageIcon("0.png");
//					ImageIcon board014 = new ImageIcon("1.png");
//					ImageIcon board140 = new ImageIcon("2.png");
//					ImageIcon board1414 = new ImageIcon("3.png");
//					ImageIcon board0_ = new ImageIcon("4.png");
//					ImageIcon board14_ = new ImageIcon("6.png");
//					ImageIcon board_0 = new ImageIcon("5.png");
//					ImageIcon board_14 = new ImageIcon("7.png");
//					ImageIcon boardcentural = new ImageIcon("8.png");
//
//
//								if (i == 0 && j == 0) {
//									guiboard[i][j].setIcon(board00);
//									guiboard[i][j].selfcolor = "null";
//									guiboard[i][j].isclicked = false;
//								}
//								if (i == 0 && j == 14) {
//									guiboard[i][j].setIcon(board014);
//									guiboard[i][j].selfcolor = "null";
//									guiboard[i][j].isclicked = false;
//								}
//								if (i == 0 && j != 0 && j != 14) {
//									guiboard[i][j].setIcon(board0_);
//									guiboard[i][j].selfcolor = "null";
//									guiboard[i][j].isclicked = false;
//								}
//								if (i == 14 && j == 0) {
//									guiboard[i][j].setIcon(board140);
//									guiboard[i][j].selfcolor = "null";
//									guiboard[i][j].isclicked = false;
//								}
//								if (i == 14 && j == 14) {
//									guiboard[i][j].setIcon(board1414);
//									guiboard[i][j].selfcolor = "null";
//									guiboard[i][j].isclicked = false;
//								}
//								if (i == 14 && j != 0 && j != 14) {
//									guiboard[i][j].setIcon(board14_);
//									guiboard[i][j].selfcolor = "null";
//									guiboard[i][j].isclicked = false;
//								}
//								if (j == 0 && i != 0 && i != 14) {
//									guiboard[i][j].setIcon(board_0);
//									guiboard[i][j].selfcolor = "null";
//									guiboard[i][j].isclicked = false;
//								}
//								if (j == 14 && i != 0 && i != 14) {
//									guiboard[i][j].setIcon(board_14);
//									guiboard[i][j].selfcolor = "null";
//									guiboard[i][j].isclicked = false;
//								}
//								if (j != 0 && j != 14 && i != 0 && i != 14) {
//									guiboard[i][j].setIcon(boardcentural);
//									guiboard[i][j].selfcolor = "null";
//									guiboard[i][j].isclicked = false;
//								}
//
//				}
//			}
//		}
//		repaint();
//	}

	public void guibegin() {
//		music music = new music();
//		music.playmusic();
		try{
		setLocationByPlatform(true);
		}catch (Exception e){
			
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				board[i][j] = "+ ";
			}
		}
//		whitecloneboard();
//		blackcloneboard();
		setTitle("杨泽诚的五子棋小游戏");
		setContentPane(c1);
		c = getContentPane();
		c.setLayout(null);

		ImageIcon wuziqi = new ImageIcon(
				"五子棋.png");
		ImageIcon begin = new ImageIcon(
				"开始游戏.png");
		ImageIcon conti = new ImageIcon(
				"读取存档.png");
		ImageIcon exit = new ImageIcon(
				"退出游戏.png");
		wuziqiJLabel = new JLabel(wuziqi);
		wuziqiJLabel.setBounds(180, 100, 300, 120);
		beginJLabel = new JLabel(begin);
		beginJLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("控制台信息：开始新游戏");
				choosemode();
			}
		});
		beginJLabel.setBounds(200, 250, 200, 70);
		contiLabel = new JLabel(conti);
		contiLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				remove(beginJLabel);
				remove(contiLabel);
				remove(exitLabel);
				remove(wuziqiJLabel);
				repaint();
				System.out.println("控制台信息：选择继续游戏");
				continuegame = true;
				System.out.println("请在对话框中选择游戏存档");
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("请选择想要继续的游戏存档");
				fileChooser.showOpenDialog(null);
				try {
					continueFile = fileChooser.getSelectedFile();
				} catch (Exception e3) {

				}
				Scanner scanner = null;
				try {
					scanner = new Scanner(continueFile);
				} catch (FileNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				player1 = scanner.next();
				player1mode = scanner.next();
				player2 = scanner.next();
				player2mode = scanner.next();
				rule = scanner.next();
				inputcolor = scanner.next();

				while (true) {
					try {
						int i = scanner.nextInt();
						int j = scanner.nextInt();
						String color = scanner.next();
						if (color.equals("B")) {
							board[i][j] = "● ";
						} else if (color.equals("W")) {
							board[i][j] = "o ";
						}
					} catch (Exception e2) {
						System.out.println("控制台信息：读取完毕");
						break;
					}
				}
//				whitecloneboard();
//				blackcloneboard();
				continuegame = true;
				guiinput();

			}
		});
		contiLabel.setBounds(200, 330, 200, 70);
		exitLabel = new JLabel(exit);
		exitLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("控制台信息：选择退出游戏");
				setVisible(false);

			}
		});
		exitLabel.setBounds(200, 410, 200, 70);
		add(wuziqiJLabel);
		add(beginJLabel);
		add(contiLabel);
		add(exitLabel);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(750, 600);
		show();
	}

	public void choosemode() {
		JLabel pvpJLabel, pveLabel, eveJLabel, modechooseLabel;

		remove(wuziqiJLabel);
		remove(beginJLabel);
		remove(contiLabel);
		remove(exitLabel);
		repaint();
		ImageIcon modechooseIcon = new ImageIcon(
				"选择对战模式.png");
		ImageIcon PvP = new ImageIcon(
				"人人对战.png");
		ImageIcon PvE = new ImageIcon(
				"人机大战.png");
		ImageIcon EvE = new ImageIcon(
				"机机对战.png");

		modechooseLabel = new JLabel(modechooseIcon);
		modechooseLabel.setBounds(150, 130, 300, 120);
		pvpJLabel = new JLabel(PvP);
		pveLabel = new JLabel(PvE);
		eveJLabel = new JLabel(EvE);

		pvpJLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out
						.println("控制台信息：选择人人对战，player1 = human player2 = human");
				player1 = "human";
				player2 = "human";
				remove(pveLabel);
				remove(pvpJLabel);
				remove(eveJLabel);
				remove(modechooseLabel);
				chooseRule();

			}
		});
		pvpJLabel.setBounds(200, 250, 200, 70);

		pveLabel.setBounds(200, 330, 200, 70);
		pveLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("控制台信息：选择人机大战");
				remove(pveLabel);
				remove(pvpJLabel);
				remove(eveJLabel);
				remove(modechooseLabel);
				firstorsecond();
			}
		});

		eveJLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("控制台信息：选择机机对战");
				remove(pveLabel);
				remove(pvpJLabel);
				remove(eveJLabel);
				remove(modechooseLabel);
				player1 = "AI";
				player2 = "AI";
				firstaimode();
			}
		});
		eveJLabel.setBounds(200, 410, 200, 70);
		add(modechooseLabel);
		add(pvpJLabel);
		add(pveLabel);
		add(eveJLabel);

	}

	public void firstorsecond() {
		repaint();

		ImageIcon firstIcon = new ImageIcon(
				"先手.png");
		ImageIcon secondIcon = new ImageIcon(
				"后手.png");
		ImageIcon forstitleIcon = new ImageIcon(
				"选择您的先后手.png");
		JLabel first, second, firstorsecondtitle;
		first = new JLabel(firstIcon);
		second = new JLabel(secondIcon);
		firstorsecondtitle = new JLabel(forstitleIcon);
		first.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("控制台信息：人为先手");
				player1 = "human";
				player2 = "AI";
				remove(first);
				remove(second);
				remove(firstorsecondtitle);
				secondaimode();

			}
		});
		first.setBounds(200, 250, 200, 70);

		second.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("控制台信息：人为后手");
				player1 = "AI";
				player2 = "human";
				
				remove(first);
				remove(second);
				remove(firstorsecondtitle);
				firstaimode();
			}
		});
		second.setBounds(200, 330, 200, 70);

		firstorsecondtitle.setBounds(150, 130, 300, 120);
		add(first);
		add(second);
		add(firstorsecondtitle);
	}

	public void firstaimode() {
		repaint();
		ImageIcon firstIcon = new ImageIcon(
				"选择先手电脑的策略.png");

		ImageIcon attackIcon = new ImageIcon(
				"进攻型.png");
		ImageIcon defendIcon = new ImageIcon(
				"防御型.png");
		ImageIcon balanceIcon = new ImageIcon(
				"平衡型.png");
		JLabel defendLabel = new JLabel(defendIcon);
		JLabel balanceLabel = new JLabel(balanceIcon);
		JLabel firstLabel = new JLabel(firstIcon);
		JLabel attackLabel = new JLabel(attackIcon);
		attackLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				player1mode = "attack";
				System.out.println("player1mode:" + player1mode);
				remove(balanceLabel);
				remove(attackLabel);
				remove(defendLabel);
				remove(firstLabel);
				if (player2.equals("AI")) {
					System.out.println("enter second ai mode chooser");
					secondaimode();
				}else {
					chooseRule();
				}

			}
		});

		defendLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				player1mode = "defend";
				System.out.println("player1mode:" + player1mode);
				remove(balanceLabel);
				remove(attackLabel);
				remove(defendLabel);
				remove(firstLabel);
				if (player2.equals("AI")) {
					System.out.println("enter second ai mode chooser");
					secondaimode();
				} else {
					chooseRule();
				}

			}
		});

		balanceLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				player1mode = "balance";
				System.out.println("player1mode:" + player1mode);
				remove(balanceLabel);
				remove(attackLabel);
				remove(defendLabel);
				remove(firstLabel);
				if (player2.equals("AI")) {
					System.out.println("enter second ai mode chooser");
					secondaimode();
				} else {
					chooseRule();
				}

			}
		});

		firstLabel.setBounds(150, 100, 300, 120);
		attackLabel.setBounds(200, 250, 200, 70);
		defendLabel.setBounds(200, 330, 200, 70);
		balanceLabel.setBounds(200, 410, 200, 70);
		add(firstLabel);
		add(attackLabel);
		add(defendLabel);
		add(balanceLabel);

	}

	public void secondaimode() {
		repaint();

		ImageIcon secondIcon = new ImageIcon(
				"选择后手电脑的策略.png");
		ImageIcon attackIcon = new ImageIcon(
				"进攻型.png");
		ImageIcon defendIcon = new ImageIcon(
				"防御型.png");
		ImageIcon balanceIcon = new ImageIcon(
				"平衡型.png");

		JLabel secondLabel = new JLabel(secondIcon);
		JLabel attackLabel2 = new JLabel(attackIcon);
		JLabel defendLabel2 = new JLabel(defendIcon);
		JLabel balanceLabel2 = new JLabel(balanceIcon);
		attackLabel2.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				player2mode = "attack";
				remove(balanceLabel2);
				remove(attackLabel2);
				remove(defendLabel2);
				remove(secondLabel);
				chooseRule();
				//
				System.out.println(player1 + player1mode + player2
						+ player2mode);

			}
		});

		defendLabel2.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				player2mode = "defend";
				remove(balanceLabel2);
				remove(attackLabel2);
				remove(defendLabel2);
				remove(secondLabel);
				chooseRule();
				//
				System.out.println(player1 + player1mode + player2
						+ player2mode);
			}
		});

		balanceLabel2.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				player2mode = "balance";
				remove(balanceLabel2);
				remove(attackLabel2);
				remove(defendLabel2);
				remove(secondLabel);
				chooseRule();
				//
				System.out.println(player1 + player1mode + player2
						+ player2mode);

			}
		});

		secondLabel.setBounds(150, 100, 300, 120);
		attackLabel2.setBounds(200, 250, 200, 70);
		defendLabel2.setBounds(200, 330, 200, 70);
		balanceLabel2.setBounds(200, 410, 200, 70);
		add(secondLabel);
		add(attackLabel2);
		add(defendLabel2);
		add(balanceLabel2);
	}

	public void chooseRule() {

		repaint();
		ImageIcon ruleIcon = new ImageIcon(
				"请选择游戏规则.png");
		ImageIcon gomokuIcon = new ImageIcon(
				"无禁手.png");
		ImageIcon yangIcon = new ImageIcon(
				"杨氏禁手.png");

		JLabel gomokuLabel, yangLabel, ruleLabel;
		ruleLabel = new JLabel(ruleIcon);
		ruleLabel.setBounds(150, 120, 300, 120);
		gomokuLabel = new JLabel(gomokuIcon);
		gomokuLabel.setBounds(200, 250, 200, 70);
		yangLabel = new JLabel(yangIcon);
		yangLabel.setBounds(200, 330, 200, 70);

		gomokuLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				rule = "G";
				remove(ruleLabel);
				remove(gomokuLabel);
				remove(yangLabel);
				System.out.println("player1:" + player1 + " " + "player2:"
						+ player2 + " " + "player1mode:" + player1mode + " "
						+ "player2mode:" + player2mode + " " + "rule:" + rule);
				guiinput();
			}
		});
		yangLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				rule = "Y";
				remove(ruleLabel);
				remove(gomokuLabel);
				remove(yangLabel);
				System.out.println("player1:" + player1 + " " + "player2:"
						+ player2 + " " + "player1mode:" + player1mode + " "
						+ "player2mode:" + player2mode + " " + "rule:" + rule);
				guiinput();

			}
		});
		add(ruleLabel);
		add(gomokuLabel);
		add(yangLabel);

	}

	public guichess[][] guiboard = new guichess[15][15];

	public Rule referee;
	public JLabel titlesmallLabel, saveLabel, regretLabel;
	public JPanel panel;

	public void guiinput() {

		ImageIcon titlesmallIcon = new ImageIcon("五子棋small.png");
		ImageIcon regretIcon = new ImageIcon("悔棋small.png");
		ImageIcon saveIcon = new ImageIcon("存档small.png");

		titlesmallLabel = new JLabel(titlesmallIcon);
		regretLabel = new JLabel(regretIcon);
		regretLabel.setVisible(false);
		saveLabel = new JLabel(saveIcon);

		titlesmallLabel.setBounds(30, 0, 200, 80);
		regretLabel.setBounds(500, 250, 150, 50);
		regretLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (!player1.equals("AI") && !player2.equals("AI")) {
					if (inputcolor.equals("B")) {
//						boardcloneblack();
//						guicloneboard();
						repaint();

					} else if (inputcolor.equals("W")) {
//						boardclonewhite();
//						guicloneboard();
						repaint();
					}
				}
			}
		});
		saveLabel.setBounds(500, 310, 150, 50);
		saveLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("控制台信息：保存游戏");
				Record record = new Record();
				try {
					record.save(player1, player2, player1mode, player2mode,
							rule, inputcolor, board);
				} catch (FileNotFoundException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}

			}
		});
		add(titlesmallLabel);
		add(saveLabel);
		add(regretLabel);

		panel = new JPanel();
		panel.setSize(450, 450);
		panel.setLayout(new GridLayout(15, 15));
		panel.setOpaque(false);
		panel.setBounds(30, 80, 450, 450);
		panel.setVisible(true);

		add(panel);

		ImageIcon board00 = new ImageIcon("0.png");
		ImageIcon board014 = new ImageIcon("1.png");
		ImageIcon board140 = new ImageIcon("2.png");
		ImageIcon board1414 = new ImageIcon("3.png");
		ImageIcon board0_ = new ImageIcon("4.png");
		ImageIcon board14_ = new ImageIcon("6.png");
		ImageIcon board_0 = new ImageIcon("5.png");
		ImageIcon board_14 = new ImageIcon("7.png");
		ImageIcon boardcentural = new ImageIcon("8.png");

		for (int i = 0; i < 15; i++) {// 初始化空棋盘
			for (int j = 0; j < 15; j++) {
				if (board[i][j].equals("o ")) {
					guiboard[i][j] = new guichess(null, i, j, board00);
					guiboard[i][j].setwhite();
				}
				if (board[i][j].equals("● ")) {
					guiboard[i][j] = new guichess(null, i, j, board00);
					guiboard[i][j].setblack();
				}
				if (board[i][j].equals("+ ")) {
					if (i == 0 && j == 0) {
						guiboard[i][j] = new guichess(null, i, j, board00);
					}
					if (i == 0 && j == 14) {
						guiboard[i][j] = new guichess(null, i, j, board014);
					}
					if (i == 0 && j != 0 && j != 14) {
						guiboard[i][j] = new guichess(null, i, j, board0_);
					}
					if (i == 14 && j == 0) {
						guiboard[i][j] = new guichess(null, i, j, board140);
					}
					if (i == 14 && j == 14) {
						guiboard[i][j] = new guichess(null, i, j, board1414);
					}
					if (i == 14 && j != 0 && j != 14) {
						guiboard[i][j] = new guichess(null, i, j, board14_);
					}
					if (j == 0 && i != 0 && i != 14) {
						guiboard[i][j] = new guichess(null, i, j, board_0);
					}
					if (j == 14 && i != 0 && i != 14) {
						guiboard[i][j] = new guichess(null, i, j, board_14);
					}
					if (j != 0 && j != 14 && i != 0 && i != 14) {
						guiboard[i][j] = new guichess(null, i, j, boardcentural);
					}

				}
				guiboard[i][j].setVisible(true);
				panel.add(guiboard[i][j]);

			}
		}
		if (player1.equals("AI") && player2.equals("human")
				&& continuegame == false) {
			board[7][7] = "● ";
			guiboard[7][7].setblack();
			guiboard[7][7].isclicked = true;
			System.out.println("先手为电脑，人工放置中心棋子");
		}
		repaint();
		if (rule.equals("G")) {
			referee = new GomokuRule();
		} else if (rule.equals("Y")) {
			referee = new YangRule();
		}
		// startgame();

	}

	JLabel resultLabel = null, restartLabel = null,designerLabel = null;

	public void showresult(int result) {
		remove(titlesmallLabel);
		remove(saveLabel);
		remove(regretLabel);
		remove(panel);
		repaint();
		ImageIcon blackwinIcon = new ImageIcon("黑方胜.png");
		ImageIcon whitewinIcon = new ImageIcon("白方胜.png");
		ImageIcon nonewinIcon = new ImageIcon("平局.png");
		ImageIcon restartIcon = new ImageIcon("重新开始.png");
		ImageIcon designerIcon = new ImageIcon("查看制作人员名单.png");

		if (result == -1) {
			resultLabel = new JLabel(blackwinIcon);
		}
		if (result == 1) {
			resultLabel = new JLabel(whitewinIcon);
		}
		resultLabel.setBounds(150, 200, 300, 120);
		restartLabel = new JLabel(restartIcon);
		restartLabel.setBounds(200, 300, 200, 70);
		designerLabel = new JLabel(designerIcon);
		designerLabel.setBounds(200, 380, 200, 70);
		designerLabel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				showdesigner();
				
			}
		});
		
		restartLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				player1 = null;
				player1mode = null;
				player2 = null;
				player2mode = null;
				rule = null;
				inputcolor = "B";
				remove(restartLabel);
				remove(resultLabel);
				remove(designerLabel);
				repaint();
				guibegin();

			}
		});
		add(resultLabel);
		add(restartLabel);
		add(designerLabel);

	}
	
	public void showdesigner(){
		remove(restartLabel);
		remove(resultLabel);
		remove(designerLabel);
		repaint();
		ImageIcon designIcon = new ImageIcon("制作人员.png");
		JLabel desiLabel = new JLabel(designIcon);
		desiLabel.setBounds(40, 130, 500, 300);
		add(desiLabel);
	}

	class CInstead extends JPanel {
		ImageIcon icon;
		Image img;

		public CInstead() {
			icon = new ImageIcon("水墨风.jpeg");
			img = icon.getImage();
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, null);
		}
	}

	String[][] judgeboard = new String[15][15];
	Player AIPlayer1 = new AIPlayer();
	Player AIPlayer2 = new AIPlayer();

	class guichess extends JLabel {
		private static final long serialVersionUID = 5278504345365770L;
		public int x;
		public int y;
		public Player player;

		public String selfcolor = "null";
		public boolean isclicked = false;

		public ImageIcon whiteIcon1 = new ImageIcon("白色棋子1.png");
		public ImageIcon whiteIcon2 = new ImageIcon("白色棋子2.png");
		public ImageIcon blackIcon1 = new ImageIcon("黑色棋子1.png");
		public ImageIcon blackIcon2 = new ImageIcon("黑色棋子2.png");

		public guichess(Player player, int x, int y, ImageIcon icon) {
			super(icon);
			this.x = x;
			this.y = y;
			this.player = player;
			this.addMouseListener(new MouseListener() {

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO 自动生成的方法存根

				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO 自动生成的方法存根

				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO 自动生成的方法存根

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO 自动生成的方法存根

				}

				@Override
				public void mouseClicked(MouseEvent e) {
					System.out.println(x + "," + y);
					if (isclicked == false) {

						if (player1.equals("human") && player2.equals("human")) {
							isclicked = true;
							if (inputcolor.equals("B")) {
								setblack();
								inputcolor = "W";
								for (int i = 0; i < 15; i++) {
									for (int j = 0; j < 15; j++) {
										if (guiboard[i][j].selfcolor
												.equals("null")) {
											board[i][j] = "+ ";
										} else if (guiboard[i][j].selfcolor
												.equals("B")) {
											board[i][j] = "● ";
										} else if (guiboard[i][j].selfcolor
												.equals("W")) {
											board[i][j] = "o ";
										}
									}
								}
								
								int result = referee.isvictory(board);
								System.out.println("result is:" + result);
								if (result != 0) {
									showresult(result);
								}
//								whitecloneboard();

							} else if (inputcolor.equals("W")) {
								setwhite();
								inputcolor = "B";
								for (int i = 0; i < 15; i++) {
									for (int j = 0; j < 15; j++) {
										if (guiboard[i][j].selfcolor
												.equals("null")) {
											board[i][j] = "+ ";
										} else if (guiboard[i][j].selfcolor
												.equals("B")) {
											board[i][j] = "● ";
										} else if (guiboard[i][j].selfcolor
												.equals("W")) {
											board[i][j] = "o ";
										}
									}
								}
								int result = referee.isvictory(board);
								System.out.println("result is:" + result);
								if (result != 0) {
									showresult(result);
								}
//								blackcloneboard();
							}
						} else if (player1.equals("human")
								&& player2.equals("AI")) {
							isclicked = true;
							setblack();
							inputcolor = "B";
							for (int i = 0; i < 15; i++) {
								for (int j = 0; j < 15; j++) {
									if (guiboard[i][j].selfcolor.equals("null")) {
										board[i][j] = "+ ";
									} else if (guiboard[i][j].selfcolor
											.equals("B")) {
										board[i][j] = "● ";
									} else if (guiboard[i][j].selfcolor
											.equals("W")) {
										board[i][j] = "o ";
									}
								}
							}
							int result = referee.isvictory(board);
							System.out.println("result is:" + result);
							if (result != 0) {
								showresult(result);
							}else {
							AIPlayer2.setmode(player2mode);
							AIPlayer2.setcolor("W");
							Chesswithoutcolor chess = AIPlayer2
									.Playerinput(board);
							int x = chess.getX();
							int y = chess.getY();
							System.out.println(x + " " + y);
							guiboard[x][y].setwhite();
							guiboard[x][y].isclicked = true;
							for (int i = 0; i < 15; i++) {
								for (int j = 0; j < 15; j++) {
									if (guiboard[i][j].selfcolor.equals("null")) {
										board[i][j] = "+ ";
									} else if (guiboard[i][j].selfcolor
											.equals("B")) {
										board[i][j] = "● ";
									} else if (guiboard[i][j].selfcolor
											.equals("W")) {
										board[i][j] = "o ";
									}
								}
							}
//							blackcloneboard();
							repaint();
							int result2 = referee.isvictory(board);
							System.out.println("result is:" + result2);
							if (result2 != 0) {
								showresult(result2);
							}
							}

						} else if (player1.equals("AI")
								&& player2.equals("human")) {
							isclicked = true;
							setwhite();
							inputcolor = "W";
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e1) {
								// TODO 自动生成的 catch 块
								e1.printStackTrace();
							}
							for (int i = 0; i < 15; i++) {
								for (int j = 0; j < 15; j++) {
									if (guiboard[i][j].selfcolor.equals("null")) {
										board[i][j] = "+ ";
									} else if (guiboard[i][j].selfcolor
											.equals("B")) {
										board[i][j] = "● ";
									} else if (guiboard[i][j].selfcolor
											.equals("W")) {
										board[i][j] = "o ";
									}
								}
							}
							
							int result = referee.isvictory(board);
							System.out.println("result is:" + result);
							if (result != 0) {
								showresult(result);
							} else {
							AIPlayer1.setmode(player1mode);
							AIPlayer1.setcolor("B");
							Chesswithoutcolor chess = AIPlayer1
									.Playerinput(board);
							int x = chess.getX();
							int y = chess.getY();
							System.out.println(x + " " + y);
							guiboard[x][y].setblack();
							guiboard[x][y].isclicked = true;
							for (int i = 0; i < 15; i++) {
								for (int j = 0; j < 15; j++) {
									if (guiboard[i][j].selfcolor.equals("null")) {
										board[i][j] = "+ ";
									} else if (guiboard[i][j].selfcolor
											.equals("B")) {
										board[i][j] = "● ";
									} else if (guiboard[i][j].selfcolor
											.equals("W")) {
										board[i][j] = "o ";
									}
								}
							}
//							whitecloneboard();
							repaint();
							
							int result2 = referee.isvictory(board);
							System.out.println("result is:" + result2);
							if (result2 != 0) {
								showresult(result2);
							}
							}
						} else if (player1.equals("AI") && player2.equals("AI")) {
							System.out.println("控制台信息：EvE模式");
							isclicked = false;
							System.out.println(inputcolor);
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e1) {
								// TODO 自动生成的 catch 块
								e1.printStackTrace();
							}
							System.out.println("控制台信息：先手AI");
							for (int i = 0; i < 15; i++) {
								for (int j = 0; j < 15; j++) {
									if (guiboard[i][j].selfcolor.equals("null")) {
										board[i][j] = "+ ";
									} else if (guiboard[i][j].selfcolor
											.equals("B")) {
										board[i][j] = "● ";
									} else if (guiboard[i][j].selfcolor
											.equals("W")) {
										board[i][j] = "o ";
									}
								}
							}
							int result = referee.isvictory(board);
							System.out.println("result is:" + result);
							if (result != 0) {
								showresult(result);
							}else {
							AIPlayer1.setmode(player1mode);
							AIPlayer1.setcolor("B");
							Chesswithoutcolor chess1 = AIPlayer1
									.Playerinput(board);
							int x1 = chess1.getX();
							int y1 = chess1.getY();
							guiboard[x1][y1].setblack();
							inputcolor = "W";
							System.out.println("f" + x1 + " " + y1 + " "
									+ inputcolor);
							repaint();

							System.out.println("控制台信息：后手AI");
							for (int i = 0; i < 15; i++) {
								for (int j = 0; j < 15; j++) {
									if (guiboard[i][j].selfcolor.equals("null")) {
										board[i][j] = "+ ";
									} else if (guiboard[i][j].selfcolor
											.equals("B")) {
										board[i][j] = "● ";
									} else if (guiboard[i][j].selfcolor
											.equals("W")) {
										board[i][j] = "o ";
									}
								}
							}
							int result2 = referee.isvictory(board);
							System.out.println("result is:" + result2);
							if (result2 != 0) {
								showresult(result2);
							}
							AIPlayer2.setmode(player2mode);
							AIPlayer2.setcolor("W");
							Chesswithoutcolor chess2 = AIPlayer2
									.Playerinput(board);
							int x2 = chess2.getX();
							int y2 = chess2.getY();
							guiboard[x2][y2].setwhite();
							inputcolor = "B";
							System.out.println("s" + x2 + " " + y2 + " "
									+ inputcolor);
							repaint();
							}
						}

						for (int i = 0; i < 15; i++) {
							for (int j = 0; j < 15; j++) {
								if (guiboard[i][j].selfcolor.equals("null")) {
									board[i][j] = "+ ";
								} else if (guiboard[i][j].selfcolor.equals("B")) {
									board[i][j] = "● ";
								} else if (guiboard[i][j].selfcolor.equals("W")) {
									board[i][j] = "o ";
								}
							}
						}


					} else if (isclicked == true) {
						System.out.println("控制台信息：该子已被点击过");
					}

				}
			});
		}

		public void setwhite() {
			Random random = new Random();
			int i = random.nextInt(2);
			if (i == 0) {
				setIcon(whiteIcon1);
			} else if (i == 1) {
				setIcon(whiteIcon2);
			}
			selfcolor = "W";
			repaint();

		}

		public void setblack() {
			Random random = new Random();
			int i = random.nextInt(2);
			if (i == 0) {
				setIcon(blackIcon1);
			} else if (i == 1) {
				setIcon(blackIcon2);
			}
			selfcolor = "B";
			repaint();

		}

	}
}