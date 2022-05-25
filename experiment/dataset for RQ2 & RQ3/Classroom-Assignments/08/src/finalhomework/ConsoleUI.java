package finalhomework;

import java.util.Scanner;

public class ConsoleUI implements UI {
	int gameInt, playerInt, ruleInt, orderInt, difficultyInt;

	@Override
	public void start() {

		boolean availible = true;
		while (availible) {
			try {
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);

				// choose type of game.
				System.out.println("请选择：\n  0.开启新战争。    1.继续历史战争");
				gameInt = input.nextInt();
				if (gameInt == 0) {
					while (availible) {
						try {
							// choose player.
							System.out
									.println("请选择游戏玩家：\n  0.HumanPlayer   1.AIPlayer");
							playerInt = input.nextInt();
							if (playerInt == 1) {
								// choose order to put stone.
								while (availible) {
									try {
										System.out
												.println("请选择落子顺序：\n  0.玩家持黑先下         1.玩家持白后下");
										orderInt = input.nextInt();

										if (orderInt != 0 && orderInt != 1)
											throw new Exception();
										break;
									} catch (Exception e) {
										System.out.println("输入不正确，请重新输入");
										continue;
									}
								}

								// choose difficulty of AI.
								while (availible) {
									try {
										System.out
												.println("请选择难度： \n  0.困难         1.简单");
										difficultyInt = input.nextInt();
										if (difficultyInt != 0
												&& difficultyInt != 1)
											throw new Exception();
										break;
									} catch (Exception e) {
										System.out.println("输入不正确，请重新输入");
										continue;
									}
								}

							}
							if (playerInt != 1 && playerInt != 0)
								throw new Exception();
							break;
						} catch (Exception e) {
							System.out.println("输入不正确，请重新输入");
							continue;
						}
					}

					// choose rule of new game.
					while (availible) {
						try {
							System.out
									.println("请选择游戏规则：\n  0.GomokuRule   1.RenjuRule");
							ruleInt = input.nextInt();
							if (ruleInt != 1 && ruleInt != 0)
								throw new Exception();
							break;
						} catch (Exception e) {
							System.out.println("输入不正确，请重新输入");
							continue;
						}
					}

				} else if (gameInt != 1) {
					throw new Exception();
				}
				// game starts.
				new Game1().start(gameInt, playerInt, ruleInt, orderInt,
						difficultyInt);

				while (availible) {
					try {
						System.out
								.println("是否继续游戏？\n  0.继续     1.退出     2.改为GUI  ");
						int s = input.nextInt();
						if (s == 0)
							start();
						else if (s == 1)
							System.exit(0);
						else if (s == 2)
							new GUI().start();
						else
							throw new Exception();
						break;
					} catch (Exception e) {
						System.out.println("输入不正确，请重新输入");
						continue;
					}
				}

			} catch (Exception e) {
				System.out.println("输入不正确，请重新输入");
				continue;
			}

		}

	}
}
