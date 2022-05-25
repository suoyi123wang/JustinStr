package homework;

import org.junit.Test;

public class HumanPlayer_Test {

  @Test(timeout = 5000)
  public void test_isLegal_1_1() throws Exception{

      java.lang.String string1 = "\u000F";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_2_2() throws Exception{

      java.lang.String string1 = "\"\u0000";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_3_3() throws Exception{

      java.lang.String string1 = "\u0000";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_4_4() throws Exception{

      java.lang.String string1 = "_\u000F";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_5_5() throws Exception{

      java.lang.String string1 = "";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_6_6() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_7_7() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_8_8() throws Exception{

      java.lang.String string1 = "\\n";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_9_9() throws Exception{

      java.lang.String string1 = "3Q";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_10_10() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_11_11() throws Exception{

      java.lang.String string1 = "";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_12_12() throws Exception{

      java.lang.String string1 = "<a> </a>";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_13_13() throws Exception{

      java.lang.String string1 = " #";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_14_14() throws Exception{

      java.lang.String string1 = "a ";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_15_15() throws Exception{

      java.lang.String string1 = "<a> </a>";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_16_16() throws Exception{

      java.lang.String string1 = "";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_17_17() throws Exception{

      java.lang.String string1 = "<a> </a>";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_18_18() throws Exception{

      java.lang.String string1 = " ";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_19_19() throws Exception{

      java.lang.String string1 = "[0,1]";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



  @Test(timeout = 5000)
  public void test_isLegal_20_20() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      homework.HumanPlayer humanPlayer0 = new homework.HumanPlayer();
      humanPlayer0.isLegal(string1);

  }



}