package com.mysql.cj.protocol;

import org.junit.Test;

public class Security_Test {

  @Test(timeout = 5000)
  public void test_scramble411_1_1() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      byte[] byteArray1 = {};
      java.lang.String string2 = "i";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_2_2() throws Exception{

      java.lang.String string0 = " #";
      byte[] byteArray1 = {};
      java.lang.String string2 = "";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_3_3() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      byte[] byteArray1 = {};
      java.lang.String string2 = "<a> </a>";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_4_4() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      byte[] byteArray1 = {};
      java.lang.String string2 = "";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_5_5() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      byte[] byteArray1 = {};
      java.lang.String string2 = " #";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_6_6() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      byte[] byteArray1 = {};
      java.lang.String string2 = " ";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_7_7() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      byte[] byteArray1 = {};
      java.lang.String string2 = " #";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_8_8() throws Exception{

      java.lang.String string0 = "\\n";
      byte[] byteArray1 = {};
      java.lang.String string2 = "<a> </a>";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_9_9() throws Exception{

      java.lang.String string0 = " ";
      byte[] byteArray1 = {};
      java.lang.String string2 = "[0,1]";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_10_10() throws Exception{

      java.lang.String string0 = "a ";
      byte[] byteArray1 = {};
      java.lang.String string2 = "[0,1]";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_11_11() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      byte[] byteArray1 = {};
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_12_12() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      byte[] byteArray1 = {};
      java.lang.String string2 = "a ";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_13_13() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      byte[] byteArray1 = {};
      java.lang.String string2 = "[0,1]";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_14_14() throws Exception{

      java.lang.String string0 = " ";
      byte[] byteArray1 = {};
      java.lang.String string2 = "\\n";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_15_15() throws Exception{

      java.lang.String string0 = "/+=Be\\XL";
      byte[] byteArray1 = {};
      java.lang.String string2 = "[0,1]";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_16_16() throws Exception{

      java.lang.String string0 = " #";
      byte[] byteArray1 = {};
      java.lang.String string2 = "{\"key\":2 }";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_17_17() throws Exception{

      java.lang.String string0 = "a ";
      byte[] byteArray1 = {};
      java.lang.String string2 = " #";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_18_18() throws Exception{

      java.lang.String string0 = "^@D.\\3,LTSY99\\:/L";
      byte[] byteArray1 = {};
      java.lang.String string2 = "<a>Hello World</a>";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_19_19() throws Exception{

      java.lang.String string0 = "\\n";
      byte[] byteArray1 = {};
      java.lang.String string2 = "a ";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



  @Test(timeout = 5000)
  public void test_scramble411_20_20() throws Exception{

      java.lang.String string0 = " #";
      byte[] byteArray1 = {};
      java.lang.String string2 = "\\n";
      com.mysql.cj.protocol.Security.scramble411(string0, byteArray1, string2);

  }



}