package go;

import org.junit.Test;

public class Player_Test {

  @Test(timeout = 5000)
  public void test_getStone_1_1() throws Exception{

      java.lang.String string1 = "\\r";
      int int2 = -1;
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      go.Player player0 = new go.Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_2_2() throws Exception{

      java.lang.String string1 = ")";
      int int2 = -99715369;
      go.Player player0 = new go.Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_3_3() throws Exception{

      java.lang.String string1 = "";
      int int2 = -2147483648;
      go.Player player0 = new go.Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_4_4() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      int int2 = 2147483647;
      java.lang.String string3 = "{\"key\":null}";
      go.Player player0 = new go.Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_5_5() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      int int2 = 2147483647;
      go.Player player0 = new go.Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_6_6() throws Exception{

      java.lang.String string1 = "[0,1]";
      int int2 = 1;
      java.lang.String string3 = " #";
      go.Player player0 = new go.Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_7_7() throws Exception{

      java.lang.String string1 = " #";
      int int2 = 1;
      go.Player player0 = new go.Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_8_8() throws Exception{

      java.lang.String string1 = "[0,1]";
      int int2 = -2147483648;
      go.Player player0 = new go.Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_9_9() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      int int2 = -2147483648;
      java.lang.String string3 = "";
      go.Player player0 = new go.Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_10_10() throws Exception{

      java.lang.String string1 = "a ";
      int int2 = 0;
      go.Player player0 = new go.Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_11_11() throws Exception{

      java.lang.String string1 = "OlSUoxjN\\\"*}o00+0J!^Mu@l7G+c{z#23+C#zE<";
      int int2 = 155154100;
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      go.Player player0 = new go.Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_12_12() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      int int2 = 2147483647;
      java.lang.String string3 = "[0,1]";
      go.Player player0 = new go.Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_13_13() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      int int2 = -1;
      go.Player player0 = new go.Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_14_14() throws Exception{

      java.lang.String string1 = "a ";
      int int2 = -563213647;
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      go.Player player0 = new go.Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_15_15() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      int int2 = 1;
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      go.Player player0 = new go.Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_16_16() throws Exception{

      java.lang.String string1 = "\\n";
      int int2 = 1;
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      go.Player player0 = new go.Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_17_17() throws Exception{

      java.lang.String string1 = "[0,1]";
      int int2 = 1;
      java.lang.String string3 = "\\n";
      go.Player player0 = new go.Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_18_18() throws Exception{

      java.lang.String string1 = " #";
      int int2 = -1;
      go.Player player0 = new go.Player();
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_19_19() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      int int2 = -2147483648;
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      go.Player player0 = new go.Player(string3);
      player0.getStone(string1, int2);

  }



  @Test(timeout = 5000)
  public void test_getStone_20_20() throws Exception{

      java.lang.String string1 = "";
      int int2 = 0;
      go.Player player0 = new go.Player();
      player0.getStone(string1, int2);

  }



}