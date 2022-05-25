package com.mysql.cj.protocol.a;

import org.junit.Test;

public class NativeProtocol_Test {

  @Test(timeout = 5000)
  public void test_changeDatabase_1_1() throws Exception{

      java.lang.String string1 = "*";
      java.lang.String string3 = "<a> </a>";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.Slf4JLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_2_2() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string3 = "a ";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.StandardLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_3_3() throws Exception{

      java.lang.String string1 = "3_*8O2XMa%w>pvg_x<9zJ.2 `%l?W.dK=>'>\\8";
      java.lang.String string3 = " #";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.Slf4JLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_4_4() throws Exception{

      java.lang.String string1 = "[0,1]";
      java.lang.String string3 = "{\"key\":2 }";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.Slf4JLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_5_5() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string3 = "<a>Hello World</a>";
      boolean boolean4 = true;
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.StandardLogger(string3, boolean4);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_6_6() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.Slf4JLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_7_7() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string3 = "<a>Hello World</a>";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.NullLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_8_8() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string3 = "\\n";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.StandardLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_9_9() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string3 = "a ";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.Slf4JLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_10_10() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string3 = "{\"key\":null}";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.Slf4JLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_11_11() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      java.lang.String string3 = "a ";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.NullLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_12_12() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string3 = "\\n";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.StandardLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_13_13() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string3 = "{\"key\":null}";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.Jdk14Logger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_14_14() throws Exception{

      java.lang.String string1 = "d,tfjywb1}Z\\\"Xxp{g";
      java.lang.String string3 = "";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.Jdk14Logger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_15_15() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.NullLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_16_16() throws Exception{

      java.lang.String string1 = " ";
      java.lang.String string3 = "a ";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.Jdk14Logger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_17_17() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string3 = "<a>Hello World</a>";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.Jdk14Logger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_18_18() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string3 = "MG'\\W\\\"YEgR]t1g!GFkp^$>gy";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.NullLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_19_19() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string3 = "{\"key\":null}";
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.Slf4JLogger(string3);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



  @Test(timeout = 5000)
  public void test_changeDatabase_20_20() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean4 = false;
      com.mysql.cj.log.Log log2 = new com.mysql.cj.log.StandardLogger(string3, boolean4);
      com.mysql.cj.protocol.a.NativeProtocol nativeProtocol0 = new com.mysql.cj.protocol.a.NativeProtocol(log2);
      nativeProtocol0.changeDatabase(string1);

  }



}