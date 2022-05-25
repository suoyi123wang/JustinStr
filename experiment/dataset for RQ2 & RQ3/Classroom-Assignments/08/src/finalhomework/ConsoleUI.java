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
				System.out.println("��ѡ��\n  0.������ս����    1.������ʷս��");
				gameInt = input.nextInt();
				if (gameInt == 0) {
					while (availible) {
						try {
							// choose player.
							System.out
									.println("��ѡ����Ϸ��ң�\n  0.HumanPlayer   1.AIPlayer");
							playerInt = input.nextInt();
							if (playerInt == 1) {
								// choose order to put stone.
								while (availible) {
									try {
										System.out
												.println("��ѡ������˳��\n  0.��ҳֺ�����         1.��ҳְ׺���");
										orderInt = input.nextInt();

										if (orderInt != 0 && orderInt != 1)
											throw new Exception();
										break;
									} catch (Exception e) {
										System.out.println("���벻��ȷ������������");
										continue;
									}
								}

								// choose difficulty of AI.
								while (availible) {
									try {
										System.out
												.println("��ѡ���Ѷȣ� \n  0.����         1.��");
										difficultyInt = input.nextInt();
										if (difficultyInt != 0
												&& difficultyInt != 1)
											throw new Exception();
										break;
									} catch (Exception e) {
										System.out.println("���벻��ȷ������������");
										continue;
									}
								}

							}
							if (playerInt != 1 && playerInt != 0)
								throw new Exception();
							break;
						} catch (Exception e) {
							System.out.println("���벻��ȷ������������");
							continue;
						}
					}

					// choose rule of new game.
					while (availible) {
						try {
							System.out
									.println("��ѡ����Ϸ����\n  0.GomokuRule   1.RenjuRule");
							ruleInt = input.nextInt();
							if (ruleInt != 1 && ruleInt != 0)
								throw new Exception();
							break;
						} catch (Exception e) {
							System.out.println("���벻��ȷ������������");
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
								.println("�Ƿ������Ϸ��\n  0.����     1.�˳�     2.��ΪGUI  ");
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
						System.out.println("���벻��ȷ������������");
						continue;
					}
				}

			} catch (Exception e) {
				System.out.println("���벻��ȷ������������");
				continue;
			}

		}

	}
}
