package com.mysql.cj.util;

import org.junit.Test;

public class Util_Test {

  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_1_1() throws Exception{

      java.lang.String string0 = "commercial";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_2_2() throws Exception{

      java.lang.String string0 = "enterprise";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_3_3() throws Exception{

      java.lang.String string0 = "advanced";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_4_4() throws Exception{

      java.lang.String string0 = "+";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_5_5() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_6_6() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_7_7() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_8_8() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_9_9() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_10_10() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_11_11() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_12_12() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_13_13() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_14_14() throws Exception{

      java.lang.String string0 = " ";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_15_15() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_16_16() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_17_17() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_18_18() throws Exception{

      java.lang.String string0 = " #";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_19_19() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isEnterpriseEdition_20_20() throws Exception{

      java.lang.String string0 = "a ";
      com.mysql.cj.util.Util.isEnterpriseEdition(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_1_21() throws Exception{

      java.lang.String string0 = "com.mysql.cj.jdbc";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_2_22() throws Exception{

      java.lang.String string0 = "javax.sql";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_3_23() throws Exception{

      java.lang.String string0 = "java.sql";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_4_24() throws Exception{

      java.lang.String string0 = "/";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_5_25() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_6_26() throws Exception{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_7_27() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_8_28() throws Exception{

      java.lang.String string0 = "[0,1]";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_9_29() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_10_30() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_11_31() throws Exception{

      java.lang.String string0 = "";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_12_32() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_13_33() throws Exception{

      java.lang.String string0 = " ";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_14_34() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_15_35() throws Exception{

      java.lang.String string0 = " #";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_16_36() throws Exception{

      java.lang.String string0 = "<a> </a>";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_17_37() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_18_38() throws Exception{

      java.lang.String string0 = "a ";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_19_39() throws Exception{

      java.lang.String string0 = "{\"key\":2 }";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



  @Test(timeout = 5000)
  public void test_isJdbcPackage_20_40() throws Exception{

      java.lang.String string0 = "\\n";
      com.mysql.cj.util.Util.isJdbcPackage(string0);

  }



}