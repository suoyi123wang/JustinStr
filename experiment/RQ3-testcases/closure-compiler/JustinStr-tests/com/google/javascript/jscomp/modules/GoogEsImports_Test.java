package com.google.javascript.jscomp.modules;

import org.junit.Test;

public class GoogEsImports_Test {

  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_1_1() throws Exception{

      java.lang.String string0 = "goog:";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_2_2() throws Exception{

      java.lang.String string0 = "7";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_3_3() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_4_4() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_5_5() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_6_6() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_7_7() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_8_8() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_9_9() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_10_10() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_11_11() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_12_12() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_13_13() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_14_14() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_15_15() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_16_16() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_17_17() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_18_18() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_19_19() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



  @Test(timeout = 5000)
  public void test_isGoogImportSpecifier_20_20() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.modules.GoogEsImports.isGoogImportSpecifier(string0);

  }



}