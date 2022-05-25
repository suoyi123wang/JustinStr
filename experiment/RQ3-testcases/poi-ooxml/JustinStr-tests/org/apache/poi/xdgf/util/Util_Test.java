package org.apache.poi.xdgf.util;

import org.junit.Test;

public class Util_Test {

  @Test(timeout = 5000)
  public void test_countLines_1_1() throws Exception{

      java.lang.String string0 = "\n";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_2_2() throws Exception{

      java.lang.String string0 = "*\n";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_3_3() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_4_4() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_5_5() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_6_6() throws Exception{

      java.lang.String string0 = "a ";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_7_7() throws Exception{

      java.lang.String string0 = "|oY<tv*#BKaQ+tm/iTRF 'B6UpOx*)e]?46uC/cbm)dl`6'";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_8_8() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_9_9() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_10_10() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_11_11() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_12_12() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_13_13() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_14_14() throws Exception{

      java.lang.String string0 = "-%uur{R\\b'c _t'E#|FD},@Mb(%";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_15_15() throws Exception{

      java.lang.String string0 = "";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_16_16() throws Exception{

      java.lang.String string0 = " ";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_17_17() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_18_18() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_19_19() throws Exception{

      java.lang.String string0 = "(ppx7Mj8n1uOf5eP>Idx$^lv3";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



  @Test(timeout = 5000)
  public void test_countLines_20_20() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      org.apache.poi.xdgf.util.Util.countLines(string0);

  }



}