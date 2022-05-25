package org.apache.commons.io;

import org.junit.Test;

public class FileUtils_Test {

  @Test(timeout = 5000)
  public void test_decodeUrl_1_1() throws Exception{

      String string0 = "%";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_2_2() throws Exception{

      String string0 = "%";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_3_3() throws Exception{

      String string0 = "!%";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_4_4() throws Exception{

      String string0 = ";%";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_5_5() throws Exception{

      String string0 = "3";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_6_6() throws Exception{

      String string0 = "";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_7_7() throws Exception{

      String string0 = "\\n";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_8_8() throws Exception{

      String string0 = "\\n";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_9_9() throws Exception{

      String string0 = "<a> </a>";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_10_10() throws Exception{

      String string0 = "";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_11_11() throws Exception{

      String string0 = "<a>Hello World</a>";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_12_12() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_13_13() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_14_14() throws Exception{

      String string0 = "\\n";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_15_15() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_16_16() throws Exception{

      String string0 = " ";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_17_17() throws Exception{

      String string0 = "http://lcs.ios.ac.cn/";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_18_18() throws Exception{

      String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_19_19() throws Exception{

      String string0 = "^[1]([3-9])[0-9]{9}$";
      FileUtils.decodeUrl(string0);

  }



  @Test(timeout = 5000)
  public void test_decodeUrl_20_20() throws Exception{

      String string0 = " #";
      FileUtils.decodeUrl(string0);

  }



}