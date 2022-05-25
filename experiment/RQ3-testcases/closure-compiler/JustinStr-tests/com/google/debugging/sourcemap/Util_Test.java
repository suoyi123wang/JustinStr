package com.google.debugging.sourcemap;

import org.junit.Test;

public class Util_Test {

  @Test(timeout = 5000)
  public void test_escapeString_1_1() throws Exception{

      java.lang.String string0 = "";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_2_2() throws Exception{

      java.lang.String string0 = "E-";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_3_3() throws Exception{

      java.lang.String string0 = "\u001F";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_4_4() throws Exception{

      java.lang.String string0 = "]";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_5_5() throws Exception{

      java.lang.String string0 = "U";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_6_6() throws Exception{

      java.lang.String string0 = "&]";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_7_7() throws Exception{

      java.lang.String string0 = ">";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_8_8() throws Exception{

      java.lang.String string0 = "";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_9_9() throws Exception{

      java.lang.String string0 = "<\u001F";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_10_10() throws Exception{

      java.lang.String string0 = "-";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_11_11() throws Exception{

      java.lang.String string0 = "";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_12_12() throws Exception{

      java.lang.String string0 = "a ";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_13_13() throws Exception{

      java.lang.String string0 = "a ";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_14_14() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_15_15() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_16_16() throws Exception{

      java.lang.String string0 = " #";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_17_17() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_18_18() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_19_19() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



  @Test(timeout = 5000)
  public void test_escapeString_20_20() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.debugging.sourcemap.Util.escapeString(string0);

  }



}