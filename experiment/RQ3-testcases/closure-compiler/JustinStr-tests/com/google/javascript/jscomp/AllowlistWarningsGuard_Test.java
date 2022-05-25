package com.google.javascript.jscomp;

import org.junit.Test;

public class AllowlistWarningsGuard_Test {

  @Test(timeout = 5000)
  public void test_getFirstLine_1_1() throws Exception{

      java.lang.String string0 = "\n";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_2_2() throws Exception{

      java.lang.String string0 = "}\n";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_3_3() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_4_4() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_5_5() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_6_6() throws Exception{

      java.lang.String string0 = "<Jb7``s";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_7_7() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_8_8() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_9_9() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_10_10() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_11_11() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_12_12() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_13_13() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_14_14() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_15_15() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_16_16() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_17_17() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_18_18() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_19_19() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



  @Test(timeout = 5000)
  public void test_getFirstLine_20_20() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.AllowlistWarningsGuard.getFirstLine(string0);

  }



}