package com.google.javascript.jscomp;

import org.junit.Test;

public class GoogleCodingConvention_Test {

  @Test(timeout = 5000)
  public void test_isConstant_1_1() throws Exception{

      java.lang.String string1 = "E$";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_2_2() throws Exception{

      java.lang.String string1 = "$";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_3_3() throws Exception{

      java.lang.String string1 = "";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_4_4() throws Exception{

      java.lang.String string1 = "84";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_5_5() throws Exception{

      java.lang.String string1 = "t";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_6_6() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_7_7() throws Exception{

      java.lang.String string1 = "";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_8_8() throws Exception{

      java.lang.String string1 = " ";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_9_9() throws Exception{

      java.lang.String string1 = "\\n";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_10_10() throws Exception{

      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_11_11() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_12_12() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_13_13() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_14_14() throws Exception{

      java.lang.String string1 = " ";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_15_15() throws Exception{

      java.lang.String string1 = " ";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_16_16() throws Exception{

      java.lang.String string1 = "{\"key\":2 }";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_17_17() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_18_18() throws Exception{

      java.lang.String string1 = "czXG=1\\\"5Q;[ka'MIz[of";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_19_19() throws Exception{

      java.lang.String string1 = " #";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstant_20_20() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstant(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_1_21() throws Exception{

      java.lang.String string1 = "(";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_2_22() throws Exception{

      java.lang.String string1 = "";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_3_23() throws Exception{

      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_4_24() throws Exception{

      java.lang.String string1 = "\\n";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_5_25() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_6_26() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_7_27() throws Exception{

      java.lang.String string1 = " #";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_8_28() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_9_29() throws Exception{

      java.lang.String string1 = "@Mn^z5";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_10_30() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_11_31() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_12_32() throws Exception{

      java.lang.String string1 = " #";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_13_33() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_14_34() throws Exception{

      java.lang.String string1 = " ";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_15_35() throws Exception{

      java.lang.String string1 = "a ";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_16_36() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_17_37() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_18_38() throws Exception{

      java.lang.String string1 = " #";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_19_39() throws Exception{

      java.lang.String string1 = " ";
      com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention2);
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isConstantKey_20_40() throws Exception{

      java.lang.String string1 = "<a> </a>";
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isConstantKey(string1);

  }



  @Test(timeout = 5000)
  public void test_isExported_1_41() throws Exception{

      java.lang.String string1 = "i";
      boolean boolean2 = true;
      com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention3);
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_2_42() throws Exception{

      java.lang.String string1 = "_";
      boolean boolean2 = false;
      com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention3);
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_3_43() throws Exception{

      java.lang.String string1 = " ";
      boolean boolean2 = false;
      com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention3);
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_4_44() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      boolean boolean2 = true;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_5_45() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      boolean boolean2 = true;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_6_46() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean2 = false;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_7_47() throws Exception{

      java.lang.String string1 = "";
      boolean boolean2 = true;
      com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention3);
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_8_48() throws Exception{

      java.lang.String string1 = " ";
      boolean boolean2 = false;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_9_49() throws Exception{

      java.lang.String string1 = " #";
      boolean boolean2 = true;
      com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention3);
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_10_50() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      boolean boolean2 = true;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_11_51() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      boolean boolean2 = false;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_12_52() throws Exception{

      java.lang.String string1 = "";
      boolean boolean2 = false;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_13_53() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      boolean boolean2 = false;
      com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention3);
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_14_54() throws Exception{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean2 = false;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_15_55() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      boolean boolean2 = false;
      com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention3);
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_16_56() throws Exception{

      java.lang.String string1 = "";
      boolean boolean2 = false;
      com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention3);
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_17_57() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      boolean boolean2 = false;
      com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention3);
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_18_58() throws Exception{

      java.lang.String string1 = "\\n";
      boolean boolean2 = true;
      com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention3);
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_19_59() throws Exception{

      java.lang.String string1 = "\\n";
      boolean boolean2 = true;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention();
      googleCodingConvention0.isExported(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_isExported_20_60() throws Exception{

      java.lang.String string1 = "\\n";
      boolean boolean2 = false;
      com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
      com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention0 = new com.google.javascript.jscomp.GoogleCodingConvention(codingConvention3);
      googleCodingConvention0.isExported(string1, boolean2);

  }



}