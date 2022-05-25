package judge;

import org.junit.Test;

public class Rule_Test {

  @Test(timeout = 5000)
  public void test_ifCorrect_1_1() throws Exception{

      String string0 = "[";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_2_2() throws Exception{

      String string0 = "vHO";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_3_3() throws Exception{

      String string0 = "!(";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_4_4() throws Exception{

      String string0 = "[0,1]";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_5_5() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_6_6() throws Exception{

      String string0 = " #";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_7_7() throws Exception{

      String string0 = "{\"key\":2 }";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_8_8() throws Exception{

      String string0 = "[0,1]";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_9_9() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_10_10() throws Exception{

      String string0 = ".\\a.txt";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_11_11() throws Exception{

      String string0 = " ";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_12_12() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_13_13() throws Exception{

      String string0 = "[0,1]";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_14_14() throws Exception{

      String string0 = "\\n";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_15_15() throws Exception{

      String string0 = "{\"key\":2 }";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_16_16() throws Exception{

      String string0 = "<a> </a>";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_17_17() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_18_18() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_19_19() throws Exception{

      String string0 = " #";
      Rule.ifCorrect(string0);

  }



  @Test(timeout = 5000)
  public void test_ifCorrect_20_20() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      Rule.ifCorrect(string0);

  }



}