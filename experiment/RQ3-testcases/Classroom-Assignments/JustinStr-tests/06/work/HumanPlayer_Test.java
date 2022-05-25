package go;

import org.junit.Test;

public class HumanPlayer_Test {

  @Test(timeout = 5000)
  public void test_getStone_1_1() throws Exception{

      String string1 = "M";
      int int2 = -1;
      HumanPlayer humanPlayer0 = new HumanPlayer();
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_2_2() throws Exception{

      String string1 = "";
      int int2 = -1;
      HumanPlayer humanPlayer0 = new HumanPlayer();
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_3_3() throws Exception{

      String string1 = "*_9VaJZ1,8'/ldgz:aq#";
      int int2 = -2147483648;
      HumanPlayer humanPlayer0 = new HumanPlayer();
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_4_4() throws Exception{

      String string1 = "<a> </a>";
      int int2 = 0;
      HumanPlayer humanPlayer0 = new HumanPlayer();
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_5_5() throws Exception{

      String string1 = "\\n";
      int int2 = -1814794217;
      String string3 = "(!l13/rj\\~NH7VN}|B#k[&9j#&}/>aDbb&(#rrv>;5P4q\\k";
      HumanPlayer humanPlayer0 = new HumanPlayer(string3);
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_6_6() throws Exception{

      String string1 = "http://lcs.ios.ac.cn/";
      int int2 = 894106260;
      HumanPlayer humanPlayer0 = new HumanPlayer();
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_7_7() throws Exception{

      String string1 = "{\"key\":2 }";
      int int2 = -1;
      String string3 = "";
      HumanPlayer humanPlayer0 = new HumanPlayer(string3);
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_8_8() throws Exception{

      String string1 = " #";
      int int2 = -2147483648;
      String string3 = "\\n";
      HumanPlayer humanPlayer0 = new HumanPlayer(string3);
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_9_9() throws Exception{

      String string1 = "";
      int int2 = -2147483648;
      HumanPlayer humanPlayer0 = new HumanPlayer();
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_10_10() throws Exception{

      String string1 = "{\"key\":null}";
      int int2 = -2147483648;
      HumanPlayer humanPlayer0 = new HumanPlayer();
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_11_11() throws Exception{

      String string1 = "^[1]([3-9])[0-9]{9}$";
      int int2 = 0;
      String string3 = "\\n";
      HumanPlayer humanPlayer0 = new HumanPlayer(string3);
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_12_12() throws Exception{

      String string1 = "http://lcs.ios.ac.cn/";
      int int2 = 1;
      HumanPlayer humanPlayer0 = new HumanPlayer();
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_13_13() throws Exception{

      String string1 = "[0,1]";
      int int2 = -2147483648;
      String string3 = ".\\a.txt";
      HumanPlayer humanPlayer0 = new HumanPlayer(string3);
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_14_14() throws Exception{

      String string1 = ".\\a.txt";
      int int2 = -1;
      String string3 = "[0,1]";
      HumanPlayer humanPlayer0 = new HumanPlayer(string3);
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_15_15() throws Exception{

      String string1 = "a ";
      int int2 = 0;
      String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      HumanPlayer humanPlayer0 = new HumanPlayer(string3);
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_16_16() throws Exception{

      String string1 = "{\"key\":null}";
      int int2 = 2147483647;
      String string3 = "{\"key\":null}";
      HumanPlayer humanPlayer0 = new HumanPlayer(string3);
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_17_17() throws Exception{

      String string1 = "Efh(n.gB}";
      int int2 = 1;
      HumanPlayer humanPlayer0 = new HumanPlayer();
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_18_18() throws Exception{

      String string1 = "http://lcs.ios.ac.cn/";
      int int2 = -2021690747;
      String string3 = "\\n";
      HumanPlayer humanPlayer0 = new HumanPlayer(string3);
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_19_19() throws Exception{

      String string1 = "{\"key\":null}";
      int int2 = 1;
      String string3 = "<a> </a>";
      HumanPlayer humanPlayer0 = new HumanPlayer(string3);
      humanPlayer0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_20_20() throws Exception{

      String string1 = "^[1]([3-9])[0-9]{9}$";
      int int2 = 0;
      String string3 = "{\"key\":null}";
      HumanPlayer humanPlayer0 = new HumanPlayer(string3);
      humanPlayer0.getStone(string1, int2);

  }



}