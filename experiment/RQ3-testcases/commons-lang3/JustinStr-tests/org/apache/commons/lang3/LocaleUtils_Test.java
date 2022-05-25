package org.apache.commons.lang3;

import org.junit.Test;

public class LocaleUtils_Test {

  @Test(timeout = 5000)
  public void test_toLocale_1_1() throws Exception{

      java.lang.String string0 = "7.j_";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_2_2() throws Exception{

      java.lang.String string0 = "}j27_";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_3_3() throws Exception{

      java.lang.String string0 = "";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_4_4() throws Exception{

      java.lang.String string0 = "}y";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_5_5() throws Exception{

      java.lang.String string0 = "_";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_6_6() throws Exception{

      java.lang.String string0 = "C%%.";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_7_7() throws Exception{

      java.lang.String string0 = "Qv,\r]]";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_8_8() throws Exception{

      java.lang.String string0 = ",_";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_9_9() throws Exception{

      java.lang.String string0 = "#";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_10_10() throws Exception{

      java.lang.String string0 = "cT_";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_11_11() throws Exception{

      java.lang.String string0 = "$";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_12_12() throws Exception{

      java.lang.String string0 = "\u000B,H";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_13_13() throws Exception{

      java.lang.String string0 = "#UM=E";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_14_14() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_15_15() throws Exception{

      java.lang.String string0 = "[0,1]";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_16_16() throws Exception{

      java.lang.String string0 = "<a> </a>";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_17_17() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_18_18() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_19_19() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



  @Test(timeout = 5000)
  public void test_toLocale_20_20() throws Exception{

      java.lang.String string0 = "";
      org.apache.commons.lang3.LocaleUtils.toLocale(string0);

  }



}