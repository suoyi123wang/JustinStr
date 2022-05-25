package go;

import org.junit.Test;

public class Player_Test {

  @Test(timeout = 5000)
  public void test_getStone_1_1() throws Exception{

      String string1 = "\f";
      int int2 = -1;
      String string3 = "<a>Hello World</a>";
      Player player0 = new AIPlayer(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_2_2() throws Exception{

      String string1 = "";
      int int2 = -2147483648;
      String string3 = "http://lcs.ios.ac.cn/";
      Player player0 = new HumanPlayer(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_3_3() throws Exception{

      String string1 = "<a>Hello World</a>";
      int int2 = 1;
      Player player0 = new Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_4_4() throws Exception{

      String string1 = "<a>Hello World</a>";
      int int2 = -1;
      String string3 = "<a> </a>";
      Player player0 = new AIPlayer(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_5_5() throws Exception{

      String string1 = "{\"key\":2 }";
      int int2 = 2147483647;
      String string3 = "<a>Hello World</a>";
      Player player0 = new HumanPlayer(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_6_6() throws Exception{

      String string1 = "http://lcs.ios.ac.cn/";
      int int2 = -1;
      String string3 = "<a> </a>";
      Player player0 = new HumanPlayer(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_7_7() throws Exception{

      String string1 = " ";
      int int2 = 1;
      String string3 = "\\n";
      Player player0 = new Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_8_8() throws Exception{

      String string1 = " #";
      int int2 = 1;
      Player player0 = new HumanPlayer();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_9_9() throws Exception{

      String string1 = " #";
      int int2 = 1;
      Player player0 = new HumanPlayer();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_10_10() throws Exception{

      String string1 = "<a>Hello World</a>";
      int int2 = -1;
      Player player0 = new Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_11_11() throws Exception{

      String string1 = "<a>Hello World</a>";
      int int2 = 1340908551;
      String string3 = "http://lcs.ios.ac.cn/";
      Player player0 = new Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_12_12() throws Exception{

      String string1 = "\\n";
      int int2 = 1;
      String string3 = "^[1]([3-9])[0-9]{9}$";
      Player player0 = new AIPlayer(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_13_13() throws Exception{

      String string1 = "^[1]([3-9])[0-9]{9}$";
      int int2 = 1;
      Player player0 = new HumanPlayer();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_14_14() throws Exception{

      String string1 = "http://lcs.ios.ac.cn/";
      int int2 = 292756345;
      String string3 = "http://lcs.ios.ac.cn/";
      Player player0 = new AIPlayer(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_15_15() throws Exception{

      String string1 = "^[1]([3-9])[0-9]{9}$";
      int int2 = -2147483648;
      Player player0 = new HumanPlayer();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_16_16() throws Exception{

      String string1 = ".\\a.txt";
      int int2 = 0;
      String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      Player player0 = new AIPlayer(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_17_17() throws Exception{

      String string1 = "^[1]([3-9])[0-9]{9}$";
      int int2 = 2147483647;
      Player player0 = new Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_18_18() throws Exception{

      String string1 = "<a>Hello World</a>";
      int int2 = 134326444;
      Player player0 = new Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_19_19() throws Exception{

      String string1 = ".\\a.txt";
      int int2 = 0;
      String string3 = "{\"key\":null}";
      Player player0 = new Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_20_20() throws Exception{

      String string1 = " #";
      int int2 = 0;
      Player player0 = new Player();
      player0.getStone(string1, int2);

  }



}