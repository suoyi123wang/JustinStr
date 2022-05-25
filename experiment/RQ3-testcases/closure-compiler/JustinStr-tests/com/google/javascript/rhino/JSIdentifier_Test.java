package com.google.javascript.rhino;

import org.junit.Test;

public class JSIdentifier_Test {

  @Test(timeout = 5000)
  public void test_isJSIdentifier_1_1() throws Exception{

      java.lang.String string0 = "X";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_2_2() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_3_3() throws Exception{

      java.lang.String string0 = "kn";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_4_4() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_5_5() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_6_6() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_7_7() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_8_8() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_9_9() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_10_10() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_11_11() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_12_12() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_13_13() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_14_14() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_15_15() throws Exception{

      java.lang.String string0 = "J^~EXUnSW&ael:&>2 uza9+NH%lg-/~A?w";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_16_16() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_17_17() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_18_18() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_19_19() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isJSIdentifier_20_20() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.rhino.JSIdentifier.isJSIdentifier(string0);

  }



}