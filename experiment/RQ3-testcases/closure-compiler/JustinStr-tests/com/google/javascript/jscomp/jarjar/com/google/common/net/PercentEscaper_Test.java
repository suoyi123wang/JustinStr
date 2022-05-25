package com.google.javascript.jscomp.jarjar.com.google.common.net;

import org.junit.Test;

public class PercentEscaper_Test {

  @Test(timeout = 5000)
  public void test_escape_1_1() throws Exception{

      java.lang.String string1 = ")";
      java.lang.String string2 = "\\n";
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_2_2() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_3_3() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_4_4() throws Exception{

      java.lang.String string1 = "Gj^AfGv'A]7~ZYB\\\"";
      java.lang.String string2 = "";
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_5_5() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = ".\\a.txt";
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_6_6() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = "<a> </a>";
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_7_7() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_8_8() throws Exception{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_9_9() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "<a>Hello World</a>";
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_10_10() throws Exception{

      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = " #";
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_11_11() throws Exception{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "\\n";
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_12_12() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_13_13() throws Exception{

      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "";
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_14_14() throws Exception{

      java.lang.String string1 = "Y\\\"l0tWG";
      java.lang.String string2 = "{\"key\":null}";
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_15_15() throws Exception{

      java.lang.String string1 = "a ";
      java.lang.String string2 = "ii)`0]@18]dj<p&`I)0*";
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_16_16() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_17_17() throws Exception{

      java.lang.String string1 = ".o>O3Kya~kA#";
      java.lang.String string2 = "\\n";
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_18_18() throws Exception{

      java.lang.String string1 = "a ";
      java.lang.String string2 = "a ";
      boolean boolean3 = true;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_19_19() throws Exception{

      java.lang.String string1 = "\\n";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



  @Test(timeout = 5000)
  public void test_escape_20_20() throws Exception{

      java.lang.String string1 = "";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean3 = false;
      com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper percentEscaper0 = new com.google.javascript.jscomp.jarjar.com.google.common.net.PercentEscaper(string2, boolean3);
      percentEscaper0.escape(string1);

  }



}