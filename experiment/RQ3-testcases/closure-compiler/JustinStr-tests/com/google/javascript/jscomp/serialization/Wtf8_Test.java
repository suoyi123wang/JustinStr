package com.google.javascript.jscomp.serialization;

import org.junit.Test;

public class Wtf8_Test {

  @Test(timeout = 5000)
  public void test_encodeToWtf8_1_1() throws Exception{

      java.lang.String string0 = "m\u0080";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_2_2() throws Exception{

      java.lang.String string0 = "M\u0000";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_3_3() throws Exception{

      java.lang.String string0 = "\u0800";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_4_4() throws Exception{

      java.lang.String string0 = "\u0000";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_5_5() throws Exception{

      java.lang.String string0 = "F\u0800";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_6_6() throws Exception{

      java.lang.String string0 = "\u0080";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_7_7() throws Exception{

      java.lang.String string0 = "*";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_8_8() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_9_9() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_10_10() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_11_11() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_12_12() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_13_13() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_14_14() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_15_15() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_16_16() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_17_17() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_18_18() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_19_19() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



  @Test(timeout = 5000)
  public void test_encodeToWtf8_20_20() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.serialization.Wtf8.encodeToWtf8(string0);

  }



}