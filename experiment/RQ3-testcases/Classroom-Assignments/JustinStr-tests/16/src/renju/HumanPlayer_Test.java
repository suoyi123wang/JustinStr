package renju;

import org.junit.Test;

public class HumanPlayer_Test {

  @Test(timeout = 5000)
  public void test_parseStone_1_1() throws Exception{

      String string1 = "@";
      int int2 = 1;
      int int3 = 0;
      String string4 = "^[1]([3-9])[0-9]{9}$";
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3, string4);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_2_2() throws Exception{

      String string1 = "";
      int int2 = 0;
      int int3 = -2147483648;
      String string4 = "\\n";
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3, string4);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_3_3() throws Exception{

      String string1 = "F\\\"'M?+e2UysEwF[)xhd__}VRWgAho@%@QDsngW>8b;``*uA/";
      int int2 = -1;
      int int3 = -1;
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_4_4() throws Exception{

      String string1 = "<a> </a>";
      int int2 = 2147483647;
      int int3 = -2147483648;
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_5_5() throws Exception{

      String string1 = ".\\a.txt";
      int int2 = 1;
      int int3 = 322488168;
      String string4 = "<a>Hello World</a>";
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3, string4);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_6_6() throws Exception{

      String string1 = "{\"key\":2 }";
      int int2 = 1;
      int int3 = -1;
      String string4 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3, string4);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_7_7() throws Exception{

      String string1 = "<a>Hello World</a>";
      int int2 = -1597058245;
      int int3 = 2147483647;
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_8_8() throws Exception{

      String string1 = " #";
      int int2 = 1;
      int int3 = -1;
      String string4 = "<a>Hello World</a>";
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3, string4);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_9_9() throws Exception{

      String string1 = "";
      int int2 = 0;
      int int3 = -1;
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_10_10() throws Exception{

      String string1 = "<a>Hello World</a>";
      int int2 = 2147483647;
      int int3 = 284447131;
      String string4 = "{\"key\":null}";
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3, string4);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_11_11() throws Exception{

      String string1 = "\\n";
      int int2 = 0;
      int int3 = 1450155051;
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_12_12() throws Exception{

      String string1 = "http://lcs.ios.ac.cn/";
      int int2 = 2084426392;
      int int3 = 1;
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_13_13() throws Exception{

      String string1 = "a ";
      int int2 = 0;
      int int3 = -1;
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_14_14() throws Exception{

      String string1 = " #";
      int int2 = -2147483648;
      int int3 = 0;
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_15_15() throws Exception{

      String string1 = "http://lcs.ios.ac.cn/";
      int int2 = 0;
      int int3 = -2147483648;
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_16_16() throws Exception{

      String string1 = "\\n";
      int int2 = 2147483647;
      int int3 = -62961877;
      String string4 = "[0,1]";
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3, string4);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_17_17() throws Exception{

      String string1 = " ";
      int int2 = 2147483647;
      int int3 = 1;
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_18_18() throws Exception{

      String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      int int2 = 2147483647;
      int int3 = 1;
      String string4 = "http://lcs.ios.ac.cn/";
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3, string4);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_19_19() throws Exception{

      String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      int int2 = 0;
      int int3 = -215016;
      String string4 = "<a> </a>";
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3, string4);
      humanPlayer0.parseStone(string1);

  }



  @Test(timeout = 5000)
  public void test_parseStone_20_20() throws Exception{

      String string1 = "[0,1]";
      int int2 = 0;
      int int3 = -2147483648;
      HumanPlayer humanPlayer0 = new HumanPlayer(int2, int3);
      humanPlayer0.parseStone(string1);

  }



}