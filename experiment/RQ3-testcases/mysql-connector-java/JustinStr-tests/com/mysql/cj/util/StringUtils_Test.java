package com.mysql.cj.util;

import org.junit.Test;

public class StringUtils_Test {

  @Test(timeout = 5000)
  public void test_fixDecimalExponent_1_1() throws Exception{

      java.lang.String string0 = "E";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_2_2() throws Exception{

      java.lang.String string0 = "a ";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_3_3() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_4_4() throws Exception{

      java.lang.String string0 = "a ";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_5_5() throws Exception{

      java.lang.String string0 = "v2_I)6I5z94=,^%%uS(VgSZ%:&teWIoCv&Gjf8PC!>\\\"3:t)[";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_6_6() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_7_7() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_8_8() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_9_9() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_10_10() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_11_11() throws Exception{

      java.lang.String string0 = " ";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_12_12() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_13_13() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_14_14() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_15_15() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_16_16() throws Exception{

      java.lang.String string0 = " ";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_17_17() throws Exception{

      java.lang.String string0 = "PyvPx=Qk`Ku,]`>jbk";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_18_18() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_19_19() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_fixDecimalExponent_20_20() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.mysql.cj.util.StringUtils.fixDecimalExponent(string0);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_1_21() throws Exception{

      int int0 = -2147483648;
      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "2";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_2_22() throws Exception{

      int int0 = -2147483648;
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_3_23() throws Exception{

      int int0 = -720642683;
      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "a ";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_4_24() throws Exception{

      int int0 = -757076864;
      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_5_25() throws Exception{

      int int0 = 1;
      java.lang.String string1 = "\\n";
      java.lang.String string2 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_6_26() throws Exception{

      int int0 = -1790001364;
      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "a ";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_7_27() throws Exception{

      int int0 = 1;
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string2 = "\\n";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_8_28() throws Exception{

      int int0 = -1;
      java.lang.String string1 = "";
      java.lang.String string2 = "[0,1]";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_9_29() throws Exception{

      int int0 = -1;
      java.lang.String string1 = "";
      java.lang.String string2 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_10_30() throws Exception{

      int int0 = 382185702;
      java.lang.String string1 = " ";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_11_31() throws Exception{

      int int0 = -2147483648;
      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "{\"key\":2 }";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_12_32() throws Exception{

      int int0 = 1491074480;
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_13_33() throws Exception{

      int int0 = 0;
      java.lang.String string1 = " #";
      java.lang.String string2 = "K6Tw~3zB)g0`VSc\\!.#*\\g,&";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_14_34() throws Exception{

      int int0 = 2147483647;
      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_15_35() throws Exception{

      int int0 = 0;
      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_16_36() throws Exception{

      int int0 = 1;
      java.lang.String string1 = "";
      java.lang.String string2 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_17_37() throws Exception{

      int int0 = 2147483647;
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = ">!o=Ow";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_18_38() throws Exception{

      int int0 = 0;
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_19_39() throws Exception{

      int int0 = -2147483648;
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_indexOfIgnoreCase_20_40() throws Exception{

      int int0 = 1;
      java.lang.String string1 = "a ";
      java.lang.String string2 = ".\\a.txt";
      com.mysql.cj.util.StringUtils.indexOfIgnoreCase(int0, string1, string2);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_1_41() throws Exception{

      java.lang.String string0 = "a";
      java.lang.String string1 = " #";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_2_42() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "\\n";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_3_43() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = ".\\a.txt";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_4_44() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = " #";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_5_45() throws Exception{

      java.lang.String string0 = "[0,1]";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_6_46() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "[0,1]";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_7_47() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = " ";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_8_48() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = "<a> </a>";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_9_49() throws Exception{

      java.lang.String string0 = "[0,1]";
      java.lang.String string1 = " ";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_10_50() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = "\\n";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_11_51() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = " #";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_12_52() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = "";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_13_53() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = " ";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_14_54() throws Exception{

      java.lang.String string0 = "+iuu2[M1[!Z)Mn32'Mw>V 06mbvq3=^,fWzGC4y{";
      java.lang.String string1 = " #";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_15_55() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_16_56() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "{\"key\":2 }";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_17_57() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "a ";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_18_58() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "[0,1]";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_19_59() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_startsWithIgnoreCaseAndNonAlphaNumeric_20_60() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "a ";
      com.mysql.cj.util.StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_1_61() throws Exception{

      java.lang.String string0 = "f";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_2_62() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_3_63() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_4_64() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_5_65() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_6_66() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_7_67() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_8_68() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_9_69() throws Exception{

      java.lang.String string0 = " ";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_10_70() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_11_71() throws Exception{

      java.lang.String string0 = "$Q@>\\\"2q;8`X&{4Lo";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_12_72() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_13_73() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_14_74() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_15_75() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_16_76() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_17_77() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_18_78() throws Exception{

      java.lang.String string0 = "x`zUh%=T&b_Q,0ORoN|@-]SDGVH.+TT@&u _A!XyyR8^$Z(h0";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_19_79() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_isNullOrEmpty_20_80() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.util.StringUtils.isNullOrEmpty(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_1_81() throws Exception{

      java.lang.String string0 = "%";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_2_82() throws Exception{

      java.lang.String string0 = "g";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_3_83() throws Exception{

      java.lang.String string0 = "gH7:dr@";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_4_84() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_5_85() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_6_86() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_7_87() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_8_88() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_9_89() throws Exception{

      java.lang.String string0 = " ";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_10_90() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_11_91() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_12_92() throws Exception{

      java.lang.String string0 = "u?cqc)W}5(v]/W\\\"%esV|T[)ItuVh#t{1;;vj";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_13_93() throws Exception{

      java.lang.String string0 = " #";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_14_94() throws Exception{

      java.lang.String string0 = "if1>/nxT~W`Q[R,@H~F'@HFG>a";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_15_95() throws Exception{

      java.lang.String string0 = " #";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_16_96() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_17_97() throws Exception{

      java.lang.String string0 = " ";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_18_98() throws Exception{

      java.lang.String string0 = ":$\\Z#}BfO&QMAH/fH9-Ga=zD]%v8gOgXeOI4MKZk";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_19_99() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_sanitizeProcOrFuncName_20_100() throws Exception{

      java.lang.String string0 = "0*&Vf`;?[H, Sj8O8~xUZG4";
      com.mysql.cj.util.StringUtils.sanitizeProcOrFuncName(string0);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_1_101() throws Exception{

      java.lang.String string0 = "%";
      java.lang.String string1 = " #";
      java.lang.String string2 = ".\\a.txt";
      boolean boolean3 = false;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_2_102() throws Exception{

      java.lang.String string0 = "H";
      java.lang.String string1 = "dVx2N6lM@%A{c5s(0xS";
      java.lang.String string2 = ".\\a.txt";
      boolean boolean3 = false;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_3_103() throws Exception{

      java.lang.String string0 = ".";
      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "{\"key\":2 }";
      boolean boolean3 = false;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_4_104() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "{\"key\":null}";
      boolean boolean3 = false;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_5_105() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = "{\"key\":null}";
      boolean boolean3 = true;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_6_106() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "a ";
      boolean boolean3 = true;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_7_107() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean3 = true;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_8_108() throws Exception{

      java.lang.String string0 = "[0,1]";
      java.lang.String string1 = "vZ\\\"*$kY0#05\\v)HZ2W}@3z,OFk6~>\\\"-RAA}@/Q+f|_v@r\\s3#";
      java.lang.String string2 = " ";
      boolean boolean3 = false;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_9_109() throws Exception{

      java.lang.String string0 = "[0,1]";
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "?";
      boolean boolean3 = true;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_10_110() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string2 = " #";
      boolean boolean3 = false;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_11_111() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = " ";
      java.lang.String string2 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean3 = true;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_12_112() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string2 = ".\\a.txt";
      boolean boolean3 = false;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_13_113() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "Wz^WLy(t{a6sw8h.2h,0y-ZB|:i/|/&[]=&B=5e)8";
      java.lang.String string2 = "W*J:@ry>TjU/WdH{RMFg<MV%K<,IpQDzQe;S^1,lbtn %@1?o";
      boolean boolean3 = true;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_14_114() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "<a>Hello World</a>";
      java.lang.String string2 = " ";
      boolean boolean3 = true;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_15_115() throws Exception{

      java.lang.String string0 = "[0,1]";
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      boolean boolean3 = false;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_16_116() throws Exception{

      java.lang.String string0 = "[0,1]";
      java.lang.String string1 = "<a> </a>";
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      boolean boolean3 = true;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_17_117() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string1 = " #";
      java.lang.String string2 = ".\\a.txt";
      boolean boolean3 = true;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_18_118() throws Exception{

      java.lang.String string0 = "[0,1]";
      java.lang.String string1 = ".\\a.txt";
      java.lang.String string2 = "a ";
      boolean boolean3 = false;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_19_119() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "[0,1]";
      java.lang.String string2 = "a ";
      boolean boolean3 = false;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_splitDBdotName_20_120() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = "{\"key\":null}";
      java.lang.String string2 = "Buz]k| pNYDnwH]V\\LM";
      boolean boolean3 = false;
      com.mysql.cj.util.StringUtils.splitDBdotName(string0, string1, string2, boolean3);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_1_121() throws Exception{

      java.lang.String string0 = "2";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_2_122() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_3_123() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_4_124() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_5_125() throws Exception{

      java.lang.String string0 = " ";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_6_126() throws Exception{

      java.lang.String string0 = "a ";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_7_127() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_8_128() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_9_129() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_10_130() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_11_131() throws Exception{

      java.lang.String string0 = "'Wnb\\fJqXO*Z1p}*^$2j5t{E%,";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_12_132() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_13_133() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_14_134() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_15_135() throws Exception{

      java.lang.String string0 = " ";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_16_136() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_17_137() throws Exception{

      java.lang.String string0 = " f~";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_18_138() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_19_139() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_isEmptyOrWhitespaceOnly_20_140() throws Exception{

      java.lang.String string0 = " ";
      com.mysql.cj.util.StringUtils.isEmptyOrWhitespaceOnly(string0);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_1_141() throws Exception{

      java.lang.String string0 = ".";
      java.lang.String string1 = "@";
      boolean boolean2 = false;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_2_142() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_3_143() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      java.lang.String string1 = "<a> </a>";
      boolean boolean2 = false;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_4_144() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "\\n";
      boolean boolean2 = false;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_5_145() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = ".\\a.txt";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_6_146() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = " ";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_7_147() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string1 = " #";
      boolean boolean2 = false;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_8_148() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "A>ym`dQzpko(M<z[4q3N5}DJ(xU";
      boolean boolean2 = false;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_9_149() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "<a> </a>";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_10_150() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "\\n";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_11_151() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_12_152() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string1 = "Pjid ";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_13_153() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = " ";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_14_154() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "\\n";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_15_155() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = " ";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_16_156() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = "[0,1]";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_17_157() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = " ";
      boolean boolean2 = false;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_18_158() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_19_159() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = ".\\a.txt";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_quoteIdentifier_20_160() throws Exception{

      java.lang.String string0 = "[0,1]";
      java.lang.String string1 = "<a> </a>";
      boolean boolean2 = true;
      com.mysql.cj.util.StringUtils.quoteIdentifier(string0, string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_1_161() throws Exception{

      java.lang.String string0 = "'";
      java.lang.String string1 = "\r";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_2_162() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_3_163() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_4_164() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = "{\"key\":2 }";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_5_165() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_6_166() throws Exception{

      java.lang.String string0 = "<a> </a>";
      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_7_167() throws Exception{

      java.lang.String string0 = "[0,1]";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_8_168() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_9_169() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_10_170() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "a ";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_11_171() throws Exception{

      java.lang.String string0 = "Tk=<KX ]#>*ry<46lX7bJ=t_RKPe`{o=F7.G";
      java.lang.String string1 = "<a>Hello World</a>";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_12_172() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "[0,1]";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_13_173() throws Exception{

      java.lang.String string0 = "<a> </a>";
      java.lang.String string1 = ".\\a.txt";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_14_174() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "\\n";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_15_175() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_16_176() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_17_177() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "l<";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_18_178() throws Exception{

      java.lang.String string0 = "C.1Tk8}.9wmJl|";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_19_179() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string1 = "<a>Hello World</a>";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_unQuoteIdentifier_20_180() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "<a>Hello World</a>";
      com.mysql.cj.util.StringUtils.unQuoteIdentifier(string0, string1);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_1_181() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "\"";
      int int2 = 0;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_2_182() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = "";
      int int2 = 1;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_3_183() throws Exception{

      java.lang.String string0 = "IL5e~Z!!aC&Kxvuyr@L0v`p@=67L{(YR-$4i";
      java.lang.String string1 = "{\"key\":2 }";
      int int2 = 0;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_4_184() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "[0,1]";
      int int2 = -1;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_5_185() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = ".\\a.txt";
      int int2 = 1203304200;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_6_186() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      int int2 = -1;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_7_187() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string1 = "{\"key\":null}";
      int int2 = 2147483647;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_8_188() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      int int2 = -1;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_9_189() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "<a> </a>";
      int int2 = 0;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_10_190() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string1 = "<a> </a>";
      int int2 = -1;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_11_191() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = " #";
      int int2 = 1;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_12_192() throws Exception{

      java.lang.String string0 = "<a> </a>";
      java.lang.String string1 = ".\\a.txt";
      int int2 = -2147483648;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_13_193() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      int int2 = -2147483648;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_14_194() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = "{\"key\":null}";
      int int2 = 2147483647;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_15_195() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = ".\\a.txt";
      int int2 = 1631993725;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_16_196() throws Exception{

      java.lang.String string0 = "<a> </a>";
      java.lang.String string1 = "<a>Hello World</a>";
      int int2 = 0;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_17_197() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      int int2 = -351090663;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_18_198() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "<a> </a>";
      int int2 = -2147483648;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_19_199() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "<a>Hello World</a>";
      int int2 = 1;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_indexOfQuoteDoubleAware_20_200() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = "8h}1t!3r5L%NJl*i$bj&1;=Kr^#";
      int int2 = -2147483648;
      com.mysql.cj.util.StringUtils.indexOfQuoteDoubleAware(string0, string1, int2);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_1_201() throws Exception{

      java.lang.String string0 = "/* ping */";
      int int5 = -1;
      int int6 = -2147483648;
      int int7 = -163012890;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = false;
      boolean boolean3 = false;
      boolean boolean4 = false;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_2_202() throws Exception{

      java.lang.String string0 = "k";
      int int5 = -1;
      int int6 = -1391578742;
      int int7 = 2147483647;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = true;
      boolean boolean3 = true;
      boolean boolean4 = true;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_3_203() throws Exception{

      java.lang.String string0 = "a ";
      int int5 = -2147483648;
      int int6 = 1;
      int int7 = -460814790;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = false;
      boolean boolean3 = false;
      boolean boolean4 = true;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_4_204() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      int int5 = 1;
      int int6 = 2147483647;
      int int7 = 1;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = true;
      boolean boolean3 = true;
      boolean boolean4 = true;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_5_205() throws Exception{

      java.lang.String string0 = "a ";
      int int5 = -327230450;
      int int6 = -2147483648;
      int int7 = 97518807;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = false;
      boolean boolean3 = false;
      boolean boolean4 = false;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_6_206() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      int int5 = -2147483648;
      int int6 = 2147483647;
      int int7 = 1;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = true;
      boolean boolean3 = false;
      boolean boolean4 = true;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_7_207() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      int int5 = 0;
      int int6 = 2147483647;
      int int7 = 0;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = true;
      boolean boolean3 = true;
      boolean boolean4 = false;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_8_208() throws Exception{

      java.lang.String string0 = " #";
      int int5 = -1;
      int int6 = -1703896885;
      int int7 = 0;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = false;
      boolean boolean3 = true;
      boolean boolean4 = false;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_9_209() throws Exception{

      java.lang.String string0 = "a ";
      int int5 = 0;
      int int6 = 1946276764;
      int int7 = 1670823250;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = false;
      boolean boolean3 = true;
      boolean boolean4 = true;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_10_210() throws Exception{

      java.lang.String string0 = "";
      int int5 = -2147483648;
      int int6 = -1;
      int int7 = 1;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = true;
      boolean boolean3 = true;
      boolean boolean4 = false;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_11_211() throws Exception{

      java.lang.String string0 = "#_-/ T";
      int int5 = 306435257;
      int int6 = -2147483648;
      int int7 = 2147483647;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = true;
      boolean boolean3 = false;
      boolean boolean4 = true;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_12_212() throws Exception{

      java.lang.String string0 = "<a> </a>";
      int int5 = 2147483647;
      int int6 = 1;
      int int7 = 1;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = true;
      boolean boolean3 = true;
      boolean boolean4 = false;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_13_213() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      int int5 = 1615082851;
      int int6 = -318420370;
      int int7 = -1;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = true;
      boolean boolean3 = false;
      boolean boolean4 = false;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_14_214() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      int int5 = -2147483648;
      int int6 = -1;
      int int7 = 0;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = false;
      boolean boolean3 = true;
      boolean boolean4 = true;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_15_215() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      int int5 = -2147483648;
      int int6 = 2147483647;
      int int7 = 1;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = false;
      boolean boolean3 = true;
      boolean boolean4 = false;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_16_216() throws Exception{

      java.lang.String string0 = " ";
      int int5 = -1;
      int int6 = -1;
      int int7 = -1;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = true;
      boolean boolean3 = true;
      boolean boolean4 = false;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_17_217() throws Exception{

      java.lang.String string0 = " #";
      int int5 = 0;
      int int6 = 2147483647;
      int int7 = -2147483648;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = false;
      boolean boolean3 = false;
      boolean boolean4 = true;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_18_218() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      int int5 = -2147483648;
      int int6 = -1;
      int int7 = -2147483648;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = true;
      boolean boolean3 = true;
      boolean boolean4 = true;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_19_219() throws Exception{

      java.lang.String string0 = "\\n";
      int int5 = -1;
      int int6 = 2147483647;
      int int7 = -2147483648;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = false;
      boolean boolean3 = false;
      boolean boolean4 = false;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_canHandleAsServerPreparedStatementNoCache_20_220() throws Exception{

      java.lang.String string0 = " #";
      int int5 = 1;
      int int6 = 2147483647;
      int int7 = 0;
      com.mysql.cj.ServerVersion serverVersion1 = new com.mysql.cj.ServerVersion(int5, int6, int7);
      boolean boolean2 = true;
      boolean boolean3 = false;
      boolean boolean4 = false;
      com.mysql.cj.util.StringUtils.canHandleAsServerPreparedStatementNoCache(string0, serverVersion1, boolean2, boolean3, boolean4);

  }



  @Test(timeout = 5000)
  public void test_escapeString_1_221() throws Exception{

      java.lang.String string5 = ".\\a.txt";
      java.lang.CharSequence charSequence4 = new java.lang.StringBuilder(string5);
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(charSequence4);
      java.lang.String string1 = "}";
      boolean boolean2 = true;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_2_222() throws Exception{

      java.lang.CharSequence charSequence4 = new java.lang.String();
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(charSequence4);
      java.lang.String string1 = "";
      boolean boolean2 = true;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_3_223() throws Exception{

      int int4 = 0;
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(int4);
      java.lang.String string1 = "{\"key\":null}";
      boolean boolean2 = false;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_4_224() throws Exception{

      int int4 = -2147483648;
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(int4);
      java.lang.String string1 = "";
      boolean boolean2 = true;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_5_225() throws Exception{

      int int4 = -425349229;
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(int4);
      java.lang.String string1 = "\\n";
      boolean boolean2 = true;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_6_226() throws Exception{

      int int4 = 2147483647;
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(int4);
      java.lang.String string1 = "<a>Hello World</a>";
      boolean boolean2 = true;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_7_227() throws Exception{

      java.lang.String string4 = "";
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(string4);
      java.lang.String string1 = "*791{D2$s~&i#&`/:GivOM0g&gfFmmpQrbI=L.%/W";
      boolean boolean2 = true;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_8_228() throws Exception{

      java.lang.String string4 = "[0,1]";
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(string4);
      java.lang.String string1 = "";
      boolean boolean2 = false;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_9_229() throws Exception{

      int int4 = 0;
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(int4);
      java.lang.String string1 = "[0,1]";
      boolean boolean2 = true;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_10_230() throws Exception{

      int int4 = 2147483647;
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(int4);
      java.lang.String string1 = "<a> </a>";
      boolean boolean2 = false;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_11_231() throws Exception{

      java.lang.String string4 = "{\"key\":null}";
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(string4);
      java.lang.String string1 = "{\"key\":2 }";
      boolean boolean2 = false;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_12_232() throws Exception{

      java.lang.String string4 = "a ";
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(string4);
      java.lang.String string1 = "[0,1]";
      boolean boolean2 = false;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_13_233() throws Exception{

      java.lang.String string4 = ".\\a.txt";
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(string4);
      java.lang.String string1 = "<a> </a>";
      boolean boolean2 = false;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_14_234() throws Exception{

      java.lang.String string5 = "{\"key\":2 }";
      java.lang.CharSequence charSequence4 = new java.lang.StringBuilder(string5);
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(charSequence4);
      java.lang.String string1 = ".\\a.txt";
      boolean boolean2 = true;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_15_235() throws Exception{

      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder();
      java.lang.String string1 = "<a>Hello World</a>";
      boolean boolean2 = false;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_16_236() throws Exception{

      int int4 = 1;
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(int4);
      java.lang.String string1 = "<a>Hello World</a>";
      boolean boolean2 = true;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_17_237() throws Exception{

      java.lang.CharSequence charSequence4 = new java.lang.StringBuffer();
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(charSequence4);
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean2 = false;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_18_238() throws Exception{

      java.lang.String string4 = "<a>Hello World</a>";
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(string4);
      java.lang.String string1 = "\\n";
      boolean boolean2 = true;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_19_239() throws Exception{

      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder();
      java.lang.String string1 = "<a> </a>";
      boolean boolean2 = false;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



  @Test(timeout = 5000)
  public void test_escapeString_20_240() throws Exception{

      java.lang.String string5 = " #";
      java.lang.CharSequence charSequence4 = new java.lang.StringBuilder(string5);
      java.lang.StringBuilder stringBuilder0 = new java.lang.StringBuilder(charSequence4);
      java.lang.String string1 = "<a> </a>";
      boolean boolean2 = true;
      java.nio.charset.CharsetEncoder charsetEncoder3 = null;
      com.mysql.cj.util.StringUtils.escapeString(stringBuilder0, string1, boolean2, charsetEncoder3);

  }



}