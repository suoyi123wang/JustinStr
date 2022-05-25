package five;

import org.junit.Test;

public class Record_Test {

  @Test(timeout = 5000)
  public void test_noLess_1_1() throws Exception{

      String string0 = "time";
      int int1 = -2147483648;
      int int2 = 697252777;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_2_2() throws Exception{

      String string0 = ">";
      int int1 = 0;
      int int2 = -1;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_3_3() throws Exception{

      String string0 = "I";
      int int1 = 0;
      int int2 = -2147483648;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_4_4() throws Exception{

      String string0 = "name";
      int int1 = 2147483647;
      int int2 = 2147483647;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_5_5() throws Exception{

      String string0 = "<a> </a>";
      int int1 = -1;
      int int2 = 0;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_6_6() throws Exception{

      String string0 = "{\"key\":null}";
      int int1 = 0;
      int int2 = 0;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_7_7() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      int int1 = 0;
      int int2 = 1695954870;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_8_8() throws Exception{

      String string0 = "[0,1]";
      int int1 = 0;
      int int2 = 2147483647;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_9_9() throws Exception{

      String string0 = "<a>Hello World</a>";
      int int1 = -1;
      int int2 = 0;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_10_10() throws Exception{

      String string0 = "a ";
      int int1 = 2147483647;
      int int2 = 522142934;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_11_11() throws Exception{

      String string0 = " ";
      int int1 = 937611956;
      int int2 = -1982491805;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_12_12() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      int int1 = -2147483648;
      int int2 = -1;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_13_13() throws Exception{

      String string0 = " #";
      int int1 = 0;
      int int2 = -2147483648;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_14_14() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      int int1 = -2147483648;
      int int2 = 1;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_15_15() throws Exception{

      String string0 = "a ";
      int int1 = 1;
      int int2 = 2147483647;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_16_16() throws Exception{

      String string0 = "";
      int int1 = 0;
      int int2 = -1;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_17_17() throws Exception{

      String string0 = "{\"key\":null}";
      int int1 = -456958685;
      int int2 = -1;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_18_18() throws Exception{

      String string0 = "{\"key\":2 }";
      int int1 = 1;
      int int2 = -716574952;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_19_19() throws Exception{

      String string0 = "\\n";
      int int1 = 2147483647;
      int int2 = 1;
      Record.noLess(string0, int1, int2);

  }



  @Test(timeout = 5000)
  public void test_noLess_20_20() throws Exception{

      String string0 = "{\"key\":2 }";
      int int1 = -1;
      int int2 = -2005761532;
      Record.noLess(string0, int1, int2);

  }



}