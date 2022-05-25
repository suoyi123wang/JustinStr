package homework;

public interface SetLevel {
	
	static final int BLACK_CHESS=1;
	static final int WHITE_CHESS=2;
	/**
	 * 代表最低防御等级
	 */
	static final int LEVEL_ONE=1;
	
	static final int LEVEL_TWO=2;
	
	static final int LEVEL_THREE=3;
	
	static final int LEVEL_FOUR=4;
	/**
	 * 电脑攻击最高策略
	 */
	static final String COMPUTE_LEVEL_FIVE="5-1";
	static final String  COMPUTE_LEVEL_FIVE_ONE="5.1-1";
	
	/**
	 * 电脑攻击第四策略
	 */
	static final String COMPUTE_LEVEL_FOUR="4-1";
	static final String  COMPUTE_LEVEL_FOUR_ONE="4.1-1";
	/**
	 * 电脑攻击第三策略
	 */
	static final String COMPUTE_LEVEL_THREE="3-1";
	static final String  COMPUTE_LEVEL_THREE_ONE="3.1-1";
	/**
	 * 电脑攻击第二策略
	 */
	static final String COMPUTE_LEVEL_TWO="2-1";
	static final String  COMPUTE_LEVEL_TWO_ONE="2.1-1";
	/**
	 * 电脑攻击最低策略
	 */
	static final String COMPUTE_LEVEL_ONE="1-1";
	/**
	 * 电脑防御最高策略
	 */
	static final String PLAYER_LEVEL_FIVE="5-2";
	static final String  PLAYER_LEVEL_FIVE_ONE="5.1-2";
	/**
	 * 电脑防御第四策略
	 */
	static final String PLAYER_LEVEL_FOUR="4-2";
	static final String  PLAYER_LEVEL_FOUR_ONE="4.1-2";
	/**
	 * 电脑防御第三策略
	 */
	static final String PLAYER_LEVEL_THREE="3-2";
	static final String  PLAYER_LEVEL_THREE_ONE="3.1-2";
	/**电脑防御第二策略
	 * 
	 */
	static final String PLAYER_LEVEL_TWO="2-2";
	static final String  PLAYER_LEVEL_TWO_ONE="2.1-2";
	/**
	 * 电脑防御最低策略
	 */
	static final String PLAYER_LEVEL_ONE="1-2";
	
	static final String []level={
		COMPUTE_LEVEL_FIVE_ONE,
		PLAYER_LEVEL_FIVE_ONE,
		COMPUTE_LEVEL_FIVE,
		PLAYER_LEVEL_FIVE,
		COMPUTE_LEVEL_FOUR_ONE,
		PLAYER_LEVEL_FOUR_ONE,
		COMPUTE_LEVEL_FOUR,
		PLAYER_LEVEL_FOUR,
		COMPUTE_LEVEL_THREE_ONE,
		PLAYER_LEVEL_THREE_ONE,
		COMPUTE_LEVEL_THREE,
		PLAYER_LEVEL_THREE,
		COMPUTE_LEVEL_TWO_ONE,
		PLAYER_LEVEL_TWO_ONE,
		COMPUTE_LEVEL_TWO,
		PLAYER_LEVEL_TWO,
		COMPUTE_LEVEL_ONE,
		PLAYER_LEVEL_ONE
		};
	
	

}
