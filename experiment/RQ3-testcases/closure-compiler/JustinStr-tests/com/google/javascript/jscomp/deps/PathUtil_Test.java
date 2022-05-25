package com.google.javascript.jscomp.deps;

import org.junit.Test;

public class PathUtil_Test {

  @Test(timeout = 5000)
  public void test_isAbsolute_1_1() throws Exception{

      java.lang.String string0 = "/";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_2_2() throws Exception{

      java.lang.String string0 = "t";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_3_3() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_4_4() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_5_5() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_6_6() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_7_7() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_8_8() throws Exception{

      java.lang.String string0 = "K~P=n\\\"y_A\\\"x[>I?uA\\\"Pqh|,xtt:T\\oF";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_9_9() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_10_10() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_11_11() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_12_12() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_13_13() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_14_14() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_15_15() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_16_16() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_17_17() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_18_18() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_19_19() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



  @Test(timeout = 5000)
  public void test_isAbsolute_20_20() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.deps.PathUtil.isAbsolute(string0);

  }



}