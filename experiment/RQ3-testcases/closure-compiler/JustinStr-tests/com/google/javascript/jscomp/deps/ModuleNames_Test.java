package com.google.javascript.jscomp.deps;

import org.junit.Test;

public class ModuleNames_Test {

  @Test(timeout = 5000)
  public void test_toModuleName_1_1() throws Exception{

      java.lang.String string0 = "/";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_2_2() throws Exception{

      java.lang.String string0 = "3";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_3_3() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_4_4() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_5_5() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_6_6() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_7_7() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_8_8() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_9_9() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_10_10() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_11_11() throws Exception{

      java.lang.String string0 = "`rV?ZGL'J+cjo1c\\1:";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_12_12() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_13_13() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_14_14() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_15_15() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_16_16() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_17_17() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_18_18() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_19_19() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_toModuleName_20_20() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.deps.ModuleNames.toModuleName(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_1_21() throws Exception{

      java.lang.String string0 = "/";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_2_22() throws Exception{

      java.lang.String string0 = "~";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_3_23() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_4_24() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_5_25() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_6_26() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_7_27() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_8_28() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_9_29() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_10_30() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_11_31() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_12_32() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_13_33() throws Exception{

      java.lang.String string0 = "D~bw/Ja88IHBBdO";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_14_34() throws Exception{

      java.lang.String string0 = "TPARv%EsSl$-x";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_15_35() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_16_36() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_17_37() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_18_38() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_19_39() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



  @Test(timeout = 5000)
  public void test_canonicalizePath_20_40() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.deps.ModuleNames.canonicalizePath(string0);

  }



}