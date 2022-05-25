package com.mysql.cj;

import org.junit.Test;

public class MysqlType_Test {

  @Test(timeout = 5000)
  public void test_getByName_1_1() throws Exception{

      java.lang.String string0 = "(";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_2_2() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_3_3() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_4_4() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_5_5() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_6_6() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_7_7() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_8_8() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_9_9() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_10_10() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_11_11() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_12_12() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_13_13() throws Exception{

      java.lang.String string0 = "EyaVBkWb55B\\\"LkIXagmc]T/urV'G_LQ'2g@M|m9&;$Kc;IZsa";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_14_14() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_15_15() throws Exception{

      java.lang.String string0 = "a ";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_16_16() throws Exception{

      java.lang.String string0 = " #";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_17_17() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_18_18() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_19_19() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.MysqlType.getByName(string0);

  }



  @Test(timeout = 5000)
  public void test_getByName_20_20() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.MysqlType.getByName(string0);

  }



}