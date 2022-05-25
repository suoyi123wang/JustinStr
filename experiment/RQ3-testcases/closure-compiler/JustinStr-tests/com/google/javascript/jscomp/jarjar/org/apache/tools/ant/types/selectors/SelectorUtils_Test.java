package com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors;

import org.junit.Test;

public class SelectorUtils_Test {

  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_1_1() throws Exception{

      java.lang.String string0 = "-";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_2_2() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_3_3() throws Exception{

      java.lang.String string0 = "n[mL5lD9USW~&UMToeD jJ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_4_4() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_5_5() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_6_6() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_7_7() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_8_8() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_9_9() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_10_10() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_11_11() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_12_12() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_13_13() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_14_14() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_15_15() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_16_16() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_17_17() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_18_18() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_19_19() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_tokenizePathAsArray_20_20() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.tokenizePathAsArray(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_1_21() throws Exception{

      java.lang.String string0 = "*";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_2_22() throws Exception{

      java.lang.String string0 = "?";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_3_23() throws Exception{

      java.lang.String string0 = "5";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_4_24() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_5_25() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_6_26() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_7_27() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_8_28() throws Exception{

      java.lang.String string0 = "D]9+x|yJD_sbs{!oY%>EcXrrx-u!1<pSk[sx7@YIjlhc^8";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_9_29() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_10_30() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_11_31() throws Exception{

      java.lang.String string0 = " #";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_12_32() throws Exception{

      java.lang.String string0 = "UNl";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_13_33() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_14_34() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_15_35() throws Exception{

      java.lang.String string0 = " ";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_16_36() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_17_37() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_18_38() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_19_39() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



  @Test(timeout = 5000)
  public void test_hasWildcards_20_40() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorUtils.hasWildcards(string0);

  }



}