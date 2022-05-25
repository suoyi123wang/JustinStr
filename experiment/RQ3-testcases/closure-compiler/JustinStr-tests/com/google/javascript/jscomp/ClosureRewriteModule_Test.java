package com.google.javascript.jscomp;

import org.junit.Test;

public class ClosureRewriteModule_Test {

  @Test(timeout = 5000)
  public void test_isModuleExport_1_1() throws Exception{

      java.lang.String string0 = "module$exports$";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_2_2() throws Exception{

      java.lang.String string0 = "'";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_3_3() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_4_4() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_5_5() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_6_6() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_7_7() throws Exception{

      java.lang.String string0 = "+14wc[fW8AUl7hhE-A7$<yBT6pg@TluYb~'";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_8_8() throws Exception{

      java.lang.String string0 = "LOxF\\\"wK_elvB3\\T*UTOU{uvO@j/u.W/D!6fN{u(q0l@Z";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_9_9() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_10_10() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_11_11() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_12_12() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_13_13() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_14_14() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_15_15() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_16_16() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_17_17() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_18_18() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_19_19() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleExport_20_20() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleExport(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_1_21() throws Exception{

      java.lang.String string0 = "module$contents$";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_2_22() throws Exception{

      java.lang.String string0 = "X";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_3_23() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_4_24() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_5_25() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_6_26() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_7_27() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_8_28() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_9_29() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_10_30() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_11_31() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_12_32() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_13_33() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_14_34() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_15_35() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_16_36() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_17_37() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_18_38() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_19_39() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



  @Test(timeout = 5000)
  public void test_isModuleContent_20_40() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.ClosureRewriteModule.isModuleContent(string0);

  }



}