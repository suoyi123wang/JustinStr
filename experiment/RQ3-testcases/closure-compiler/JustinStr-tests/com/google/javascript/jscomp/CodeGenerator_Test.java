package com.google.javascript.jscomp;

import org.junit.Test;

public class CodeGenerator_Test {

  @Test(timeout = 5000)
  public void test_isSimpleNumber_1_1() throws Exception{

      java.lang.String string0 = "0";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_2_2() throws Exception{

      java.lang.String string0 = "\u000B9";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_3_3() throws Exception{

      java.lang.String string0 = "9";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_4_4() throws Exception{

      java.lang.String string0 = "N0";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_5_5() throws Exception{

      java.lang.String string0 = "(";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_6_6() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_7_7() throws Exception{

      java.lang.String string0 = "wr";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_8_8() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_9_9() throws Exception{

      java.lang.String string0 = "*5'q!1B";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_10_10() throws Exception{

      java.lang.String string0 = "xg}%";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_11_11() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_12_12() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_13_13() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_14_14() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_15_15() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_16_16() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_17_17() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_18_18() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_19_19() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_isSimpleNumber_20_20() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_1_21() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_2_22() throws Exception{

      java.lang.String string0 = "\u001F";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_3_23() throws Exception{

      java.lang.String string0 = "M";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_4_24() throws Exception{

      java.lang.String string0 = "=";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_5_25() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_6_26() throws Exception{

      java.lang.String string0 = "q\u001F";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_7_27() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_8_28() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_9_29() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_10_30() throws Exception{

      java.lang.String string0 = "\\n";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_11_31() throws Exception{

      java.lang.String string0 = "";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_12_32() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_13_33() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_14_34() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_15_35() throws Exception{

      java.lang.String string0 = "Y!+K@\\eT#g~R:M:99`}Dg%}w,O6k.L,";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_16_36() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_17_37() throws Exception{

      java.lang.String string0 = "a ";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_18_38() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_19_39() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



  @Test(timeout = 5000)
  public void test_identifierEscape_20_40() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.google.javascript.jscomp.CodeGenerator.identifierEscape(string0);

  }



}